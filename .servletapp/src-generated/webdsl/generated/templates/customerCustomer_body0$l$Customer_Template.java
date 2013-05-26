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

public @SuppressWarnings("all") class customerCustomer_body0$l$Customer_Template extends TemplateServlet 
{ 
  protected void storeArguments(Object[] args)
  { 
    arg0 = (utils.RefArg)args[0];
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
    return "customerCustomer_body0$l$Customer";
  }

  public String getTemplateClassName()
  { 
    return "customerCustomer_body0$l$Customer_Template";
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
    return "customerCustomer_body0$l$(arg : Ref<Customer>)";
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

  private utils.RefArg arg0 = null;

  public void setArg0(utils.RefArg arg0)
  { 
    this.arg0 = arg0;
  }

  public utils.RefArg getArg0()
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
    ident += "tcall543";
    ThreadLocalPage.get().enterTemplateContext("tcall543");
    try
    { 
      Object[] args1297 = {"Details"};
      utils.LocalTemplateArguments args21296 = env.getExtraLocalTemplateArguments("groupString");
      if(args21296 != null)
      { 
        args1297 = ArrayUtils.addAll(args1297, args21296.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupString", new utils.TemplateCall("customerCustomer_ta0Customer", getElementsContext(), new Object[]{(webdsl.generated.domain.Customer)arg0.get()}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("groupString", args1297, newenv, attrsmapout, args21296);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupString(Details)");
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
    int sec7 = ThreadLocalPage.get().getSectionDepth();
    if(sec7 > 0)
    { 
      if(sec7 > 6)
      { 
        sec7 = 6;
      }
    }
    else
    { 
      sec7 = 1;
    }
    out.print("<h" + sec7);
    out.print(" class=\"header section" + sec7 + "\" " + "" + ">");
    String tmpstring15;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox(((webdsl.generated.domain.Customer)arg0.get()).getName()))
      { 
        tmpstring15 = "";
      }
      else
      { 
        tmpstring15 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf(((webdsl.generated.domain.Customer)arg0.get()).getName()) : utils.HTMLFilter.filter(String.valueOf(((webdsl.generated.domain.Customer)arg0.get()).getName())));
      }
    }
    catch(NullPointerException npe)
    { 
      tmpstring15 = "";
    }
    catch(IndexOutOfBoundsException ine)
    { 
      tmpstring15 = "";
    }
    out.print(tmpstring15);
    out.print("</h" + sec7 + ">");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall543";
    ThreadLocalPage.get().enterTemplateContext("tcall543");
    try
    { 
      Object[] args1300 = {"Details"};
      utils.LocalTemplateArguments args21299 = env.getExtraLocalTemplateArguments("groupString");
      if(args21299 != null)
      { 
        args1300 = ArrayUtils.addAll(args1300, args21299.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupString", new utils.TemplateCall("customerCustomer_ta0Customer", getElementsContext(), new Object[]{(webdsl.generated.domain.Customer)arg0.get()}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("groupString", args1300, newenv, attrsmapout, args21299);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupString(Details)");
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
    ident += "tcall543";
    ThreadLocalPage.get().enterTemplateContext("tcall543");
    try
    { 
      Object[] args1299 = {"Details"};
      utils.LocalTemplateArguments args21298 = env.getExtraLocalTemplateArguments("groupString");
      if(args21298 != null)
      { 
        args1299 = ArrayUtils.addAll(args1299, args21298.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupString", new utils.TemplateCall("customerCustomer_ta0Customer", getElementsContext(), new Object[]{(webdsl.generated.domain.Customer)arg0.get()}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).handleActions("groupString", args1299, newenv, attrsmapout, args21298);
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
    ident += "tcall543";
    ThreadLocalPage.get().enterTemplateContext("tcall543");
    try
    { 
      Object[] args1298 = {"Details"};
      utils.LocalTemplateArguments args21297 = env.getExtraLocalTemplateArguments("groupString");
      if(args21297 != null)
      { 
        args1298 = ArrayUtils.addAll(args1298, args21297.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("groupString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      newenv.putWithcall("elements#groupString", new utils.TemplateCall("customerCustomer_ta0Customer", getElementsContext(), new Object[]{(webdsl.generated.domain.Customer)arg0.get()}, attrs));
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("groupString", args1298, newenv, attrsmapout, args21297);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "groupString(Details)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }
}