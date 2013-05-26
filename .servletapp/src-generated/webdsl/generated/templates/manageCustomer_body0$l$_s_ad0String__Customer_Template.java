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

public @SuppressWarnings("all") class manageCustomer_body0$l$_s_ad0String__Customer_Template extends TemplateServlet 
{ 
  protected void storeArguments(Object[] args)
  { 
    x0 = (String)args[0];
    elem0 = (webdsl.generated.domain.Customer)args[1];
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
    return "manageCustomer_body0$l$_s_ad0String__Customer";
  }

  public String getTemplateClassName()
  { 
    return "manageCustomer_body0$l$_s_ad0String__Customer_Template";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + (elem0 != null ? elem0.getVersion() == 0 ? "_" : elem0.getId().toString() : "null");
  }

  public String debugStateEncodingAll()
  { 
    return "TemplateClass: " + getTemplateClassName() + "\n" + "TemplateArgument: " + getStateEncodingOfArgument() + "\n" + "ContextString: " + getTemplateContext() + "\n" + "UniqueId: " + getUniqueId() + "\n";
  }

  public String getTemplateSignature()
  { 
    return "manageCustomer_body0$l$_s_ad0(x : String, elem : Customer)";
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

  private webdsl.generated.domain.Customer elem0 = null;

  public void setElem0(webdsl.generated.domain.Customer elem0)
  { 
    this.elem0 = elem0;
  }

  public webdsl.generated.domain.Customer getElem0()
  { 
    return elem0;
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
    ident += "tcall458";
    ThreadLocalPage.get().enterTemplateContext("tcall458");
    try
    { 
      Object[] args1085 = {"remove"};
      utils.LocalTemplateArguments args21084 = env.getExtraLocalTemplateArguments("outputString");
      if(args21084 != null)
      { 
        args1085 = ArrayUtils.addAll(args1085, args21084.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("outputString", args1085, newenv, attrsmapout, args21084);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputString(remove)");
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
      ident += "tcall458";
      ThreadLocalPage.get().enterTemplateContext("tcall458");
      try
      { 
        Object[] args1086 = {"remove"};
        utils.LocalTemplateArguments args21085 = env.getExtraLocalTemplateArguments("outputString");
        if(args21085 != null)
        { 
          args1086 = ArrayUtils.addAll(args1086, args21085.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render("outputString", args1086, newenv, attrsmapout, args21085);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "outputString(remove)");
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
      ident += "tcall458";
      ThreadLocalPage.get().enterTemplateContext("tcall458");
      try
      { 
        Object[] args1086 = {"remove"};
        utils.LocalTemplateArguments args21085 = env.getExtraLocalTemplateArguments("outputString");
        if(args21085 != null)
        { 
          args1086 = ArrayUtils.addAll(args1086, args21085.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render("outputString", args1086, newenv, attrsmapout, args21085);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "outputString(remove)");
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
      manageCustomer_body0$l$_s_ad0String__Customer_remove0 temp = (manageCustomer_body0$l$_s_ad0String__Customer_remove0)getAction("manageCustomer_body0$l$_s_ad0String__Customer_remove0");
      temp.run(elem0, ident);
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
    putAction("manageCustomer_body0$l$_s_ad0String__Customer_remove0", new manageCustomer_body0$l$_s_ad0String__Customer_remove0()
                                                                       { 
                                                                         public org.webdsl.lang.Environment getEnv()
                                                                         { 
                                                                           return env;
                                                                         }

                                                                         public void run(webdsl.generated.domain.Customer arg0, String actionident)
                                                                         { 
                                                                           ThreadLocalAction.set(this);
                                                                           if(!ThreadLocalPage.get().hasExecutedAction)
                                                                           { 
                                                                             boolean actionFailed = false;
                                                                             ThreadLocalPage.get().hasExecutedAction = true;
                                                                             try
                                                                             { 
                                                                               arg0.validateDelete();
                                                                               HibernateUtilConfigured.getSessionFactory().getCurrentSession().delete(arg0);
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
      manageCustomer_body0$l$_s_ad0String__Customer_remove0 temp = (manageCustomer_body0$l$_s_ad0String__Customer_remove0)getAction("manageCustomer_body0$l$_s_ad0String__Customer_remove0");
      ThreadLocalPage.get().setActionToBeExecuted(temp);
    }
  }
}