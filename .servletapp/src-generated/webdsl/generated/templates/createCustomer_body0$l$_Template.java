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

public @SuppressWarnings("all") class createCustomer_body0$l$_Template extends TemplateServlet 
{ 
  protected void storeArguments(Object[] args)
  { }

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
    return "createCustomer_body0$l$";
  }

  public String getTemplateClassName()
  { 
    return "createCustomer_body0$l$_Template";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String debugStateEncodingAll()
  { 
    return "TemplateClass: " + getTemplateClassName() + "\n" + "TemplateArgument: " + getStateEncodingOfArgument() + "\n" + "ContextString: " + getTemplateContext() + "\n" + "UniqueId: " + getUniqueId() + "\n";
  }

  public String getTemplateSignature()
  { 
    return "createCustomer_body0$l$()";
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

  private webdsl.generated.domain.Customer temp0;

  public webdsl.generated.domain.Customer getTemp0()
  { 
    return temp0;
  }

  public void setTemp0(webdsl.generated.domain.Customer temp0)
  { 
    this.temp0 = temp0;
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
    ident += "tcall524";
    ThreadLocalPage.get().enterTemplateContext("tcall524");
    try
    { 
      Object[] args1259 = {temp0.getName()};
      utils.LocalTemplateArguments args21258 = env.getExtraLocalTemplateArguments("outputString");
      if(args21258 != null)
      { 
        args1259 = ArrayUtils.addAll(args1259, args21258.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("outputString", args1259, newenv, attrsmapout, args21258);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputString(temp.name)");
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
    ident += "form6" + uniqueid;
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      ThreadLocalPage.get().setInSubmittedForm(true);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall525";
      ThreadLocalPage.get().enterTemplateContext("tcall525");
      try
      { 
        Object[] args1258 = {"Details"};
        utils.LocalTemplateArguments args21257 = env.getExtraLocalTemplateArguments("groupString");
        if(args21257 != null)
        { 
          args1258 = ArrayUtils.addAll(args1258, args21257.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupString", new utils.TemplateCall("createCustomer_ta0Customer", getElementsContext(), new Object[]{new RefArg_createCustomer_body0$l$0(createCustomer_body0$l$_Template.this)}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupString", args1258, newenv, attrsmapout, args21257);
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
      ident += "tcall527";
      ThreadLocalPage.get().enterTemplateContext("tcall527");
      try
      { 
        Object[] args1257 = {"createCustomer_body0$l$_save3" + webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueId()};
        utils.LocalTemplateArguments args21256 = env.getExtraLocalTemplateArguments("wrapsubmitString");
        if(args21256 != null)
        { 
          args1257 = ArrayUtils.addAll(args1257, args21256.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("wrapsubmitString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("s", new utils.TemplateCall("createCustomer_body0$l$_s_ad0String__Customer", getElementsContext(), new Object[]{new RefArg_createCustomer_body0$l$0(createCustomer_body0$l$_Template.this)}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs("wrapsubmitString", args1257, newenv, attrsmapout, args21256);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "wrapsubmitString(createCustomer_body0$l$_save3 + getTemplate().getUniqueId())");
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
    int sec6 = ThreadLocalPage.get().getSectionDepth();
    if(sec6 > 0)
    { 
      if(sec6 > 6)
      { 
        sec6 = 6;
      }
    }
    else
    { 
      sec6 = 1;
    }
    out.print("<h" + sec6);
    out.print(" class=\"header section" + sec6 + "\" " + "" + ">");
    String tmpstring14;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("Create "))
      { 
        tmpstring14 = "";
      }
      else
      { 
        tmpstring14 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("Create ") : utils.HTMLFilter.filter(String.valueOf("Create ")));
      }
    }
    catch(NullPointerException npe)
    { 
      tmpstring14 = "";
    }
    catch(IndexOutOfBoundsException ine)
    { 
      tmpstring14 = "";
    }
    out.print(tmpstring14);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall524";
    ThreadLocalPage.get().enterTemplateContext("tcall524");
    try
    { 
      Object[] args1266 = {temp0.getName()};
      utils.LocalTemplateArguments args21265 = env.getExtraLocalTemplateArguments("outputString");
      if(args21265 != null)
      { 
        args1266 = ArrayUtils.addAll(args1266, args21265.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("outputString", args1266, newenv, attrsmapout, args21265);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputString(temp.name)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    out.print("</h" + sec6 + ">");
    ident = (inForLoop ? forelementcounter : "") + ("form6" + uniqueid);
    ThreadLocalPage.get().setFormIdent(ident);
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      ThreadLocalPage.get().setInSubmittedForm(true);
    }
    ThreadLocalPage.get().formRequiresMultipartEnc = false;
    out.print("<form name=\"" + ident + "\" id=\"" + ident + "\" action=\"" + utils.HTMLFilter.filter(ThreadLocalPage.get().getPageUrlWithParams()) + "\" accept-charset=\"UTF-8\" method=\"POST\" " + "");
    java.io.StringWriter stringwriter6 = new java.io.StringWriter();
    out = new java.io.PrintWriter(stringwriter6);
    ThreadLocalOut.push(out);
    out.print(">");
    out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
    out.print(ThreadLocalPage.get().getHiddenParams());
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall525";
    ThreadLocalPage.get().enterTemplateContext("tcall525");
    try
    { 
      Object[] args1267 = {"Details"};
      utils.LocalTemplateArguments args21266 = env.getExtraLocalTemplateArguments("groupString");
      if(args21266 != null)
      { 
        args1267 = ArrayUtils.addAll(args1267, args21266.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupString", new utils.TemplateCall("createCustomer_ta0Customer", getElementsContext(), new Object[]{new RefArg_createCustomer_body0$l$0(createCustomer_body0$l$_Template.this)}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupString", args1267, newenv, attrsmapout, args21266);
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
    ident += "tcall527";
    ThreadLocalPage.get().enterTemplateContext("tcall527");
    try
    { 
      Object[] args1268 = {"createCustomer_body0$l$_save3" + webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueId()};
      utils.LocalTemplateArguments args21267 = env.getExtraLocalTemplateArguments("wrapsubmitString");
      if(args21267 != null)
      { 
        args1268 = ArrayUtils.addAll(args1268, args21267.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("wrapsubmitString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("s", new utils.TemplateCall("createCustomer_body0$l$_s_ad0String__Customer", getElementsContext(), new Object[]{new RefArg_createCustomer_body0$l$0(createCustomer_body0$l$_Template.this)}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("wrapsubmitString", args1268, newenv, attrsmapout, args21267);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "wrapsubmitString(createCustomer_body0$l$_save3 + getTemplate().getUniqueId())");
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
    out.write(stringwriter6.toString());
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
    ident += "tcall524";
    ThreadLocalPage.get().enterTemplateContext("tcall524");
    try
    { 
      Object[] args1265 = {temp0.getName()};
      utils.LocalTemplateArguments args21264 = env.getExtraLocalTemplateArguments("outputString");
      if(args21264 != null)
      { 
        args1265 = ArrayUtils.addAll(args1265, args21264.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("outputString", args1265, newenv, attrsmapout, args21264);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputString(temp.name)");
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
    ident += "form6" + uniqueid;
    ThreadLocalPage.get().setFormIdent(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall525";
    ThreadLocalPage.get().enterTemplateContext("tcall525");
    try
    { 
      Object[] args1264 = {"Details"};
      utils.LocalTemplateArguments args21263 = env.getExtraLocalTemplateArguments("groupString");
      if(args21263 != null)
      { 
        args1264 = ArrayUtils.addAll(args1264, args21263.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupString", new utils.TemplateCall("createCustomer_ta0Customer", getElementsContext(), new Object[]{new RefArg_createCustomer_body0$l$0(createCustomer_body0$l$_Template.this)}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupString", args1264, newenv, attrsmapout, args21263);
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
    ident += "tcall527";
    ThreadLocalPage.get().enterTemplateContext("tcall527");
    try
    { 
      Object[] args1263 = {"createCustomer_body0$l$_save3" + webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueId()};
      utils.LocalTemplateArguments args21262 = env.getExtraLocalTemplateArguments("wrapsubmitString");
      if(args21262 != null)
      { 
        args1263 = ArrayUtils.addAll(args1263, args21262.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("wrapsubmitString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("s", new utils.TemplateCall("createCustomer_body0$l$_s_ad0String__Customer", getElementsContext(), new Object[]{new RefArg_createCustomer_body0$l$0(createCustomer_body0$l$_Template.this)}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("wrapsubmitString", args1263, newenv, attrsmapout, args21262);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "wrapsubmitString(createCustomer_body0$l$_save3 + getTemplate().getUniqueId())");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }

  protected void initializeLocalVarsOnce()
  { }

  protected void initializeLocalVars()
  { 
    temp0 = webdsl.generated.functions.createCustomer_objCr0_.createCustomer_objCr0_();
  }

  protected void initActions()
  { }

  protected void initSubmitActions()
  { 
    putAction("createCustomer_body0$l$_save4", new createCustomer_body0$l$_save4()
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
                                                       temp0.setVersion(1);
                                                       HibernateUtilConfigured.getSessionFactory().getCurrentSession().save(temp0);
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
    ident += "tcall524";
    ThreadLocalPage.get().enterTemplateContext("tcall524");
    try
    { 
      Object[] args1262 = {temp0.getName()};
      utils.LocalTemplateArguments args21261 = env.getExtraLocalTemplateArguments("outputString");
      if(args21261 != null)
      { 
        args1262 = ArrayUtils.addAll(args1262, args21261.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("outputString", args1262, newenv, attrsmapout, args21261);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputString(temp.name)");
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
    ident += "tcall525";
    ThreadLocalPage.get().enterTemplateContext("tcall525");
    try
    { 
      Object[] args1261 = {"Details"};
      utils.LocalTemplateArguments args21260 = env.getExtraLocalTemplateArguments("groupString");
      if(args21260 != null)
      { 
        args1261 = ArrayUtils.addAll(args1261, args21260.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupString", new utils.TemplateCall("createCustomer_ta0Customer", getElementsContext(), new Object[]{new RefArg_createCustomer_body0$l$0(createCustomer_body0$l$_Template.this)}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupString", args1261, newenv, attrsmapout, args21260);
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
    ident += "tcall527";
    ThreadLocalPage.get().enterTemplateContext("tcall527");
    try
    { 
      Object[] args1260 = {"createCustomer_body0$l$_save3" + webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueId()};
      utils.LocalTemplateArguments args21259 = env.getExtraLocalTemplateArguments("wrapsubmitString");
      if(args21259 != null)
      { 
        args1260 = ArrayUtils.addAll(args1260, args21259.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("wrapsubmitString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("s", new utils.TemplateCall("createCustomer_body0$l$_s_ad0String__Customer", getElementsContext(), new Object[]{new RefArg_createCustomer_body0$l$0(createCustomer_body0$l$_Template.this)}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("wrapsubmitString", args1260, newenv, attrsmapout, args21259);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "wrapsubmitString(createCustomer_body0$l$_save3 + getTemplate().getUniqueId())");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }
}