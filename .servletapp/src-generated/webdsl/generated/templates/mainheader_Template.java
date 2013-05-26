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

@SuppressWarnings("all") public class mainheader_Template extends TemplateServlet 
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
    return "mainheader";
  }

  public String getTemplateClassName()
  { 
    return "mainheader_Template";
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
    return "mainheader()";
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
      return "mainheader";
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
    java.io.StringWriter sw11 = new java.io.StringWriter();
    out = new java.io.PrintWriter(sw11);
    ThreadLocalOut.push(out);
    boolean succeeded11 = false;
    try
    { 
      out.print("<a href=\"");
      if(ThreadLocalEmailContext.inEmailContext())
      { 
        out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/"));
      }
      else
      { 
        out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/"));
      }
      out.print("\" " + "" + " class=\"navigate\">");
      out.print("<img src=\"" + ThreadLocalServlet.getContextPath());
      String tmpstring29;
      try
      { 
        if(org.webdsl.tools.Utils.isNullAutoBox("/images/logosmall.png"))
        { 
          tmpstring29 = "";
        }
        else
        { 
          tmpstring29 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("/images/logosmall.png") : utils.HTMLFilter.filter(String.valueOf("/images/logosmall.png")));
        }
      }
      catch(NullPointerException npe)
      { 
        tmpstring29 = "";
      }
      catch(IndexOutOfBoundsException ine)
      { 
        tmpstring29 = "";
      }
      out.print(tmpstring29);
      out.print("\" " + "" + " />");
      out.print("</a>");
      succeeded11 = true;
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
    if(succeeded11)
    { 
      out.print(sw11.toString());
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