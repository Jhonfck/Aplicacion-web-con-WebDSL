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

public @SuppressWarnings("all") class navbaritem_Template extends TemplateServlet 
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
    return "navbaritem";
  }

  public String getTemplateClassName()
  { 
    return "navbaritem_Template";
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
    return "navbaritem()";
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
      return "navbaritem";
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
    ident += "tcall217";
    ThreadLocalPage.get().enterTemplateContext("tcall217");
    try
    { 
      Object[] args535 = env.getWithcall("elements#" + getElementsContext()) == null ? new Object[0] : env.getWithcall("elements#" + getElementsContext()).args;
      utils.LocalTemplateArguments args2534 = env.getExtraLocalTemplateArguments(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name);
      if(args2534 != null)
      { 
        args535 = ArrayUtils.addAll(args535, args2534.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name).newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = env.getWithcall("elements#" + getElementsContext()) == null ? utils.TemplateCall.EmptyAttrs : env.getWithcall("elements#" + getElementsContext()).attrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs(env.getWithcall("elements#" + getElementsContext()) == null ? null : env.getWithcall("elements#" + getElementsContext()).parentName, args535, newenv, attrsmapout, args2534);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "elements()");
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
    out.print("<" + "span");
    out.print(" " + "class" + "=\"");
    String tmpstring30;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("navbaritem"))
      { 
        tmpstring30 = "";
      }
      else
      { 
        tmpstring30 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("navbaritem") : utils.HTMLFilter.filter(String.valueOf("navbaritem")));
      }
    }
    catch(NullPointerException npe)
    { 
      tmpstring30 = "";
    }
    catch(IndexOutOfBoundsException ine)
    { 
      tmpstring30 = "";
    }
    out.print(tmpstring30);
    out.print("\"");
    out.print(">");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall217";
    ThreadLocalPage.get().enterTemplateContext("tcall217");
    try
    { 
      Object[] args538 = env.getWithcall("elements#" + getElementsContext()) == null ? new Object[0] : env.getWithcall("elements#" + getElementsContext()).args;
      utils.LocalTemplateArguments args2537 = env.getExtraLocalTemplateArguments(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name);
      if(args2537 != null)
      { 
        args538 = ArrayUtils.addAll(args538, args2537.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name).newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = env.getWithcall("elements#" + getElementsContext()) == null ? utils.TemplateCall.EmptyAttrs : env.getWithcall("elements#" + getElementsContext()).attrs;
      ((TemplateServlet)templatecalls.get(ident)).render(env.getWithcall("elements#" + getElementsContext()) == null ? null : env.getWithcall("elements#" + getElementsContext()).parentName, args538, newenv, attrsmapout, args2537);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "elements()");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    out.print("</" + "span");
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
    ident += "tcall217";
    ThreadLocalPage.get().enterTemplateContext("tcall217");
    try
    { 
      Object[] args537 = env.getWithcall("elements#" + getElementsContext()) == null ? new Object[0] : env.getWithcall("elements#" + getElementsContext()).args;
      utils.LocalTemplateArguments args2536 = env.getExtraLocalTemplateArguments(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name);
      if(args2536 != null)
      { 
        args537 = ArrayUtils.addAll(args537, args2536.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name).newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = env.getWithcall("elements#" + getElementsContext()) == null ? utils.TemplateCall.EmptyAttrs : env.getWithcall("elements#" + getElementsContext()).attrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions(env.getWithcall("elements#" + getElementsContext()) == null ? null : env.getWithcall("elements#" + getElementsContext()).parentName, args537, newenv, attrsmapout, args2536);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "elements()");
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
    ident += "tcall217";
    ThreadLocalPage.get().enterTemplateContext("tcall217");
    try
    { 
      Object[] args536 = env.getWithcall("elements#" + getElementsContext()) == null ? new Object[0] : env.getWithcall("elements#" + getElementsContext()).args;
      utils.LocalTemplateArguments args2535 = env.getExtraLocalTemplateArguments(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name);
      if(args2535 != null)
      { 
        args536 = ArrayUtils.addAll(args536, args2535.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name).newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = env.getWithcall("elements#" + getElementsContext()) == null ? utils.TemplateCall.EmptyAttrs : env.getWithcall("elements#" + getElementsContext()).attrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs(env.getWithcall("elements#" + getElementsContext()) == null ? null : env.getWithcall("elements#" + getElementsContext()).parentName, args536, newenv, attrsmapout, args2535);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "elements()");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }
}