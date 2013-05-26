package webdsl.generated.templates;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.apache.commons.lang.ArrayUtils;
import utils.*;
import org.webdsl.lang.Environment;
import utils.TemplateCall;
import webdsl.generated.domain.*;

@SuppressWarnings("all") public class ManageCustomerPage extends PageServlet 
{ 
  public String getPageName()
  { 
    return "manageCustomer";
  }

  public String getHiddenParams()
  { 
    java.lang.StringBuffer hiddens = new java.lang.StringBuffer();
    hiddenParams(hiddens);
    return hiddens.toString();
  }

  public String getHiddenPostParams()
  { 
    java.lang.StringBuffer hiddens = new java.lang.StringBuffer();
    hiddenPostParams(hiddens);
    return hiddens.toString();
  }

  public String getHiddenPostParamsJson()
  { 
    java.lang.StringBuffer hiddens = new java.lang.StringBuffer();
    hiddenPostParamsJson(hiddens);
    return hiddens.toString();
  }

  manageCustomer_Template templateservlet = new manageCustomer_Template();

  protected void initVarsAndArgs()
  { 
    DispatchServlet.initGlobalVars(env, hibSession);
    initialize();
    envGlobalAndSession = env;
    conversion();
    loadArguments();
    Object[] args = {};
    this.args = args;
  }

