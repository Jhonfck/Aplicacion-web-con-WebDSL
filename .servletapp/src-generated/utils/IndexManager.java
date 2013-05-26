package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.io.File;
import java.io.IOException;
import org.apache.lucene.analysis.WhitespaceAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.LogMergePolicy;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.spell.SpellChecker;
import org.apache.lucene.search.spell.Dictionary;
import org.apache.lucene.search.spell.LuceneDictionary;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.SearchFactory;
import org.hibernate.search.reader.ReaderProvider;
import org.hibernate.search.store.DirectoryProvider;
import org.hibernate.search.store.FSDirectoryProvider;
import org.webdsl.search.AutoCompleter;
import org.webdsl.search.SearchSuggester;
import org.webdsl.search.SearchHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.*;
import webdsl.generated.domain.*;
import org.webdsl.lang.*;

@SuppressWarnings("all") public class IndexManager  
{ 
  public static void main(String[] args)
  { 
    reindex(Arrays.asList(args));
    System.exit(0);
  }

  private static void reindex()
  { 
    reindex(new ArrayList<String>());
  }

  private static void reindex(List<String> entities)
  { 
    log("Starting reindexing of searchable data...");
    long time = System.currentTimeMillis();
    if(entities == null || entities.isEmpty() || entities.contains("dummy_webdsl_entity") || entities.contains("webdsl.generated.domain.dummy_webdsl_entity"))
    { 
      reindexEntityClass(webdsl.generated.domain.dummy_webdsl_entity.class);
    }
    indexSuggestions();
    time = System.currentTimeMillis() - time;
    log("Reindexing finished in " + time + "ms total.");
  }

  public static void renewFacetIndexReaders()
  { 
    dummy_webdsl_entitySearcher.renewBoboReaders();
  }

  private static boolean reindexEntityClass(Class<?> c)
  { 
    String entityName = c.getName().substring(c.getPackage().getName().length() + 1);
    log("---Reindexing: " + entityName + "---");
    long time = System.currentTimeMillis();
    SessionFactory sessionf = HibernateUtilConfigured.getSessionFactory();
    Session session = sessionf.getCurrentSession();
    org.hibernate.search.FullTextSession ftSession = getFullTextSession();
    try
    { 
      ftSession.createIndexer(c).progressMonitor(new org.webdsl.search.IndexProgressMonitor(2000, entityName)).batchSizeToLoadObjects(50).threadsToLoadObjects(3).threadsForSubsequentFetching(4).threadsForIndexWriter(3).purgeAllOnStart(true).startAndWait();
    }
    catch(Exception ex)
    { 
      ex.printStackTrace();
      return false;
    }
    finally
    { 
      if(ftSession != null)
      { 
        ftSession.close();
        ftSession = null;
      }
      if(session != null)
      { 
        session = null;
      }
      if(sessionf != null)
      { 
        sessionf = null;
      }
    }
    time = System.currentTimeMillis() - time;
    log("---Done in " + time + "ms.---");
    return true;
  }

  public static void indexSuggestions()
  { 
    indexSuggestions(null);
  }

  public static void indexSuggestions(List<String> namespaces)
  { }

  private static boolean clearIndex(File path)
  { 
    try
    { 
      if(path == null || !path.exists())
        return true;
      FSDirectory indexDir = new FSDirectoryProvider().getDirectory();
      IndexWriter writer = new IndexWriter(indexDir.open(path), new IndexWriterConfig(Version.LUCENE_CURRENT, new WhitespaceAnalyzer(Version.LUCENE_CURRENT)));
      writer.deleteAll();
      writer.close();
      return true;
    }
    catch(Exception ex)
    { 
      ex.printStackTrace();
      return false;
    }
  }

  public static void clearAutoCompleteIndex(String entity)
  { 
  }

  public static void clearSpellCheckIndex(String entity)
  { 
  }

  public static void clearAutoCompleteIndex(String entity, String[] fields)
  { 
    Class<?> entityClass = null;
    if(entityClass == null)
      return;
    for(int c = 0; c < fields.length; c++)
    { 
      log("Clearing autocomplete index for entity: " + entity + ", field: " + fields[c]);
      File path = new File(indexDirAutoComplete(entityClass, fields[c]));
      if(clearIndex(path))
        log("Clearing autocomplete index successful");
      else
        log("Clearing autocomplete index unsuccessful");
    }
  }

  public static void clearSpellCheckIndex(String entity, String[] fields)
  { 
    Class<?> entityClass = null;
    if(entityClass == null)
      return;
    for(int c = 0; c < fields.length; c++)
    { 
      log("Clearing spellcheck index for entity: " + entity + ", field: " + fields[c]);
      File path = new File(indexDirSpellCheck(entityClass, fields[c]));
      if(clearIndex(path))
        log("Clearing spellcheck index successful");
      else
        log("Clearing spellcheck index unsuccessful");
    }
  }

