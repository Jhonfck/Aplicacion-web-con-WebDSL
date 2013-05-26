package webdsl.generated.templates;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.apache.commons.lang.ArrayUtils;
import utils.*;
import org.webdsl.tools.Utils;
import org.webdsl.lang.Environment;
import org.webdsl.WebDSLEntity;
import webdsl.generated.domain.*;
import webdsl.generated.actions.*;

public @SuppressWarnings("all") class createCustomer_ta0Customer_ta4Customer_Template extends TemplateServlet 
{ 
  protected void storeArguments(Object[] args)
  { 
    temp0 = (utils.RefArg)args[0];
  }

  public void setPageArguments(String[] pa)
  { 
    pageArguments = pa;
  }

  public String[] getPageArguments()
  { 
    return pageArguments;
  }

  public String getUniqueName()
  { 
    return "createCustomer_ta0Customer_ta4Customer";
  }

  public String getTemplateClassName()
  { 
    return "createCustomer_ta0Customer_ta4Customer_Template";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + "ref";
  }

  public String debugStateEncodingAll()
  { 
    return "TemplateClass: " + getTemplateClassName() + "\n" + "TemplateArgument: " + getStateEncodingOfArgument() + "\n" + "ContextString: " + getTemplateContext() + "\n" + "UniqueId: " + getUniqueId() + "\n";
  }

  public String getTemplateSignature()
  { 
    return "createCustomer_ta0Customer_ta4(temp : Ref<Customer>)";
  }

  protected void tryWriteSpanOpen(PrintWriter outtemp)
  { }

  protected void tryWriteSpanClose(PrintWriter outtemp)
  { }

  protected void putLocalDefinesInEnv()
  { }

  protected boolean isAjaxTemplate()
  { 
    return false;
  }

  protected String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "createCustomer_ta0Customer";
    }
    else
    { 
      return calledName;
    }
  }

  private utils.RefArg temp0 = null;

  public void setTemp0(utils.RefArg temp0)
  { 
    this.temp0 = temp0;
  }

  public utils.RefArg getTemp0()
  { 
    return temp0;
  }

  protected void validateInputsInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall516";
    ThreadLocalPage.get().enterTemplateContext("tcall516");
    try
    { 
      Object[] args1235 = {new RefArg_inputString_1_createCustomer_ta0Customer_ta4Customerpc0((webdsl.generated.domain.Customer)temp0.get())};
      utils.LocalTemplateArguments args21234 = env.getExtraLocalTemplateArguments("inputString");
      if(args21234 != null)
      { 
        args1235 = ArrayUtils.addAll(args1235, args21234.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("inputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = new HashMap<String, String>();
      attrsmapout.put("class", "inputaddress");
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("inputString", args1235, newenv, attrsmapout, args21234);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "inputString(temp.address)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }

  protected void renderInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall516";
    ThreadLocalPage.get().enterTemplateContext("tcall516");
    try
    { 
      Object[] args1238 = {new RefArg_inputString_1_createCustomer_ta0Customer_ta4Customerpc0((webdsl.generated.domain.Customer)temp0.get())};
      utils.LocalTemplateArguments args21237 = env.getExtraLocalTemplateArguments("inputString");
      if(args21237 != null)
      { 
        args1238 = ArrayUtils.addAll(args1238, args21237.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("inputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = new HashMap<String, String>();
      attrsmapout.put("class", "inputaddress");
      ((TemplateServlet)templatecalls.get(ident)).render("inputString", args1238, newenv, attrsmapout, args21237);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "inputString(temp.address)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }

  private void callTemplates()
  { }

  protected void handleActionsInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall516";
    ThreadLocalPage.get().enterTemplateContext("tcall516");
    try
    { 
      Object[] args1237 = {new RefArg_inputString_1_createCustomer_ta0Customer_ta4Customerpc0((webdsl.generated.domain.Customer)temp0.get())};
      utils.LocalTemplateArguments args21236 = env.getExtraLocalTemplateArguments("inputString");
      if(args21236 != null)
      { 
        args1237 = ArrayUtils.addAll(args1237, args21236.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("inputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = new HashMap<String, String>();
      attrsmapout.put("class", "inputaddress");
      ((TemplateServlet)templatecalls.get(ident)).handleActions("inputString", args1237, newenv, attrsmapout, args21236);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "inputString(temp.address)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }

  protected void initializeLocalVarsOnce()
  { }

  protected void initializeLocalVars()
  { }

  protected void initActions()
  { }

  protected void initSubmitActions()
  { 
    putAction("createCustomer_ta0Customer_ta4Customer_save0", new createCustomer_ta0Customer_ta4Customer_save0()
                                                              { 
                                                                public org.webdsl.lang.Environment getEnv()
                                                                { 
                                                                  return env;
                                                                }

                                                                public void run(String actionident)
                                                                { 
                                                                  ThreadLocalAction.set(this);
                                                                  if(!ThreadLocalPage.get().hasExecutedAction)
                                                                  { 
                                                                    boolean actionFailed = false;
                                                                    ThreadLocalPage.get().hasExecutedAction = true;
                                                                    try
                                                                    { 
                                                                      ((webdsl.generated.domain.Customer)temp0.get()).setVersion(1);
                                                                      HibernateUtilConfigured.getSessionFactory().getCurrentSession().save((webdsl.generated.domain.Customer)temp0.get());
                                                                      if(ThreadLocalPage.get().isAjaxRuntimeRequest())
                                                                      { 
                                                                        if(!ThreadLocalServlet.get().isPostRequest)
                                                                        { 
                                                                          try
                                                                          { 
                                                                            ThreadLocalPage.get().setRedirectUrl(utils.HTMLFilter.unfilter(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/manageCustomer")));
                                                                            if(!ThreadLocalPage.get().isActionLinkUsed())
                                                                            { 
                                                                              response.sendRedirect(ThreadLocalPage.get().getRedirectUrl());
                                                                            }
                                                                          }
                                                                          catch(IOException ioe)
                                                                          { 
                                                                            System.out.println("redirect failed");
                                                                            ioe.printStackTrace();
                                                                          }
                                                                        }
                                                                        else
                                                                        { 
                                                                          ThreadLocalOut.peek().print("{ action: \"relocate\", value: \"" + utils.HTMLFilter.unfilter(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/manageCustomer")) + "\" },\n");
                                                                        }
                                                                      }
                                                                      else
                                                                      { 
                                                                        try
                                                                        { 
                                                                          ThreadLocalPage.get().setRedirectUrl(utils.HTMLFilter.unfilter(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/manageCustomer")));
                                                                          if(!ThreadLocalPage.get().isActionLinkUsed())
                                                                          { 
                                                                            response.sendRedirect(ThreadLocalPage.get().getRedirectUrl());
                                                                          }
                                                                        }
                                                                        catch(IOException ioe)
                                                                        { 
                                                                          System.out.println("redirect failed");
                                                                          ioe.printStackTrace();
                                                                        }
                                                                      }
                                                                      isRedirected = true;
                                                                      hibSession.flush();
                                                                      if(!ThreadLocalPage.get().isRollback())
                                                                      { 
                                                                        ThreadLocalPage.get().validateEntitiesAfterAction();
                                                                      }
                                                                    }
                                                                    catch(utils.ValidationException ve)
                                                                    { 
                                                                      ThreadLocalPage.get().getValidationExceptions().add(ve.setName(actionident));
                                                                      ThreadLocalPage.get().setValidated(false);
                                                                      actionFailed = true;
                                                                    }
                                                                    catch(utils.MultipleValidationExceptions ve)
                                                                    { 
                                                                      for(utils.ValidationException vex : ve.getValidationExceptions())
                                                                      { 
                                                                        ThreadLocalPage.get().getValidationExceptions().add(vex.setName(actionident));
                                                                      }
                                                                      ThreadLocalPage.get().setValidated(false);
                                                                      actionFailed = true;
                                                                    }
                                                                    catch(Exception excep)
                                                                    { 
                                                                      System.out.println("exception during execution of action");
                                                                      excep.printStackTrace();
                                                                      ThreadLocalPage.get().setValidated(false);
                                                                      ThreadLocalPage.get().getValidationExceptions().add(new utils.ValidationException(actionident, "An error occured while processing your request"));
                                                                      actionFailed = true;
                                                                    }
                                                                    finally
                                                                    { 
                                                                      if(!isRedirected && !ThreadLocalPage.get().isDownloadSet() && !actionFailed)
                                                                      { 
                                                                        try
                                                                        { 
                                                                          if(!ThreadLocalPage.get().isAjaxActionExecuted())
                                                                          { 
                                                                            ThreadLocalPage.get().setRedirectUrl(ThreadLocalPage.get().getPageUrlWithParams());
                                                                            if(!ThreadLocalPage.get().isActionLinkUsed())
                                                                            { 
                                                                              response.sendRedirect(ThreadLocalPage.get().getRedirectUrl());
                                                                            }
                                                                          }
                                                                          else
                                                                            if(!isRedirected)
                                                                            { 
                                                                              ThreadLocalOut.peek().print("{ action: \"refresh\" },");
                                                                            }
                                                                        }
                                                                        catch(IOException ioe)
                                                                        { 
                                                                          System.out.println("redirect failed");
                                                                          ioe.printStackTrace();
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              });
  }

  protected void initialize()
  { }

  protected void storeInputsInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall516";
    ThreadLocalPage.get().enterTemplateContext("tcall516");
    try
    { 
      Object[] args1236 = {new RefArg_inputString_1_createCustomer_ta0Customer_ta4Customerpc0((webdsl.generated.domain.Customer)temp0.get())};
      utils.LocalTemplateArguments args21235 = env.getExtraLocalTemplateArguments("inputString");
      if(args21235 != null)
      { 
        args1236 = ArrayUtils.addAll(args1236, args21235.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("inputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = new HashMap<String, String>();
      attrsmapout.put("class", "inputaddress");
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("inputString", args1236, newenv, attrsmapout, args21235);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "inputString(temp.address)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }
}