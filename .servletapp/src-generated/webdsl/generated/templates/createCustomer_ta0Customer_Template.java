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

public @SuppressWarnings("all") class createCustomer_ta0Customer_Template extends TemplateServlet 
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
    return "createCustomer_ta0Customer";
  }

  public String getTemplateClassName()
  { 
    return "createCustomer_ta0Customer_Template";
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
    return "createCustomer_ta0(temp : Ref<Customer>)";
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
    ident += "tcall529";
    ThreadLocalPage.get().enterTemplateContext("tcall529");
    try
    { 
      Object[] args1275 = {};
      utils.LocalTemplateArguments args21274 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21274 != null)
      { 
        args1275 = ArrayUtils.addAll(args1275, args21274.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta1Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1275, newenv, attrsmapout, args21274);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall531";
    ThreadLocalPage.get().enterTemplateContext("tcall531");
    try
    { 
      Object[] args1274 = {};
      utils.LocalTemplateArguments args21273 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21273 != null)
      { 
        args1274 = ArrayUtils.addAll(args1274, args21273.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta3Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1274, newenv, attrsmapout, args21273);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall533";
    ThreadLocalPage.get().enterTemplateContext("tcall533");
    try
    { 
      Object[] args1273 = {};
      utils.LocalTemplateArguments args21272 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21272 != null)
      { 
        args1273 = ArrayUtils.addAll(args1273, args21272.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta5Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1273, newenv, attrsmapout, args21272);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall535";
    ThreadLocalPage.get().enterTemplateContext("tcall535");
    try
    { 
      Object[] args1272 = {};
      utils.LocalTemplateArguments args21271 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21271 != null)
      { 
        args1272 = ArrayUtils.addAll(args1272, args21271.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta7Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1272, newenv, attrsmapout, args21271);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall537";
    ThreadLocalPage.get().enterTemplateContext("tcall537");
    try
    { 
      Object[] args1271 = {};
      utils.LocalTemplateArguments args21270 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21270 != null)
      { 
        args1271 = ArrayUtils.addAll(args1271, args21270.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta9Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1271, newenv, attrsmapout, args21270);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall539";
    ThreadLocalPage.get().enterTemplateContext("tcall539");
    try
    { 
      Object[] args1270 = {};
      utils.LocalTemplateArguments args21269 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21269 != null)
      { 
        args1270 = ArrayUtils.addAll(args1270, args21269.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta12Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1270, newenv, attrsmapout, args21269);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall541";
    ThreadLocalPage.get().enterTemplateContext("tcall541");
    try
    { 
      Object[] args1269 = {};
      utils.LocalTemplateArguments args21268 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21268 != null)
      { 
        args1269 = ArrayUtils.addAll(args1269, args21268.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta14Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1269, newenv, attrsmapout, args21268);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall529";
    ThreadLocalPage.get().enterTemplateContext("tcall529");
    try
    { 
      Object[] args1290 = {};
      utils.LocalTemplateArguments args21289 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21289 != null)
      { 
        args1290 = ArrayUtils.addAll(args1290, args21289.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta1Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1290, newenv, attrsmapout, args21289);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall531";
    ThreadLocalPage.get().enterTemplateContext("tcall531");
    try
    { 
      Object[] args1291 = {};
      utils.LocalTemplateArguments args21290 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21290 != null)
      { 
        args1291 = ArrayUtils.addAll(args1291, args21290.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta3Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1291, newenv, attrsmapout, args21290);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall533";
    ThreadLocalPage.get().enterTemplateContext("tcall533");
    try
    { 
      Object[] args1292 = {};
      utils.LocalTemplateArguments args21291 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21291 != null)
      { 
        args1292 = ArrayUtils.addAll(args1292, args21291.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta5Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1292, newenv, attrsmapout, args21291);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall535";
    ThreadLocalPage.get().enterTemplateContext("tcall535");
    try
    { 
      Object[] args1293 = {};
      utils.LocalTemplateArguments args21292 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21292 != null)
      { 
        args1293 = ArrayUtils.addAll(args1293, args21292.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta7Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1293, newenv, attrsmapout, args21292);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall537";
    ThreadLocalPage.get().enterTemplateContext("tcall537");
    try
    { 
      Object[] args1294 = {};
      utils.LocalTemplateArguments args21293 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21293 != null)
      { 
        args1294 = ArrayUtils.addAll(args1294, args21293.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta9Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1294, newenv, attrsmapout, args21293);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall539";
    ThreadLocalPage.get().enterTemplateContext("tcall539");
    try
    { 
      Object[] args1295 = {};
      utils.LocalTemplateArguments args21294 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21294 != null)
      { 
        args1295 = ArrayUtils.addAll(args1295, args21294.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta12Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1295, newenv, attrsmapout, args21294);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall541";
    ThreadLocalPage.get().enterTemplateContext("tcall541");
    try
    { 
      Object[] args1296 = {};
      utils.LocalTemplateArguments args21295 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21295 != null)
      { 
        args1296 = ArrayUtils.addAll(args1296, args21295.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta14Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1296, newenv, attrsmapout, args21295);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall529";
    ThreadLocalPage.get().enterTemplateContext("tcall529");
    try
    { 
      Object[] args1289 = {};
      utils.LocalTemplateArguments args21288 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21288 != null)
      { 
        args1289 = ArrayUtils.addAll(args1289, args21288.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta1Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1289, newenv, attrsmapout, args21288);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall531";
    ThreadLocalPage.get().enterTemplateContext("tcall531");
    try
    { 
      Object[] args1288 = {};
      utils.LocalTemplateArguments args21287 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21287 != null)
      { 
        args1288 = ArrayUtils.addAll(args1288, args21287.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta3Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1288, newenv, attrsmapout, args21287);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall533";
    ThreadLocalPage.get().enterTemplateContext("tcall533");
    try
    { 
      Object[] args1287 = {};
      utils.LocalTemplateArguments args21286 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21286 != null)
      { 
        args1287 = ArrayUtils.addAll(args1287, args21286.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta5Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1287, newenv, attrsmapout, args21286);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall535";
    ThreadLocalPage.get().enterTemplateContext("tcall535");
    try
    { 
      Object[] args1286 = {};
      utils.LocalTemplateArguments args21285 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21285 != null)
      { 
        args1286 = ArrayUtils.addAll(args1286, args21285.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta7Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1286, newenv, attrsmapout, args21285);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall537";
    ThreadLocalPage.get().enterTemplateContext("tcall537");
    try
    { 
      Object[] args1285 = {};
      utils.LocalTemplateArguments args21284 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21284 != null)
      { 
        args1285 = ArrayUtils.addAll(args1285, args21284.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta9Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1285, newenv, attrsmapout, args21284);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall539";
    ThreadLocalPage.get().enterTemplateContext("tcall539");
    try
    { 
      Object[] args1284 = {};
      utils.LocalTemplateArguments args21283 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21283 != null)
      { 
        args1284 = ArrayUtils.addAll(args1284, args21283.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta12Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1284, newenv, attrsmapout, args21283);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall541";
    ThreadLocalPage.get().enterTemplateContext("tcall541");
    try
    { 
      Object[] args1283 = {};
      utils.LocalTemplateArguments args21282 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21282 != null)
      { 
        args1283 = ArrayUtils.addAll(args1283, args21282.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta14Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1283, newenv, attrsmapout, args21282);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    putAction("createCustomer_ta0Customer_save1", new createCustomer_ta0Customer_save1()
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
    ident += "tcall529";
    ThreadLocalPage.get().enterTemplateContext("tcall529");
    try
    { 
      Object[] args1282 = {};
      utils.LocalTemplateArguments args21281 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21281 != null)
      { 
        args1282 = ArrayUtils.addAll(args1282, args21281.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta1Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1282, newenv, attrsmapout, args21281);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall531";
    ThreadLocalPage.get().enterTemplateContext("tcall531");
    try
    { 
      Object[] args1281 = {};
      utils.LocalTemplateArguments args21280 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21280 != null)
      { 
        args1281 = ArrayUtils.addAll(args1281, args21280.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta3Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1281, newenv, attrsmapout, args21280);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall533";
    ThreadLocalPage.get().enterTemplateContext("tcall533");
    try
    { 
      Object[] args1280 = {};
      utils.LocalTemplateArguments args21279 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21279 != null)
      { 
        args1280 = ArrayUtils.addAll(args1280, args21279.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta5Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1280, newenv, attrsmapout, args21279);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall535";
    ThreadLocalPage.get().enterTemplateContext("tcall535");
    try
    { 
      Object[] args1279 = {};
      utils.LocalTemplateArguments args21278 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21278 != null)
      { 
        args1279 = ArrayUtils.addAll(args1279, args21278.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta7Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1279, newenv, attrsmapout, args21278);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall537";
    ThreadLocalPage.get().enterTemplateContext("tcall537");
    try
    { 
      Object[] args1278 = {};
      utils.LocalTemplateArguments args21277 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21277 != null)
      { 
        args1278 = ArrayUtils.addAll(args1278, args21277.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta9Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1278, newenv, attrsmapout, args21277);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall539";
    ThreadLocalPage.get().enterTemplateContext("tcall539");
    try
    { 
      Object[] args1277 = {};
      utils.LocalTemplateArguments args21276 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21276 != null)
      { 
        args1277 = ArrayUtils.addAll(args1277, args21276.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta12Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1277, newenv, attrsmapout, args21276);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
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
    ident += "tcall541";
    ThreadLocalPage.get().enterTemplateContext("tcall541");
    try
    { 
      Object[] args1276 = {};
      utils.LocalTemplateArguments args21275 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21275 != null)
      { 
        args1276 = ArrayUtils.addAll(args1276, args21275.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("createCustomer_ta0Customer_ta14Customer", getElementsContext(), new Object[]{temp0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1276, newenv, attrsmapout, args21275);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupitem()");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }
}