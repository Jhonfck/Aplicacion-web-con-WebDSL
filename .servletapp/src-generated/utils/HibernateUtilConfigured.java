package utils;

import java.util.Properties;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.webdsl.*;
import org.hibernate.event.*;
import org.hibernate.event.def.*;
import java.util.*;
import webdsl.generated.domain.*;

@SuppressWarnings("unused") public class HibernateUtilConfigured  
{ 
  private static final SessionFactory sessionFactory;

  private static Configuration annotationConfiguration;

  static
  { 
    try
    { 
      annotationConfiguration = new Configuration();
      annotationConfiguration.addPackage("utils");
      annotationConfiguration.addAnnotatedClass(utils.ApplicationContextProperty.class);
      annotationConfiguration.addAnnotatedClass(utils.File.class);
      annotationConfiguration.addPackage("webdsl.generated.domain");
      annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.Customer.class);
      annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.dummy_webdsl_entity.class);
      annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.QueuedEmail.class);
      annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.RequestLogEntry.class);
      annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.SessionManager.class);
      annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.SessionMessage.class);
      annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.ValidationException.class);
      annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.ValidationExceptionMultiple.class);
      annotationConfiguration.setListener("save-update", new SetVersionSaveOrUpdateEventListener());
      annotationConfiguration.setListener("flush-entity", new SetValidationEventListener());
      sessionFactory = annotationConfiguration.buildSessionFactory();
    }
    catch(Throwable ex)
    { 
      throw new ExceptionInInitializerError(ex);
    }
  }

  public static SessionFactory getSessionFactory()
  { 
    return sessionFactory;
  }

  public static Configuration getAnnotationConfiguration()
  { 
    return annotationConfiguration;
  }

  @SuppressWarnings("serial") private static class SetVersionSaveOrUpdateEventListener extends DefaultSaveOrUpdateEventListener 
  { 
    public void onSaveOrUpdate(SaveOrUpdateEvent event) throws HibernateException
    { 
      setVersion(event.getObject());
      super.onSaveOrUpdate(event);
    }

    public void setVersion(Object o)
    { 
      if(org.hibernate.Hibernate.isInitialized(o) && o instanceof WebDSLEntity)
      { 
        WebDSLEntity we = (WebDSLEntity)o;
        if(we.getVersion() <= 0)
        { 
          we.setVersion(1);
        }
      }
    }
  }

  @SuppressWarnings("serial") private static class SetValidationEventListener extends DefaultFlushEntityEventListener 
  { 
    public void onFlushEntity(FlushEntityEvent event) throws HibernateException
    { 
      validate(event.getEntity());
      super.onFlushEntity(event);
    }

    public void validate(Object o)
    { 
      if(o instanceof WebDSLEntity)
      { 
        WebDSLEntity we = (WebDSLEntity)o;
        AbstractPageServlet aps = ThreadLocalPage.get();
        if(aps != null)
        { 
          aps.addEntityToValidateAfterAction(we);
        }
      }
    }
  }
}