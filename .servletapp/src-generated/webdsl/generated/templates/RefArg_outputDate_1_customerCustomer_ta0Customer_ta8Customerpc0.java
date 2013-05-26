package webdsl.generated.templates;

import webdsl.generated.domain.*;
import utils.*;

@SuppressWarnings("all") public class RefArg_outputDate_1_customerCustomer_ta0Customer_ta8Customerpc0  implements utils.RefArg
{ 
  public webdsl.generated.domain.Customer arg0;

  public RefArg_outputDate_1_customerCustomer_ta0Customer_ta8Customerpc0 () 
  { }

  public RefArg_outputDate_1_customerCustomer_ta0Customer_ta8Customerpc0 (Object arg0) 
  { 
    this.arg0 = (webdsl.generated.domain.Customer)arg0;
  }

  public webdsl.generated.domain.Customer set(Object obj)
  { 
    arg0.setDateOfBirth((java.util.Date)org.webdsl.tools.Utils.cast(obj, java.util.Date.class));
    return arg0;
  }

  public Object get()
  { 
    return (java.util.Date)arg0.getDateOfBirth();
  }

  public void load(String uuid)
  { 
    if(uuid.contains(":"))
    { 
      arg0 = (webdsl.generated.domain.Customer)utils.PageParamLoad.loadEntityFromParam(HibernateUtilConfigured.getSessionFactory().getCurrentSession(), "webdsl.generated.domain", uuid);
    }
    else
    { 
      try
      { 
        Class<?> cl = org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.Customer");
        arg0 = (webdsl.generated.domain.Customer)HibernateUtilConfigured.getSessionFactory().getCurrentSession().load(cl, java.util.UUID.fromString(uuid));
      }
      catch(ClassNotFoundException cnfe)
      { 
        throw new RuntimeException(cnfe);
      }
    }
  }

  public String getUrlString()
  { 
    return arg0.getId() + "!" + "RefArg_outputDate_1_customerCustomer_ta0Customer_ta8Customerpc0";
  }

  public String get_WebDslEntityType()
  { 
    if(get() == null)
    { 
      return "Date";
    }
    else
    { 
      return ((org.webdsl.WebDSLEntity)get()).get_WebDslEntityType();
    }
  }

  public org.webdsl.WebDSLEntity getEntity()
  { 
    return arg0;
  }

  public void validate(String location, java.util.List<utils.ValidationException> exceptions)
  { 
    webdsl.generated.domain.ValidationExceptionMultiple vem = new webdsl.generated.domain.ValidationExceptionMultiple();
    arg0.validateDateOfBirth_internal_(vem);
    for(webdsl.generated.domain.ValidationException v : vem.getExceptions())
    { 
      exceptions.add(new utils.ValidationException(location, v.getMessage()));
    }
  }

  public java.util.List<String> getValidationErrors()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple vem = new webdsl.generated.domain.ValidationExceptionMultiple();
    arg0.validateDateOfBirth_internal_(vem);
    java.util.List<String> result = new java.util.ArrayList<String>();
    for(webdsl.generated.domain.ValidationException v : vem.getExceptions())
    { 
      result.add(v.getMessage());
    }
    return result;
  }

  public org.webdsl.lang.ReflectionProperty getReflectionProperty()
  { 
    return utils.ThreadLocalServlet.get().getReflectionEntityByName("Customer").getPropertyByName("dateOfBirth");
  }

  public java.util.List<Object> getAllowed()
  { 
    return getReflectionProperty().getAllowed(arg0);
  }
}