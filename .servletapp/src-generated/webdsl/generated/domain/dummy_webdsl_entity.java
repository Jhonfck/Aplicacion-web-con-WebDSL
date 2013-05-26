package webdsl.generated.domain;

import java.util.*;
import javax.persistence.*;
import webdsl.generated.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @javax.persistence.Entity @javax.persistence.Table(name = "_dummy_webdsl_entity") @org.hibernate.search.annotations.Indexed @org.hibernate.search.annotations.FullTextFilterDefs({@org.hibernate.search.annotations.FullTextFilterDef(name = "fieldConstraintFilter0", impl = org.webdsl.search.FieldConstraintFilter.class), @org.hibernate.search.annotations.FullTextFilterDef(name = "fieldConstraintFilter1", impl = org.webdsl.search.FieldConstraintFilter.class), @org.hibernate.search.annotations.FullTextFilterDef(name = "fieldConstraintFilter2", impl = org.webdsl.search.FieldConstraintFilter.class), @org.hibernate.search.annotations.FullTextFilterDef(name = "fieldConstraintFilter3", impl = org.webdsl.search.FieldConstraintFilter.class), @org.hibernate.search.annotations.FullTextFilterDef(name = "fieldConstraintFilter4", impl = org.webdsl.search.FieldConstraintFilter.class), @org.hibernate.search.annotations.FullTextFilterDef(name = "namespaceConstraintFilter", impl = org.webdsl.search.NamespaceConstraintFilter.class)}) @org.hibernate.search.annotations.AnalyzerDefs({@org.hibernate.search.annotations.AnalyzerDef(name = "default", charFilters = {}, tokenizer = @org.hibernate.search.annotations.TokenizerDef(factory = org.apache.solr.analysis.StandardTokenizerFactory.class, params = {}), filters = {@org.hibernate.search.annotations.TokenFilterDef(factory = org.apache.solr.analysis.StandardFilterFactory.class, params = {}), @org.hibernate.search.annotations.TokenFilterDef(factory = org.apache.solr.analysis.LowerCaseFilterFactory.class, params = {}), @org.hibernate.search.annotations.TokenFilterDef(factory = org.apache.solr.analysis.StopFilterFactory.class, params = {})})}) @javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType.SINGLE_TABLE) @javax.persistence.DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 255) @SuppressWarnings("all") class dummy_webdsl_entity  implements org.webdsl.WebDSLEntity
{ 
  public static java.util.List<webdsl.generated.domain.dummy_webdsl_entity> _static_searchdummy_webdsl_entity_(String searchQuery)
  { 
    return _static_searchdummy_webdsl_entity_(searchQuery, 1000, 0);
  }

  public static java.util.List<webdsl.generated.domain.dummy_webdsl_entity> _static_searchdummy_webdsl_entity_(String searchQuery, int limit)
  { 
    return _static_searchdummy_webdsl_entity_(searchQuery, limit, 0);
  }

  public static java.util.List<webdsl.generated.domain.dummy_webdsl_entity> _static_searchdummy_webdsl_entity_(String searchQuery, int limit, int offset)
  { 
    return new webdsl.generated.domain.dummy_webdsl_entitySearcher().query(searchQuery).firstResult(offset).maxResults(limit).list();
  }

  public void validateDelete()
  { 
    java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
    if(exceptions.size() > 0)
    { 
      throw new utils.MultipleValidationExceptions(exceptions);
    }
  }

  public void validateSave()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple mex = this.validateSave_();
    java.util.List<webdsl.generated.domain.ValidationException> ex = mex.getExceptions();
    java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
    for(webdsl.generated.domain.ValidationException v : ex)
    { 
      exceptions.add(new utils.ValidationException(null, v.getMessage()));
    }
    if(exceptions.size() > 0)
    { 
      throw new utils.MultipleValidationExceptions(exceptions);
    }
  }

  public static dummy_webdsl_entity _static_createEmpty_()
  { 
    return new dummy_webdsl_entity();
  }

  public dummy_webdsl_entity () 
  { }

  @javax.persistence.Id @org.hibernate.annotations.Type(type = "utils.UUIDUserType") @org.hibernate.search.annotations.DocumentId @org.hibernate.search.annotations.FieldBridge(impl = UUIDFieldBridge.class) @javax.persistence.Column(name = "id", length = 32) protected java.util.UUID _id = java.util.UUID.randomUUID();

  public java.util.UUID getId()
  { 
    return _id;
  }

  public void setId(java.util.UUID idarg)
  { 
    this._id = idarg;
  }

  public String getNaturalId()
  { 
    return _id.toString();
  }

  @Version @Column(name = "version_opt_lock") protected Integer _version = 0;

  public Integer getVersion()
  { 
    return _version;
  }

  public void setVersion(Integer v)
  { 
    this._version = v;
  }

  @Transient boolean versionWasIncreased = false;

  public void increaseVersion()
  { 
    if(!versionWasIncreased)
    { 
      _version++;
      versionWasIncreased = true;
    }
  }

  @Transient protected boolean isChanged = false;

  public boolean isChanged()
  { 
    return isChanged;
  }

  public void setChanged()
  { 
    isChanged = true;
  }

  public boolean equals(Object o)
  { 
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("dummy_webdsl_entity") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? dummy_webdsl_entity.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : dummy_webdsl_entity.class.cast(o)).getId(), getId());
  }

  public int hashCode()
  { 
    if(getId() == null)
      return super.hashCode();
    else
      return getId().hashCode();
  }

  public int compareTo(org.webdsl.WebDSLEntity o)
  { 
    return getId().compareTo(((dummy_webdsl_entity)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("dummy_webdsl_entity") || s.equals("Object") || s.equals("Entity");
  }

  @javax.persistence.Column(name = "\"_text\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _text = "";

  @org.hibernate.search.annotations.Fields({@org.hibernate.search.annotations.Field(analyzer = @org.hibernate.search.annotations.Analyzer(definition = "default"), name = "text")}) public String getText()
  { 
    return _text;
  }

  public void setText(String newitem)
  { 
    if(!textBeingSet)
    { 
      textBeingSet = true;
      setChanged();
      this.setText_(newitem);
      String olditem = _text;
      _text = newitem;
      textBeingSet = false;
    }
  }

  public void setTextNoEventsOrValidation(String newitem)
  { 
    setChanged();
    _text = newitem;
  }

  @Transient boolean textBeingSet = false;

  public String getName()
  { 
    if(getId() != null)
    { 
      return getId().toString();
    }
    else
    { 
      return "";
    }
  }

  public String get_WebDslEntityType()
  { 
    return "dummy_webdsl_entity";
  }

  public void validateText_internal_(webdsl.generated.domain.ValidationExceptionMultiple v2)
  { 
    if(!(org.webdsl.tools.Utils.equal(this.getText().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getText().length() > 255)
    { 
      v2.addToExceptions(webdsl.generated.functions.ent_dummy_webdsl_entity_objCr1_.ent_dummy_webdsl_entity_objCr1_());
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateText_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v1 = webdsl.generated.functions.ent_dummy_webdsl_entity_objCr0_.ent_dummy_webdsl_entity_objCr0_();
    this.validateText_internal_(v1);
    return v1;
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateSave_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v0 = webdsl.generated.functions.ent_dummy_webdsl_entity_objCr2_.ent_dummy_webdsl_entity_objCr2_();
    this.validateText_internal_(v0);
    return v0;
  }

  public static java.util.List<org.webdsl.WebDSLEntity> $static$all_()
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("from dummy_webdsl_entity").list();
  }

  public java.util.List<org.webdsl.WebDSLEntity> all_()
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("from dummy_webdsl_entity").list();
  }

  public void dummy_webdsl_entity_()
  { }

  public void setText_(String value0)
  { }

  public static java.util.List<webdsl.generated.domain.dummy_webdsl_entity> _static_findByText_(String prop2)
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from dummy_webdsl_entity as g where g . _text = :param28").setParameter("param28", prop2).list();
  }

  public static java.util.List<webdsl.generated.domain.dummy_webdsl_entity> _static_findByTextLike_(String prop1)
  { 
    String s0 = "%" + prop1 + "%";
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from dummy_webdsl_entity as g where g . _text like :param29").setParameter("param29", s0).list();
  }

  public static webdsl.generated.domain.dummy_webdsl_entity _static_load_(java.util.UUID prop0)
  { 
    return (webdsl.generated.domain.dummy_webdsl_entity)org.webdsl.tools.Utils.cast(utils.PageParamLoad.loadEntity(HibernateUtilConfigured.getSessionFactory().getCurrentSession(), "webdsl.generated.domain" + "." + "dummy_webdsl_entity", prop0), webdsl.generated.domain.dummy_webdsl_entity.class);
  }
}