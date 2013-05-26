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

@SuppressWarnings("all") public class root_body0$l$_Template extends TemplateServlet 
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
    return "root_body0$l$";
  }

  public String getTemplateClassName()
  { 
    return "root_body0$l$_Template";
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
    return "root_body0$l$()";
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

  protected void renderInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    String tmpstring16;
    try
    { 
      if(org.webdsl.tools.Utils.isNullAutoBox("Hello world!"))
      { 
        tmpstring16 = "";
      }
      else
      { 
        tmpstring16 = String.valueOf(ThreadLocalPage.get().isRawoutput() ? String.valueOf("Hello world!") : utils.HTMLFilter.filter(String.valueOf("Hello world!")));
      }
    }
    catch(NullPointerException npe)
    { 
      tmpstring16 = "";
    }
    catch(IndexOutOfBoundsException ine)
    { 
      tmpstring16 = "";
    }
    out.print(tmpstring16);
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