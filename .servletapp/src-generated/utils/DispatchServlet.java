package utils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;
import javax.servlet.*;
import javax.servlet.http.*;
import utils.*;
import webdsl.generated.templates.*;
import webdsl.generated.domain.*;
import org.webdsl.lang.Environment;

@SuppressWarnings({"serial", "unused"}) public class DispatchServlet extends HttpServlet 
{ 
  public static void tryLoadGlobalsAndPerformInit()
  { 
    org.hibernate.Session hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
    try
    { 
      hibSession.beginTransaction();
      GlobalVariables.load();
      GlobalInit.load();
      hibSession.getTransaction().commit();
    }
    catch(Exception se)
    { 
      System.out.println("*** Exception occured in application init. WebDSL application will not run correctly. ***");
      se.printStackTrace();
      hibSession.getTransaction().rollback();
    }
  }

  private java.util.Timer timer;

  public void init()
  { 
    tryLoadGlobalsAndPerformInit();
    timer = new java.util.Timer();
    java.util.TimerTask timer30 = new java.util.TimerTask()
                                  { 
                                    public void run()
                                    { 
                                      if(utils.GlobalVariables.globalvarsChecked && utils.GlobalInit.initChecked)
                                      { 
                                        org.hibernate.Session hibSession = null;
                                        try
                                        { 
                                          hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
                                          hibSession.beginTransaction();
                                          Environment env = new Environment(PageServlet.staticEnv);
                                          if(DispatchServlet.initGlobalVars(env, hibSession))
                                          { 
                                            AbstractPageServlet ps = new GlobalsPageServlet(env);
                                            ps.setHibSession(hibSession);
                                            ThreadLocalPage.set(ps);
                                            java.io.PrintWriter out = new java.io.PrintWriter(System.out);
                                            ThreadLocalOut.push(out);
                                            webdsl.generated.functions.internalHandleEmailQueue_.internalHandleEmailQueue_();
                                            hibSession.getTransaction().commit();
                                            ThreadLocalOut.popChecked(out);
                                          }
                                        }
                                        catch(Exception ex)
                                        { 
                                          System.out.println("exception occured while executing timed function: " + "invoke internalHandleEmailQueue() every 30 seconds");
                                          System.out.println("exception message: " + ex.getMessage());
                                          ex.printStackTrace();
                                          hibSession.getTransaction().rollback();
                                        }
                                        finally
                                        { 
                                          ThreadLocalPage.set(null);
                                        }
                                      }
                                    }
                                  };
    timer.scheduleAtFixedRate(timer30, 0, 1000 * 30 + 0);
    java.util.TimerTask timer31 = new java.util.TimerTask()
                                  { 
                                    public void run()
                                    { 
                                      if(utils.GlobalVariables.globalvarsChecked && utils.GlobalInit.initChecked)
                                      { 
                                        org.hibernate.Session hibSession = null;
                                        try
                                        { 
                                          hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
                                          hibSession.beginTransaction();
                                          Environment env = new Environment(PageServlet.staticEnv);
                                          if(DispatchServlet.initGlobalVars(env, hibSession))
                                          { 
                                            AbstractPageServlet ps = new GlobalsPageServlet(env);
                                            ps.setHibSession(hibSession);
                                            ThreadLocalPage.set(ps);
                                            java.io.PrintWriter out = new java.io.PrintWriter(System.out);
                                            ThreadLocalOut.push(out);
                                            webdsl.generated.functions.renewFacetIndexReaders_.renewFacetIndexReaders_();
                                            hibSession.getTransaction().commit();
                                            ThreadLocalOut.popChecked(out);
                                          }
                                        }
                                        catch(Exception ex)
                                        { 
                                          System.out.println("exception occured while executing timed function: " + "invoke renewFacetIndexReaders() every 60 minutes");
                                          System.out.println("exception message: " + ex.getMessage());
                                          ex.printStackTrace();
                                          hibSession.getTransaction().rollback();
                                        }
                                        finally
                                        { 
                                          ThreadLocalPage.set(null);
                                        }
                                      }
                                    }
                                  };
    timer.scheduleAtFixedRate(timer31, 0, 60 * 1000 * 60 + 0);
    java.util.TimerTask timer32 = new java.util.TimerTask()
                                  { 
                                    public void run()
                                    { 
                                      if(utils.GlobalVariables.globalvarsChecked && utils.GlobalInit.initChecked)
                                      { 
                                        org.hibernate.Session hibSession = null;
                                        try
                                        { 
                                          hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
                                          hibSession.beginTransaction();
                                          Environment env = new Environment(PageServlet.staticEnv);
                                          if(DispatchServlet.initGlobalVars(env, hibSession))
                                          { 
                                            AbstractPageServlet ps = new GlobalsPageServlet(env);
                                            ps.setHibSession(hibSession);
                                            ThreadLocalPage.set(ps);
                                            java.io.PrintWriter out = new java.io.PrintWriter(System.out);
                                            ThreadLocalOut.push(out);
                                            webdsl.generated.functions.updateSuggestionIndex_.updateSuggestionIndex_();
                                            hibSession.getTransaction().commit();
                                            ThreadLocalOut.popChecked(out);
                                          }
                                        }
                                        catch(Exception ex)
                                        { 
                                          System.out.println("exception occured while executing timed function: " + "invoke updateSuggestionIndex() every 12 hours");
                                          System.out.println("exception message: " + ex.getMessage());
                                          ex.printStackTrace();
                                          hibSession.getTransaction().rollback();
                                        }
                                        finally
                                        { 
                                          ThreadLocalPage.set(null);
                                        }
                                      }
                                    }
                                  };
    timer.scheduleAtFixedRate(timer32, 0, 60 * 60 * 1000 * 12 + 0);
    java.util.TimerTask timer33 = new java.util.TimerTask()
                                  { 
                                    public void run()
                                    { 
                                      if(utils.GlobalVariables.globalvarsChecked && utils.GlobalInit.initChecked)
                                      { 
                                        org.hibernate.Session hibSession = null;
                                        try
                                        { 
                                          hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
                                          hibSession.beginTransaction();
                                          Environment env = new Environment(PageServlet.staticEnv);
                                          if(DispatchServlet.initGlobalVars(env, hibSession))
                                          { 
                                            AbstractPageServlet ps = new GlobalsPageServlet(env);
                                            ps.setHibSession(hibSession);
                                            ThreadLocalPage.set(ps);
                                            java.io.PrintWriter out = new java.io.PrintWriter(System.out);
                                            ThreadLocalOut.push(out);
                                            webdsl.generated.functions.optimizeSearchIndex_.optimizeSearchIndex_();
                                            hibSession.getTransaction().commit();
                                            ThreadLocalOut.popChecked(out);
                                          }
                                        }
                                        catch(Exception ex)
                                        { 
                                          System.out.println("exception occured while executing timed function: " + "invoke optimizeSearchIndex() every 12 hours");
                                          System.out.println("exception message: " + ex.getMessage());
                                          ex.printStackTrace();
                                          hibSession.getTransaction().rollback();
                                        }
                                        finally
                                        { 
                                          ThreadLocalPage.set(null);
                                        }
                                      }
                                    }
                                  };
    timer.scheduleAtFixedRate(timer33, 0, 60 * 60 * 1000 * 12 + 0);
    java.util.TimerTask timer34 = new java.util.TimerTask()
                                  { 
                                    public void run()
                                    { 
                                      if(utils.GlobalVariables.globalvarsChecked && utils.GlobalInit.initChecked)
                                      { 
                                        org.hibernate.Session hibSession = null;
                                        try
                                        { 
                                          hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
                                          hibSession.beginTransaction();
                                          Environment env = new Environment(PageServlet.staticEnv);
                                          if(DispatchServlet.initGlobalVars(env, hibSession))
                                          { 
                                            AbstractPageServlet ps = new GlobalsPageServlet(env);
                                            ps.setHibSession(hibSession);
                                            ThreadLocalPage.set(ps);
                                            java.io.PrintWriter out = new java.io.PrintWriter(System.out);
                                            ThreadLocalOut.push(out);
                                            webdsl.generated.functions.internalCleanupSessionManagerEntities_.internalCleanupSessionManagerEntities_();
                                            hibSession.getTransaction().commit();
                                            ThreadLocalOut.popChecked(out);
                                          }
                                        }
                                        catch(Exception ex)
                                        { 
                                          System.out.println("exception occured while executing timed function: " + "invoke internalCleanupSessionManagerEntities() every 10 minutes");
                                          System.out.println("exception message: " + ex.getMessage());
                                          ex.printStackTrace();
                                          hibSession.getTransaction().rollback();
                                        }
                                        finally
                                        { 
                                          ThreadLocalPage.set(null);
                                        }
                                      }
                                    }
                                  };
    timer.scheduleAtFixedRate(timer34, 0, 60 * 1000 * 10 + 0);
  }

  public void destroy()
  { 
    timer.cancel();
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  { 
    DispatchServletHelper d = new DispatchServletHelper(this, true, getServletConfig().getServletContext().getContextPath());
    d.doServe(request, response);
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  { 
    DispatchServletHelper d = new DispatchServletHelper(this, false, getServletConfig().getServletContext().getContextPath());
    d.doServe(request, response);
  }

  public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  { 
    DispatchServletHelper d = new DispatchServletHelper(this, false, getServletConfig().getServletContext().getContextPath());
    d.doServe(request, response);
  }

  public static boolean initGlobalVars(Environment env, org.hibernate.Session hibSession)
  { 
    return true;
  }
}