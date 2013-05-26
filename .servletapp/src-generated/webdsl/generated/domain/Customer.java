package webdsl.generated.domain;

import java.util.*;
import javax.persistence.*;
import webdsl.generated.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @javax.persistence.Entity @javax.persistence.Table(name = "_Customer") @javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType.SINGLE_TABLE) @javax.persistence.DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 255) @SuppressWarnings("all") class Customer  implements org.webdsl.WebDSLEntity
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

  public static Customer _static_createEmpty_()
  { 
    return new Customer();
  }

  public Customer () 
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
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("Customer") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? Customer.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : Customer.class.cast(o)).getId(), getId());
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
    return getId().compareTo(((Customer)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("Customer") || s.equals("Object") || s.equals("Entity");
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

  @javax.persistence.Column(name = "\"_surname\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _surname = "";

  public String getSurname()
  { 
    return _surname;
  }

  public void setSurname(String newitem)
  { 
    if(!surnameBeingSet)
    { 
      surnameBeingSet = true;
      setChanged();
      this.setSurname_(newitem);
      String olditem = _surname;
      _surname = newitem;
      surnameBeingSet = false;
    }
  }

  public void setSurnameNoEventsOrValidation(String newitem)
  { 
    setChanged();
    _surname = newitem;
  }

  @Transient boolean surnameBeingSet = false;

  @javax.persistence.Column(name = "\"_address\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _address = "";

  public String getAddress()
  { 
    return _address;
  }

  public void setAddress(String newitem)
  { 
    if(!addressBeingSet)
    { 
      addressBeingSet = true;
      setChanged();
      this.setAddress_(newitem);
      String olditem = _address;
      _address = newitem;
      addressBeingSet = false;
    }
  }

  public void setAddressNoEventsOrValidation(String newitem)
  { 
    setChanged();
    _address = newitem;
  }

  @Transient boolean addressBeingSet = false;

  @javax.persistence.Column(name = "\"_email\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _email = "";

  public String getEmail()
  { 
    return _email;
  }

  public void setEmail(String newitem)
  { 
    if(!emailBeingSet)
    { 
      emailBeingSet = true;
      setChanged();
      this.setEmail_(newitem);
      String olditem = _email;
      _email = newitem;
      emailBeingSet = false;
    }
  }

  public void setEmailNoEventsOrValidation(String newitem)
  { 
    setChanged();
    _email = newitem;
  }

  @Transient boolean emailBeingSet = false;

  @Temporal(TemporalType.DATE) @javax.persistence.Column(name = "\"_dateOfBirth\"") @org.hibernate.annotations.AccessType(value = "field") protected java.util.Date _dateOfBirth = null;

  public java.util.Date getDateOfBirth()
  { 
    return _dateOfBirth;
  }

  public void setDateOfBirth(java.util.Date newitem)
  { 
    if(!dateOfBirthBeingSet)
    { 
      dateOfBirthBeingSet = true;
      setChanged();
      this.setDateOfBirth_(newitem);
      java.util.Date olditem = _dateOfBirth;
      _dateOfBirth = newitem;
      dateOfBirthBeingSet = false;
    }
  }

  public void setDateOfBirthNoEventsOrValidation(java.util.Date newitem)
  { 
    setChanged();
    _dateOfBirth = newitem;
  }

  @Transient boolean dateOfBirthBeingSet = false;

  @javax.persistence.Column(name = "\"_bio\"", length = 1000000) @org.hibernate.annotations.AccessType(value = "field") protected String _bio = "";

  public String getBio()
  { 
    return _bio;
  }

  public void setBio(String newitem)
  { 
    if(!bioBeingSet)
    { 
      bioBeingSet = true;
      setChanged();
      this.setBio_(newitem);
      String olditem = _bio;
      _bio = newitem;
      bioBeingSet = false;
    }
  }

  public void setBioNoEventsOrValidation(String newitem)
  { 
    setChanged();
    _bio = newitem;
  }

  @Transient boolean bioBeingSet = false;

  @org.hibernate.annotations.AccessType(value = "field") @OneToOne(fetch = javax.persistence.FetchType.LAZY) @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.MERGE}) protected utils.File _photo = null;

  public utils.File getPhoto()
  { 
    return _photo;
  }

  public void setPhoto(utils.File newitem)
  { 
    if(!photoBeingSet)
    { 
      photoBeingSet = true;
      setChanged();
      this.setPhoto_(newitem);
      utils.File olditem = _photo;
      _photo = newitem;
      photoBeingSet = false;
    }
  }

  public void setPhotoNoEventsOrValidation(utils.File newitem)
  { 
    setChanged();
    _photo = newitem;
  }

  @Transient boolean photoBeingSet = false;

  public String get_WebDslEntityType()
  { 
    return "Customer";
  }

  public void validatePhoto_internal_(webdsl.generated.domain.ValidationExceptionMultiple v14)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validatePhoto_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v13 = webdsl.generated.functions.ent_Customer_objCr11_.ent_Customer_objCr11_();
    this.validatePhoto_internal_(v13);
    return v13;
  }

  public void validateBio_internal_(webdsl.generated.domain.ValidationExceptionMultiple v12)
  { 
    if(!(org.webdsl.tools.Utils.equal(this.getBio().length(), null) || org.webdsl.tools.Utils.equal(1000000, null)) && this.getBio().length() > 1000000)
    { 
      v12.addToExceptions(webdsl.generated.functions.ent_Customer_objCr10_.ent_Customer_objCr10_());
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateBio_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v11 = webdsl.generated.functions.ent_Customer_objCr9_.ent_Customer_objCr9_();
    this.validateBio_internal_(v11);
    return v11;
  }

  public void validateDateOfBirth_internal_(webdsl.generated.domain.ValidationExceptionMultiple v10)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validateDateOfBirth_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v9 = webdsl.generated.functions.ent_Customer_objCr8_.ent_Customer_objCr8_();
    this.validateDateOfBirth_internal_(v9);
    return v9;
  }

  public void validateEmail_internal_(webdsl.generated.domain.ValidationExceptionMultiple v8)
  { 
    if(!(org.webdsl.tools.Utils.equal(this.getEmail().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getEmail().length() > 255)
    { 
      v8.addToExceptions(webdsl.generated.functions.ent_Customer_objCr7_.ent_Customer_objCr7_());
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateEmail_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v7 = webdsl.generated.functions.ent_Customer_objCr6_.ent_Customer_objCr6_();
    this.validateEmail_internal_(v7);
    return v7;
  }

  public void validateAddress_internal_(webdsl.generated.domain.ValidationExceptionMultiple v6)
  { 
    if(!(org.webdsl.tools.Utils.equal(this.getAddress().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getAddress().length() > 255)
    { 
      v6.addToExceptions(webdsl.generated.functions.ent_Customer_objCr5_.ent_Customer_objCr5_());
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateAddress_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v5 = webdsl.generated.functions.ent_Customer_objCr4_.ent_Customer_objCr4_();
    this.validateAddress_internal_(v5);
    return v5;
  }

  public void validateSurname_internal_(webdsl.generated.domain.ValidationExceptionMultiple v4)
  { 
    if(!(org.webdsl.tools.Utils.equal(this.getSurname().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getSurname().length() > 255)
    { 
      v4.addToExceptions(webdsl.generated.functions.ent_Customer_objCr3_.ent_Customer_objCr3_());
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateSurname_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v3 = webdsl.generated.functions.ent_Customer_objCr2_.ent_Customer_objCr2_();
    this.validateSurname_internal_(v3);
    return v3;
  }

  public void validateName_internal_(webdsl.generated.domain.ValidationExceptionMultiple v2)
  { 
    if(!(org.webdsl.tools.Utils.equal(this.getName().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getName().length() > 255)
    { 
      v2.addToExceptions(webdsl.generated.functions.ent_Customer_objCr1_.ent_Customer_objCr1_());
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateName_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v1 = webdsl.generated.functions.ent_Customer_objCr0_.ent_Customer_objCr0_();
    this.validateName_internal_(v1);
    return v1;
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateSave_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v0 = webdsl.generated.functions.ent_Customer_objCr12_.ent_Customer_objCr12_();
    this.validateAddress_internal_(v0);
    this.validateBio_internal_(v0);
    this.validateDateOfBirth_internal_(v0);
    this.validateEmail_internal_(v0);
    this.validateName_internal_(v0);
    this.validatePhoto_internal_(v0);
    this.validateSurname_internal_(v0);
    return v0;
  }

  public static java.util.List<org.webdsl.WebDSLEntity> $static$all_()
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("from Customer").list();
  }

  public java.util.List<org.webdsl.WebDSLEntity> all_()
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("from Customer").list();
  }

  public void Customer_()
  { }

  public void setName_(String value6)
  { }

  public void setSurname_(String value5)
  { }

  public void setAddress_(String value4)
  { }

  public void setEmail_(String value3)
  { }

  public void setDateOfBirth_(java.util.Date value2)
  { }

  public void setBio_(String value1)
  { }

  public void setPhoto_(utils.File value0)
  { }

  public static java.util.List<webdsl.generated.domain.Customer> _static_findByName_(String prop10)
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from Customer as g where g . _name = :param55").setParameter("param55", prop10).list();
  }

  public static java.util.List<webdsl.generated.domain.Customer> _static_findByNameLike_(String prop9)
  { 
    String s4 = "%" + prop9 + "%";
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from Customer as g where g . _name like :param56").setParameter("param56", s4).list();
  }

  public static java.util.List<webdsl.generated.domain.Customer> _static_findBySurname_(String prop8)
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from Customer as g where g . _surname = :param57").setParameter("param57", prop8).list();
  }

  public static java.util.List<webdsl.generated.domain.Customer> _static_findBySurnameLike_(String prop7)
  { 
    String s3 = "%" + prop7 + "%";
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from Customer as g where g . _surname like :param58").setParameter("param58", s3).list();
  }

  public static java.util.List<webdsl.generated.domain.Customer> _static_findByAddress_(String prop6)
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from Customer as g where g . _address = :param59").setParameter("param59", prop6).list();
  }

  public static java.util.List<webdsl.generated.domain.Customer> _static_findByAddressLike_(String prop5)
  { 
    String s2 = "%" + prop5 + "%";
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from Customer as g where g . _address like :param60").setParameter("param60", s2).list();
  }

  public static java.util.List<webdsl.generated.domain.Customer> _static_findByEmail_(String prop4)
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from Customer as g where g . _email = :param61").setParameter("param61", prop4).list();
  }

  public static java.util.List<webdsl.generated.domain.Customer> _static_findByEmailLike_(String prop3)
  { 
    String s1 = "%" + prop3 + "%";
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from Customer as g where g . _email like :param62").setParameter("param62", s1).list();
  }

  public static java.util.List<webdsl.generated.domain.Customer> _static_findByBio_(String prop2)
  { 
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from Customer as g where g . _bio = :param63").setParameter("param63", prop2).list();
  }

  public static java.util.List<webdsl.generated.domain.Customer> _static_findByBioLike_(String prop1)
  { 
    String s0 = "%" + prop1 + "%";
    return HibernateUtilConfigured.getSessionFactory().getCurrentSession().createQuery("select g from Customer as g where g . _bio like :param64").setParameter("param64", s0).list();
  }

  public static webdsl.generated.domain.Customer _static_load_(java.util.UUID prop0)
  { 
    return (webdsl.generated.domain.Customer)org.webdsl.tools.Utils.cast(utils.PageParamLoad.loadEntity(HibernateUtilConfigured.getSessionFactory().getCurrentSession(), "webdsl.generated.domain" + "." + "Customer", prop0), webdsl.generated.domain.Customer.class);
  }
}