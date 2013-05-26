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
import org.webdsl.lang.Environment;
import webdsl.generated.domain.*;
import webdsl.generated.actions.*;

@SuppressWarnings("unused") public class sendQueuedEmail_Email_Template extends EmailServlet 
{ 
  private void storeArguments(Object[] args)
  { 
    q0 = (webdsl.generated.domain.QueuedEmail)args[0];
  }

  boolean validated = true;

  String uniqueid;

  Environment env;

  private java.util.Map<String, Object> templatecalls = new java.util.HashMap<String, Object>();

  PrintWriter out;

  private org.hibernate.Session hibSession;

  private HttpServletRequest request;

  private HttpServletResponse response;

  private boolean initialized = false;

  public Map<String, String> attrs = null;

  public java.util.Deque<String> templateContext = new java.util.ArrayDeque<String>();

  public String getTemplateContextString()
  { 
    return "email";
  }

  protected String getElementsContext()
  { 
    return "sendQueuedEmail";
  }

  HttpSession session;

  public void render(Object[] args, Environment env)
  { 
    if(!initialized)
    { 
      initialized = true;
      this.request = ThreadLocalPage.get().getRequest();
      this.response = ThreadLocalPage.get().getResponse();
      this.hibSession = ThreadLocalPage.get().getHibSession();
      this.env = env;
      storeArguments(args);
      this.uniqueid = Encoders.encodeTemplateId("sendQueuedEmail_Email_Template", getTemplateContextString());
      initialize();
      initActions();
      initialize2();
    }
    this.out = new java.io.PrintWriter(body);
    ThreadLocalOut.push(this.out);
    ThreadLocalEmailContext.set(this);
    renderInternal();
    ThreadLocalEmailContext.set(null);
    ThreadLocalOut.popChecked(this.out);
  }

  private webdsl.generated.domain.QueuedEmail q0 = null;

  public void setQ0(webdsl.generated.domain.QueuedEmail q0)
  { 
    this.q0 = q0;
  }

  public webdsl.generated.domain.QueuedEmail getQ0()
  { 
    return q0;
  }

  protected void renderInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    this.receivers = q0.getTo();
    this.sender = q0.getFrom();
    this.subject = q0.getSubject();
    this.cc = q0.getCc();
    this.bcc = q0.getBcc();
    this.replyTo = q0.getReplyTo();
    ThreadLocalPage.get().enableRawoutput();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall220";
    ThreadLocalPage.get().enterTemplateContext("tcall220");
    try
    { 
      Object[] args547 = {q0.getBody()};
      utils.LocalTemplateArguments args2546 = env.getExtraLocalTemplateArguments("outputString");
      if(args2546 != null)
      { 
        args547 = ArrayUtils.addAll(args547, args2546.extraArgs);
      }
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("outputString").newInstance());
      }
      org.webdsl.lang.Environment newenv = new Environment(env);
      Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
      ((TemplateServlet)templatecalls.get(ident)).render("outputString", args547, newenv, attrsmapout, args2546);
    }
    catch(Exception ex)
    { 
      System.out.println("Problem occurred in template call: " + "outputString(q.body)");
      utils.Warning.printSmallStackTrace(ex);
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContext();
    ThreadLocalTemplate.set(this);
    ThreadLocalPage.get().disableRawoutput();
  }

  private void initialize2()
  { }

  void initActions()
  { }

  protected void initialize()
  { }
}