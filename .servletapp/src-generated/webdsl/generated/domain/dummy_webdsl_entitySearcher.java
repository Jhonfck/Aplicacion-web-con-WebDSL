package webdsl.generated.domain;

import utils.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Date;
import org.apache.lucene.index.IndexReader;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.SearchFactory;
import org.hibernate.search.store.DirectoryProvider;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.store.Directory;
import org.apache.lucene.analysis.PerFieldAnalyzerWrapper;
import org.apache.lucene.analysis.Analyzer;
import org.webdsl.search.SearchSuggester;
import org.webdsl.search.QueryDef;
import com.browseengine.bobo.api.BoboIndexReader;
import com.browseengine.bobo.facets.FacetHandler;

public class dummy_webdsl_entitySearcher extends org.webdsl.search.AbstractEntitySearcher<webdsl.generated.domain.dummy_webdsl_entity, dummy_webdsl_entitySearcher> 
{ 
  private static Analyzer _analyzer;

  private static BoboIndexReader _boboReader;

  static
  { 
    _analyzer = org.hibernate.search.Search.getFullTextSession(HibernateUtilConfigured.getSessionFactory().getCurrentSession()).getSearchFactory().getAnalyzer(webdsl.generated.domain.dummy_webdsl_entity.class);
  }

  public dummy_webdsl_entitySearcher () 
  { 
    entityClass = webdsl.generated.domain.dummy_webdsl_entity.class;
    indexName = "webdsl.generated.domain.dummy_webdsl_entity";
    fullTextSession = org.hibernate.search.Search.getFullTextSession(HibernateUtilConfigured.getSessionFactory().getCurrentSession());
    analyzer = _analyzer;
    searchFields = new String[]{"text"};
    untokenizedFields = new String[]{};
    mltSearchFields = new String[]{"text"};
    rootQD = parentQD = currentQD = new QueryDef(Occur.SHOULD, new String[]{"text"});
  }

  public static ArrayList<String> spellSuggest(String toSuggestOn, List<String> fields, float accuracy, int noSug)
  { 
    return spellSuggest(toSuggestOn, "", fields, accuracy, noSug);
  }

  public static ArrayList<String> spellSuggest(String toSuggestOn, String field, float accuracy, int noSug)
  { 
    return spellSuggest(toSuggestOn, "", field, accuracy, noSug);
  }

  public static ArrayList<String> spellSuggest(String toSuggestOn, String namespace, List<String> fields, float accuracy, int noSug)
  { 
    String baseDir = utils.IndexManager.indexDirSpellCheck(webdsl.generated.domain.dummy_webdsl_entity.class, "", namespace);
    return SearchSuggester.findSpellSuggestions(webdsl.generated.domain.dummy_webdsl_entity.class, baseDir, fields, noSug, accuracy, true, _analyzer, toSuggestOn);
  }

  public static ArrayList<String> spellSuggest(String toSuggestOn, String namespace, String field, float accuracy, int noSug)
  { 
    String baseDir = utils.IndexManager.indexDirSpellCheck(webdsl.generated.domain.dummy_webdsl_entity.class, "", namespace);
    return SearchSuggester.findSpellSuggestionsForField(webdsl.generated.domain.dummy_webdsl_entity.class, baseDir, field, noSug, accuracy, true, _analyzer, toSuggestOn);
  }

  public static ArrayList<String> autoCompleteSuggest(String toSuggestOn, List<String> fields, int noSug)
  { 
    return autoCompleteSuggest(toSuggestOn, "", fields, noSug);
  }

  public static ArrayList<String> autoCompleteSuggest(String toSuggestOn, String field, int noSug)
  { 
    return autoCompleteSuggest(toSuggestOn, "", field, noSug);
  }

  public static ArrayList<String> autoCompleteSuggest(String toSuggestOn, String namespace, List<String> fields, int noSug)
  { 
    String baseDir = utils.IndexManager.indexDirAutoComplete(webdsl.generated.domain.dummy_webdsl_entity.class, "", namespace);
    return SearchSuggester.findAutoCompletions(webdsl.generated.domain.dummy_webdsl_entity.class, baseDir, fields, noSug, _analyzer, toSuggestOn);
  }

  public static ArrayList<String> autoCompleteSuggest(String toSuggestOn, String namespace, String field, int noSug)
  { 
    String baseDir = utils.IndexManager.indexDirAutoComplete(webdsl.generated.domain.dummy_webdsl_entity.class, "", namespace);
    return SearchSuggester.findAutoCompletionsForField(webdsl.generated.domain.dummy_webdsl_entity.class, baseDir, field, noSug, _analyzer, toSuggestOn);
  }

  public Class<?> fieldType(String field)
  { 
    return String.class;
  }

  protected FullTextSession getFullTextSession()
  { 
    if(fullTextSession == null)
    { 
      fullTextSession = org.hibernate.search.Search.getFullTextSession(HibernateUtilConfigured.getSessionFactory().getCurrentSession());
      updateFullTextQuery = true;
    }
    return fullTextSession;
  }

  protected synchronized BoboIndexReader getBoboReader(String field, Collection<String> allFields)
  { 
    if(_boboReader == null || _boboReader.getFacetHandler(field) == null)
    { 
      renewBoboReaders(allFields);
    }
    return _boboReader;
  }

  public final synchronized static void renewBoboReaders()
  { 
    if(_boboReader != null)
    { 
      renewBoboReaders(new ArrayList<String>());
    }
  }

  private final synchronized static void renewBoboReaders(Collection<String> allFields)
  { 
    log("renewing bobo index reader");
    BoboIndexReader boboReader_OLD = _boboReader;
    List<FacetHandler<?>> facetHandlerList = new ArrayList<FacetHandler<?>>();
    if(_boboReader != null)
    { 
      facetHandlerList.addAll(_boboReader.getFacetHandlerMap().values());
    }
    Map<String, FacetHandler<?>> facetHandlerMap = new HashMap<String, FacetHandler<?>>();
    for(FacetHandler<?> facetHandler : facetHandlerList)
    { 
      facetHandlerMap.put(facetHandler.getName(), facetHandler);
    }
    for(String fld : allFields)
    { 
      if(!facetHandlerMap.containsKey(fld))
        facetHandlerList.add(getFacetHandlerForField(fld));
    }
    SearchFactory searchFactory = org.hibernate.search.Search.getFullTextSession(HibernateUtilConfigured.getSessionFactory().getCurrentSession()).getSearchFactory();
    DirectoryProvider<?>[] providers = searchFactory.getDirectoryProviders(webdsl.generated.domain.dummy_webdsl_entity.class);
    try
    { 
      Directory idx = providers[0].getDirectory();
      IndexReader reader = IndexReader.open(idx, true);
      _boboReader = BoboIndexReader.getInstance(reader, facetHandlerList);
    }
    catch(IOException ex)
    { 
      ex.printStackTrace();
    }
    finally
    { 
      if(boboReader_OLD != null)
      { 
        try
        { 
          boboReader_OLD.close();
        }
        catch(IOException ex)
        { 
          ex.printStackTrace();
        }
      }
    }
  }
}