  public static void optimizeIndex()
  { 
    log("Optimizing search index started.");
    getSearchFactory().optimize();
    log("Optimizing search index finished succesfully.");
  }

  public static String indexDir()
  { 
    return "searchindex/CentroDatos";
  }

  public static String indexDirSpellCheck(Class<?> entityClass, String field)
  { 
    return indexDir() + "/SpellCheck/" + entityClass.getName() + "/" + field;
  }

  public static String indexDirSpellCheck(Class<?> entityClass, String field, String namespace)
  { 
    if(namespace == null || namespace.isEmpty())
      return indexDirSpellCheck(entityClass, field);
    return indexDir() + "/SpellCheck/" + entityClass.getName() + "." + namespace + "/" + field;
  }

  public static String indexDirAutoComplete(Class<?> entityClass, String field)
  { 
    return indexDir() + "/AutoComplete/" + entityClass.getName() + "/" + field;
  }

  public static String indexDirAutoComplete(Class<?> entityClass, String field, String namespace)
  { 
    if(namespace == null || namespace.isEmpty())
      return indexDirAutoComplete(entityClass, field);
    return indexDir() + "/AutoComplete/" + entityClass.getName() + "." + namespace + "/" + field;
  }

  public static String indexName(Class<?> entityClass)
  { 
    if(webdsl.generated.domain.dummy_webdsl_entity.class.equals(entityClass))
    { 
      return "webdsl.generated.domain.dummy_webdsl_entity";
    }
    return null;
  }

  private static FullTextSession getFullTextSession()
  { 
    return org.hibernate.search.Search.getFullTextSession(HibernateUtilConfigured.getSessionFactory().getCurrentSession());
  }

  private static SearchFactory getSearchFactory()
  { 
    return getFullTextSession().getSearchFactory();
  }

  public static void reindexSuggestions(Class<?> entityClass, String[] completionFields, String[] spellcheckFields)
  { 
    reindexSuggestions(entityClass, completionFields, spellcheckFields, null);
  }

  @SuppressWarnings("deprecation") public static void reindexSuggestions(Class<?> entityClass, String[] completionFields, String[] spellcheckFields, List<String> namespaces)
  { 
    SearchFactory searchFactory = getSearchFactory();
    DirectoryProvider[] directoryProviders = searchFactory.getDirectoryProviders(entityClass);
    ReaderProvider readerProvider = searchFactory.getReaderProvider();
    IndexReader sourceReader = readerProvider.openReader(directoryProviders);
    Directory sourceDir = (Directory)directoryProviders[0].getDirectory();
    String tmpIndexPath = IndexManager.indexDir() + "/tmp";
    Directory tmpDir = null;
    IndexReader nsIndexReader = null;
    IndexWriter nsIndexWriter = null;
    Query negatedNamespaceQuery;
    Iterator<String> namespaceIt;
    long lastModified;
    try
    { 
      lastModified = IndexReader.lastModified(sourceDir);
    }
    catch(Exception ex)
    { 
      ex.printStackTrace();
      lastModified = 0;
    }
    if(namespaces == null || namespaces.isEmpty())
    { 
      namespaceIt = new LuceneDictionary(sourceReader, SearchHelper.NAMESPACEFIELD).getWordsIterator();
    }
    else
    { 
      namespaceIt = namespaces.iterator();
    }
    reindexAutoCompletion(sourceReader, entityClass, completionFields, null, lastModified);
    reindexSpellCheck(sourceReader, entityClass, spellcheckFields, null, lastModified);
    try
    { 
      tmpDir = FSDirectory.open(new File(tmpIndexPath));
      String currentNamespace = "";
      while(namespaceIt.hasNext())
      { 
        currentNamespace = namespaceIt.next();
        negatedNamespaceQuery = mustNotNamespaceQuery(currentNamespace);
        try
        { 
          IndexWriterConfig writerCfg = new IndexWriterConfig(Version.LUCENE_CURRENT, new WhitespaceAnalyzer(Version.LUCENE_CURRENT)).setRAMBufferSizeMB((int)IndexWriterConfig.DEFAULT_RAM_BUFFER_SIZE_MB);
          writerCfg.setOpenMode(OpenMode.CREATE);
          nsIndexWriter = new IndexWriter(tmpDir, writerCfg);
          ((LogMergePolicy)nsIndexWriter.getConfig().getMergePolicy()).setMergeFactor(300);
          nsIndexWriter.addIndexes(sourceDir);
          nsIndexWriter.deleteDocuments(negatedNamespaceQuery);
          nsIndexWriter.optimize();
          if(nsIndexWriter.numDocs() < 1)
          { 
            log("no suggestions to update for namespace '" + currentNamespace + "'");
            continue;
          }
        }
        catch(Exception ex)
        { 
          System.out.println("Error during renewal of suggestion indexes");
          ex.printStackTrace();
        }
        finally
        { 
          if(nsIndexWriter != null)
          { 
            try
            { 
              nsIndexWriter.close();
            }
            catch(Exception ex2)
            { 
              ex2.printStackTrace();
            }
          }
        }
        try
        { 
          nsIndexReader = IndexReader.open(tmpDir);
          reindexAutoCompletion(nsIndexReader, entityClass, completionFields, currentNamespace, lastModified);
          reindexSpellCheck(nsIndexReader, entityClass, spellcheckFields, currentNamespace, lastModified);
        }
        catch(Exception ex)
        { 
          log("Error during renewal of suggestion indexes");
          ex.printStackTrace();
        }
        finally
        { 
          if(nsIndexReader != null)
          { 
            try
            { 
              nsIndexReader.close();
            }
            catch(IOException ex)
            { 
              ex.printStackTrace();
            }
          }
        }
      }
    }
    catch(Exception ex)
    { 
      ex.printStackTrace();
    }
    finally
    { 
      if(tmpDir != null)
      { 
        try
        { 
          tmpDir.close();
        }
        catch(IOException ex)
        { 
          ex.printStackTrace();
        }
      }
    }
  }

