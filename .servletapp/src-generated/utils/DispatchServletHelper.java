package utils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import utils.*;
import webdsl.generated.templates.*;
import org.webdsl.lang.Environment;
import org.webdsl.WebDSLEntity;
import webdsl.generated.domain.RequestLogEntry;
import webdsl.generated.domain.SessionManager;
import org.webdsl.lang.*;

@SuppressWarnings({"unused", "unchecked", "rawtypes"}) public class DispatchServletHelper extends AbstractDispatchServletHelper 
{ 
  public static HashMap<String, utils.PageDispatch> pages = new HashMap<String, utils.PageDispatch>();

  public HashMap<String, utils.PageDispatch> getPages()
  { 
    return pages;
  }

  Class pc;

  java.util.Map<String, utils.File> fileUploads;

  java.util.Map<String, String> parammap;

  java.util.Map<String, List<String>> parammapvalues;

  HttpServletRequest request;

  public HttpServletRequest getRequest()
  { 
    return request;
  }

  HttpServletResponse response;

  java.util.UUID sessionId = null;

  public java.util.UUID getSessionId()
  { 
    return sessionId;
  }

  webdsl.generated.domain.SessionManager sessionManager = null;

  public webdsl.generated.domain.SessionManager getSessionManager()
  { 
    return sessionManager;
  }

  public void loadSessionManager(org.hibernate.Session hses)
  { 
    try
    { 
      sessionManager = (SessionManager)hses.get(SessionManager.class, sessionId);
      if(sessionManager == null)
      { 
        throw new RuntimeException();
      }
    }
    catch(Exception ex)
    { 
      sessionManager = new SessionManager();
      sessionManager.setId(sessionId);
      sessionManager.setLastUseNoEventsOrValidation(new java.util.Date());
      hses.save(sessionManager);
    }
    webdsl.generated.functions.internalUpdateSessionManagerTimeout_.internalUpdateSessionManagerTimeout_();
  }

  public void storeOutgoingMessagesInHttpSession()
  { 
    if(sessionManager.getMessages().size() > 0)
    { 
      sessionManager.removeAllFromMessages();
    }
    if(outgoingSuccessMessages.size() > 0)
    { 
      for(String s : outgoingSuccessMessages)
      { 
        webdsl.generated.domain.SessionMessage m = new webdsl.generated.domain.SessionMessage();
        m.setTextNoEventsOrValidation(s);
        sessionManager.getMessages().add(m);
      }
    }
  }

  public void retrieveIncomingMessagesFromHttpSession()
  { 
    for(webdsl.generated.domain.SessionMessage m : sessionManager.getMessages())
    { 
      incomingSuccessMessages.add(m.getText());
    }
  }

  RequestLogEntry requestLogEntry;

  public RequestLogEntry getRequestLogEntry()
  { 
    return requestLogEntry;
  }

  public String contextPath;

  private String requested;

  public String getRequestedPage()
  { 
    return requested;
  }

  protected static int httpsPort = 443;

  public int getHttpsPort()
  { 
    return httpsPort;
  }

  protected static int httpPort = 80;

  public int getHttpPort()
  { 
    return httpPort;
  }

  static
  { 
    try
    { 
      java.util.Properties props = new java.util.Properties();
      props.load(DispatchServletHelper.class.getResourceAsStream("/tomcat.properties"));
      httpsPort = Integer.parseInt(props.getProperty("webdsl.tomcat.https.port"));
      httpPort = Integer.parseInt(props.getProperty("webdsl.tomcat.http.port"));
    }
    catch(Exception ex)
    { 
      System.out.println("Could not read tomcat.properties file, custom http(s) port settings are ignored in the currently deployed application.");
    }
  }

  DispatchServlet servlet;

  public DispatchServletHelper (DispatchServlet servlet, boolean isPost, String contextPath) 
  { 
    this.servlet = servlet;
    this.isPostRequest = isPost;
    this.contextPath = contextPath;
  }

  DispatchServlet getServlet()
  { 
    return servlet;
  }

  public String getContextPath()
  { 
    return contextPath;
  }

