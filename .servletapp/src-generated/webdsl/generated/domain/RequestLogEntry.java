package webdsl.generated.domain;

import java.util.*;
import javax.persistence.*;
import webdsl.generated.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @javax.persistence.Entity @javax.persistence.Table(name = "_RequestLogEntry") @javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType.SINGLE_TABLE) @javax.persistence.DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 255) @SuppressWarnings("all") class RequestLogEntry  implements org.webdsl.WebDSLEntity
{ 
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

  public static RequestLogEntry _static_createEmpty_()
  { 
    return new RequestLogEntry();
  }

  public RequestLogEntry () 
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
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("RequestLogEntry") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? RequestLogEntry.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : RequestLogEntry.class.cast(o)).getId(), getId());
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
    return getId().compareTo(((RequestLogEntry)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("RequestLogEntry") || s.equals("Object") || s.equals("Entity");
  }

  @javax.persistence.Column(name = "\"_name\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _name = "";

  public String getName()
  { 
    return _name;
  }

  public void setName(String newitem)
  { 
    if(!nameBeingSet)
    { 
      nameBeingSet = true;
      setChanged();
      this.setName_(newitem);
      String olditem = _name;
      _name = newitem;
      nameBeingSet = false;
    }
  }

  public void setNameNoEventsOrValidation(String newitem)
  { 
    setChanged();
    _name = newitem;
  }

  @Transient boolean nameBeingSet = false;

  @javax.persistence.Column(name = "\"_requestedURL\"", length = 1000000) @org.hibernate.annotations.AccessType(value = "field") protected String _requestedURL = "";

  public String getRequestedURL()
  { 
    return _requestedURL;
  }

  public void setRequestedURL(String newitem)
  { 
    if(!requestedURLBeingSet)
    { 
      requestedURLBeingSet = true;
      setChanged();
      this.setRequestedURL_(newitem);
      String olditem = _requestedURL;
      _requestedURL = newitem;
      requestedURLBeingSet = false;
    }
  }

  public void setRequestedURLNoEventsOrValidation(String newitem)
  { 
    setChanged();
    _requestedURL = newitem;
  }

  @Transient boolean requestedURLBeingSet = false;

  @Temporal(TemporalType.TIMESTAMP) @javax.persistence.Column(name = "\"_start\"") @org.hibernate.annotations.AccessType(value = "field") protected java.util.Date _start = null;

  public java.util.Date getStart()
  { 
    return _start;
  }

  public void setStart(java.util.Date newitem)
  { 
    if(!startBeingSet)
    { 
      startBeingSet = true;
      setChanged();
      this.setStart_(newitem);
      java.util.Date olditem = _start;
      _start = newitem;
      startBeingSet = false;
    }
  }

  public void setStartNoEventsOrValidation(java.util.Date newitem)
  { 
    setChanged();
    _start = newitem;
  }

  @Transient boolean startBeingSet = false;

  @Temporal(TemporalType.TIMESTAMP) @javax.persistence.Column(name = "\"_end\"") @org.hibernate.annotations.AccessType(value = "field") protected java.util.Date _end = null;

  public java.util.Date getEnd()
  { 
    return _end;
  }

  public void setEnd(java.util.Date newitem)
  { 
    if(!endBeingSet)
    { 
      endBeingSet = true;
      setChanged();
      this.setEnd_(newitem);
      java.util.Date olditem = _end;
      _end = newitem;
      endBeingSet = false;
    }
  }

  public void setEndNoEventsOrValidation(java.util.Date newitem)
  { 
    setChanged();
    _end = newitem;
  }

  @Transient boolean endBeingSet = false;

  @javax.persistence.Column(name = "\"_clientIP\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _clientIP = "";

  public String getClientIP()
  { 
    return _clientIP;
  }

  public void setClientIP(String newitem)
  { 
    if(!clientIPBeingSet)
    { 
      clientIPBeingSet = true;
      setChanged();
      this.setClientIP_(newitem);
      String olditem = _clientIP;
      _clientIP = newitem;
      clientIPBeingSet = false;
    }
  }

  public void setClientIPNoEventsOrValidation(String newitem)
  { 
    setChanged();
    _clientIP = newitem;
  }

  @Transient boolean clientIPBeingSet = false;

  @javax.persistence.Column(name = "\"_clientPort\"") @org.hibernate.annotations.AccessType(value = "field") protected Integer _clientPort = 0;

  public Integer getClientPort()
  { 
    return _clientPort;
  }

  public void setClientPort(Integer newitem)
  { 
    if(!clientPortBeingSet)
    { 
      clientPortBeingSet = true;
      setChanged();
      this.setClientPort_(newitem);
      Integer olditem = _clientPort;
      _clientPort = newitem;
      clientPortBeingSet = false;
    }
  }

  public void setClientPortNoEventsOrValidation(Integer newitem)
  { 
    setChanged();
    _clientPort = newitem;
  }

  @Transient boolean clientPortBeingSet = false;

  @javax.persistence.Column(name = "\"_method\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _method = "";

  public String getMethod()
  { 
    return _method;
  }

  public void setMethod(String newitem)
  { 
    if(!methodBeingSet)
    { 
      methodBeingSet = true;
      setChanged();
      this.setMethod_(newitem);
      String olditem = _method;
      _method = newitem;
      methodBeingSet = false;
    }
  }

  public void setMethodNoEventsOrValidation(String newitem)
  { 
    setChanged();
    _method = newitem;
  }

  @Transient boolean methodBeingSet = false;

  @javax.persistence.Column(name = "\"_referer\"", length = 1000000) @org.hibernate.annotations.AccessType(value = "field") protected String _referer = "";

  public String getReferer()
  { 
    return _referer;
  }

  public void setReferer(String newitem)
  { 
    if(!refererBeingSet)
    { 
      refererBeingSet = true;
      setChanged();
      this.setReferer_(newitem);
      String olditem = _referer;
      _referer = newitem;
      refererBeingSet = false;
    }
  }

  public void setRefererNoEventsOrValidation(String newitem)
  { 
    setChanged();
    _referer = newitem;
  }

  @Transient boolean refererBeingSet = false;

  @javax.persistence.Column(name = "\"_userAgent\"", length = 1000000) @org.hibernate.annotations.AccessType(value = "field") protected String _userAgent = "";

  public String getUserAgent()
  { 
    return _userAgent;
  }

  public void setUserAgent(String newitem)
  { 
    if(!userAgentBeingSet)
    { 
      userAgentBeingSet = true;
      setChanged();
      this.setUserAgent_(newitem);
      String olditem = _userAgent;
      _userAgent = newitem;
      userAgentBeingSet = false;
    }
  }

  public void setUserAgentNoEventsOrValidation(String newitem)
  { 
    setChanged();
    _userAgent = newitem;
  }

  @Transient boolean userAgentBeingSet = false;

  @javax.persistence.Column(name = "\"_queryExecutionCount\"") @org.hibernate.annotations.AccessType(value = "field") protected Integer _queryExecutionCount = 0;

  public Integer getQueryExecutionCount()
  { 
    return _queryExecutionCount;
  }

  public void setQueryExecutionCount(Integer newitem)
  { 
    if(!queryExecutionCountBeingSet)
    { 
      queryExecutionCountBeingSet = true;
      setChanged();
      this.setQueryExecutionCount_(newitem);
      Integer olditem = _queryExecutionCount;
      _queryExecutionCount = newitem;
      queryExecutionCountBeingSet = false;
    }
  }

  public void setQueryExecutionCountNoEventsOrValidation(Integer newitem)
  { 
    setChanged();
    _queryExecutionCount = newitem;
  }

  @Transient boolean queryExecutionCountBeingSet = false;

  @javax.persistence.Column(name = "\"_queryExecutionMaxTime\"") @org.hibernate.annotations.AccessType(value = "field") protected Integer _queryExecutionMaxTime = 0;

  public Integer getQueryExecutionMaxTime()
  { 
    return _queryExecutionMaxTime;
  }

  public void setQueryExecutionMaxTime(Integer newitem)
  { 
    if(!queryExecutionMaxTimeBeingSet)
    { 
      queryExecutionMaxTimeBeingSet = true;
      setChanged();
      this.setQueryExecutionMaxTime_(newitem);
      Integer olditem = _queryExecutionMaxTime;
      _queryExecutionMaxTime = newitem;
      queryExecutionMaxTimeBeingSet = false;
    }
  }

  public void setQueryExecutionMaxTimeNoEventsOrValidation(Integer newitem)
  { 
    setChanged();
    _queryExecutionMaxTime = newitem;
  }

  @Transient boolean queryExecutionMaxTimeBeingSet = false;

  @javax.persistence.Column(name = "\"_queryExecutionMaxTimeQueryString\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _queryExecutionMaxTimeQueryString = "";

  public String getQueryExecutionMaxTimeQueryString()
  { 
    return _queryExecutionMaxTimeQueryString;
  }

  public void setQueryExecutionMaxTimeQueryString(String newitem)
  { 
    if(!queryExecutionMaxTimeQueryStringBeingSet)
    { 
      queryExecutionMaxTimeQueryStringBeingSet = true;
      setChanged();
      this.setQueryExecutionMaxTimeQueryString_(newitem);
      String olditem = _queryExecutionMaxTimeQueryString;
      _queryExecutionMaxTimeQueryString = newitem;
      queryExecutionMaxTimeQueryStringBeingSet = false;
    }
  }

  public void setQueryExecutionMaxTimeQueryStringNoEventsOrValidation(String newitem)
  { 
    setChanged();
    _queryExecutionMaxTimeQueryString = newitem;
  }

  @Transient boolean queryExecutionMaxTimeQueryStringBeingSet = false;

  public String get_WebDslEntityType()
  { 
    return "RequestLogEntry";
  }

  public void validateQueryExecutionMaxTimeQueryString_internal_(webdsl.generated.domain.ValidationExceptionMultiple v24)
  { 
    if(!(org.webdsl.tools.Utils.equal(this.getQueryExecutionMaxTimeQueryString().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getQueryExecutionMaxTimeQueryString().length() > 255)
    { 
      v24.addToExceptions(webdsl.generated.functions.ent_RequestLogEntry_objCr18_.ent_RequestLogEntry_objCr18_());
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateQueryExecutionMaxTimeQueryString_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v23 = webdsl.generated.functions.ent_RequestLogEntry_objCr17_.ent_RequestLogEntry_objCr17_();
    this.validateQueryExecutionMaxTimeQueryString_internal_(v23);
    return v23;
  }

  public void validateQueryExecutionMaxTime_internal_(webdsl.generated.domain.ValidationExceptionMultiple v22)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validateQueryExecutionMaxTime_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v21 = webdsl.generated.functions.ent_RequestLogEntry_objCr16_.ent_RequestLogEntry_objCr16_();
    this.validateQueryExecutionMaxTime_internal_(v21);
    return v21;
  }

  public void validateQueryExecutionCount_internal_(webdsl.generated.domain.ValidationExceptionMultiple v20)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validateQueryExecutionCount_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v19 = webdsl.generated.functions.ent_RequestLogEntry_objCr15_.ent_RequestLogEntry_objCr15_();
    this.validateQueryExecutionCount_internal_(v19);
    return v19;
  }

  public void validateUserAgent_internal_(webdsl.generated.domain.ValidationExceptionMultiple v18)
  { 
    if(!(org.webdsl.tools.Utils.equal(this.getUserAgent().length(), null) || org.webdsl.tools.Utils.equal(1000000, null)) && this.getUserAgent().length() > 1000000)
    { 
      v18.addToExceptions(webdsl.generated.functions.ent_RequestLogEntry_objCr14_.ent_RequestLogEntry_objCr14_());
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateUserAgent_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v17 = webdsl.generated.functions.ent_RequestLogEntry_objCr13_.ent_RequestLogEntry_objCr13_();
    this.validateUserAgent_internal_(v17);
    return v17;
  }

  public void validateReferer_internal_(webdsl.generated.domain.ValidationExceptionMultiple v16)
  { 
    if(!(org.webdsl.tools.Utils.equal(this.getReferer().length(), null) || org.webdsl.tools.Utils.equal(1000000, null)) && this.getReferer().length() > 1000000)
    { 
      v16.addToExceptions(webdsl.generated.functions.ent_RequestLogEntry_objCr12_.ent_RequestLogEntry_objCr12_());
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateReferer_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v15 = webdsl.generated.functions.ent_RequestLogEntry_objCr11_.ent_RequestLogEntry_objCr11_();
    this.validateReferer_internal_(v15);
    return v15;
  }

  public void validateMethod_internal_(webdsl.generated.domain.ValidationExceptionMultiple v14)
  { 
    if(!(org.webdsl.tools.Utils.equal(this.getMethod().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getMethod().length() > 255)
    { 
      v14.addToExceptions(webdsl.generated.functions.ent_RequestLogEntry_objCr10_.ent_RequestLogEntry_objCr10_());
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateMethod_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v13 = webdsl.generated.functions.ent_RequestLogEntry_objCr9_.ent_RequestLogEntry_objCr9_();
    this.validateMethod_internal_(v13);
    return v13;
  }

  public void validateClientPort_internal_(webdsl.generated.domain.ValidationExceptionMultiple v12)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validateClientPort_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v11 = webdsl.generated.functions.ent_RequestLogEntry_objCr8_.ent_RequestLogEntry_objCr8_();
    this.validateClientPort_internal_(v11);
    return v11;
  }

  public void validateClientIP_internal_(webdsl.generated.domain.ValidationExceptionMultiple v10)
  { 
    if(!(org.webdsl.tools.Utils.equal(this.getClientIP().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getClientIP().length() > 255)
    { 
      v10.addToExceptions(webdsl.generated.functions.ent_RequestLogEntry_objCr7_.ent_RequestLogEntry_objCr7_());
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateClientIP_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v9 = webdsl.generated.functions.ent_RequestLogEntry_objCr6_.ent_RequestLogEntry_objCr6_();
    this.validateClientIP_internal_(v9);
    return v9;
  }

  public void validateEnd_internal_(webdsl.generated.domain.ValidationExceptionMultiple v8)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validateEnd_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v7 = webdsl.generated.functions.ent_RequestLogEntry_objCr5_.ent_RequestLogEntry_objCr5_();
    this.validateEnd_internal_(v7);
    return v7;
  }

  public void validateStart_internal_(webdsl.generated.domain.ValidationExceptionMultiple v6)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validateStart_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v5 = webdsl.generated.functions.ent_RequestLogEntry_objCr4_.ent_RequestLogEntry_objCr4_();
    this.validateStart_internal_(v5);
    return v5;
  }

  public void validateRequestedURL_internal_(webdsl.generated.domain.ValidationExceptionMultiple v4)
  { 
    if(!(org.webdsl.tools.Utils.equal(this.getRequestedURL().length(), null) || org.webdsl.tools.Utils.equal(1000000, null)) && this.getRequestedURL().length() > 1000000)
    { 
      v4.addToExceptions(webdsl.generated.functions.ent_RequestLogEntry_objCr3_.ent_RequestLogEntry_objCr3_());
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateRequestedURL_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v3 = webdsl.generated.functions.ent_RequestLogEntry_objCr2_.ent_RequestLogEntry_objCr2_();
    this.validateRequestedURL_internal_(v3);
    return v3;
  }

  public void validateName_internal_(webdsl.generated.domain.ValidationExceptionMultiple v2)
  { 
    if(!(org.webdsl.tools.Utils.equal(this.getName().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getName().length() > 255)
    { 
      v2.addToExceptions(webdsl.generated.functions.ent_RequestLogEntry_objCr1_.ent_RequestLogEntry_objCr1_());
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateName_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v1 = webdsl.generated.functions.ent_RequestLogEntry_objCr0_.ent_RequestLogEntry_objCr0_();
    this.validateName_internal_(v1);
    return v1;
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateSave_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v0 = webdsl.generated.functions.ent_RequestLogEntry_objCr19_.ent_RequestLogEntry_objCr19_();
    this.validateClientIP_internal_(v0);
    this.validateClientPort_internal_(v0);
    this.validateEnd_internal_(v0);
    this.validateMethod_internal_(v0);
    this.validateName_internal_(v0);
    this.validateQueryExecutionCount_internal_(v0);
    this.validateQueryExecutionMaxTime_internal_(v0);
    this.validateQueryExecutionMaxTimeQueryString_internal_(v0);
    this.validateReferer_internal_(v0);
    this.validateRequestedURL_internal_(v0);
    this.validateStart_internal_(v0);
    this.validateUserAgent_internal_(v0);
    return v0;
  }

  public static java.util.List<org.webdsl.WebDSLEntity> $static$all_()
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("from RequestLogEntry").list();
  }

  public java.util.List<org.webdsl.WebDSLEntity> all_()
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("from RequestLogEntry").list();
  }

  public void RequestLogEntry_()
  { }

  public void setName_(String value11)
  { }

  public void setRequestedURL_(String value10)
  { }

  public void setStart_(java.util.Date value9)
  { }

  public void setEnd_(java.util.Date value8)
  { }

  public void setClientIP_(String value7)
  { }

  public void setClientPort_(Integer value6)
  { }

  public void setMethod_(String value5)
  { }

  public void setReferer_(String value4)
  { }

  public void setUserAgent_(String value3)
  { }

  public void setQueryExecutionCount_(Integer value2)
  { }

  public void setQueryExecutionMaxTime_(Integer value1)
  { }

  public void setQueryExecutionMaxTimeQueryString_(String value0)
  { }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByName_(String prop14)
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _name = :param12").setParameter("param12", prop14).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByNameLike_(String prop13)
  { 
    String s6 = "%" + prop13 + "%";
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _name like :param13").setParameter("param13", s6).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByRequestedURL_(String prop12)
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _requestedURL = :param14").setParameter("param14", prop12).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByRequestedURLLike_(String prop11)
  { 
    String s5 = "%" + prop11 + "%";
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _requestedURL like :param15").setParameter("param15", s5).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByClientIP_(String prop10)
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _clientIP = :param16").setParameter("param16", prop10).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByClientIPLike_(String prop9)
  { 
    String s4 = "%" + prop9 + "%";
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _clientIP like :param17").setParameter("param17", s4).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByMethod_(String prop8)
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _method = :param18").setParameter("param18", prop8).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByMethodLike_(String prop7)
  { 
    String s3 = "%" + prop7 + "%";
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _method like :param19").setParameter("param19", s3).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByReferer_(String prop6)
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _referer = :param20").setParameter("param20", prop6).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByRefererLike_(String prop5)
  { 
    String s2 = "%" + prop5 + "%";
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _referer like :param21").setParameter("param21", s2).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByUserAgent_(String prop4)
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _userAgent = :param22").setParameter("param22", prop4).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByUserAgentLike_(String prop3)
  { 
    String s1 = "%" + prop3 + "%";
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _userAgent like :param23").setParameter("param23", s1).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByQueryExecutionMaxTimeQueryString_(String prop2)
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _queryExecutionMaxTimeQueryString = :param24").setParameter("param24", prop2).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByQueryExecutionMaxTimeQueryStringLike_(String prop1)
  { 
    String s0 = "%" + prop1 + "%";
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from RequestLogEntry as g where g . _queryExecutionMaxTimeQueryString like :param25").setParameter("param25", s0).list();
  }

  public static webdsl.generated.domain.RequestLogEntry _static_load_(java.util.UUID prop0)
  { 
    return (webdsl.generated.domain.RequestLogEntry)org.webdsl.tools.Utils.cast(utils.PageParamLoad.loadEntity(HibernateUtilConfigured.getSessionFactory().getCurrentSession(), "webdsl.generated.domain" + "." + "RequestLogEntry", prop0), webdsl.generated.domain.RequestLogEntry.class);
  }
}