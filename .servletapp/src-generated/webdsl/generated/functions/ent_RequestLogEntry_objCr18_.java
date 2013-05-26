package webdsl.generated.functions;

import java.io.*;
import java.util.HashMap;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import utils.*;
import webdsl.generated.templates.*;
import webdsl.generated.domain.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

@SuppressWarnings("all") public class ent_RequestLogEntry_objCr18_  implements org.webdsl.lang.IFunction
{ 
  public static webdsl.generated.domain.ValidationException ent_RequestLogEntry_objCr18_()
  { 
    webdsl.generated.domain.ValidationException obj0 = webdsl.generated.domain.ValidationException._static_createEmpty_();
    obj0.ValidationException_();
    obj0.setMessage("Value exceeds maximum length (" + 255 + ")");
    return obj0;
  }

  public Object apply(Object[] args)
  { 
    return ent_RequestLogEntry_objCr18_.ent_RequestLogEntry_objCr18_();
  }
}