  static
  { 
    { 
      String[] s = {};
      Boolean[] b = {};
      pages.put("root", new utils.PageDispatch(RootPage.class, s, b, false));
    }
    { 
      String[] s = {};
      Boolean[] b = {};
      pages.put("pagenotfound", new utils.PageDispatch(PagenotfoundPage.class, s, b, false));
    }
    { 
      String[] s = {};
      Boolean[] b = {};
      pages.put("manageCustomer", new utils.PageDispatch(ManageCustomerPage.class, s, b, false));
    }
    { 
      String[] s = {"arg"};
      Boolean[] b = {true};
      pages.put("editCustomer", new utils.PageDispatch(EditCustomerPage.class, s, b, false));
    }
    { 
      String[] s = {"arg"};
      Boolean[] b = {true};
      pages.put("customer", new utils.PageDispatch(CustomerPage.class, s, b, false));
    }
    { 
      String[] s = {};
      Boolean[] b = {};
      pages.put("createCustomer", new utils.PageDispatch(CreateCustomerPage.class, s, b, false));
    }
    { 
      String[] s = {};
      Boolean[] b = {};
      pages.put("accessDenied", new utils.PageDispatch(AccessDeniedPage.class, s, b, false));
    }
    { 
      String[] s = {};
      Boolean[] b = {};
      pages.put("noMessages", new utils.PageDispatch(NoMessagesPage.class, s, b, true));
    }
    { 
      String[] s = {"list"};
      Boolean[] b = {false};
      pages.put("showMessagesList_String_", new utils.PageDispatch(ShowMessagesList_String_Page.class, s, b, true));
    }
  }

  private void addToValues(String key, String val, Map<String, List<String>> parammapvalues)
  { 
    List<String> current = parammapvalues.get(key);
    if(current == null)
    { 
      List<String> newlist = new LinkedList<String>();
      newlist.add(val);
      parammapvalues.put(key, newlist);
    }
    else
    { 
      current.add(val);
    }
  }

  public boolean unspecifiedArgumentsContainEntityTypes(String[] argnames, int count)
  { 
    Boolean[] argEntityTypes = pages.get(requested).getEntityArgs();
    for(int in = argnames.length - 1; in >= count; in--)
    { 
      if(argEntityTypes[in] == true)
      { 
        return true;
      }
    }
    return false;
  }

  public String paramDecode(HttpServletRequest request, String param) throws UnsupportedEncodingException
  { 
    if(request.getCharacterEncoding() != null && request.getCharacterEncoding().equals("UTF-8"))
    { 
      return param;
    }
    else
    { 
      return new String(param.getBytes("ISO-8859-1"), "UTF-8");
    }
  }

  public void storeRequestLogEntryinSeparateSession()
  { 
    org.hibernate.Session hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
    try
    { 
      hibSession.beginTransaction();
      storeRequestLogEntry(hibSession);
      hibSession.getTransaction().commit();
    }
    catch(Exception se)
    { 
      System.out.println("Exception occured while storing request log entry.");
      se.printStackTrace();
      hibSession.getTransaction().rollback();
    }
  }

  public void storeRequestLogEntry(org.hibernate.Session hibSession)
  { 
    hibSession.saveOrUpdate(requestLogEntry);
  }

  public void setEndTimeAndStoreRequestLog(org.hibernate.Session hibSession)
  { 
    requestLogEntry.setEndNoEventsOrValidation(new java.util.Date());
    storeRequestLogEntry(hibSession);
  }