  public void serve(HttpServletRequest request, HttpServletResponse response, Map<String, String> parammap, Map<String, List<String>> parammapvalues, Map<String, utils.File> fileUploads)
  { 
    ThreadLocalPage.set(this);
    this.request = request;
    this.response = response;
    this.parammap = parammap;
    this.parammapvalues = parammapvalues;
    this.fileUploads = fileUploads;
    if(parammap.get("__ajax_runtime_request__") != null)
    { 
      this.setAjaxRuntimeRequest(true);
    }
    RequestLogEntry rle = ((utils.DispatchServletHelper)ThreadLocalServlet.get()).getRequestLogEntry();
    org.apache.log4j.NDC.push(rle.getId().toString());
    utils.NDCAppender ndcAppender = null;
    if(request.getQueryString() != null && request.getQueryString().indexOf("logsql") != -1)
      ndcAppender = utils.NDCAppender.getNamed("hibernateLog");
    if(ndcAppender != null)
      ndcAppender.addNDC(rle.getId().toString());
    hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
    hibSession.beginTransaction();
    try
    { 
      java.io.StringWriter s = new java.io.StringWriter();
      java.io.PrintWriter out = new java.io.PrintWriter(s);
      ThreadLocalOut.push(out);
      ThreadLocalServlet.get().loadSessionManager(hibSession);
      ThreadLocalServlet.get().retrieveIncomingMessagesFromHttpSession();
      initVarsAndArgs();
      initRequestVars();
      if(isActionSubmit())
      { 
        if(parammap.get("__action__link__") != null)
        { 
          this.setActionLinkUsed(true);
        }
        templateservlet.storeInputs(null, args, new Environment(env), null, null);
        ThreadLocalPage.get().clearTemplateContext();
        utils.ActionClass submitAction = ThreadLocalPage.get().getActionToBeExecuted();
        boolean ignoreValidation = false;
        if(submitAction != null)
        { 
          ignoreValidation = submitAction.isValidationDisabled();
        }
        else
        { }
        if(!ignoreValidation)
        { 
          templateservlet.validateInputs(null, args, new Environment(env), null, null);
          ThreadLocalPage.get().clearTemplateContext();
        }
        if(validated)
        { 
          templateservlet.handleActions(null, args, new Environment(env), null, null);
          ThreadLocalPage.get().clearTemplateContext();
        }
      }
      if(isNotValid())
      { 
        clearHibernateCache();
        abortTransaction();
      }
      String outstream = s.toString();
      if(download != null)
      { 
        download();
      }
      else
      { 
        if(hasNotExecutedAction() || isNotValid())
        { 
          if(isAjaxRuntimeRequest() && outstream.length() > 0)
          { 
            response.getWriter().write("[" + outstream + "{}]");
          }
          else
            if(isValid() && isPostRequest())
            { 
              System.out.println("Error: server received POST request but was unable to dispatch to a proper action");
              response.getWriter().write("404 \n Error: server received POST request but was unable to dispatch to a proper action");
            }
            else
              if(isAjaxTemplateRequest() && isPostRequest())
              { 
                java.io.StringWriter s1 = new java.io.StringWriter();
                java.io.PrintWriter out1 = new java.io.PrintWriter(s1);
                render(request, response, out1, true);
                response.getWriter().write("[{action:\"replace\", id:{type:'enclosing-placeholder'}, value:\"" + org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(s1.toString()) + "\"}]");
              }
              else
                if(isActionLinkUsed() || isAjaxRuntimeRequest())
                { 
                  java.io.StringWriter s1 = new java.io.StringWriter();
                  java.io.PrintWriter out1 = new java.io.PrintWriter(s1);
                  render(request, response, out1, true);
                  response.getWriter().write("[{action:\"replaceall\", value:\"" + org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(s1.toString()) + "\"}]");
                }
                else
                { 
                  render(request, response, null, false);
                }
        }
        else
        { 
          if(isAjaxRuntimeRequest())
          { 
            response.getWriter().write("[" + outstream + "{}]");
          }
          else
            if(isActionLinkUsed())
            { 
              response.getWriter().write("[{action:\"relocate\", value:\"" + this.getRedirectUrl() + "\"}]");
            }
        }
      }
      ThreadLocalServlet.get().storeOutgoingMessagesInHttpSession();
      org.hibernate.stat.Statistics hibernateStatistics = HibernateUtilConfigured.getSessionFactory().getStatistics();
      rle.setQueryExecutionCountNoEventsOrValidation(new Long(hibernateStatistics.getQueryExecutionCount()).intValue());
      rle.setQueryExecutionMaxTimeNoEventsOrValidation(new Long(hibernateStatistics.getQueryExecutionMaxTime()).intValue());
      rle.setQueryExecutionMaxTimeQueryStringNoEventsOrValidation(hibernateStatistics.getQueryExecutionMaxTimeQueryString());
      if(isTransactionAborted() || ThreadLocalPage.get().isRollback())
      { 
        hibSession.getTransaction().rollback();
      }
      else
      { 
        storeSessionEntities();
        if(!this.isAjaxRuntimeRequest())
        { 
          ThreadLocalServlet.get().setEndTimeAndStoreRequestLog(hibSession);
        }
        hibSession.flush();
        hibSession.getTransaction().commit();
      }
      ThreadLocalOut.popChecked(out);
    }
    catch(Exception ex)
    { 
      String url = ThreadLocalServlet.get().getRequest().getRequestURL().toString();
      System.out.println("exception occured while handling request URL: " + url);
      System.out.println("exception message: " + ex.getMessage());
      ex.printStackTrace();
      hibSession.getTransaction().rollback();
      throw new RuntimeException("serve page request failed, requested URL: " + url);
    }
    finally
    { 
      PageServlet.cleanupThreadLocals();
      org.apache.log4j.NDC.remove();
      if(ndcAppender != null)
        ndcAppender.removeNDC(rle.getId().toString());
    }
  }

  public void initializeBasics(AbstractPageServlet ps, Object[] args, Environment env)
  { 
    this.envGlobalAndSession = ps.envGlobalAndSession;
    this.request = ps.getRequest();
    this.env = env;
    this.response = ps.getResponse();
    this.parammap = ps.getParammap();
    this.parammapvalues = ps.getParammapvalues();
    this.fileUploads = ps.getFileUploads();
    hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
    ThreadLocalServlet.get().loadSessionManager(hibSession);
    initialize();
  }

