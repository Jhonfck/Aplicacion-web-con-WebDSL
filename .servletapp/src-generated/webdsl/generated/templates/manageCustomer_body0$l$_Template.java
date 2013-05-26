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

public @SuppressWarnings("all") class manageCustomer_body0$l$_Template extends TemplateServlet 
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
    return "manageCustomer_body0$l$";
  }

  public String getTemplateClassName()
  { 
    return "manageCustomer_body0$l$_Template";
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
    return "manageCustomer_body0$l$()";
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

  protected void validateInputsInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    java.util.List<webdsl.generated.domain.Customer> list9 = HibernateUtilConfigured.getSessionFactory().getCurrentSession().createCriteria(webdsl.generated.domain.Customer.class).list();
    inForLoop = true;
    forLoopCounter++;
    int separatorindex8 = 0;
    Object[] array8 = list9.toArray();
    for(int i9 = 0; i9 < array8.length; i9++)
    { 
      webdsl.generated.domain.Customer elem0 = (webdsl.generated.domain.Customer)array8[i9];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(elem0))
      { 
        WebDSLEntity temp9 = (WebDSLEntity)(Object)elem0;
        forelementcounter = temp9.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp9.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall578";
      ThreadLocalPage.get().enterTemplateContext("tcall578");
      try
      { 
        Object[] args1370 = {elem0.getName()};
        utils.LocalTemplateArguments args21369 = env.getExtraLocalTemplateArguments("outputString");
        if(args21369 != null)
        { 
          args1370 = ArrayUtils.addAll(args1370, args21369.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs("outputString", args1370, newenv, attrsmapout, args21369);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "outputString(elem.name)");
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
      ident += "form8" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().setInSubmittedForm(true);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident += "tcall579";
        ThreadLocalPage.get().enterTemplateContext("tcall579");
        try
        { 
          Object[] args1369 = {"manageCustomer_body0$l$_remove3" + webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueId()};
          utils.LocalTemplateArguments args21368 = env.getExtraLocalTemplateArguments("wrapsubmitString");
          if(args21368 != null)
          { 
            args1369 = ArrayUtils.addAll(args1369, args21368.extraArgs);
          }
          if(templatecalls.get(ident) == null)
          { 
            templatecalls.put(ident, (TemplateServlet)env.getTemplate("wrapsubmitString").newInstance());
          }
          org.webdsl.lang.Environment newenv = new Environment(env);
          newenv.putWithcall("s", new utils.TemplateCall("manageCustomer_body0$l$_s_ad0String__Customer", getElementsContext(), new Object[]{elem0}, attrs));
          Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
          ((TemplateServlet)templatecalls.get(ident)).validateInputs("wrapsubmitString", args1369, newenv, attrsmapout, args21368);
        }
        catch(Exception ex)
        { 
          System.out.println("Problem occurred in template call: " + "wrapsubmitString(manageCustomer_body0$l$_remove3 + getTemplate().getUniqueId())");
          utils.Warning.printSmallStackTrace(ex);
        }
        ident = "";
        ThreadLocalPage.get().leaveTemplateContext();
        ThreadLocalTemplate.set(this);
      }
      ThreadLocalPage.get().setInSubmittedForm(false);
      ThreadLocalPage.get().leaveTemplateContext();
    }
    forLoopCounter--;
    if(forLoopCounter == 0)
    { 
      inForLoop = false;
      forelementcounter = "0";
      fallbackcounter = 0;
    }
  }

  protected void renderInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    java.io.StringWriter sw6 = new java.io.StringWriter();
    out = new java.io.PrintWriter(sw6);
    ThreadLocalOut.push(out);
    boolean succeeded6 = false;
    try
    { 
      out.print("<a href=\"");
      if(ThreadLocalEmailContext.inEmailContext())
      { 
        out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/createCustomer"));
      }
      else
      { 
        out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/createCustomer"));
      }
      out.print("\" " + "" + " class=\"navigate\">");
      String tmpstring17;
      try
      { 
        if(org.webdsl.tools.Utils.isNullAutoBox("create"))
        { 
          tmpstring17 = "";
        }
        else
        { 
          tmpstring17 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("create") : utils.HTMLFilter.filter(String.valueOf("create")));
        }
      }
      catch(NullPointerException npe)
      { 
        tmpstring17 = "";
      }
      catch(IndexOutOfBoundsException ine)
      { 
        tmpstring17 = "";
      }
      out.print(tmpstring17);
      out.print("</a>");
      succeeded6 = true;
    }
    catch(NullPointerException npe)
    { 
      utils.Warning.warn("null reference prevented rendering of template element");
    }
    catch(IndexOutOfBoundsException ine)
    { 
      utils.Warning.warn("index out of bounds prevented rendering of template element");
    }
    ThreadLocalOut.popChecked(out);
    out = ThreadLocalOut.peek();
    if(succeeded6)
    { 
      out.print(sw6.toString());
    }
    out.print("<ul " + "" + ">");
    java.util.List<webdsl.generated.domain.Customer> list12 = HibernateUtilConfigured.getSessionFactory().getCurrentSession().createCriteria(webdsl.generated.domain.Customer.class).list();
    inForLoop = true;
    forLoopCounter++;
    int separatorindex11 = 0;
    Object[] array11 = list12.toArray();
    for(int i12 = 0; i12 < array11.length; i12++)
    { 
      webdsl.generated.domain.Customer elem0 = (webdsl.generated.domain.Customer)array11[i12];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(elem0))
      { 
        WebDSLEntity temp12 = (WebDSLEntity)(Object)elem0;
        forelementcounter = temp12.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp12.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      out.print("<li " + "" + ">");
      java.io.StringWriter sw7 = new java.io.StringWriter();
      out = new java.io.PrintWriter(sw7);
      ThreadLocalOut.push(out);
      boolean succeeded7 = false;
      try
      { 
        out.print("<a href=\"");
        if(ThreadLocalEmailContext.inEmailContext())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/customer" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(elem0.getNaturalId())), "Customer")));
        }
        else
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/customer" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(elem0.getNaturalId())), "Customer")));
        }
        out.print("\" " + "" + " class=\"navigate\">");
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident += "tcall578";
        ThreadLocalPage.get().enterTemplateContext("tcall578");
        try
        { 
          Object[] args1375 = {elem0.getName()};
          utils.LocalTemplateArguments args21374 = env.getExtraLocalTemplateArguments("outputString");
          if(args21374 != null)
          { 
            args1375 = ArrayUtils.addAll(args1375, args21374.extraArgs);
          }
          if(templatecalls.get(ident) == null)
          { 
            templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
          }
          org.webdsl.lang.Environment newenv = new Environment(env);
          Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
          ((TemplateServlet)templatecalls.get(ident)).render("outputString", args1375, newenv, attrsmapout, args21374);
        }
        catch(Exception ex)
        { 
          System.out.println("Problem occurred in template call: " + "outputString(elem.name)");
          utils.Warning.printSmallStackTrace(ex);
        }
        ident = "";
        ThreadLocalPage.get().leaveTemplateContext();
        ThreadLocalTemplate.set(this);
        out.print("</a>");
        succeeded7 = true;
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
      ThreadLocalOut.popChecked(out);
      out = ThreadLocalOut.peek();
      if(succeeded7)
      { 
        out.print(sw7.toString());
      }
      String tmpstring18;
      try
      { 
        if(org.webdsl.tools.Utils.isNullAutoBox(" "))
        { 
          tmpstring18 = "";
        }
        else
        { 
          tmpstring18 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf(" ") : utils.HTMLFilter.filter(String.valueOf(" ")));
        }
      }
      catch(NullPointerException npe)
      { 
        tmpstring18 = "";
      }
      catch(IndexOutOfBoundsException ine)
      { 
        tmpstring18 = "";
      }
      out.print(tmpstring18);
      java.io.StringWriter sw8 = new java.io.StringWriter();
      out = new java.io.PrintWriter(sw8);
      ThreadLocalOut.push(out);
      boolean succeeded8 = false;
      try
      { 
        out.print("<a href=\"");
        if(ThreadLocalEmailContext.inEmailContext())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/editCustomer" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(elem0.getNaturalId())), "Customer")));
        }
        else
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/editCustomer" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(elem0.getNaturalId())), "Customer")));
        }
        out.print("\" " + "" + " class=\"navigate\">");
        String tmpstring19;
        try
        { 
          if(org.webdsl.tools.Utils.isNullAutoBox("edit"))
          { 
            tmpstring19 = "";
          }
          else
          { 
            tmpstring19 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("edit") : utils.HTMLFilter.filter(String.valueOf("edit")));
          }
        }
        catch(NullPointerException npe)
        { 
          tmpstring19 = "";
        }
        catch(IndexOutOfBoundsException ine)
        { 
          tmpstring19 = "";
        }
        out.print(tmpstring19);
        out.print("</a>");
        succeeded8 = true;
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
      ThreadLocalOut.popChecked(out);
      out = ThreadLocalOut.peek();
      if(succeeded8)
      { 
        out.print(sw8.toString());
      }
      String tmpstring20;
      try
      { 
        if(org.webdsl.tools.Utils.isNullAutoBox(" "))
        { 
          tmpstring20 = "";
        }
        else
        { 
          tmpstring20 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf(" ") : utils.HTMLFilter.filter(String.valueOf(" ")));
        }
      }
      catch(NullPointerException npe)
      { 
        tmpstring20 = "";
      }
      catch(IndexOutOfBoundsException ine)
      { 
        tmpstring20 = "";
      }
      out.print(tmpstring20);
      ident = (inForLoop ? forelementcounter : "") + ("form8" + uniqueid);
      ThreadLocalPage.get().setFormIdent(ident);
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().setInSubmittedForm(true);
      }
      ThreadLocalPage.get().formRequiresMultipartEnc = false;
      out.print("<form name=\"" + ident + "\" id=\"" + ident + "\" action=\"" + utils.HTMLFilter.filter(ThreadLocalPage.get().getPageUrlWithParams()) + "\" accept-charset=\"UTF-8\" method=\"POST\" " + "");
      java.io.StringWriter stringwriter8 = new java.io.StringWriter();
      out = new java.io.PrintWriter(stringwriter8);
      ThreadLocalOut.push(out);
      out.print(">");
      out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
      out.print(ThreadLocalPage.get().getHiddenParams());
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall579";
      ThreadLocalPage.get().enterTemplateContext("tcall579");
      try
      { 
        Object[] args1376 = {"manageCustomer_body0$l$_remove3" + webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueId()};
        utils.LocalTemplateArguments args21375 = env.getExtraLocalTemplateArguments("wrapsubmitString");
        if(args21375 != null)
        { 
          args1376 = ArrayUtils.addAll(args1376, args21375.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("wrapsubmitString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("s", new utils.TemplateCall("manageCustomer_body0$l$_s_ad0String__Customer", getElementsContext(), new Object[]{elem0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render("wrapsubmitString", args1376, newenv, attrsmapout, args21375);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "wrapsubmitString(manageCustomer_body0$l$_remove3 + getTemplate().getUniqueId())");
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
      out.write(stringwriter8.toString());
      ThreadLocalPage.get().formRequiresMultipartEnc = false;
      ThreadLocalPage.get().setInSubmittedForm(false);
      ThreadLocalPage.get().setFormIdent("");
      out.print("</li>");
      ThreadLocalPage.get().leaveTemplateContext();
    }
    forLoopCounter--;
    if(forLoopCounter == 0)
    { 
      inForLoop = false;
      forelementcounter = "0";
      fallbackcounter = 0;
    }
    out.print("</ul>");
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
    java.util.List<webdsl.generated.domain.Customer> list11 = HibernateUtilConfigured.getSessionFactory().getCurrentSession().createCriteria(webdsl.generated.domain.Customer.class).list();
    inForLoop = true;
    forLoopCounter++;
    int separatorindex10 = 0;
    Object[] array10 = list11.toArray();
    for(int i11 = 0; i11 < array10.length; i11++)
    { 
      webdsl.generated.domain.Customer elem0 = (webdsl.generated.domain.Customer)array10[i11];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(elem0))
      { 
        WebDSLEntity temp11 = (WebDSLEntity)(Object)elem0;
        forelementcounter = temp11.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp11.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall578";
      ThreadLocalPage.get().enterTemplateContext("tcall578");
      try
      { 
        Object[] args1374 = {elem0.getName()};
        utils.LocalTemplateArguments args21373 = env.getExtraLocalTemplateArguments("outputString");
        if(args21373 != null)
        { 
          args1374 = ArrayUtils.addAll(args1374, args21373.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions("outputString", args1374, newenv, attrsmapout, args21373);
        if(ThreadLocalPage.get().hasExecutedAction)
          return;
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "outputString(elem.name)");
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
      ident += "form8" + uniqueid;
      ThreadLocalPage.get().setFormIdent(ident);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall579";
      ThreadLocalPage.get().enterTemplateContext("tcall579");
      try
      { 
        Object[] args1373 = {"manageCustomer_body0$l$_remove3" + webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueId()};
        utils.LocalTemplateArguments args21372 = env.getExtraLocalTemplateArguments("wrapsubmitString");
        if(args21372 != null)
        { 
          args1373 = ArrayUtils.addAll(args1373, args21372.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("wrapsubmitString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("s", new utils.TemplateCall("manageCustomer_body0$l$_s_ad0String__Customer", getElementsContext(), new Object[]{elem0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions("wrapsubmitString", args1373, newenv, attrsmapout, args21372);
        if(ThreadLocalPage.get().hasExecutedAction)
          return;
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "wrapsubmitString(manageCustomer_body0$l$_remove3 + getTemplate().getUniqueId())");
        utils.Warning.printSmallStackTrace(ex);
      }
      ident = "";
      ThreadLocalPage.get().leaveTemplateContext();
      ThreadLocalTemplate.set(this);
      ThreadLocalPage.get().leaveTemplateContext();
    }
    forLoopCounter--;
    if(forLoopCounter == 0)
    { 
      inForLoop = false;
      forelementcounter = "0";
      fallbackcounter = 0;
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
    putAction("manageCustomer_body0$l$_remove4", new manageCustomer_body0$l$_remove4()
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
    java.util.List<webdsl.generated.domain.Customer> list10 = HibernateUtilConfigured.getSessionFactory().getCurrentSession().createCriteria(webdsl.generated.domain.Customer.class).list();
    inForLoop = true;
    forLoopCounter++;
    int separatorindex9 = 0;
    Object[] array9 = list10.toArray();
    for(int i10 = 0; i10 < array9.length; i10++)
    { 
      webdsl.generated.domain.Customer elem0 = (webdsl.generated.domain.Customer)array9[i10];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(elem0))
      { 
        WebDSLEntity temp10 = (WebDSLEntity)(Object)elem0;
        forelementcounter = temp10.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp10.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall578";
      ThreadLocalPage.get().enterTemplateContext("tcall578");
      try
      { 
        Object[] args1372 = {elem0.getName()};
        utils.LocalTemplateArguments args21371 = env.getExtraLocalTemplateArguments("outputString");
        if(args21371 != null)
        { 
          args1372 = ArrayUtils.addAll(args1372, args21371.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs("outputString", args1372, newenv, attrsmapout, args21371);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "outputString(elem.name)");
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
      ident += "tcall579";
      ThreadLocalPage.get().enterTemplateContext("tcall579");
      try
      { 
        Object[] args1371 = {"manageCustomer_body0$l$_remove3" + webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueId()};
        utils.LocalTemplateArguments args21370 = env.getExtraLocalTemplateArguments("wrapsubmitString");
        if(args21370 != null)
        { 
          args1371 = ArrayUtils.addAll(args1371, args21370.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("wrapsubmitString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("s", new utils.TemplateCall("manageCustomer_body0$l$_s_ad0String__Customer", getElementsContext(), new Object[]{elem0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs("wrapsubmitString", args1371, newenv, attrsmapout, args21370);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "wrapsubmitString(manageCustomer_body0$l$_remove3 + getTemplate().getUniqueId())");
        utils.Warning.printSmallStackTrace(ex);
      }
      ident = "";
      ThreadLocalPage.get().leaveTemplateContext();
      ThreadLocalTemplate.set(this);
      ThreadLocalPage.get().leaveTemplateContext();
    }
    forLoopCounter--;
    if(forLoopCounter == 0)
    { 
      inForLoop = false;
      forelementcounter = "0";
      fallbackcounter = 0;
    }
  }
}