  public void doServe(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  { 
    requestLogEntry = new RequestLogEntry();
    requestLogEntry.setStartNoEventsOrValidation(new java.util.Date());
    if(request.getCookies() != null)
    { 
      for(Cookie c : request.getCookies())
      { 
        if("WEBDSLSESSIONID".equals(c.getName()))
        { 
          try
          { 
            sessionId = utils.UUIDUserType.retrieveUUID(c.getValue());
          }
          catch(Exception ex)
          { 
            System.out.println("Could not create UUID from String, new session will be created");
          }
        }
      }
    }
    if(sessionId == null)
    { 
      sessionId = java.util.UUID.randomUUID();
      response.setHeader("SET-COOKIE", "WEBDSLSESSIONID=" + utils.UUIDUserType.persistUUIDString(sessionId) + "; HttpOnly; path=/");
    }
    this.request = request;
    this.response = response;
    response.setCharacterEncoding("UTF-8");
    ThreadLocalServlet.set(this);
    boolean showerrorpage = false;
    try
    { 
      String[] req = request.getRequestURL().toString().split("/");
      int count;
      boolean first = false;
      if(ThreadLocalServlet.getContextPath().length() > 1)
      { 
        for(count = 0; count < req.length; count++)
        { 
          if(req[count].equals("CentroDatos"))
          { 
            count++;
            break;
          }
        }
      }
      else
      { 
        count = 3;
      }
      String[] argnames;
      String[] args;
      if(count > req.length - 1)
      { 
        requested = "root";
        args = new String[0];
        argnames = new String[0];
      }
      else
      { 
        requested = req[count];
        args = java.util.Arrays.copyOfRange(req, count + 1, req.length);
        argnames = pages.get(requested).getArgs();
      }
      fileUploads = new HashMap<String, utils.File>();
      parammap = new HashMap<String, String>();
      parammapvalues = new HashMap<String, List<String>>();
      for(java.util.Enumeration en = request.getParameterNames(); en.hasMoreElements(); )
      { 
        String parameterName = (String)en.nextElement();
        parammap.put(parameterName, paramDecode(request, request.getParameter(parameterName)));
        for(String paramval : request.getParameterValues(parameterName))
        { 
          addToValues(parameterName, paramDecode(request, paramval), parammapvalues);
        }
      }
      int count2 = 0;
      for(count2 = 0; count2 < args.length; count2++)
      { 
        if(count2 >= argnames.length)
        { }
        else
        { 
          String decoded = utils.URLFilter.unfilter(args[count2]);
          parammap.put(argnames[count2], decoded);
          addToValues(argnames[count2], decoded, parammapvalues);
        }
      }
      if(count2 < argnames.length)
      { 
        if(!isPostRequest && parammap.get("action-call-with-get-request-type") == null)
        { 
          if(unspecifiedArgumentsContainEntityTypes(argnames, count2))
          { 
            throw new utils.TooFewArgumentsException();
          }
        }
      }
      boolean isMultipart = org.apache.commons.fileupload.servlet.ServletFileUpload.isMultipartContent(request);
      if(isMultipart)
      { 
        org.apache.commons.fileupload.FileItemFactory factory = new org.apache.commons.fileupload.disk.DiskFileItemFactory();
        org.apache.commons.fileupload.servlet.ServletFileUpload upload = new org.apache.commons.fileupload.servlet.ServletFileUpload(factory);
        try
        { 
          java.util.List<org.apache.commons.fileupload.FileItem> items = (java.util.List<org.apache.commons.fileupload.FileItem>)upload.parseRequest(request);
          java.util.Iterator<org.apache.commons.fileupload.FileItem> iter = items.iterator();
          while(iter.hasNext())
          { 
            org.apache.commons.fileupload.FileItem item = (org.apache.commons.fileupload.FileItem)iter.next();
            if(item.isFormField())
            { 
              String name = item.getFieldName();
              String value = item.getString();
              parammap.put(name, paramDecode(request, value));
              addToValues(name, paramDecode(request, value), parammapvalues);
            }
            else
            { 
              String fieldName = item.getFieldName();
              String fileName = item.getName();
              String contentType = item.getContentType();
              boolean isInMemory = item.isInMemory();
              long sizeInBytes = item.getSize();
              utils.File temp = new utils.File();
              temp.setFileName(fileName);
              temp.setContentType(contentType);
              temp.setSizeInBytes(sizeInBytes);
              temp.setContentStream(item.getInputStream());
              fileUploads.put(fieldName, temp);
            }
          }
        }
        catch(org.apache.commons.fileupload.FileUploadException ex)
        { 
          System.out.println("exception occured in file upload handling DispatchServlet");
          ex.printStackTrace();
        }
      }
      utils.PageDispatch pd = pages.get(requested);
      if(pd == null)
      { 
        requested = "pagenotfound";
        pd = pages.get(requested);
        pc = pd.getPageClass();
      }
      else
      { 
        pc = pd.getPageClass();
      }
      requestLogEntry.setRequestedURLNoEventsOrValidation(request.getRequestURL().toString());
      requestLogEntry.setNameNoEventsOrValidation(requested);
      requestLogEntry.setClientIPNoEventsOrValidation(request.getRemoteAddr());
      requestLogEntry.setClientPortNoEventsOrValidation(request.getRemotePort());
      if(this.isPostRequest)
      { 
        requestLogEntry.setMethodNoEventsOrValidation("POST");
      }
      else
      { 
        requestLogEntry.setMethodNoEventsOrValidation("GET");
      }
      requestLogEntry.setUserAgentNoEventsOrValidation(request.getHeader("User-Agent"));
      requestLogEntry.setRefererNoEventsOrValidation(request.getHeader("Referer"));
      showerrorpage = !handlePage();
    }
    catch(utils.TooFewArgumentsException ex)
    { 
      showerrorpage = true;
    }
    catch(utils.AjaxWithGetRequestException ex)
    { 
      showerrorpage = true;
    }
    catch(Exception ex)
    { 
      System.out.println("Exception in dispatch servlet: " + ex.getMessage());
      ex.printStackTrace();
      showerrorpage = true;
    }
    if(showerrorpage)
    { 
      pc = pages.get("pagenotfound").getPageClass();
      if(!handlePage())
      { 
        response.setStatus(404);
        response.getWriter().write("<h3>404 Not Found</h3>");
      }
    }
    cleanupThreadLocals();
  }

  private static void cleanupThreadLocals()
  { 
    ThreadLocalServlet.set(null);
  }

  private boolean handlePage()
  { 
    if(pc != null)
    { 
      try
      { 
        PageServlet pageservlet = (PageServlet)pc.newInstance();
        pageservlet.serve(request, response, parammap, parammapvalues, fileUploads);
        if(parammap.get("show_build_id") != null)
        { 
          try
          { 
            response.getWriter().write("build-id:" + "afa27057-3bba-4fb1-8b0e-62b2a3b720ab");
          }
          catch(IOException ioe)
          { 
            ioe.printStackTrace();
          }
        }
      }
      catch(IllegalAccessException iae)
      { 
        System.out.println("Problem in dispatch servlet page lookup: " + iae.getMessage());
        iae.printStackTrace();
        return false;
      }
      catch(InstantiationException ie)
      { 
        System.out.println("Problem in dispatch servlet page lookup: " + ie.getMessage());
        ie.printStackTrace();
        return false;
      }
      catch(RuntimeException re)
      { 
        return false;
      }
    }
    else
    { 
      return false;
    }
    return true;
  }

  static
  { 
    ReflectionEntity ent;
    ent = new ReflectionEntity("Customer", null, true);
    reflectionentities.add(ent);
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Customer, String>("name", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Customer, String>("surname", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Customer, String>("address", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Customer, String>("email", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Customer, java.util.Date>("dateOfBirth", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Customer, String>("bio", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Customer, utils.File>("photo", false, null)
                            { });
    ReflectionEntity.add(ent);
    ent = new ReflectionEntity("dummy_webdsl_entity", null, false);
    reflectionentities.add(ent);
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity, String>("text", false, null)
                            { });
    ReflectionEntity.add(ent);
    ent = new ReflectionEntity("QueuedEmail", null, false);
    reflectionentities.add(ent);
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail, String>("body", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail, String>("to", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail, String>("cc", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail, String>("bcc", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail, String>("replyTo", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail, String>("from", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail, String>("subject", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail, java.util.Date>("lastTry", false, null)
                            { });
    ReflectionEntity.add(ent);
    ent = new ReflectionEntity("RequestLogEntry", null, false);
    reflectionentities.add(ent);
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry, String>("name", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry, String>("requestedURL", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry, java.util.Date>("start", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry, java.util.Date>("end", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry, String>("clientIP", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry, Integer>("clientPort", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry, String>("method", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry, String>("referer", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry, String>("userAgent", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry, Integer>("queryExecutionCount", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry, Integer>("queryExecutionMaxTime", false, null)
                            { });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry, String>("queryExecutionMaxTimeQueryString", false, null)
                            { });
    ReflectionEntity.add(ent);
    ent = new ReflectionEntity("SessionManager", null, false);
    reflectionentities.add(ent);
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager, webdsl.generated.domain.SessionMessage>("messages", false, null)
                            { 
                              public List<webdsl.generated.domain.SessionMessage> getAllowed(webdsl.generated.domain.SessionManager arg)
                              { 
                                return arg.allowedMessages_();
                              }
                            });
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager, java.util.Date>("lastUse", false, null)
                            { });
    ReflectionEntity.add(ent);
    ent = new ReflectionEntity("SessionMessage", null, false);
    reflectionentities.add(ent);
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage, String>("text", false, null)
                            { });
    ReflectionEntity.add(ent);
    ent = new ReflectionEntity("ValidationException", null, false);
    reflectionentities.add(ent);
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException, String>("message", false, null)
                            { });
    ReflectionEntity.add(ent);
    ent = new ReflectionEntity("ValidationExceptionMultiple", null, false);
    reflectionentities.add(ent);
    ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple, webdsl.generated.domain.ValidationException>("exceptions", false, null)
                            { 
                              public List<webdsl.generated.domain.ValidationException> getAllowed(webdsl.generated.domain.ValidationExceptionMultiple arg)
                              { 
                                return arg.allowedExceptions_();
                              }
                            });
    ReflectionEntity.add(ent);
    System.out.println("number of entities: " + reflectionentities.size());
  }
}