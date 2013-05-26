package webdsl.generated.domain;

import java.util.*;
import javax.persistence.*;
import webdsl.generated.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @javax.persistence.Entity @javax.persistence.Table(name = "_SessionManager") @javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType.SINGLE_TABLE) @javax.persistence.DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 255) @SuppressWarnings("all") class SessionManager  implements org.webdsl.WebDSLEntity
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

  public static SessionManager _static_createEmpty_()
  { 
    return new SessionManager();
  }

  public SessionManager () 
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
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("SessionManager") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? SessionManager.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : SessionManager.class.cast(o)).getId(), getId());
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
    return getId().compareTo(((SessionManager)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("SessionManager") || s.equals("Object") || s.equals("Entity");
  }

  @ManyToMany(fetch = javax.persistence.FetchType.LAZY) @JoinTable(name = "SessionManager_messages_SessionMessage") @org.hibernate.annotations.IndexColumn(name = "SessionManagermessagesindex", base = 0) @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.MERGE}) protected java.util.List<webdsl.generated.domain.SessionMessage> _messages = new java.util.ArrayList<webdsl.generated.domain.SessionMessage>();

  public java.util.List<webdsl.generated.domain.SessionMessage> getMessages()
  { 
    return _messages;
  }

  public void setMessages(java.util.List<webdsl.generated.domain.SessionMessage> newitem)
  { 
    setChanged();
    _messages = newitem;
  }

  @Transient boolean messagesBeingSet = false;

  public java.util.List<webdsl.generated.domain.SessionMessage> getMessagesList()
  { 
    return new ArrayList(getMessages());
  }

  public void setMessagesList(java.util.List<webdsl.generated.domain.SessionMessage> list23)
  { 
    setChanged();
    setMessages(new java.util.ArrayList<webdsl.generated.domain.SessionMessage>(list23));
  }

  public int getMessagesLength()
  { 
    return getMessages().size();
  }

  public void removeFromMessages(webdsl.generated.domain.SessionMessage item)
  { 
    if(item != null && !messagesBeingSet)
    { 
      messagesBeingSet = true;
      setChanged();
      getMessages().remove(item);
      if(!getMessages().contains(item))
      { 
        this.removeFromMessages_(item);
      }
      messagesBeingSet = false;
    }
  }

  public void replaceAllInMessages(java.util.Collection<webdsl.generated.domain.SessionMessage> col)
  { 
    removeAllFromMessages();
    addAllToMessages(col);
  }

  public void removeAllFromMessages()
  { 
    setChanged();
    org.hibernate.Hibernate.initialize(getMessages());
    while(!getMessages().isEmpty())
    { 
      removeFromMessages(getMessages().iterator().next());
    }
  }

  public void addToMessages(webdsl.generated.domain.SessionMessage item)
  { 
    if(item != null && !messagesBeingSet)
    { 
      setChanged();
      messagesBeingSet = true;
      webdsl.generated.domain.SessionMessage oldthing = new webdsl.generated.domain.SessionMessage();
      getMessages().add(item);
      this.addToMessages_(item);
      messagesBeingSet = false;
    }
  }

  public java.util.List<webdsl.generated.domain.SessionMessage> addAllToMessages(java.util.Collection<webdsl.generated.domain.SessionMessage> col)
  { 
    setChanged();
    Iterator<webdsl.generated.domain.SessionMessage> it = col.iterator();
    while(it.hasNext())
    { 
      addToMessages(it.next());
    }
    return getMessages();
  }

  public void setInMessages(int index, webdsl.generated.domain.SessionMessage newitem)
  { 
    if(newitem != null && !messagesBeingSet && index >= 0 && index < getMessages().size())
    { 
      messagesBeingSet = true;
      setChanged();
      webdsl.generated.domain.SessionMessage item = getMessages().get(index);
      if(!getMessages().contains(item))
      { 
        this.removeFromMessages_(item);
      }
      item = newitem;
      this.addToMessages_(item);
      getMessages().set(index, item);
      messagesBeingSet = false;
    }
  }

  public void insertInMessages(int index, webdsl.generated.domain.SessionMessage item)
  { 
    if(item != null && !messagesBeingSet && index >= 0 && index <= getMessages().size())
    { 
      messagesBeingSet = true;
      setChanged();
      if(!getMessages().contains(item))
      { 
        this.addToMessages_(item);
      }
      getMessages().add(index, item);
      messagesBeingSet = false;
    }
  }

  public void removeAtMessages(int index)
  { 
    if(index >= 0 && index < getMessages().size())
    { 
      messagesBeingSet = true;
      setChanged();
      webdsl.generated.domain.SessionMessage item = getMessages().remove(index);
      if(!getMessages().contains(item))
      { 
        this.removeFromMessages_(item);
      }
      messagesBeingSet = false;
    }
  }

  @Temporal(TemporalType.TIMESTAMP) @javax.persistence.Column(name = "\"_lastUse\"") @org.hibernate.annotations.AccessType(value = "field") protected java.util.Date _lastUse = null;

  public java.util.Date getLastUse()
  { 
    return _lastUse;
  }

  public void setLastUse(java.util.Date newitem)
  { 
    if(!lastUseBeingSet)
    { 
      lastUseBeingSet = true;
      setChanged();
      this.setLastUse_(newitem);
      java.util.Date olditem = _lastUse;
      _lastUse = newitem;
      lastUseBeingSet = false;
    }
  }

  public void setLastUseNoEventsOrValidation(java.util.Date newitem)
  { 
    setChanged();
    _lastUse = newitem;
  }

  @Transient boolean lastUseBeingSet = false;

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
    return "SessionManager";
  }

  public java.util.List<webdsl.generated.domain.SessionMessage> allowedMessages_()
  { 
    return (java.util.List<webdsl.generated.domain.SessionMessage>)(java.util.List<?>)webdsl.generated.domain.SessionMessage.$static$all_();
  }

  public void validateLastUse_internal_(webdsl.generated.domain.ValidationExceptionMultiple v4)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validateLastUse_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v3 = webdsl.generated.functions.ent_SessionManager_objCr1_.ent_SessionManager_objCr1_();
    this.validateLastUse_internal_(v3);
    return v3;
  }

  public void validateMessages_internal_(webdsl.generated.domain.ValidationExceptionMultiple v2)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validateMessages_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v1 = webdsl.generated.functions.ent_SessionManager_objCr0_.ent_SessionManager_objCr0_();
    this.validateMessages_internal_(v1);
    return v1;
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateSave_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v0 = webdsl.generated.functions.ent_SessionManager_objCr2_.ent_SessionManager_objCr2_();
    this.validateLastUse_internal_(v0);
    this.validateMessages_internal_(v0);
    return v0;
  }

  public static java.util.List<org.webdsl.WebDSLEntity> $static$all_()
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("from SessionManager").list();
  }

  public java.util.List<org.webdsl.WebDSLEntity> all_()
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("from SessionManager").list();
  }

  public void SessionManager_()
  { }

  public void removeFromMessages_(webdsl.generated.domain.SessionMessage value2)
  { }

  public void addToMessages_(webdsl.generated.domain.SessionMessage value1)
  { }

  public void setLastUse_(java.util.Date value0)
  { }

  public static webdsl.generated.domain.SessionManager _static_load_(java.util.UUID prop0)
  { 
    return (webdsl.generated.domain.SessionManager)org.webdsl.tools.Utils.cast(utils.PageParamLoad.loadEntity(HibernateUtilConfigured.getSessionFactory().getCurrentSession(), "webdsl.generated.domain" + "." + "SessionManager", prop0), webdsl.generated.domain.SessionManager.class);
  }
}