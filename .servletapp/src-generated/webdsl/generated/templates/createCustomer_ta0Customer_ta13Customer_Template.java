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

public @SuppressWarnings("all") class createCustomer_ta0Customer_ta13Customer_Template extends TemplateServlet 
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
    return "createCustomer_ta0Customer_ta13Customer";
  }

  public String getTemplateClassName()
  { 
    return "createCustomer_ta0Customer_ta13Customer_Template";
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
    return "createCustomer_ta0Customer_ta13(temp : Ref<Customer>)";
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
    ident += "tcall504";
    ThreadLocalPage.get().enterTemplateContext("tcall504");
    try
    { 
      Object[] args1203 = {new RefArg_inputImage_1_createCustomer_ta0Customer_ta13Customerpc0((webdsl.generated.domain.Customer)temp0.get())};
      utils.LocalTemplateArguments args21202 = env.getExtraLocalTemplateArguments("inputImage");
      if(args21202 != null)
      { 
        args1203 = ArrayUtils.addAll(args1203, args21202.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("inputImage").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = new HashMap<String, String>();
      attrsmapout.put("class", "inputphoto");
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("inputImage", args1203, newenv, attrsmapout, args21202);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "inputImage(temp.photo)");
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
    ident += "tcall504";
    ThreadLocalPage.get().enterTemplateContext("tcall504");
    try
    { 
      Object[] args1206 = {new RefArg_inputImage_1_createCustomer_ta0Customer_ta13Customerpc0((webdsl.generated.domain.Customer)temp0.get())};
      utils.LocalTemplateArguments args21205 = env.getExtraLocalTemplateArguments("inputImage");
      if(args21205 != null)
      { 
        args1206 = ArrayUtils.addAll(args1206, args21205.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("inputImage").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = new HashMap<String, String>();
      attrsmapout.put("class", "inputphoto");
      ((TemplateServlet)templatecalls.get(ident)).render("inputImage", args1206, newenv, attrsmapout, args21205);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "inputImage(temp.photo)");
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
    ident += "tcall504";
    ThreadLocalPage.get().enterTemplateContext("tcall504");
    try
    { 
      Object[] args1205 = {new RefArg_inputImage_1_createCustomer_ta0Customer_ta13Customerpc0((webdsl.generated.domain.Customer)temp0.get())};
      utils.LocalTemplateArguments args21204 = env.getExtraLocalTemplateArguments("inputImage");
      if(args21204 != null)
      { 
        args1205 = ArrayUtils.addAll(args1205, args21204.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("inputImage").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = new HashMap<String, String>();
      attrsmapout.put("class", "inputphoto");
      ((TemplateServlet)templatecalls.get(ident)).handleActions("inputImage", args1205, newenv, attrsmapout, args21204);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "inputImage(temp.photo)");
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
    putAction("createCustomer_ta0Customer_ta13Customer_save0", new createCustomer_ta0Customer_ta13Customer_save0()
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
    ident += "tcall504";
    ThreadLocalPage.get().enterTemplateContext("tcall504");
    try
    { 
      Object[] args1204 = {new RefArg_inputImage_1_createCustomer_ta0Customer_ta13Customerpc0((webdsl.generated.domain.Customer)temp0.get())};
      utils.LocalTemplateArguments args21203 = env.getExtraLocalTemplateArguments("inputImage");
      if(args21203 != null)
      { 
        args1204 = ArrayUtils.addAll(args1204, args21203.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("inputImage").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = new HashMap<String, String>();
      attrsmapout.put("class", "inputphoto");
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("inputImage", args1204, newenv, attrsmapout, args21203);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "inputImage(temp.photo)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }
}