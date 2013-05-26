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

public @SuppressWarnings("all") class applicationmenu_Template extends TemplateServlet 
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
    return "applicationmenu";
  }

  public String getTemplateClassName()
  { 
    return "applicationmenu_Template";
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
    return "applicationmenu()";
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
      return "applicationmenu";
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
    ident += "tcall213";
    ThreadLocalPage.get().enterTemplateContext("tcall213");
    try
    { 
      Object[] args528 = {};
      utils.LocalTemplateArguments args2527 = env.getExtraLocalTemplateArguments("navbaritem");
      if(args2527 != null)
      { 
        args528 = ArrayUtils.addAll(args528, args2527.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("navbaritem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#navbaritem", new utils.TemplateCall("applicationmenu_ta0", getElementsContext(), new Object[]{}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("navbaritem", args528, newenv, attrsmapout, args2527);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "navbaritem()");
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
    ident += "tcall215";
    ThreadLocalPage.get().enterTemplateContext("tcall215");
    try
    { 
      Object[] args527 = {};
      utils.LocalTemplateArguments args2526 = env.getExtraLocalTemplateArguments("navbaritem");
      if(args2526 != null)
      { 
        args527 = ArrayUtils.addAll(args527, args2526.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("navbaritem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#navbaritem", new utils.TemplateCall("applicationmenu_ta1", getElementsContext(), new Object[]{}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("navbaritem", args527, newenv, attrsmapout, args2526);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "navbaritem()");
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
    ident += "tcall213";
    ThreadLocalPage.get().enterTemplateContext("tcall213");
    try
    { 
      Object[] args533 = {};
      utils.LocalTemplateArguments args2532 = env.getExtraLocalTemplateArguments("navbaritem");
      if(args2532 != null)
      { 
        args533 = ArrayUtils.addAll(args533, args2532.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("navbaritem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#navbaritem", new utils.TemplateCall("applicationmenu_ta0", getElementsContext(), new Object[]{}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("navbaritem", args533, newenv, attrsmapout, args2532);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "navbaritem()");
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
    ident += "tcall215";
    ThreadLocalPage.get().enterTemplateContext("tcall215");
    try
    { 
      Object[] args534 = {};
      utils.LocalTemplateArguments args2533 = env.getExtraLocalTemplateArguments("navbaritem");
      if(args2533 != null)
      { 
        args534 = ArrayUtils.addAll(args534, args2533.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("navbaritem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#navbaritem", new utils.TemplateCall("applicationmenu_ta1", getElementsContext(), new Object[]{}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("navbaritem", args534, newenv, attrsmapout, args2533);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "navbaritem()");
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
    ident += "tcall213";
    ThreadLocalPage.get().enterTemplateContext("tcall213");
    try
    { 
      Object[] args532 = {};
      utils.LocalTemplateArguments args2531 = env.getExtraLocalTemplateArguments("navbaritem");
      if(args2531 != null)
      { 
        args532 = ArrayUtils.addAll(args532, args2531.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("navbaritem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#navbaritem", new utils.TemplateCall("applicationmenu_ta0", getElementsContext(), new Object[]{}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("navbaritem", args532, newenv, attrsmapout, args2531);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "navbaritem()");
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
    ident += "tcall215";
    ThreadLocalPage.get().enterTemplateContext("tcall215");
    try
    { 
      Object[] args531 = {};
      utils.LocalTemplateArguments args2530 = env.getExtraLocalTemplateArguments("navbaritem");
      if(args2530 != null)
      { 
        args531 = ArrayUtils.addAll(args531, args2530.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("navbaritem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#navbaritem", new utils.TemplateCall("applicationmenu_ta1", getElementsContext(), new Object[]{}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("navbaritem", args531, newenv, attrsmapout, args2530);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "navbaritem()");
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
    ident += "tcall213";
    ThreadLocalPage.get().enterTemplateContext("tcall213");
    try
    { 
      Object[] args530 = {};
      utils.LocalTemplateArguments args2529 = env.getExtraLocalTemplateArguments("navbaritem");
      if(args2529 != null)
      { 
        args530 = ArrayUtils.addAll(args530, args2529.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("navbaritem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#navbaritem", new utils.TemplateCall("applicationmenu_ta0", getElementsContext(), new Object[]{}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("navbaritem", args530, newenv, attrsmapout, args2529);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "navbaritem()");
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
    ident += "tcall215";
    ThreadLocalPage.get().enterTemplateContext("tcall215");
    try
    { 
      Object[] args529 = {};
      utils.LocalTemplateArguments args2528 = env.getExtraLocalTemplateArguments("navbaritem");
      if(args2528 != null)
      { 
        args529 = ArrayUtils.addAll(args529, args2528.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("navbaritem").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#navbaritem", new utils.TemplateCall("applicationmenu_ta1", getElementsContext(), new Object[]{}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("navbaritem", args529, newenv, attrsmapout, args2528);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "navbaritem()");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }
}