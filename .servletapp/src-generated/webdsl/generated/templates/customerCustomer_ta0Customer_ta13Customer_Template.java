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

public @SuppressWarnings("all") class customerCustomer_ta0Customer_ta13Customer_Template extends TemplateServlet 
{ 
  protected void storeArguments(Object[] args)
  { 
    arg0 = (webdsl.generated.domain.Customer)args[0];
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
    return "customerCustomer_ta0Customer_ta13Customer";
  }

  public String getTemplateClassName()
  { 
    return "customerCustomer_ta0Customer_ta13Customer_Template";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + (arg0 != null ? arg0.getVersion() == 0 ? "_" : arg0.getId().toString() : "null");
  }

  public String debugStateEncodingAll()
  { 
    return "TemplateClass: " + getTemplateClassName() + "\n" + "TemplateArgument: " + getStateEncodingOfArgument() + "\n" + "ContextString: " + getTemplateContext() + "\n" + "UniqueId: " + getUniqueId() + "\n";
  }

  public String getTemplateSignature()
  { 
    return "customerCustomer_ta0Customer_ta13(arg : Customer)";
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
      return "customerCustomer_ta0Customer";
    }
    else
    { 
      return calledName;
    }
  }

  private webdsl.generated.domain.Customer arg0 = null;

  public void setArg0(webdsl.generated.domain.Customer arg0)
  { 
    this.arg0 = arg0;
  }

  public webdsl.generated.domain.Customer getArg0()
  { 
    return arg0;
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
    ident += "tcall483";
    ThreadLocalPage.get().enterTemplateContext("tcall483");
    try
    { 
      Object[] args1149 = {arg0.getPhoto().getFileName()};
      utils.LocalTemplateArguments args21148 = env.getExtraLocalTemplateArguments("outputString");
      if(args21148 != null)
      { 
        args1149 = ArrayUtils.addAll(args1149, args21148.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("outputString", args1149, newenv, attrsmapout, args21148);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputString(arg.photo.fileName())");
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
    out.print("<img alt=\"");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall483";
    ThreadLocalPage.get().enterTemplateContext("tcall483");
    try
    { 
      Object[] args1150 = {arg0.getPhoto().getFileName()};
      utils.LocalTemplateArguments args21149 = env.getExtraLocalTemplateArguments("outputString");
      if(args21149 != null)
      { 
        args1150 = ArrayUtils.addAll(args1150, args21149.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("outputString", args1150, newenv, attrsmapout, args21149);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputString(arg.photo.fileName())");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    out.print("\"" + (" class=\"" + "outputimage" + (" " + "outputphoto") + "\" " + "" + " ") + "src='" + ThreadLocalServlet.getContextPath() + "/" + ThreadLocalPage.get().getActionTarget() + "?" + ((inForLoop ? forelementcounter : "") + ("action12" + ("" + (arg0 != null ? arg0.getVersion() == 0 ? "_" : arg0.getId().toString() : "null")))) + "=1&" + "action-call-with-get-request-type" + "=1&" + ThreadLocalPage.get().getHiddenPostParams() + "' >");
    out.print("</img>");
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
    ident += "action12" + ("" + (arg0 != null ? arg0.getVersion() == 0 ? "_" : arg0.getId().toString() : "null"));
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      customerCustomer_ta0Customer_ta13Customer_ia0 temp = (customerCustomer_ta0Customer_ta13Customer_ia0)getAction("customerCustomer_ta0Customer_ta13Customer_ia0");
      temp.run(arg0, ident);
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
    putAction("customerCustomer_ta0Customer_ta13Customer_ia0", new customerCustomer_ta0Customer_ta13Customer_ia0()
                                                               { 
                                                                 public org.webdsl.lang.Environment getEnv()
                                                                 { 
                                                                   return env;
                                                                 }

                                                                 public void run(webdsl.generated.domain.Customer arg1, String actionident)
                                                                 { 
                                                                   ThreadLocalAction.set(this);
                                                                   if(!ThreadLocalPage.get().hasExecutedAction)
                                                                   { 
                                                                     boolean actionFailed = false;
                                                                     ThreadLocalPage.get().hasExecutedAction = true;
                                                                     try
                                                                     { 
                                                                       ThreadLocalPage.get().setDownload(arg1.getPhoto());
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
    ident += "action12" + ("" + (arg0 != null ? arg0.getVersion() == 0 ? "_" : arg0.getId().toString() : "null"));
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      customerCustomer_ta0Customer_ta13Customer_ia0 temp = (customerCustomer_ta0Customer_ta13Customer_ia0)getAction("customerCustomer_ta0Customer_ta13Customer_ia0");
      ThreadLocalPage.get().setActionToBeExecuted(temp);
    }
  }
}