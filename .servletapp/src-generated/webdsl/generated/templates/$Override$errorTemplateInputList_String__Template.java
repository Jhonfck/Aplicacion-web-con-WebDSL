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

public @SuppressWarnings("all") class $Override$errorTemplateInputList_String__Template extends TemplateServlet 
{ 
  protected void storeArguments(Object[] args)
  { 
    messages0 = (java.util.List<String>)args[0];
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
    return "errorTemplateInputList_String_";
  }

  public String getTemplateClassName()
  { 
    return "$Override$errorTemplateInputList_String__Template";
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
    return "errorTemplateInput(messages : List<String>)";
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
      return "errorTemplateInputList_String_";
    }
    else
    { 
      return calledName;
    }
  }

  private java.util.List<String> messages0 = new java.util.ArrayList<String>();

  public void setMessages0(java.util.List<String> messages0)
  { 
    this.messages0 = messages0;
  }

  public java.util.List<String> getMessages0()
  { 
    return messages0;
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
    ident += "tcall218";
    ThreadLocalPage.get().enterTemplateContext("tcall218");
    try
    { 
      Object[] args540 = env.getWithcall("elements#" + getElementsContext()) == null ? new Object[0] : env.getWithcall("elements#" + getElementsContext()).args;
      utils.LocalTemplateArguments args2539 = env.getExtraLocalTemplateArguments(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name);
      if(args2539 != null)
      { 
        args540 = ArrayUtils.addAll(args540, args2539.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name).newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = env.getWithcall("elements#" + getElementsContext()) == null ? utils.TemplateCall.EmptyAttrs : env.getWithcall("elements#" + getElementsContext()).attrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs(env.getWithcall("elements#" + getElementsContext()) == null ? null : env.getWithcall("elements#" + getElementsContext()).parentName, args540, newenv, attrsmapout, args2539);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "elements()");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    java.util.ArrayList<String> list19 = new java.util.ArrayList<String>(messages0);
    inForLoop = true;
    forLoopCounter++;
    int separatorindex16 = 0;
    Object[] array16 = list19.toArray();
    for(int i17 = 0; i17 < array16.length; i17++)
    { 
      String ve0 = (String)array16[i17];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(ve0))
      { 
        WebDSLEntity temp17 = (WebDSLEntity)(Object)ve0;
        forelementcounter = temp17.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp17.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall219";
      ThreadLocalPage.get().enterTemplateContext("tcall219");
      try
      { 
        Object[] args539 = {ve0};
        utils.LocalTemplateArguments args2538 = env.getExtraLocalTemplateArguments("outputString");
        if(args2538 != null)
        { 
          args539 = ArrayUtils.addAll(args539, args2538.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs("outputString", args539, newenv, attrsmapout, args2538);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "outputString(ve)");
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
    ident += "tcall218";
    ThreadLocalPage.get().enterTemplateContext("tcall218");
    try
    { 
      Object[] args545 = env.getWithcall("elements#" + getElementsContext()) == null ? new Object[0] : env.getWithcall("elements#" + getElementsContext()).args;
      utils.LocalTemplateArguments args2544 = env.getExtraLocalTemplateArguments(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name);
      if(args2544 != null)
      { 
        args545 = ArrayUtils.addAll(args545, args2544.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name).newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = env.getWithcall("elements#" + getElementsContext()) == null ? utils.TemplateCall.EmptyAttrs : env.getWithcall("elements#" + getElementsContext()).attrs;
      ((TemplateServlet)templatecalls.get(ident)).render(env.getWithcall("elements#" + getElementsContext()) == null ? null : env.getWithcall("elements#" + getElementsContext()).parentName, args545, newenv, attrsmapout, args2544);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "elements()");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    java.util.ArrayList<String> list22 = new java.util.ArrayList<String>(messages0);
    inForLoop = true;
    forLoopCounter++;
    int separatorindex19 = 0;
    Object[] array19 = list22.toArray();
    for(int i20 = 0; i20 < array19.length; i20++)
    { 
      String ve0 = (String)array19[i20];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(ve0))
      { 
        WebDSLEntity temp20 = (WebDSLEntity)(Object)ve0;
        forelementcounter = temp20.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp20.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      out.print("<" + "tr");
      out.print(" " + "style" + "=\"");
      String tmpstring31;
      try
      { 
        if(org.webdsl.tools.Utils.isNullAutoBox("color: #FF0000;border: 1px solid #FF0000;"))
        { 
          tmpstring31 = "";
        }
        else
        { 
          tmpstring31 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("color: #FF0000;border: 1px solid #FF0000;") : utils.HTMLFilter.filter(String.valueOf("color: #FF0000;border: 1px solid #FF0000;")));
        }
      }
      catch(NullPointerException npe)
      { 
        tmpstring31 = "";
      }
      catch(IndexOutOfBoundsException ine)
      { 
        tmpstring31 = "";
      }
      out.print(tmpstring31);
      out.print("\"");
      out.print(">");
      out.print("<" + "td");
      out.print(">");
      out.print("</" + "td");
      out.print(">");
      out.print("<" + "td");
      out.print(">");
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall219";
      ThreadLocalPage.get().enterTemplateContext("tcall219");
      try
      { 
        Object[] args546 = {ve0};
        utils.LocalTemplateArguments args2545 = env.getExtraLocalTemplateArguments("outputString");
        if(args2545 != null)
        { 
          args546 = ArrayUtils.addAll(args546, args2545.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render("outputString", args546, newenv, attrsmapout, args2545);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "outputString(ve)");
        utils.Warning.printSmallStackTrace(ex);
      }
      ident = "";
      ThreadLocalPage.get().leaveTemplateContext();
      ThreadLocalTemplate.set(this);
      out.print("</" + "td");
      out.print(">");
      out.print("</" + "tr");
      out.print(">");
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
    ident += "tcall218";
    ThreadLocalPage.get().enterTemplateContext("tcall218");
    try
    { 
      Object[] args544 = env.getWithcall("elements#" + getElementsContext()) == null ? new Object[0] : env.getWithcall("elements#" + getElementsContext()).args;
      utils.LocalTemplateArguments args2543 = env.getExtraLocalTemplateArguments(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name);
      if(args2543 != null)
      { 
        args544 = ArrayUtils.addAll(args544, args2543.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name).newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = env.getWithcall("elements#" + getElementsContext()) == null ? utils.TemplateCall.EmptyAttrs : env.getWithcall("elements#" + getElementsContext()).attrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions(env.getWithcall("elements#" + getElementsContext()) == null ? null : env.getWithcall("elements#" + getElementsContext()).parentName, args544, newenv, attrsmapout, args2543);
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
    java.util.ArrayList<String> list21 = new java.util.ArrayList<String>(messages0);
    inForLoop = true;
    forLoopCounter++;
    int separatorindex18 = 0;
    Object[] array18 = list21.toArray();
    for(int i19 = 0; i19 < array18.length; i19++)
    { 
      String ve0 = (String)array18[i19];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(ve0))
      { 
        WebDSLEntity temp19 = (WebDSLEntity)(Object)ve0;
        forelementcounter = temp19.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp19.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall219";
      ThreadLocalPage.get().enterTemplateContext("tcall219");
      try
      { 
        Object[] args543 = {ve0};
        utils.LocalTemplateArguments args2542 = env.getExtraLocalTemplateArguments("outputString");
        if(args2542 != null)
        { 
          args543 = ArrayUtils.addAll(args543, args2542.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions("outputString", args543, newenv, attrsmapout, args2542);
        if(ThreadLocalPage.get().hasExecutedAction)
          return;
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "outputString(ve)");
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
    ident += "tcall218";
    ThreadLocalPage.get().enterTemplateContext("tcall218");
    try
    { 
      Object[] args542 = env.getWithcall("elements#" + getElementsContext()) == null ? new Object[0] : env.getWithcall("elements#" + getElementsContext()).args;
      utils.LocalTemplateArguments args2541 = env.getExtraLocalTemplateArguments(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name);
      if(args2541 != null)
      { 
        args542 = ArrayUtils.addAll(args542, args2541.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate(env.getWithcall("elements#" + getElementsContext()) == null ? "elementsempty" : env.getWithcall("elements#" + getElementsContext()).name).newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = env.getWithcall("elements#" + getElementsContext()) == null ? utils.TemplateCall.EmptyAttrs : env.getWithcall("elements#" + getElementsContext()).attrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs(env.getWithcall("elements#" + getElementsContext()) == null ? null : env.getWithcall("elements#" + getElementsContext()).parentName, args542, newenv, attrsmapout, args2541);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "elements()");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    java.util.ArrayList<String> list20 = new java.util.ArrayList<String>(messages0);
    inForLoop = true;
    forLoopCounter++;
    int separatorindex17 = 0;
    Object[] array17 = list20.toArray();
    for(int i18 = 0; i18 < array17.length; i18++)
    { 
      String ve0 = (String)array17[i18];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(ve0))
      { 
        WebDSLEntity temp18 = (WebDSLEntity)(Object)ve0;
        forelementcounter = temp18.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp18.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "tcall219";
      ThreadLocalPage.get().enterTemplateContext("tcall219");
      try
      { 
        Object[] args541 = {ve0};
        utils.LocalTemplateArguments args2540 = env.getExtraLocalTemplateArguments("outputString");
        if(args2540 != null)
        { 
          args541 = ArrayUtils.addAll(args541, args2540.extraArgs);
        }
        if(templatecalls.get(ident) == null)
        { 
          templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
        }
        org.webdsl.lang.Environment newenv = new Environment(env);
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs("outputString", args541, newenv, attrsmapout, args2540);
      }
      catch(Exception ex)
      { 
        System.out.println("Problem occurred in template call: " + "outputString(ve)");
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