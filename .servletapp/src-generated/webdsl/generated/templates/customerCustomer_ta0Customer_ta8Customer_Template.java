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

public @SuppressWarnings("all") class customerCustomer_ta0Customer_ta8Customer_Template extends TemplateServlet 
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
    return "customerCustomer_ta0Customer_ta8Customer";
  }

  public String getTemplateClassName()
  { 
    return "customerCustomer_ta0Customer_ta8Customer_Template";
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
    return "customerCustomer_ta0Customer_ta8(arg : Customer)";
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
      return "customerCustomer_ta0Customer";
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
    ident += "tcall489";
    ThreadLocalPage.get().enterTemplateContext("tcall489");
    try
    { 
      Object[] args1163 = {new RefArg_outputDate_1_customerCustomer_ta0Customer_ta8Customerpc0(arg0)};
      utils.LocalTemplateArguments args21162 = env.getExtraLocalTemplateArguments("outputDate");
      if(args21162 != null)
      { 
        args1163 = ArrayUtils.addAll(args1163, args21162.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputDate").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = new HashMap<String, String>();
      attrsmapout.put("class", "outputdateOfBirth");
      ((TemplateServlet)templatecalls.get(ident)).validateInputs("outputDate", args1163, newenv, attrsmapout, args21162);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputDate(arg.dateOfBirth)");
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
    ident += "tcall489";
    ThreadLocalPage.get().enterTemplateContext("tcall489");
    try
    { 
      Object[] args1166 = {new RefArg_outputDate_1_customerCustomer_ta0Customer_ta8Customerpc0(arg0)};
      utils.LocalTemplateArguments args21165 = env.getExtraLocalTemplateArguments("outputDate");
      if(args21165 != null)
      { 
        args1166 = ArrayUtils.addAll(args1166, args21165.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputDate").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = new HashMap<String, String>();
      attrsmapout.put("class", "outputdateOfBirth");
      ((TemplateServlet)templatecalls.get(ident)).render("outputDate", args1166, newenv, attrsmapout, args21165);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputDate(arg.dateOfBirth)");
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
    ident += "tcall489";
    ThreadLocalPage.get().enterTemplateContext("tcall489");
    try
    { 
      Object[] args1165 = {new RefArg_outputDate_1_customerCustomer_ta0Customer_ta8Customerpc0(arg0)};
      utils.LocalTemplateArguments args21164 = env.getExtraLocalTemplateArguments("outputDate");
      if(args21164 != null)
      { 
        args1165 = ArrayUtils.addAll(args1165, args21164.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputDate").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = new HashMap<String, String>();
      attrsmapout.put("class", "outputdateOfBirth");
      ((TemplateServlet)templatecalls.get(ident)).handleActions("outputDate", args1165, newenv, attrsmapout, args21164);
      if(ThreadLocalPage.get().hasExecutedAction)
        return;
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputDate(arg.dateOfBirth)");
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
    ident += "tcall489";
    ThreadLocalPage.get().enterTemplateContext("tcall489");
    try
    { 
      Object[] args1164 = {new RefArg_outputDate_1_customerCustomer_ta0Customer_ta8Customerpc0(arg0)};
      utils.LocalTemplateArguments args21163 = env.getExtraLocalTemplateArguments("outputDate");
      if(args21163 != null)
      { 
        args1164 = ArrayUtils.addAll(args1164, args21163.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputDate").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = new HashMap<String, String>();
      attrsmapout.put("class", "outputdateOfBirth");
      ((TemplateServlet)templatecalls.get(ident)).storeInputs("outputDate", args1164, newenv, attrsmapout, args21163);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputDate(arg.dateOfBirth)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
  }
}