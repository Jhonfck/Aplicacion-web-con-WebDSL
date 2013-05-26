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

public @SuppressWarnings("all") class $Override$main_Template extends TemplateServlet 
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
    return "main";
  }

  public String getTemplateClassName()
  { 
    return "$Override$main_Template";
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
    return "main()";
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
      return "main";
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
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall210";
    ThreadLocalPage.get().enterTemplateContext("tcall210");
    try
    { 
      Object[] args517 = {};
      utils.LocalTemplateArguments args2516 = env.getExtraLocalTemplateArguments("mainheader");
      if(args2516 != null)
      { 
        args517 = ArrayUtils.addAll(args517, args2516.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("mainheader").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("mainheader", args517, newenv, attrsmapout, args2516);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "mainheader()");
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
    ident += "tcall211";
    ThreadLocalPage.get().enterTemplateContext("tcall211");
    try
    { 
      Object[] args516 = {};
      utils.LocalTemplateArguments args2515 = env.getExtraLocalTemplateArguments("applicationmenu");
      if(args2515 != null)
      { 
        args516 = ArrayUtils.addAll(args516, args2515.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("applicationmenu").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("applicationmenu", args516, newenv, attrsmapout, args2515);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "applicationmenu()");
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
    ident += "tcall212";
    ThreadLocalPage.get().enterTemplateContext("tcall212");
    try
    { 
      Object[] args515 = {};
      utils.LocalTemplateArguments args2514 = env.getExtraLocalTemplateArguments("body");
      if(args2514 != null)
      { 
        args515 = ArrayUtils.addAll(args515, args2514.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("body").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("body", args515, newenv, attrsmapout, args2514);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "body()");
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
    out.print("<" + "div");
    out.print(" " + "id" + "=\"");
    String tmpstring17;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("pagewrapper"))
      { 
        tmpstring17 = "";
      }
      else
      { 
        tmpstring17 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("pagewrapper") : utils.HTMLFilter.filter(String.valueOf("pagewrapper")));
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
    out.print("\"");
    out.print(">");
    out.print("<" + "div");
    out.print(" " + "id" + "=\"");
    String tmpstring18;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("header"))
      { 
        tmpstring18 = "";
      }
      else
      { 
        tmpstring18 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("header") : utils.HTMLFilter.filter(String.valueOf("header")));
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
    out.print("\"");
    out.print(">");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall210";
    ThreadLocalPage.get().enterTemplateContext("tcall210");
    try
    { 
      Object[] args524 = {};
      utils.LocalTemplateArguments args2523 = env.getExtraLocalTemplateArguments("mainheader");
      if(args2523 != null)
      { 
        args524 = ArrayUtils.addAll(args524, args2523.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("mainheader").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("mainheader", args524, newenv, attrsmapout, args2523);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "mainheader()");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    out.print("</" + "div");
    out.print(">");
    out.print("<" + "div");
    out.print(" " + "id" + "=\"");
    String tmpstring19;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("navbar"))
      { 
        tmpstring19 = "";
      }
      else
      { 
        tmpstring19 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("navbar") : utils.HTMLFilter.filter(String.valueOf("navbar")));
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
    out.print("\"");
    out.print(">");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall211";
    ThreadLocalPage.get().enterTemplateContext("tcall211");
    try
    { 
      Object[] args525 = {};
      utils.LocalTemplateArguments args2524 = env.getExtraLocalTemplateArguments("applicationmenu");
      if(args2524 != null)
      { 
        args525 = ArrayUtils.addAll(args525, args2524.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("applicationmenu").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("applicationmenu", args525, newenv, attrsmapout, args2524);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "applicationmenu()");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    out.print("</" + "div");
    out.print(">");
    out.print("<" + "div");
    out.print(" " + "id" + "=\"");
    String tmpstring20;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("content"))
      { 
        tmpstring20 = "";
      }
      else
      { 
        tmpstring20 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("content") : utils.HTMLFilter.filter(String.valueOf("content")));
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
    out.print("\"");
    out.print(">");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall212";
    ThreadLocalPage.get().enterTemplateContext("tcall212");
    try
    { 
      Object[] args526 = {};
      utils.LocalTemplateArguments args2525 = env.getExtraLocalTemplateArguments("body");
      if(args2525 != null)
      { 
        args526 = ArrayUtils.addAll(args526, args2525.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("body").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("body", args526, newenv, attrsmapout, args2525);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "body()");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    out.print("</" + "div");
    out.print(">");
    out.print("<" + "div");
    out.print(" " + "id" + "=\"");
    String tmpstring21;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("clear"))
      { 
        tmpstring21 = "";
      }
      else
      { 
        tmpstring21 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("clear") : utils.HTMLFilter.filter(String.valueOf("clear")));
      }
    }
    catch(NullPointerException npe)
    { 
      tmpstring21 = "";
    }
    catch(IndexOutOfBoundsException ine)
    { 
      tmpstring21 = "";
    }
    out.print(tmpstring21);
    out.print("\"");
    out.print(">");
    out.print("</" + "div");
    out.print(">");
    out.print("<" + "div");
    out.print(" " + "id" + "=\"");
    String tmpstring22;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("push"))
      { 
        tmpstring22 = "";
      }
      else
      { 
        tmpstring22 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("push") : utils.HTMLFilter.filter(String.valueOf("push")));
      }
    }
    catch(NullPointerException npe)
    { 
      tmpstring22 = "";
    }
    catch(IndexOutOfBoundsException ine)
    { 
      tmpstring22 = "";
    }
    out.print(tmpstring22);
    out.print("\"");
    out.print(">");
    out.print("</" + "div");
    out.print(">");
    out.print("</" + "div");
    out.print(">");
    out.print("<" + "div");
    out.print(" " + "id" + "=\"");
    String tmpstring23;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("footer"))
      { 
        tmpstring23 = "";
      }
      else
      { 
        tmpstring23 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("footer") : utils.HTMLFilter.filter(String.valueOf("footer")));
      }
    }
    catch(NullPointerException npe)
    { 
      tmpstring23 = "";
    }
    catch(IndexOutOfBoundsException ine)
    { 
      tmpstring23 = "";
    }
    out.print(tmpstring23);
    out.print("\"");
    out.print(">");
    out.print("<" + "span");
    out.print(" " + "id" + "=\"");
    String tmpstring24;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("footercontent"))
      { 
        tmpstring24 = "";
      }
      else
      { 
        tmpstring24 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("footercontent") : utils.HTMLFilter.filter(String.valueOf("footercontent")));
      }
    }
    catch(NullPointerException npe)
    { 
      tmpstring24 = "";
    }
    catch(IndexOutOfBoundsException ine)
    { 
      tmpstring24 = "";
    }
    out.print(tmpstring24);
    out.print("\"");
    out.print(">");
    String tmpstring25;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("powered by "))
      { 
        tmpstring25 = "";
      }
      else
      { 
        tmpstring25 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("powered by ") : utils.HTMLFilter.filter(String.valueOf("powered by ")));
      }
    }
    catch(NullPointerException npe)
    { 
      tmpstring25 = "";
    }
    catch(IndexOutOfBoundsException ine)
    { 
      tmpstring25 = "";
    }
    out.print(tmpstring25);
    out.print("<" + "a");
    out.print(" " + "href" + "=\"");
    String tmpstring26;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("http://webdsl.org"))
      { 
        tmpstring26 = "";
      }
      else
      { 
        tmpstring26 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("http://webdsl.org") : utils.HTMLFilter.filter(String.valueOf("http://webdsl.org")));
      }
    }
    catch(NullPointerException npe)
    { 
      tmpstring26 = "";
    }
    catch(IndexOutOfBoundsException ine)
    { 
      tmpstring26 = "";
    }
    out.print(tmpstring26);
    out.print("\"");
    out.print(">");
    String tmpstring27;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("WebDSL"))
      { 
        tmpstring27 = "";
      }
      else
      { 
        tmpstring27 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("WebDSL") : utils.HTMLFilter.filter(String.valueOf("WebDSL")));
      }
    }
    catch(NullPointerException npe)
    { 
      tmpstring27 = "";
    }
    catch(IndexOutOfBoundsException ine)
    { 
      tmpstring27 = "";
    }
    out.print(tmpstring27);
    out.print("</" + "a");
    out.print(">");
    out.print("</" + "span");
    out.print(">");
    out.print("</" + "div");
    out.print(">");
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
    ident += "tcall210";
    ThreadLocalPage.get().enterTemplateContext("tcall210");
    try
    { 
      Object[] args523 = {};
      utils.LocalTemplateArguments args2522 = env.getExtraLocalTemplateArguments("mainheader");
      if(args2522 != null)
      { 
        args523 = ArrayUtils.addAll(args523, args2522.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("mainheader").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("mainheader", args523, newenv, attrsmapout, args2522);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "mainheader()");
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
    ident += "tcall211";
    ThreadLocalPage.get().enterTemplateContext("tcall211");
    try
    { 
      Object[] args522 = {};
      utils.LocalTemplateArguments args2521 = env.getExtraLocalTemplateArguments("applicationmenu");
      if(args2521 != null)
      { 
        args522 = ArrayUtils.addAll(args522, args2521.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("applicationmenu").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("applicationmenu", args522, newenv, attrsmapout, args2521);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "applicationmenu()");
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
    ident += "tcall212";
    ThreadLocalPage.get().enterTemplateContext("tcall212");
    try
    { 
      Object[] args521 = {};
      utils.LocalTemplateArguments args2520 = env.getExtraLocalTemplateArguments("body");
      if(args2520 != null)
      { 
        args521 = ArrayUtils.addAll(args521, args2520.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("body").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("body", args521, newenv, attrsmapout, args2520);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "body()");
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
  { }

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
    ident += "tcall210";
    ThreadLocalPage.get().enterTemplateContext("tcall210");
    try
    { 
      Object[] args520 = {};
      utils.LocalTemplateArguments args2519 = env.getExtraLocalTemplateArguments("mainheader");
      if(args2519 != null)
      { 
        args520 = ArrayUtils.addAll(args520, args2519.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("mainheader").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("mainheader", args520, newenv, attrsmapout, args2519);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "mainheader()");
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
    ident += "tcall211";
    ThreadLocalPage.get().enterTemplateContext("tcall211");
    try
    { 
      Object[] args519 = {};
      utils.LocalTemplateArguments args2518 = env.getExtraLocalTemplateArguments("applicationmenu");
      if(args2518 != null)
      { 
        args519 = ArrayUtils.addAll(args519, args2518.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("applicationmenu").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("applicationmenu", args519, newenv, attrsmapout, args2518);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "applicationmenu()");
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
    ident += "tcall212";
    ThreadLocalPage.get().enterTemplateContext("tcall212");
    try
    { 
      Object[] args518 = {};
      utils.LocalTemplateArguments args2517 = env.getExtraLocalTemplateArguments("body");
      if(args2517 != null)
      { 
        args518 = ArrayUtils.addAll(args518, args2517.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("body").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("body", args518, newenv, attrsmapout, args2517);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "body()");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }
}