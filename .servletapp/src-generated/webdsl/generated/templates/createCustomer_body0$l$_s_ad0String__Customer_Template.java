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

public @SuppressWarnings("all") class createCustomer_body0$l$_s_ad0String__Customer_Template extends TemplateServlet 
{ 
  protected void storeArguments(Object[] args)
  { 
    x0 = (String)args[0];
    temp0 = (utils.RefArg)args[1];
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
    return "createCustomer_body0$l$_s_ad0String__Customer";
  }

  public String getTemplateClassName()
  { 
    return "createCustomer_body0$l$_s_ad0String__Customer_Template";
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
    return "createCustomer_body0$l$_s_ad0(x : String, temp : Ref<Customer>)";
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
      return "s";
    }
    else
    { 
      return calledName;
    }
  }

  private String x0 = "";

  public void setX0(String x0)
  { 
    this.x0 = x0;
  }

  public String getX0()
  { 
    return x0;
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
    ident += "tcall523";
    ThreadLocalPage.get().enterTemplateContext("tcall523");
    try
    { 
      Object[] args1255 = {"Save"};
      utils.LocalTemplateArguments args21254 = env.getExtraLocalTemplateArguments("outputString");
      if(args21254 != null)
      { 
        args1255 = ArrayUtils.addAll(args1255, args21254.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("outputString", args1255, newenv, attrsmapout, args21254);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputString(Save)");
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
    if(isAjaxSubmitRequired(false))
    { 
      out.print("<input type=\"submit\" value=\"");
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall523";
      ThreadLocalPage.get().enterTemplateContext("tcall523");
      try
      { 
        Object[] args1256 = {"Save"};
        utils.LocalTemplateArguments args21255 = env.getExtraLocalTemplateArguments("outputString");
        if(args21255 != null)
        { 
          args1256 = ArrayUtils.addAll(args1256, args21255.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render("outputString", args1256, newenv, attrsmapout, args21255);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "outputString(Save)");
        utils.Warning.printSmallStackTrace(ex);
      }
      ident = "";
      ThreadLocalPage.get().leaveTemplateContext();
      ThreadLocalTemplate.set(this);
      out.print("\" " + (" class=\"" + "button" + "" + "\" " + "" + " ") + " ");
      out.print("onclick='javascript:serverInvoke(\"" + ThreadLocalServlet.getContextPath() + "/" + ThreadLocalPage.get().getActionTarget() + "\",\"" + x0 + "\", [" + ThreadLocalPage.get().getHiddenPostParamsJson() + "],\"" + ThreadLocalPage.get().getFormIdent() + "\", this, true); return false;'/>");
    }
    else
    { 
      out.print("<input type=\"submit\" name=\"" + x0 + "\" value=\"");
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall523";
      ThreadLocalPage.get().enterTemplateContext("tcall523");
      try
      { 
        Object[] args1256 = {"Save"};
        utils.LocalTemplateArguments args21255 = env.getExtraLocalTemplateArguments("outputString");
        if(args21255 != null)
        { 
          args1256 = ArrayUtils.addAll(args1256, args21255.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render("outputString", args1256, newenv, attrsmapout, args21255);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "outputString(Save)");
        utils.Warning.printSmallStackTrace(ex);
      }
      ident = "";
      ThreadLocalPage.get().leaveTemplateContext();
      ThreadLocalTemplate.set(this);
      out.print("\" " + (" class=\"" + "button" + "" + "\" " + "" + " ") + " />");
    }
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
    ident = x0;
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      if(isAjaxSubmitRequired(false))
      { 
        ThreadLocalPage.get().enableAjaxActionExecuted();
      }
      createCustomer_body0$l$_s_ad0String__Customer_save0 temp = (createCustomer_body0$l$_s_ad0String__Customer_save0)getAction("createCustomer_body0$l$_s_ad0String__Customer_save0");
      temp.run(ident);
    }
  }

  protected void initializeLocalVarsOnce()
  { }

  protected void initializeLocalVars()
  { }

  protected void initActions()
  { }

  protected void initSubmitActions()
  { 
    putAction("createCustomer_body0$l$_s_ad0String__Customer_save0", new createCustomer_body0$l$_s_ad0String__Customer_save0()
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
    ident = x0;
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      createCustomer_body0$l$_s_ad0String__Customer_save0 temp = (createCustomer_body0$l$_s_ad0String__Customer_save0)getAction("createCustomer_body0$l$_s_ad0String__Customer_save0");
      ThreadLocalPage.get().setActionToBeExecuted(temp);
    }
  }
}