  public void render(HttpServletRequest request, HttpServletResponse response, java.io.PrintWriter sout, boolean onlyContent) throws ServletException, IOException
  { 
    this.request = request;
    this.response = response;
    java.io.StringWriter s = new java.io.StringWriter();
    java.io.PrintWriter out = new java.io.PrintWriter(s);
    ThreadLocalOut.push(out);
    templateservlet.render(null, args, new Environment(env), null, null);
    ThreadLocalOut.popChecked(out);
    response.setContentType(getMimetype());
    if(download != null)
    { 
      download();
    }
    else
    { 
      if(sout == null)
      { 
        sout = response.getWriter();
      }
      ThreadLocalOut.push(sout);
      addJavascriptInclude("jquery-1.5.min.js");
      addJavascriptInclude("ajax.js");
      if(!mimetypeChanged && !onlyContent)
      { 
        sout.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
        sout.println("<html>");
        sout.println("<head>");
        sout.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
        sout.println("<title>" + getPageTitle().replaceAll("<[^>]*>", "") + "</title>");
        sout.println("<link href=\"" + ThreadLocalServlet.getContextPath() + "/favicon.ico\" rel=\"shortcut icon\" type=\"image/x-icon\" />");
        sout.println("<link href=\"" + ThreadLocalServlet.getContextPath() + "/stylesheets/common_.css\" rel=\"stylesheet\" type=\"text/css\" />");
        if(this.useDojo)
        { 
          sout.println("<script type='text/javascript' src='" + ThreadLocalServlet.getContextPath() + "/javascript/dojo/dojo.js' djConfig=\"parseOnLoad: true\"></script>");
          sout.println("<link rel='stylesheet' href='" + ThreadLocalServlet.getContextPath() + "/stylesheets/dijit/themes/tundra/tundra.css' type='text/css' />");
        }
        sout.println("<script type=\"text/javascript\">var show_webdsl_debug=false;</script>");
        sout.println("<script type=\"text/javascript\">var contextpath=\"" + ThreadLocalServlet.getContextPath() + "\";</script>");
        for(String script : this.javascripts)
        { 
          if(script.startsWith("http://") || script.startsWith("https://"))
          { 
            sout.println("<script type=\"text/javascript\" src=\"" + script + "\"></script>");
          }
          else
          { 
            sout.println("<script type=\"text/javascript\" src=\"" + ThreadLocalServlet.getContextPath() + "/javascript/" + script + "\"></script>");
          }
        }
        for(String[] sheet : this.stylesheets)
        { 
          if(sheet[0].startsWith("http://") || sheet[0].startsWith("https://"))
          { 
            sout.print("<link rel=\"stylesheet\" href=\"" + sheet[0] + "\" type=\"text/css\" ");
          }
          else
          { 
            sout.print("<link rel=\"stylesheet\" href=\"" + ThreadLocalServlet.getContextPath() + "/stylesheets/" + sheet[0] + "\" type=\"text/css\" ");
          }
          if(sheet[1].equals(""))
          { 
            sout.println("/>");
          }
          else
          { 
            sout.println("media=\"" + sheet[1] + "\" />");
          }
        }
        for(Map.Entry<String, String> headEntry : customHeadNoDuplicates.entrySet())
        { 
          sout.println("<!-- " + headEntry.getKey() + " -->");
          sout.println(headEntry.getValue());
        }
        for(String headEntry : customHeads)
        { 
          sout.println(headEntry);
        }
        sout.println("</head>");
        sout.print("<body id=\"" + this.getPageName() + "\">");
        renderIncomingSuccessMessages();
        s.flush();
      }
      sout.write(s.toString());
      if(!mimetypeChanged && !onlyContent)
      { 
        if(this.parammap.get("logsql") != null)
        { 
          if(true)
          { 
            utils.HibernateLog.printHibernateLog(sout, hibSession);
          }
          else
          { 
            sout.print("<div>Access to SQL logs was denied.</div>");
          }
        }
        sout.print("</body>");
        sout.println("</html>");
      }
      ThreadLocalOut.popChecked(sout);
    }
  }

  public void serveAsAjaxResponse(AbstractPageServlet ps, Object[] args, Environment env, TemplateCall templateArg)
  { 
    initializeBasics(ps, args, env);
    ThreadLocalPage.set(this);
    this.isServingAsAjaxResponse = true;
    templateservlet.render(null, args, new Environment(env), null, null);
    ThreadLocalPage.set(ps);
  }

  public boolean IsTemplate()
  { 
    return false;
  }

  public String getUniqueName()
  { 
    return "manageCustomer";
  }

  private void storeSessionEntities()
  { }

  public void hiddenPostParamsJson(java.lang.StringBuffer combinedparams)
  { }

  public void hiddenPostParams(java.lang.StringBuffer combinedparams)
  { }

  public void hiddenParams(java.lang.StringBuffer combinedparams)
  { }

  protected void loadArguments()
  { }

  protected void conversion()
  { }

  protected void initialize()
  { }
}