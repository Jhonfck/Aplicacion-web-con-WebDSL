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

public @SuppressWarnings("all") class editCustomerCustomer_body0$l$Customer_Template extends TemplateServlet 
{ 
  protected void storeArguments(Object[] args)
  { 
    arg0 = (utils.RefArg)args[0];
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
    return "editCustomerCustomer_body0$l$Customer";
  }

  public String getTemplateClassName()
  { 
    return "editCustomerCustomer_body0$l$Customer_Template";
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
    return "editCustomerCustomer_body0$l$(arg : Ref<Customer>)";
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
      return "body";
    }
    else
    { 
      return calledName;
    }
  }

  private utils.RefArg arg0 = null;

  public void setArg0(utils.RefArg arg0)
  { 
    this.arg0 = arg0;
  }

  public utils.RefArg getArg0()
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
    ident += "tcall559";
    ThreadLocalPage.get().enterTemplateContext("tcall559");
    try
    { 
      Object[] args1331 = {((webdsl.generated.domain.Customer)arg0.get()).getName()};
      utils.LocalTemplateArguments args21330 = env.getExtraLocalTemplateArguments("outputString");
      if(args21330 != null)
      { 
        args1331 = ArrayUtils.addAll(args1331, args21330.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("outputString", args1331, newenv, attrsmapout, args21330);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputString(arg.name)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "form7" + uniqueid;
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      ThreadLocalPage.get().setInSubmittedForm(true);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall560";
      ThreadLocalPage.get().enterTemplateContext("tcall560");
      try
      { 
        Object[] args1330 = {"Details"};
        utils.LocalTemplateArguments args21329 = env.getExtraLocalTemplateArguments("groupString");
        if(args21329 != null)
        { 
          args1330 = ArrayUtils.addAll(args1330, args21329.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupString", new utils.TemplateCall("editCustomerCustomer_ta0Customer", getElementsContext(), new Object[]{(webdsl.generated.domain.Customer)arg0.get()}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupString", args1330, newenv, attrsmapout, args21329);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "groupString(Details)");
        utils.Warning.printSmallStackTrace(ex);
      }
      ident = "";
      ThreadLocalPage.get().leaveTemplateContext();
      ThreadLocalTemplate.set(this);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall562";
      ThreadLocalPage.get().enterTemplateContext("tcall562");
      try
      { 
        Object[] args1329 = {"editCustomerCustomer_body0$l$Customer_save3" + webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueId()};
        utils.LocalTemplateArguments args21328 = env.getExtraLocalTemplateArguments("wrapsubmitString");
        if(args21328 != null)
        { 
          args1329 = ArrayUtils.addAll(args1329, args21328.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("wrapsubmitString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("s", new utils.TemplateCall("editCustomerCustomer_body0$l$Customer_s_ad0String__Customer", getElementsContext(), new Object[]{(webdsl.generated.domain.Customer)arg0.get()}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs("wrapsubmitString", args1329, newenv, attrsmapout, args21328);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "wrapsubmitString(editCustomerCustomer_body0$l$Customer_save3 + getTemplate().getUniqueId())");
        utils.Warning.printSmallStackTrace(ex);
      }
      ident = "";
      ThreadLocalPage.get().leaveTemplateContext();
      ThreadLocalTemplate.set(this);
    }
    ThreadLocalPage.get().setInSubmittedForm(false);
  }

  protected void renderInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    int sec8 = ThreadLocalPage.get().getSectionDepth();
    if(sec8 > 0)
    { 
      if(sec8 > 6)
      { 
        sec8 = 6;
      }
    }
    else
    { 
      sec8 = 1;
    }
    out.print("<h" + sec8);
    out.print(" class=\"header section" + sec8 + "\" " + "" + ">");
    String tmpstring16;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("Edit "))
      { 
        tmpstring16 = "";
      }
      else
      { 
        tmpstring16 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("Edit ") : utils.HTMLFilter.filter(String.valueOf("Edit ")));
      }
    }
    catch(NullPointerException npe)
    { 
      tmpstring16 = "";
    }
    catch(IndexOutOfBoundsException ine)
    { 
      tmpstring16 = "";
    }
    out.print(tmpstring16);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall559";
    ThreadLocalPage.get().enterTemplateContext("tcall559");
    try
    { 
      Object[] args1338 = {((webdsl.generated.domain.Customer)arg0.get()).getName()};
      utils.LocalTemplateArguments args21337 = env.getExtraLocalTemplateArguments("outputString");
      if(args21337 != null)
      { 
        args1338 = ArrayUtils.addAll(args1338, args21337.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("outputString", args1338, newenv, attrsmapout, args21337);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputString(arg.name)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    out.print("</h" + sec8 + ">");
    ident = (inForLoop ? forelementcounter : "") + ("form7" + uniqueid);
    ThreadLocalPage.get().setFormIdent(ident);
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      ThreadLocalPage.get().setInSubmittedForm(true);
    }
    ThreadLocalPage.get().formRequiresMultipartEnc = false;
    out.print("<form name=\"" + ident + "\" id=\"" + ident + "\" action=\"" + utils.HTMLFilter.filter(ThreadLocalPage.get().getPageUrlWithParams()) + "\" accept-charset=\"UTF-8\" method=\"POST\" " + "");
    java.io.StringWriter stringwriter7 = new java.io.StringWriter();
    out = new java.io.PrintWriter(stringwriter7);
    ThreadLocalOut.push(out);
    out.print(">");
    out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
    out.print(ThreadLocalPage.get().getHiddenParams());
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall560";
    ThreadLocalPage.get().enterTemplateContext("tcall560");
    try
    { 
      Object[] args1339 = {"Details"};
      utils.LocalTemplateArguments args21338 = env.getExtraLocalTemplateArguments("groupString");
      if(args21338 != null)
      { 
        args1339 = ArrayUtils.addAll(args1339, args21338.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupString", new utils.TemplateCall("editCustomerCustomer_ta0Customer", getElementsContext(), new Object[]{(webdsl.generated.domain.Customer)arg0.get()}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupString", args1339, newenv, attrsmapout, args21338);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupString(Details)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall562";
    ThreadLocalPage.get().enterTemplateContext("tcall562");
    try
    { 
      Object[] args1340 = {"editCustomerCustomer_body0$l$Customer_save3" + webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueId()};
      utils.LocalTemplateArguments args21339 = env.getExtraLocalTemplateArguments("wrapsubmitString");
      if(args21339 != null)
      { 
        args1340 = ArrayUtils.addAll(args1340, args21339.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("wrapsubmitString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("s", new utils.TemplateCall("editCustomerCustomer_body0$l$Customer_s_ad0String__Customer", getElementsContext(), new Object[]{(webdsl.generated.domain.Customer)arg0.get()}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("wrapsubmitString", args1340, newenv, attrsmapout, args21339);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "wrapsubmitString(editCustomerCustomer_body0$l$Customer_save3 + getTemplate().getUniqueId())");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    out.print("</form>");
    ThreadLocalOut.popChecked(out);
    out = ThreadLocalOut.peek();
    if(ThreadLocalPage.get().formRequiresMultipartEnc)
    { 
      out.write(" enctype=\"multipart/form-data\"");
    }
    out.write(stringwriter7.toString());
    ThreadLocalPage.get().formRequiresMultipartEnc = false;
    ThreadLocalPage.get().setInSubmittedForm(false);
    ThreadLocalPage.get().setFormIdent("");
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
    ident += "tcall559";
    ThreadLocalPage.get().enterTemplateContext("tcall559");
    try
    { 
      Object[] args1337 = {((webdsl.generated.domain.Customer)arg0.get()).getName()};
      utils.LocalTemplateArguments args21336 = env.getExtraLocalTemplateArguments("outputString");
      if(args21336 != null)
      { 
        args1337 = ArrayUtils.addAll(args1337, args21336.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("outputString", args1337, newenv, attrsmapout, args21336);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputString(arg.name)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "form7" + uniqueid;
    ThreadLocalPage.get().setFormIdent(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall560";
    ThreadLocalPage.get().enterTemplateContext("tcall560");
    try
    { 
      Object[] args1336 = {"Details"};
      utils.LocalTemplateArguments args21335 = env.getExtraLocalTemplateArguments("groupString");
      if(args21335 != null)
      { 
        args1336 = ArrayUtils.addAll(args1336, args21335.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupString", new utils.TemplateCall("editCustomerCustomer_ta0Customer", getElementsContext(), new Object[]{(webdsl.generated.domain.Customer)arg0.get()}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupString", args1336, newenv, attrsmapout, args21335);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupString(Details)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall562";
    ThreadLocalPage.get().enterTemplateContext("tcall562");
    try
    { 
      Object[] args1335 = {"editCustomerCustomer_body0$l$Customer_save3" + webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueId()};
      utils.LocalTemplateArguments args21334 = env.getExtraLocalTemplateArguments("wrapsubmitString");
      if(args21334 != null)
      { 
        args1335 = ArrayUtils.addAll(args1335, args21334.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("wrapsubmitString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("s", new utils.TemplateCall("editCustomerCustomer_body0$l$Customer_s_ad0String__Customer", getElementsContext(), new Object[]{(webdsl.generated.domain.Customer)arg0.get()}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("wrapsubmitString", args1335, newenv, attrsmapout, args21334);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "wrapsubmitString(editCustomerCustomer_body0$l$Customer_save3 + getTemplate().getUniqueId())");
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
    putAction("editCustomerCustomer_body0$l$Customer_save4", new editCustomerCustomer_body0$l$Customer_save4()
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
                                                                     ((webdsl.generated.domain.Customer)arg0.get()).setVersion(1);
                                                                     HibernateUtilConfigured.getSessionFactory().getCurrentSession().save((webdsl.generated.domain.Customer)arg0.get());
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
    ident += "tcall559";
    ThreadLocalPage.get().enterTemplateContext("tcall559");
    try
    { 
      Object[] args1334 = {((webdsl.generated.domain.Customer)arg0.get()).getName()};
      utils.LocalTemplateArguments args21333 = env.getExtraLocalTemplateArguments("outputString");
      if(args21333 != null)
      { 
        args1334 = ArrayUtils.addAll(args1334, args21333.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("outputString", args1334, newenv, attrsmapout, args21333);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputString(arg.name)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall560";
    ThreadLocalPage.get().enterTemplateContext("tcall560");
    try
    { 
      Object[] args1333 = {"Details"};
      utils.LocalTemplateArguments args21332 = env.getExtraLocalTemplateArguments("groupString");
      if(args21332 != null)
      { 
        args1333 = ArrayUtils.addAll(args1333, args21332.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupString", new utils.TemplateCall("editCustomerCustomer_ta0Customer", getElementsContext(), new Object[]{(webdsl.generated.domain.Customer)arg0.get()}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupString", args1333, newenv, attrsmapout, args21332);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupString(Details)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall562";
    ThreadLocalPage.get().enterTemplateContext("tcall562");
    try
    { 
      Object[] args1332 = {"editCustomerCustomer_body0$l$Customer_save3" + webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueId()};
      utils.LocalTemplateArguments args21331 = env.getExtraLocalTemplateArguments("wrapsubmitString");
      if(args21331 != null)
      { 
        args1332 = ArrayUtils.addAll(args1332, args21331.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("wrapsubmitString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("s", new utils.TemplateCall("editCustomerCustomer_body0$l$Customer_s_ad0String__Customer", getElementsContext(), new Object[]{(webdsl.generated.domain.Customer)arg0.get()}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("wrapsubmitString", args1332, newenv, attrsmapout, args21331);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "wrapsubmitString(editCustomerCustomer_body0$l$Customer_save3 + getTemplate().getUniqueId())");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }
}