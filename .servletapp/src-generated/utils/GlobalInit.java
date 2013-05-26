package utils;

import java.io.*;
import java.util.HashMap;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import utils.*;
import webdsl.generated.templates.*;
import webdsl.generated.domain.*;
import org.webdsl.lang.Environment;

@SuppressWarnings({"unused", "unchecked"}) public class GlobalInit  
{ 
  private static org.hibernate.Session hibSession;

  static boolean applicationContextPropertyExists(String name, List<ApplicationContextProperty> res)
  { 
    for(ApplicationContextProperty a : res)
    { 
      if(a.getName().equals(name))
        return true;
    }
    return false;
  }

  static java.io.PrintWriter out;

  private static Environment env;

  public static boolean initChecked = false;

  public static void forceLoad()
  { 
    initChecked = false;
    load();
  }

  public static void load()
  { 
    if(!initChecked)
    { 
      hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
      java.io.PrintWriter out = new java.io.PrintWriter(System.out);
      ThreadLocalOut.push(out);
      env = PageServlet.staticEnv;
      boolean pageServletIsNotSet = ThreadLocalPage.get() == null;
      if(pageServletIsNotSet)
      { 
        ThreadLocalPage.set(new GlobalsPageServlet(env));
      }
      org.hibernate.Query q = hibSession.createQuery("from ApplicationContextProperty where name = '__global__init__'");
      List<ApplicationContextProperty> res = q.list();
      if(res.isEmpty())
      { 
        initialize();
        initActions();
        ApplicationContextProperty flag = new ApplicationContextProperty();
        flag.setName("__global__init__");
        hibSession.save(flag);
      }
      hibSession.flush();
      ThreadLocalOut.popChecked(out);
      out = null;
      hibSession = null;
      env = null;
      if(pageServletIsNotSet)
      { 
        ThreadLocalPage.set(null);
      }
      initChecked = true;
    }
  }

  public static void initActions()
  { }

  protected static void initialize()
  { }
}