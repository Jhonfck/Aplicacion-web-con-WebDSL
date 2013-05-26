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

public @SuppressWarnings("all") class editCustomerCustomer_ta0Customer_ta12Customer_Template extends TemplateServlet 
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
    return "editCustomerCustomer_ta0Customer_ta12Customer";
  }

  public String getTemplateClassName()
  { 
    return "editCustomerCustomer_ta0Customer_ta12Customer_Template";
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
    return "editCustomerCustomer_ta0Customer_ta12(arg : Customer)";
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
      return "editCustomerCustomer_ta0Customer";
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
    ident += "tcall462";
    ThreadLocalPage.get().enterTemplateContext("tcall462");
    try
    { 
      Object[] args1095 = {"Bio: "};
      utils.LocalTemplateArguments args21094 = env.getExtraLocalTemplateArguments("labelcolumnsString");
      if(args21094 != null)
      { 
        args1095 = ArrayUtils.addAll(args1095, args21094.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("labelcolumnsString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#labelcolumnsString", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta11Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("labelcolumnsString", args1095, newenv, attrsmapout, args21094);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "labelcolumnsString(Bio: )");
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
    ident += "tcall462";
    ThreadLocalPage.get().enterTemplateContext("tcall462");
    try
    { 
      Object[] args1098 = {"Bio: "};
      utils.LocalTemplateArguments args21097 = env.getExtraLocalTemplateArguments("labelcolumnsString");
      if(args21097 != null)
      { 
        args1098 = ArrayUtils.addAll(args1098, args21097.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("labelcolumnsString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#labelcolumnsString", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta11Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("labelcolumnsString", args1098, newenv, attrsmapout, args21097);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "labelcolumnsString(Bio: )");
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
    ident += "tcall462";
    ThreadLocalPage.get().enterTemplateContext("tcall462");
    try
    { 
      Object[] args1097 = {"Bio: "};
      utils.LocalTemplateArguments args21096 = env.getExtraLocalTemplateArguments("labelcolumnsString");
      if(args21096 != null)
      { 
        args1097 = ArrayUtils.addAll(args1097, args21096.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("labelcolumnsString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#labelcolumnsString", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta11Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("labelcolumnsString", args1097, newenv, attrsmapout, args21096);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "labelcolumnsString(Bio: )");
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
    putAction("editCustomerCustomer_ta0Customer_ta12Customer_save0", new editCustomerCustomer_ta0Customer_ta12Customer_save0()
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
                                                                             arg0.setVersion(1);
                                                                             HibernateUtilConfigured.getSessionFactory().getCurrentSession().save(arg0);
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
    ident += "tcall462";
    ThreadLocalPage.get().enterTemplateContext("tcall462");
    try
    { 
      Object[] args1096 = {"Bio: "};
      utils.LocalTemplateArguments args21095 = env.getExtraLocalTemplateArguments("labelcolumnsString");
      if(args21095 != null)
      { 
        args1096 = ArrayUtils.addAll(args1096, args21095.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("labelcolumnsString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#labelcolumnsString", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta11Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("labelcolumnsString", args1096, newenv, attrsmapout, args21095);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "labelcolumnsString(Bio: )");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }
}