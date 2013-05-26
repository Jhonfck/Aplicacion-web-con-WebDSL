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

public @SuppressWarnings("all") class customerCustomer_ta0Customer_Template extends TemplateServlet 
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
    return "customerCustomer_ta0Customer";
  }

  public String getTemplateClassName()
  { 
    return "customerCustomer_ta0Customer_Template";
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
    return "customerCustomer_ta0(arg : Customer)";
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
    if(!org.webdsl.tools.Utils.equal(arg0.getName(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall545";
      ThreadLocalPage.get().enterTemplateContext("tcall545");
      try
      { 
        Object[] args1307 = {};
        utils.LocalTemplateArguments args21306 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21306 != null)
        { 
          args1307 = ArrayUtils.addAll(args1307, args21306.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta1Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1307, newenv, attrsmapout, args21306);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getSurname(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall547";
      ThreadLocalPage.get().enterTemplateContext("tcall547");
      try
      { 
        Object[] args1306 = {};
        utils.LocalTemplateArguments args21305 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21305 != null)
        { 
          args1306 = ArrayUtils.addAll(args1306, args21305.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta3Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1306, newenv, attrsmapout, args21305);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getAddress(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall549";
      ThreadLocalPage.get().enterTemplateContext("tcall549");
      try
      { 
        Object[] args1305 = {};
        utils.LocalTemplateArguments args21304 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21304 != null)
        { 
          args1305 = ArrayUtils.addAll(args1305, args21304.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta5Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1305, newenv, attrsmapout, args21304);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getEmail(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall551";
      ThreadLocalPage.get().enterTemplateContext("tcall551");
      try
      { 
        Object[] args1304 = {};
        utils.LocalTemplateArguments args21303 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21303 != null)
        { 
          args1304 = ArrayUtils.addAll(args1304, args21303.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta7Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1304, newenv, attrsmapout, args21303);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getDateOfBirth(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall553";
      ThreadLocalPage.get().enterTemplateContext("tcall553");
      try
      { 
        Object[] args1303 = {};
        utils.LocalTemplateArguments args21302 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21302 != null)
        { 
          args1303 = ArrayUtils.addAll(args1303, args21302.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta9Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1303, newenv, attrsmapout, args21302);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getBio(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall555";
      ThreadLocalPage.get().enterTemplateContext("tcall555");
      try
      { 
        Object[] args1302 = {};
        utils.LocalTemplateArguments args21301 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21301 != null)
        { 
          args1302 = ArrayUtils.addAll(args1302, args21301.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta12Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1302, newenv, attrsmapout, args21301);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getPhoto(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall557";
      ThreadLocalPage.get().enterTemplateContext("tcall557");
      try
      { 
        Object[] args1301 = {};
        utils.LocalTemplateArguments args21300 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21300 != null)
        { 
          args1301 = ArrayUtils.addAll(args1301, args21300.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta14Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupitem", args1301, newenv, attrsmapout, args21300);
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
    else
    { }
  }

  protected void renderInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    if(!org.webdsl.tools.Utils.equal(arg0.getName(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall545";
      ThreadLocalPage.get().enterTemplateContext("tcall545");
      try
      { 
        Object[] args1322 = {};
        utils.LocalTemplateArguments args21321 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21321 != null)
        { 
          args1322 = ArrayUtils.addAll(args1322, args21321.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta1Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1322, newenv, attrsmapout, args21321);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getSurname(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall547";
      ThreadLocalPage.get().enterTemplateContext("tcall547");
      try
      { 
        Object[] args1323 = {};
        utils.LocalTemplateArguments args21322 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21322 != null)
        { 
          args1323 = ArrayUtils.addAll(args1323, args21322.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta3Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1323, newenv, attrsmapout, args21322);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getAddress(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall549";
      ThreadLocalPage.get().enterTemplateContext("tcall549");
      try
      { 
        Object[] args1324 = {};
        utils.LocalTemplateArguments args21323 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21323 != null)
        { 
          args1324 = ArrayUtils.addAll(args1324, args21323.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta5Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1324, newenv, attrsmapout, args21323);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getEmail(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall551";
      ThreadLocalPage.get().enterTemplateContext("tcall551");
      try
      { 
        Object[] args1325 = {};
        utils.LocalTemplateArguments args21324 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21324 != null)
        { 
          args1325 = ArrayUtils.addAll(args1325, args21324.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta7Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1325, newenv, attrsmapout, args21324);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getDateOfBirth(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall553";
      ThreadLocalPage.get().enterTemplateContext("tcall553");
      try
      { 
        Object[] args1326 = {};
        utils.LocalTemplateArguments args21325 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21325 != null)
        { 
          args1326 = ArrayUtils.addAll(args1326, args21325.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta9Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1326, newenv, attrsmapout, args21325);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getBio(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall555";
      ThreadLocalPage.get().enterTemplateContext("tcall555");
      try
      { 
        Object[] args1327 = {};
        utils.LocalTemplateArguments args21326 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21326 != null)
        { 
          args1327 = ArrayUtils.addAll(args1327, args21326.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta12Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1327, newenv, attrsmapout, args21326);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getPhoto(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall557";
      ThreadLocalPage.get().enterTemplateContext("tcall557");
      try
      { 
        Object[] args1328 = {};
        utils.LocalTemplateArguments args21327 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21327 != null)
        { 
          args1328 = ArrayUtils.addAll(args1328, args21327.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta14Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render("groupitem", args1328, newenv, attrsmapout, args21327);
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
    else
    { }
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
    if(!org.webdsl.tools.Utils.equal(arg0.getName(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall545";
      ThreadLocalPage.get().enterTemplateContext("tcall545");
      try
      { 
        Object[] args1321 = {};
        utils.LocalTemplateArguments args21320 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21320 != null)
        { 
          args1321 = ArrayUtils.addAll(args1321, args21320.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta1Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1321, newenv, attrsmapout, args21320);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getSurname(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall547";
      ThreadLocalPage.get().enterTemplateContext("tcall547");
      try
      { 
        Object[] args1320 = {};
        utils.LocalTemplateArguments args21319 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21319 != null)
        { 
          args1320 = ArrayUtils.addAll(args1320, args21319.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta3Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1320, newenv, attrsmapout, args21319);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getAddress(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall549";
      ThreadLocalPage.get().enterTemplateContext("tcall549");
      try
      { 
        Object[] args1319 = {};
        utils.LocalTemplateArguments args21318 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21318 != null)
        { 
          args1319 = ArrayUtils.addAll(args1319, args21318.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta5Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1319, newenv, attrsmapout, args21318);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getEmail(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall551";
      ThreadLocalPage.get().enterTemplateContext("tcall551");
      try
      { 
        Object[] args1318 = {};
        utils.LocalTemplateArguments args21317 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21317 != null)
        { 
          args1318 = ArrayUtils.addAll(args1318, args21317.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta7Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1318, newenv, attrsmapout, args21317);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getDateOfBirth(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall553";
      ThreadLocalPage.get().enterTemplateContext("tcall553");
      try
      { 
        Object[] args1317 = {};
        utils.LocalTemplateArguments args21316 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21316 != null)
        { 
          args1317 = ArrayUtils.addAll(args1317, args21316.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta9Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1317, newenv, attrsmapout, args21316);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getBio(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall555";
      ThreadLocalPage.get().enterTemplateContext("tcall555");
      try
      { 
        Object[] args1316 = {};
        utils.LocalTemplateArguments args21315 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21315 != null)
        { 
          args1316 = ArrayUtils.addAll(args1316, args21315.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta12Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1316, newenv, attrsmapout, args21315);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getPhoto(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall557";
      ThreadLocalPage.get().enterTemplateContext("tcall557");
      try
      { 
        Object[] args1315 = {};
        utils.LocalTemplateArguments args21314 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21314 != null)
        { 
          args1315 = ArrayUtils.addAll(args1315, args21314.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta14Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions("groupitem", args1315, newenv, attrsmapout, args21314);
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
    else
    { }
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
    if(!org.webdsl.tools.Utils.equal(arg0.getName(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall545";
      ThreadLocalPage.get().enterTemplateContext("tcall545");
      try
      { 
        Object[] args1314 = {};
        utils.LocalTemplateArguments args21313 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21313 != null)
        { 
          args1314 = ArrayUtils.addAll(args1314, args21313.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta1Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1314, newenv, attrsmapout, args21313);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getSurname(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall547";
      ThreadLocalPage.get().enterTemplateContext("tcall547");
      try
      { 
        Object[] args1313 = {};
        utils.LocalTemplateArguments args21312 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21312 != null)
        { 
          args1313 = ArrayUtils.addAll(args1313, args21312.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta3Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1313, newenv, attrsmapout, args21312);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getAddress(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall549";
      ThreadLocalPage.get().enterTemplateContext("tcall549");
      try
      { 
        Object[] args1312 = {};
        utils.LocalTemplateArguments args21311 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21311 != null)
        { 
          args1312 = ArrayUtils.addAll(args1312, args21311.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta5Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1312, newenv, attrsmapout, args21311);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getEmail(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall551";
      ThreadLocalPage.get().enterTemplateContext("tcall551");
      try
      { 
        Object[] args1311 = {};
        utils.LocalTemplateArguments args21310 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21310 != null)
        { 
          args1311 = ArrayUtils.addAll(args1311, args21310.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta7Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1311, newenv, attrsmapout, args21310);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getDateOfBirth(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall553";
      ThreadLocalPage.get().enterTemplateContext("tcall553");
      try
      { 
        Object[] args1310 = {};
        utils.LocalTemplateArguments args21309 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21309 != null)
        { 
          args1310 = ArrayUtils.addAll(args1310, args21309.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta9Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1310, newenv, attrsmapout, args21309);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getBio(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall555";
      ThreadLocalPage.get().enterTemplateContext("tcall555");
      try
      { 
        Object[] args1309 = {};
        utils.LocalTemplateArguments args21308 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21308 != null)
        { 
          args1309 = ArrayUtils.addAll(args1309, args21308.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta12Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1309, newenv, attrsmapout, args21308);
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
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.getPhoto(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall557";
      ThreadLocalPage.get().enterTemplateContext("tcall557");
      try
      { 
        Object[] args1308 = {};
        utils.LocalTemplateArguments args21307 = env.getExtraLocalTemplateArguments("groupitem");
        if(args21307 != null)
        { 
          args1308 = ArrayUtils.addAll(args1308, args21307.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupitem").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        newenv.putWithcall("elements#groupitem", new utils.TemplateCall("customerCustomer_ta0Customer_ta14Customer", getElementsContext(), new Object[]{arg0}, attrs));
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupitem", args1308, newenv, attrsmapout, args21307);
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
    else
    { }
  }
}