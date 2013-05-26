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

@SuppressWarnings("all") public class applicationmenu_ta1_Template extends TemplateServlet 
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
    return "applicationmenu_ta1";
  }

  public String getTemplateClassName()
  { 
    return "applicationmenu_ta1_Template";
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
    return "applicationmenu_ta1()";
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

  protected void renderInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    java.io.StringWriter sw9 = new java.io.StringWriter();
    out = new java.io.PrintWriter(sw9);
    ThreadLocalOut.push(out);
    boolean succeeded9 = false;
    try
    { 
      out.print("<a href=\"");
      if(ThreadLocalEmailContext.inEmailContext())
      { 
        out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/manageCustomer"));
      }
      else
      { 
        out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/manageCustomer"));
      }
      out.print("\" " + "" + " class=\"navigate\">");
      String tmpstring21;
      try
      { 
        if(org.webdsl.tools.Utils.isNullAutoBox("Manage Customer"))
        { 
          tmpstring21 = "";
        }
        else
        { 
          tmpstring21 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("Manage Customer") : utils.HTMLFilter.filter(String.valueOf("Manage Customer")));
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
      out.print("</a>");
      succeeded9 = true;
    }
    catch(NullPointerException npe)
    { 
      utils.Warning.warn("null reference prevented rendering of template element");
    }
    catch(IndexOutOfBoundsException ine)
    { 
      utils.Warning.warn("index out of bounds prevented rendering of template element");
    }
    ThreadLocalOut.popChecked(out);
    out = ThreadLocalOut.peek();
    if(succeeded9)
    { 
      out.print(sw9.toString());
    }
  }

  private void callTemplates()
  { }

  protected void handleActionsInternal()
  { }

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

  protected void validateInputsInternal()
  { }

  protected void storeInputsInternal()
  { }
}