  private static void log(String message)
  { 
    System.out.println(new java.util.Date() + ": " + message);
  }

  private static void reindexAutoCompletion(IndexReader rdr, Class<?> entityClass, String[] completionFields, String namespace, long lastModified)
  { 
    Directory acDir = null;
    AutoCompleter ac = null;
    String namespaceInfo = namespace == null || namespace.isEmpty() ? "" : ", namespace: " + namespace;
    String entityName = entityClass.getName().substring(entityClass.getPackage().getName().length() + 1);
    for(String field : completionFields)
    { 
      log("Creating/updating autocomplete index [entity: " + entityName + namespaceInfo + ", field: " + field + "]");
      try
      { 
        String acPath = IndexManager.indexDirAutoComplete(entityClass, field, namespace);
        File f = new File(acPath);
        if(f.exists())
        { 
          acDir = FSDirectory.open(f);
          if(IndexReader.lastModified(acDir) > lastModified)
          { 
            log("no updates");
            continue;
          }
        }
        else
        { 
          acDir = FSDirectory.open(f);
        }
        ac = new AutoCompleter(acDir);
        ac.indexDictionary(rdr, field);
        SearchSuggester.forceAutoCompleterRenewal(acPath);
      }
      catch(Exception ex)
      { 
        ex.printStackTrace();
      }
      finally
      { 
        if(ac != null)
        { 
          try
          { 
            ac.close();
          }
          catch(Exception ex)
          { 
            ex.printStackTrace();
          }
        }
        if(acDir != null)
        { 
          try
          { 
            acDir.close();
          }
          catch(Exception ex)
          { 
            ex.printStackTrace();
          }
        }
      }
      log("Done");
    }
  }

  private static void reindexSpellCheck(IndexReader rdr, Class<?> entityClass, String[] spellCheckFields, String namespace, long lastModified)
  { 
    Directory scDir = null;
    SpellChecker sc = null;
    String namespaceInfo = namespace == null || namespace.isEmpty() ? ", namespace: " + namespace : "";
    String entityName = entityClass.getName().substring(entityClass.getPackage().getName().length() + 1);
    for(String field : spellCheckFields)
    { 
      log("Creating/updating spellcheck index [entity: " + entityName + namespaceInfo + ", field: " + field + "]");
      try
      { 
        String scPath = IndexManager.indexDirSpellCheck(entityClass, field, namespace);
        File f = new File(scPath);
        if(f.exists())
        { 
          scDir = FSDirectory.open(f);
          if(IndexReader.lastModified(scDir) > lastModified)
          { 
            log("no updates");
            continue;
          }
        }
        else
        { 
          scDir = FSDirectory.open(f);
        }
        sc = new SpellChecker(scDir);
        Dictionary dictionary = new LuceneDictionary(rdr, field);
        sc.indexDictionary(dictionary);
        SearchSuggester.forceSpellCheckerRenewal(scPath);
      }
      catch(Exception ex)
      { 
        ex.printStackTrace();
      }
      finally
      { 
        if(sc != null)
        { 
          try
          { 
            sc.close();
          }
          catch(Exception ex)
          { 
            ex.printStackTrace();
          }
        }
        if(scDir != null)
        { 
          try
          { 
            scDir.close();
          }
          catch(Exception ex)
          { 
            ex.printStackTrace();
          }
        }
      }
      log("Done ");
    }
  }

  private static Query mustNotNamespaceQuery(String namespace)
  { 
    BooleanQuery q = new BooleanQuery();
    q.add(new MatchAllDocsQuery(), Occur.SHOULD);
    q.add(new TermQuery(new Term(SearchHelper.NAMESPACEFIELD, namespace)), Occur.MUST_NOT);
    return q;
  }
}