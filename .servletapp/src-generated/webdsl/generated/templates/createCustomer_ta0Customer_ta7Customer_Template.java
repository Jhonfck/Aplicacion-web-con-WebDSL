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

public @SuppressWarnings("all") class createCustomer_ta0Customer_ta7Customer_Template extends TemplateServlet 
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
    return "createCustomer_ta0Customer_ta7Customer";
  }

  public String getTemplateClassName()
  { 
    return "createCustomer_ta0Customer_ta7Customer_Template";
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
    return "createCustomer_ta0Customer_ta7(temp : Ref<Customer>)";
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
    ident += "tcall511";
    ThreadLocalPage.get().enterTemplateContext("tcall511");
    try
    { 
      Object[] args1223 = {"Email: "};
      utils.LocalTemplateArguments args21222 = env.getExtraLocalTemplateArguments("labelcolumnsString");
      if(args21222 != null)
      { 
        args1223 = ArrayUtils.addAll(args1223, args21222.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("labelcolumnsString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#labelcolumnsString", new utils.TemplateCall("createCustomer_ta0Customer_ta6Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("labelcolumnsString", args1223, newenv, attrsmapout, args21222);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "labelcolumnsString(Email: )");
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
    ident += "tcall511";
    ThreadLocalPage.get().enterTemplateContext("tcall511");
    try
    { 
      Object[] args1226 = {"Email: "};
      utils.LocalTemplateArguments args21225 = env.getExtraLocalTemplateArguments("labelcolumnsString");
      if(args21225 != null)
      { 
        args1226 = ArrayUtils.addAll(args1226, args21225.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("labelcolumnsString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#labelcolumnsString", new utils.TemplateCall("createCustomer_ta0Customer_ta6Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("labelcolumnsString", args1226, newenv, attrsmapout, args21225);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "labelcolumnsString(Email: )");
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
    ident += "tcall511";
    ThreadLocalPage.get().enterTemplateContext("tcall511");
    try
    { 
      Object[] args1225 = {"Email: "};
      utils.LocalTemplateArguments args21224 = env.getExtraLocalTemplateArguments("labelcolumnsString");
      if(args21224 != null)
      { 
        args1225 = ArrayUtils.addAll(args1225, args21224.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("labelcolumnsString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#labelcolumnsString", new utils.TemplateCall("createCustomer_ta0Customer_ta6Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("labelcolumnsString", args1225, newenv, attrsmapout, args21224);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "labelcolumnsString(Email: )");
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
    putAction("createCustomer_ta0Customer_ta7Customer_save0", new createCustomer_ta0Customer_ta7Customer_save0()
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
    ident += "tcall511";
    ThreadLocalPage.get().enterTemplateContext("tcall511");
    try
    { 
      Object[] args1224 = {"Email: "};
      utils.LocalTemplateArguments args21223 = env.getExtraLocalTemplateArguments("labelcolumnsString");
      if(args21223 != null)
      { 
        args1224 = ArrayUtils.addAll(args1224, args21223.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("labelcolumnsString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#labelcolumnsString", new utils.TemplateCall("createCustomer_ta0Customer_ta6Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("labelcolumnsString", args1224, newenv, attrsmapout, args21223);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "labelcolumnsString(Email: )");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }
}