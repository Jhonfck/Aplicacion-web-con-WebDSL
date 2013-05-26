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

public @SuppressWarnings("all") class editCustomerCustomer_ta0Customer_Template extends TemplateServlet 
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
    return "editCustomerCustomer_ta0Customer";
  }

  public String getTemplateClassName()
  { 
    return "editCustomerCustomer_ta0Customer_Template";
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
    return "editCustomerCustomer_ta0(arg : Customer)";
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
    ident += "tcall564";
    ThreadLocalPage.get().enterTemplateContext("tcall564");
    try
    { 
      Object[] args1347 = {};
      utils.LocalTemplateArguments args21346 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21346 != null)
      { 
        args1347 = ArrayUtils.addAll(args1347, args21346.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta1Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1347, newenv, attrsmapout, args21346);
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
    ident += "tcall566";
    ThreadLocalPage.get().enterTemplateContext("tcall566");
    try
    { 
      Object[] args1346 = {};
      utils.LocalTemplateArguments args21345 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21345 != null)
      { 
        args1346 = ArrayUtils.addAll(args1346, args21345.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta3Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1346, newenv, attrsmapout, args21345);
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
    ident += "tcall568";
    ThreadLocalPage.get().enterTemplateContext("tcall568");
    try
    { 
      Object[] args1345 = {};
      utils.LocalTemplateArguments args21344 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21344 != null)
      { 
        args1345 = ArrayUtils.addAll(args1345, args21344.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta5Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1345, newenv, attrsmapout, args21344);
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
    ident += "tcall570";
    ThreadLocalPage.get().enterTemplateContext("tcall570");
    try
    { 
      Object[] args1344 = {};
      utils.LocalTemplateArguments args21343 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21343 != null)
      { 
        args1344 = ArrayUtils.addAll(args1344, args21343.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta7Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1344, newenv, attrsmapout, args21343);
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
    ident += "tcall572";
    ThreadLocalPage.get().enterTemplateContext("tcall572");
    try
    { 
      Object[] args1343 = {};
      utils.LocalTemplateArguments args21342 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21342 != null)
      { 
        args1343 = ArrayUtils.addAll(args1343, args21342.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta9Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1343, newenv, attrsmapout, args21342);
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
    ident += "tcall574";
    ThreadLocalPage.get().enterTemplateContext("tcall574");
    try
    { 
      Object[] args1342 = {};
      utils.LocalTemplateArguments args21341 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21341 != null)
      { 
        args1342 = ArrayUtils.addAll(args1342, args21341.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta12Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1342, newenv, attrsmapout, args21341);
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
    ident += "tcall576";
    ThreadLocalPage.get().enterTemplateContext("tcall576");
    try
    { 
      Object[] args1341 = {};
      utils.LocalTemplateArguments args21340 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21340 != null)
      { 
        args1341 = ArrayUtils.addAll(args1341, args21340.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta14Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1341, newenv, attrsmapout, args21340);
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
    ident += "tcall564";
    ThreadLocalPage.get().enterTemplateContext("tcall564");
    try
    { 
      Object[] args1362 = {};
      utils.LocalTemplateArguments args21361 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21361 != null)
      { 
        args1362 = ArrayUtils.addAll(args1362, args21361.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta1Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1362, newenv, attrsmapout, args21361);
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
    ident += "tcall566";
    ThreadLocalPage.get().enterTemplateContext("tcall566");
    try
    { 
      Object[] args1363 = {};
      utils.LocalTemplateArguments args21362 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21362 != null)
      { 
        args1363 = ArrayUtils.addAll(args1363, args21362.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta3Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1363, newenv, attrsmapout, args21362);
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
    ident += "tcall568";
    ThreadLocalPage.get().enterTemplateContext("tcall568");
    try
    { 
      Object[] args1364 = {};
      utils.LocalTemplateArguments args21363 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21363 != null)
      { 
        args1364 = ArrayUtils.addAll(args1364, args21363.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta5Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1364, newenv, attrsmapout, args21363);
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
    ident += "tcall570";
    ThreadLocalPage.get().enterTemplateContext("tcall570");
    try
    { 
      Object[] args1365 = {};
      utils.LocalTemplateArguments args21364 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21364 != null)
      { 
        args1365 = ArrayUtils.addAll(args1365, args21364.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta7Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1365, newenv, attrsmapout, args21364);
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
    ident += "tcall572";
    ThreadLocalPage.get().enterTemplateContext("tcall572");
    try
    { 
      Object[] args1366 = {};
      utils.LocalTemplateArguments args21365 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21365 != null)
      { 
        args1366 = ArrayUtils.addAll(args1366, args21365.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta9Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1366, newenv, attrsmapout, args21365);
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
    ident += "tcall574";
    ThreadLocalPage.get().enterTemplateContext("tcall574");
    try
    { 
      Object[] args1367 = {};
      utils.LocalTemplateArguments args21366 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21366 != null)
      { 
        args1367 = ArrayUtils.addAll(args1367, args21366.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta12Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1367, newenv, attrsmapout, args21366);
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
    ident += "tcall576";
    ThreadLocalPage.get().enterTemplateContext("tcall576");
    try
    { 
      Object[] args1368 = {};
      utils.LocalTemplateArguments args21367 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21367 != null)
      { 
        args1368 = ArrayUtils.addAll(args1368, args21367.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta14Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1368, newenv, attrsmapout, args21367);
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
    ident += "tcall564";
    ThreadLocalPage.get().enterTemplateContext("tcall564");
    try
    { 
      Object[] args1361 = {};
      utils.LocalTemplateArguments args21360 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21360 != null)
      { 
        args1361 = ArrayUtils.addAll(args1361, args21360.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta1Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1361, newenv, attrsmapout, args21360);
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
    ident += "tcall566";
    ThreadLocalPage.get().enterTemplateContext("tcall566");
    try
    { 
      Object[] args1360 = {};
      utils.LocalTemplateArguments args21359 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21359 != null)
      { 
        args1360 = ArrayUtils.addAll(args1360, args21359.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta3Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1360, newenv, attrsmapout, args21359);
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
    ident += "tcall568";
    ThreadLocalPage.get().enterTemplateContext("tcall568");
    try
    { 
      Object[] args1359 = {};
      utils.LocalTemplateArguments args21358 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21358 != null)
      { 
        args1359 = ArrayUtils.addAll(args1359, args21358.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta5Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1359, newenv, attrsmapout, args21358);
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
    ident += "tcall570";
    ThreadLocalPage.get().enterTemplateContext("tcall570");
    try
    { 
      Object[] args1358 = {};
      utils.LocalTemplateArguments args21357 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21357 != null)
      { 
        args1358 = ArrayUtils.addAll(args1358, args21357.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta7Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1358, newenv, attrsmapout, args21357);
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
    ident += "tcall572";
    ThreadLocalPage.get().enterTemplateContext("tcall572");
    try
    { 
      Object[] args1357 = {};
      utils.LocalTemplateArguments args21356 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21356 != null)
      { 
        args1357 = ArrayUtils.addAll(args1357, args21356.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta9Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1357, newenv, attrsmapout, args21356);
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
    ident += "tcall574";
    ThreadLocalPage.get().enterTemplateContext("tcall574");
    try
    { 
      Object[] args1356 = {};
      utils.LocalTemplateArguments args21355 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21355 != null)
      { 
        args1356 = ArrayUtils.addAll(args1356, args21355.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta12Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1356, newenv, attrsmapout, args21355);
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
    ident += "tcall576";
    ThreadLocalPage.get().enterTemplateContext("tcall576");
    try
    { 
      Object[] args1355 = {};
      utils.LocalTemplateArguments args21354 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21354 != null)
      { 
        args1355 = ArrayUtils.addAll(args1355, args21354.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta14Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1355, newenv, attrsmapout, args21354);
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
    putAction("editCustomerCustomer_ta0Customer_save1", new editCustomerCustomer_ta0Customer_save1()
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
    ident += "tcall564";
    ThreadLocalPage.get().enterTemplateContext("tcall564");
    try
    { 
      Object[] args1354 = {};
      utils.LocalTemplateArguments args21353 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21353 != null)
      { 
        args1354 = ArrayUtils.addAll(args1354, args21353.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta1Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1354, newenv, attrsmapout, args21353);
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
    ident += "tcall566";
    ThreadLocalPage.get().enterTemplateContext("tcall566");
    try
    { 
      Object[] args1353 = {};
      utils.LocalTemplateArguments args21352 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21352 != null)
      { 
        args1353 = ArrayUtils.addAll(args1353, args21352.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta3Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1353, newenv, attrsmapout, args21352);
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
    ident += "tcall568";
    ThreadLocalPage.get().enterTemplateContext("tcall568");
    try
    { 
      Object[] args1352 = {};
      utils.LocalTemplateArguments args21351 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21351 != null)
      { 
        args1352 = ArrayUtils.addAll(args1352, args21351.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta5Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1352, newenv, attrsmapout, args21351);
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
    ident += "tcall570";
    ThreadLocalPage.get().enterTemplateContext("tcall570");
    try
    { 
      Object[] args1351 = {};
      utils.LocalTemplateArguments args21350 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21350 != null)
      { 
        args1351 = ArrayUtils.addAll(args1351, args21350.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta7Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1351, newenv, attrsmapout, args21350);
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
    ident += "tcall572";
    ThreadLocalPage.get().enterTemplateContext("tcall572");
    try
    { 
      Object[] args1350 = {};
      utils.LocalTemplateArguments args21349 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21349 != null)
      { 
        args1350 = ArrayUtils.addAll(args1350, args21349.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta9Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1350, newenv, attrsmapout, args21349);
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
    ident += "tcall574";
    ThreadLocalPage.get().enterTemplateContext("tcall574");
    try
    { 
      Object[] args1349 = {};
      utils.LocalTemplateArguments args21348 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21348 != null)
      { 
        args1349 = ArrayUtils.addAll(args1349, args21348.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta12Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1349, newenv, attrsmapout, args21348);
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
    ident += "tcall576";
    ThreadLocalPage.get().enterTemplateContext("tcall576");
    try
    { 
      Object[] args1348 = {};
      utils.LocalTemplateArguments args21347 = env.getExtraLocalTemplateArguments("groupitem");
      if(args21347 != null)
      { 
        args1348 = ArrayUtils.addAll(args1348, args21347.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupitem", new utils.TemplateCall("editCustomerCustomer_ta0Customer_ta14Customer", getElementsContext(), new Object[]{arg0}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1348, newenv, attrsmapout, args21347);
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