package webdsl.generated.templates;

import webdsl.generated.domain.*;

@SuppressWarnings("all") public class RefArg_customer0  implements utils.RefArg
{ 
  public customer_Template template;

  public RefArg_customer0 (customer_Template templ) 
  { 
    this.template = templ;
  }

  public Object set(Object obj)
  { 
    template.setArg0((webdsl.generated.domain.Customer)org.webdsl.tools.Utils.cast(obj, webdsl.generated.domain.Customer.class));
    return this;
  }

  public Object get()
  { 
    return template.getArg0();
  }

  public void load(String uuid)
  { }

  public org.webdsl.WebDSLEntity getEntity()
  { 
    return null;
  }

  public String get_WebDslEntityType()
  { 
    return "not supported for this type of reference argument (refers to template variable)";
  }

  public String getUrlString()
  { 
    return "not supported for this type of reference argument (refers to template variable)";
  }

  public void validate(String location, java.util.List<utils.ValidationException> exceptions)
  { }

  public java.util.List<String> getValidationErrors()
  { 
    return new java.util.ArrayList<String>();
  }

  public org.webdsl.lang.ReflectionProperty getReflectionProperty()
  { 
    return null;
  }

  public java.util.List<Object> getAllowed()
  { 
    return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.Customer.$static$all_();
  }
}