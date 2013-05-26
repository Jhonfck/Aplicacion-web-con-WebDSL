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

public @SuppressWarnings("all") class main_Template extends TemplateServlet 
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
    return "main_Template";
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
    ident += "tcall221";
    ThreadLocalPage.get().enterTemplateContext("tcall221");
    try
    { 
      Object[] args548 = {};
      utils.LocalTemplateArguments args2547 = env.getExtraLocalTemplateArguments("body");
      if(args2547 != null)
      { 
        args548 = ArrayUtils.addAll(args548, args2547.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("body").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("body", args548, newenv, attrsmapout, args2547);
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
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall221";
    ThreadLocalPage.get().enterTemplateContext("tcall221");
    try
    { 
      Object[] args551 = {};
      utils.LocalTemplateArguments args2550 = env.getExtraLocalTemplateArguments("body");
      if(args2550 != null)
      { 
        args551 = ArrayUtils.addAll(args551, args2550.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("body").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("body", args551, newenv, attrsmapout, args2550);
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
    ident += "tcall221";
    ThreadLocalPage.get().enterTemplateContext("tcall221");
    try
    { 
      Object[] args550 = {};
      utils.LocalTemplateArguments args2549 = env.getExtraLocalTemplateArguments("body");
      if(args2549 != null)
      { 
        args550 = ArrayUtils.addAll(args550, args2549.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("body").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("body", args550, newenv, attrsmapout, args2549);
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
    ident += "tcall221";
    ThreadLocalPage.get().enterTemplateContext("tcall221");
    try
    { 
      Object[] args549 = {};
      utils.LocalTemplateArguments args2548 = env.getExtraLocalTemplateArguments("body");
      if(args2548 != null)
      { 
        args549 = ArrayUtils.addAll(args549, args2548.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("body").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("body", args549, newenv, attrsmapout, args2548);
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