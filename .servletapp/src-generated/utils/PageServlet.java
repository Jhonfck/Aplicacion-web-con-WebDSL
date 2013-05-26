package utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import webdsl.generated.templates.*;
import org.webdsl.WebDSLEntity;
import org.webdsl.lang.Environment;
import org.hibernate.Session;

public abstract @SuppressWarnings("unused") class PageServlet extends AbstractPageServlet 
{ 
  protected void renderIncomingSuccessMessages()
  { 
    if(!ThreadLocalServlet.get().getIncomingSuccessMessages().isEmpty())
    { 
      String ident = "";
      String forelementcounter = "0";
      int fallbackcounter = 0;
      boolean inForLoop = false;
      int forLoopCounter = 0;
      PrintWriter out = ThreadLocalOut.peek();
      Class<?> ts = env.getTemplate("messages");
      try
      { 
        ((TemplateServlet)ts.newInstance()).render(null, new Object[0], env, null, null);
      }
      catch(Exception ie)
      { 
        System.out.println(ie);
      }
    }
  }

  static
  { 
    try
    { 
      staticEnv.putTemplate("applicationmenu", applicationmenu_Template.class);
      staticEnv.putTemplate("applicationmenu_ta0", applicationmenu_ta0_Template.class);
      staticEnv.putTemplate("applicationmenu_ta1", applicationmenu_ta1_Template.class);
      staticEnv.putTemplate("body", $Override$body_Template.class);
      staticEnv.putTemplate("break", break_Template.class);
      staticEnv.putTemplate("column", column_Template.class);
      staticEnv.putTemplate("container", container_Template.class);
      staticEnv.putTemplate("createCustomer_body0$l$", createCustomer_body0$l$_Template.class);
      staticEnv.putTemplate("createCustomer_body0$l$_s_ad0String__Customer", createCustomer_body0$l$_s_ad0String__Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer", createCustomer_ta0Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta0Customer", createCustomer_ta0Customer_ta0Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta11Customer", createCustomer_ta0Customer_ta11Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta12Customer", createCustomer_ta0Customer_ta12Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta13Customer", createCustomer_ta0Customer_ta13Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta14Customer", createCustomer_ta0Customer_ta14Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta1Customer", createCustomer_ta0Customer_ta1Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta2Customer", createCustomer_ta0Customer_ta2Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta3Customer", createCustomer_ta0Customer_ta3Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta4Customer", createCustomer_ta0Customer_ta4Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta5Customer", createCustomer_ta0Customer_ta5Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta6Customer", createCustomer_ta0Customer_ta6Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta7Customer", createCustomer_ta0Customer_ta7Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta8Customer", createCustomer_ta0Customer_ta8Customer_Template.class);
      staticEnv.putTemplate("createCustomer_ta0Customer_ta9Customer", createCustomer_ta0Customer_ta9Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_body0$l$Customer", customerCustomer_body0$l$Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer", customerCustomer_ta0Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta0Customer", customerCustomer_ta0Customer_ta0Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta11Customer", customerCustomer_ta0Customer_ta11Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta12Customer", customerCustomer_ta0Customer_ta12Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta13Customer", customerCustomer_ta0Customer_ta13Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta14Customer", customerCustomer_ta0Customer_ta14Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta1Customer", customerCustomer_ta0Customer_ta1Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta2Customer", customerCustomer_ta0Customer_ta2Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta3Customer", customerCustomer_ta0Customer_ta3Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta4Customer", customerCustomer_ta0Customer_ta4Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta5Customer", customerCustomer_ta0Customer_ta5Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta6Customer", customerCustomer_ta0Customer_ta6Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta7Customer", customerCustomer_ta0Customer_ta7Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta8Customer", customerCustomer_ta0Customer_ta8Customer_Template.class);
      staticEnv.putTemplate("customerCustomer_ta0Customer_ta9Customer", customerCustomer_ta0Customer_ta9Customer_Template.class);
      staticEnv.putTemplate("dateinputgenericDate__String__String__String", dateinputgenericDate__String__String__String_Template.class);
      staticEnv.putTemplate("dateinputgenericDate__String__String__String_ta0List_String___String__String__String__String__String__Date", dateinputgenericDate__String__String__String_ta0List_String___String__String__String__String__String__Date_Template.class);
      staticEnv.putTemplate("dateoutputgenericDate__String", dateoutputgenericDate__String_Template.class);
      staticEnv.putTemplate("datepickerinputDate__String__String__String__String", datepickerinputDate__String__String__String__String_Template.class);
      staticEnv.putTemplate("div", div_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_body0$l$Customer", editCustomerCustomer_body0$l$Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_body0$l$Customer_s_ad0String__Customer", editCustomerCustomer_body0$l$Customer_s_ad0String__Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer", editCustomerCustomer_ta0Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta0Customer", editCustomerCustomer_ta0Customer_ta0Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta11Customer", editCustomerCustomer_ta0Customer_ta11Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta12Customer", editCustomerCustomer_ta0Customer_ta12Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta13Customer", editCustomerCustomer_ta0Customer_ta13Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta14Customer", editCustomerCustomer_ta0Customer_ta14Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta1Customer", editCustomerCustomer_ta0Customer_ta1Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta2Customer", editCustomerCustomer_ta0Customer_ta2Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta3Customer", editCustomerCustomer_ta0Customer_ta3Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta4Customer", editCustomerCustomer_ta0Customer_ta4Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta5Customer", editCustomerCustomer_ta0Customer_ta5Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta6Customer", editCustomerCustomer_ta0Customer_ta6Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta7Customer", editCustomerCustomer_ta0Customer_ta7Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta8Customer", editCustomerCustomer_ta0Customer_ta8Customer_Template.class);
      staticEnv.putTemplate("editCustomerCustomer_ta0Customer_ta9Customer", editCustomerCustomer_ta0Customer_ta9Customer_Template.class);
      staticEnv.putTemplate("elementsempty", elementsempty_Template.class);
      staticEnv.putTemplate("errorTemplateActionList_String_", errorTemplateActionList_String__Template.class);
      staticEnv.putTemplate("errorTemplateFormList_String_", errorTemplateFormList_String__Template.class);
      staticEnv.putTemplate("errorTemplateInputList_String_", $Override$errorTemplateInputList_String__Template.class);
      staticEnv.putTemplate("fieldsetString", fieldsetString_Template.class);
      staticEnv.putTemplate("group", group_Template.class);
      staticEnv.putTemplate("groupitem", groupitem_Template.class);
      staticEnv.putTemplate("groupString", groupString_Template.class);
      staticEnv.putTemplate("inputajaxBool", inputajaxBool_Template.class);
      staticEnv.putTemplate("inputajaxEmail", inputajaxEmail_Template.class);
      staticEnv.putTemplate("inputajaxEntity", inputajaxEntity_Template.class);
      staticEnv.putTemplate("inputajaxEntity_ta0Entity", inputajaxEntity_ta0Entity_Template.class);
      staticEnv.putTemplate("inputajaxEntity__List_Entity_", inputajaxEntity__List_Entity__Template.class);
      staticEnv.putTemplate("inputajaxEntity__List_Entity__ta0List_Entity___Entity", inputajaxEntity__List_Entity__ta0List_Entity___Entity_Template.class);
      staticEnv.putTemplate("inputajaxFloat", inputajaxFloat_Template.class);
      staticEnv.putTemplate("inputajaxInt", inputajaxInt_Template.class);
      staticEnv.putTemplate("inputajaxList_Entity_", inputajaxList_Entity__Template.class);
      staticEnv.putTemplate("inputajaxList_Entity__ta0List_Entity_", inputajaxList_Entity__ta0List_Entity__Template.class);
      staticEnv.putTemplate("inputajaxList_Entity___List_Entity_", inputajaxList_Entity___List_Entity__Template.class);
      staticEnv.putTemplate("inputajaxLong", inputajaxLong_Template.class);
      staticEnv.putTemplate("inputajaxSecret", inputajaxSecret_Template.class);
      staticEnv.putTemplate("inputajaxSecret_ta0Secret", inputajaxSecret_ta0Secret_Template.class);
      staticEnv.putTemplate("inputajaxSet_Entity_", inputajaxSet_Entity__Template.class);
      staticEnv.putTemplate("inputajaxSet_Entity__ta0Set_Entity_", inputajaxSet_Entity__ta0Set_Entity__Template.class);
      staticEnv.putTemplate("inputajaxSet_Entity___List_Entity_", inputajaxSet_Entity___List_Entity__Template.class);
      staticEnv.putTemplate("inputajaxSet_Entity___List_Entity__ta0List_Entity___Set_Entity_", inputajaxSet_Entity___List_Entity__ta0List_Entity___Set_Entity__Template.class);
      staticEnv.putTemplate("inputajaxString", inputajaxString_Template.class);
      staticEnv.putTemplate("inputajaxText", inputajaxText_Template.class);
      staticEnv.putTemplate("inputajaxText_ta0Text", inputajaxText_ta0Text_Template.class);
      staticEnv.putTemplate("inputajaxURL", inputajaxURL_Template.class);
      staticEnv.putTemplate("inputajaxURL_ta0URL", inputajaxURL_ta0URL_Template.class);
      staticEnv.putTemplate("inputajaxWikiText", inputajaxWikiText_Template.class);
      staticEnv.putTemplate("inputajaxWikiText_ta0WikiText", inputajaxWikiText_ta0WikiText_Template.class);
      staticEnv.putTemplate("inputBool", inputBool_Template.class);
      staticEnv.putTemplate("inputBoolInternalBool__String", inputBoolInternalBool__String_Template.class);
      staticEnv.putTemplate("inputBool_ta0List_String___String__Bool", inputBool_ta0List_String___String__Bool_Template.class);
      staticEnv.putTemplate("inputCheckboxSetInternalHelperSet_Entity___Set_Entity___Entity__String", inputCheckboxSetInternalHelperSet_Entity___Set_Entity___Entity__String_Template.class);
      staticEnv.putTemplate("inputCheckboxSetInternalSet_Entity___List_Entity___String", inputCheckboxSetInternalSet_Entity___List_Entity___String_Template.class);
      staticEnv.putTemplate("inputDate", inputDate_Template.class);
      staticEnv.putTemplate("inputDateTime", inputDateTime_Template.class);
      staticEnv.putTemplate("inputDateTime_ta0String__String__String__DateTime", inputDateTime_ta0String__String__String__DateTime_Template.class);
      staticEnv.putTemplate("inputDate_ta0String__String__Date", inputDate_ta0String__String__Date_Template.class);
      staticEnv.putTemplate("inputEmail", inputEmail_Template.class);
      staticEnv.putTemplate("inputEmailInternalEmail__String", inputEmailInternalEmail__String_Template.class);
      staticEnv.putTemplate("inputEmail_ta0List_String___String__String__Email", inputEmail_ta0List_String___String__String__Email_Template.class);
      staticEnv.putTemplate("inputEntity", inputEntity_Template.class);
      staticEnv.putTemplate("inputEntityInternalEntity__List_Entity___String", inputEntityInternalEntity__List_Entity___String_Template.class);
      staticEnv.putTemplate("inputEntity_ta0Entity", inputEntity_ta0Entity_Template.class);
      staticEnv.putTemplate("inputEntity__List_Entity_", inputEntity__List_Entity__Template.class);
      staticEnv.putTemplate("inputEntity__List_Entity__ta0List_Entity___Entity", inputEntity__List_Entity__ta0List_Entity___Entity_Template.class);
      staticEnv.putTemplate("inputFile", inputFile_Template.class);
      staticEnv.putTemplate("inputFileInternalFile__String", inputFileInternalFile__String_Template.class);
      staticEnv.putTemplate("inputFile_ta0List_String___String__String__File", inputFile_ta0List_String___String__String__File_Template.class);
      staticEnv.putTemplate("inputFloat", inputFloat_Template.class);
      staticEnv.putTemplate("inputFloatInternalFloat__String", inputFloatInternalFloat__String_Template.class);
      staticEnv.putTemplate("inputFloat_ta0List_String___String__String__Float", inputFloat_ta0List_String___String__String__Float_Template.class);
      staticEnv.putTemplate("inputImage", inputImage_Template.class);
      staticEnv.putTemplate("inputInt", inputInt_Template.class);
      staticEnv.putTemplate("inputIntInternalInt__String", inputIntInternalInt__String_Template.class);
      staticEnv.putTemplate("inputInt_ta0List_String___String__String__Int", inputInt_ta0List_String___String__String__Int_Template.class);
      staticEnv.putTemplate("inputListInternalList_Entity___List_Entity___String", inputListInternalList_Entity___List_Entity___String_Template.class);
      staticEnv.putTemplate("inputList_Entity_", inputList_Entity__Template.class);
      staticEnv.putTemplate("inputList_Entity__ta0List_Entity_", inputList_Entity__ta0List_Entity__Template.class);
      staticEnv.putTemplate("inputList_Entity___List_Entity_", inputList_Entity___List_Entity__Template.class);
      staticEnv.putTemplate("inputList_Entity___List_Entity__ta0List_String___String__List_Entity___List_Entity_", inputList_Entity___List_Entity__ta0List_String___String__List_Entity___List_Entity__Template.class);
      staticEnv.putTemplate("inputLong", inputLong_Template.class);
      staticEnv.putTemplate("inputLongInternalLong__String", inputLongInternalLong__String_Template.class);
      staticEnv.putTemplate("inputLong_ta0List_String___String__String__Long", inputLong_ta0List_String___String__String__Long_Template.class);
      staticEnv.putTemplate("inputSDFajaxText__String", inputSDFajaxText__String_Template.class);
      staticEnv.putTemplate("inputSDFText__String", inputSDFText__String_Template.class);
      staticEnv.putTemplate("inputSDFText__String_ta0List_String___String__String__String__Text", inputSDFText__String_ta0List_String___String__String__String__Text_Template.class);
      staticEnv.putTemplate("inputSecret", inputSecret_Template.class);
      staticEnv.putTemplate("inputSecretInternalSecret__String", inputSecretInternalSecret__String_Template.class);
      staticEnv.putTemplate("inputSecret_ta0List_String___String__String__Secret", inputSecret_ta0List_String___String__String__Secret_Template.class);
      staticEnv.putTemplate("inputSelectMultipleInternalSet_Entity___List_Entity___String", inputSelectMultipleInternalSet_Entity___List_Entity___String_Template.class);
      staticEnv.putTemplate("inputSet_Entity_", inputSet_Entity__Template.class);
      staticEnv.putTemplate("inputSet_Entity__ta0Set_Entity_", inputSet_Entity__ta0Set_Entity__Template.class);
      staticEnv.putTemplate("inputSet_Entity___List_Entity_", inputSet_Entity___List_Entity__Template.class);
      staticEnv.putTemplate("inputSet_Entity___List_Entity__ta0List_Entity___Set_Entity_", inputSet_Entity___List_Entity__ta0List_Entity___Set_Entity__Template.class);
      staticEnv.putTemplate("inputString", inputString_Template.class);
      staticEnv.putTemplate("inputStringInternalString__String", inputStringInternalString__String_Template.class);
      staticEnv.putTemplate("inputString_ta0List_String___String__String__String", inputString_ta0List_String___String__String__String_Template.class);
      staticEnv.putTemplate("inputText", inputText_Template.class);
      staticEnv.putTemplate("inputTextInternalText__String", inputTextInternalText__String_Template.class);
      staticEnv.putTemplate("inputText_ta0List_String___String__String__Text", inputText_ta0List_String___String__String__Text_Template.class);
      staticEnv.putTemplate("inputTime", inputTime_Template.class);
      staticEnv.putTemplate("inputTime_ta0String__String__Time", inputTime_ta0String__String__Time_Template.class);
      staticEnv.putTemplate("inputURL", inputURL_Template.class);
      staticEnv.putTemplate("inputURLInternalURL__String", inputURLInternalURL__String_Template.class);
      staticEnv.putTemplate("inputURL_ta0List_String___String__String__URL", inputURL_ta0List_String___String__String__URL_Template.class);
      staticEnv.putTemplate("inputWikiText", inputWikiText_Template.class);
      staticEnv.putTemplate("inputWikiTextInternalWikiText__String", inputWikiTextInternalWikiText__String_Template.class);
      staticEnv.putTemplate("inputWikiText_ta0List_String___String__String__WikiText", inputWikiText_ta0List_String___String__String__WikiText_Template.class);
      staticEnv.putTemplate("labelcolumnsString", labelcolumnsString_Template.class);
      staticEnv.putTemplate("labelcolumnsString_labelInternal0$l$String__String__TemplateContext__String", labelcolumnsString_labelInternal0$l$String__String__TemplateContext__String_Template.class);
      staticEnv.putTemplate("labelcolumnsString_ta0String", labelcolumnsString_ta0String_Template.class);
      staticEnv.putTemplate("labelInternalString__String__TemplateContext", labelInternalString__String__TemplateContext_Template.class);
      staticEnv.putTemplate("labelString", labelString_Template.class);
      staticEnv.putTemplate("labelString_ta0TemplateContext__List_String___String__String", labelString_ta0TemplateContext__List_String___String__String_Template.class);
      staticEnv.putTemplate("labelString_ta1TemplateContext__List_String___String__String", labelString_ta1TemplateContext__List_String___String__String_Template.class);
      staticEnv.putTemplate("labelString_ta2TemplateContext__List_String___String__String", labelString_ta2TemplateContext__List_String___String__String_Template.class);
      staticEnv.putTemplate("main", $Override$main_Template.class);
      staticEnv.putTemplate("mainheader", mainheader_Template.class);
      staticEnv.putTemplate("manageCustomer_body0$l$", manageCustomer_body0$l$_Template.class);
      staticEnv.putTemplate("manageCustomer_body0$l$_s_ad0String__Customer", manageCustomer_body0$l$_s_ad0String__Customer_Template.class);
      staticEnv.putTemplate("menu", menu_Template.class);
      staticEnv.putTemplate("menubar", menubar_Template.class);
      staticEnv.putTemplate("menuheader", menuheader_Template.class);
      staticEnv.putTemplate("menuitem", menuitem_Template.class);
      staticEnv.putTemplate("menuitems", menuitems_Template.class);
      staticEnv.putTemplate("menuspacer", menuspacer_Template.class);
      staticEnv.putTemplate("messages", messages_Template.class);
      staticEnv.putTemplate("navbaritem", navbaritem_Template.class);
      staticEnv.putTemplate("noMessages", noMessages_Template.class);
      staticEnv.putTemplate("outputATerm", outputATerm_Template.class);
      staticEnv.putTemplate("outputBool", outputBool_Template.class);
      staticEnv.putTemplate("outputDate", outputDate_Template.class);
      staticEnv.putTemplate("outputDateTime", outputDateTime_Template.class);
      staticEnv.putTemplate("outputEmail", outputEmail_Template.class);
      staticEnv.putTemplate("outputFloat", outputFloat_Template.class);
      staticEnv.putTemplate("outputInt", outputInt_Template.class);
      staticEnv.putTemplate("outputLong", outputLong_Template.class);
      staticEnv.putTemplate("outputSecret", outputSecret_Template.class);
      staticEnv.putTemplate("outputString", outputString_Template.class);
      staticEnv.putTemplate("outputText", outputText_Template.class);
      staticEnv.putTemplate("outputTime", outputTime_Template.class);
      staticEnv.putTemplate("outputURL", outputURL_Template.class);
      staticEnv.putTemplate("outputWikiText", outputWikiText_Template.class);
      staticEnv.putTemplate("par", par_Template.class);
      staticEnv.putTemplate("pre", pre_Template.class);
      staticEnv.putTemplate("radioajaxEntity", radioajaxEntity_Template.class);
      staticEnv.putTemplate("radioajaxEntity_ta0Entity", radioajaxEntity_ta0Entity_Template.class);
      staticEnv.putTemplate("radioajaxEntity__List_Entity_", radioajaxEntity__List_Entity__Template.class);
      staticEnv.putTemplate("radioEntity", radioEntity_Template.class);
      staticEnv.putTemplate("radioEntity_ta0Entity", radioEntity_ta0Entity_Template.class);
      staticEnv.putTemplate("radioEntity__List_Entity_", radioEntity__List_Entity__Template.class);
      staticEnv.putTemplate("radioEntity__List_Entity__ta0List_String___String__String__List_Entity___Entity", radioEntity__List_Entity__ta0List_String___String__String__List_Entity___Entity_Template.class);
      staticEnv.putTemplate("radioInternalEntity__List_Entity___String", radioInternalEntity__List_Entity___String_Template.class);
      staticEnv.putTemplate("root_body0$l$", root_body0$l$_Template.class);
      staticEnv.putTemplate("row", row_Template.class);
      staticEnv.putTemplate("selectajaxEntity", selectajaxEntity_Template.class);
      staticEnv.putTemplate("selectajaxEntity_ta0Entity", selectajaxEntity_ta0Entity_Template.class);
      staticEnv.putTemplate("selectajaxEntity__List_Entity_", selectajaxEntity__List_Entity__Template.class);
      staticEnv.putTemplate("selectajaxSet_Entity_", selectajaxSet_Entity__Template.class);
      staticEnv.putTemplate("selectajaxSet_Entity__ta0Set_Entity_", selectajaxSet_Entity__ta0Set_Entity__Template.class);
      staticEnv.putTemplate("selectajaxSet_Entity___List_Entity_", selectajaxSet_Entity___List_Entity__Template.class);
      staticEnv.putTemplate("selectcheckboxajaxSet_Entity_", selectcheckboxajaxSet_Entity__Template.class);
      staticEnv.putTemplate("selectcheckboxajaxSet_Entity__ta0Set_Entity_", selectcheckboxajaxSet_Entity__ta0Set_Entity__Template.class);
      staticEnv.putTemplate("selectcheckboxajaxSet_Entity___List_Entity_", selectcheckboxajaxSet_Entity___List_Entity__Template.class);
      staticEnv.putTemplate("selectcheckboxSet_Entity_", selectcheckboxSet_Entity__Template.class);
      staticEnv.putTemplate("selectcheckboxSet_Entity__ta0Set_Entity_", selectcheckboxSet_Entity__ta0Set_Entity__Template.class);
      staticEnv.putTemplate("selectcheckboxSet_Entity___List_Entity_", selectcheckboxSet_Entity___List_Entity__Template.class);
      staticEnv.putTemplate("selectcheckboxSet_Entity___List_Entity__ta0List_String___String__List_Entity___Set_Entity_", selectcheckboxSet_Entity___List_Entity__ta0List_String___String__List_Entity___Set_Entity__Template.class);
      staticEnv.putTemplate("selectEntity", selectEntity_Template.class);
      staticEnv.putTemplate("selectEntity_ta0Entity", selectEntity_ta0Entity_Template.class);
      staticEnv.putTemplate("selectEntity__List_Entity_", selectEntity__List_Entity__Template.class);
      staticEnv.putTemplate("selectEntity__List_Entity__ta0List_String___String__List_Entity___Entity", selectEntity__List_Entity__ta0List_String___String__List_Entity___Entity_Template.class);
      staticEnv.putTemplate("selectSet_Entity_", selectSet_Entity__Template.class);
      staticEnv.putTemplate("selectSet_Entity__ta0Set_Entity_", selectSet_Entity__ta0Set_Entity__Template.class);
      staticEnv.putTemplate("selectSet_Entity___List_Entity_", selectSet_Entity___List_Entity__Template.class);
      staticEnv.putTemplate("selectSet_Entity___List_Entity__ta0List_String___String__List_Entity___Set_Entity_", selectSet_Entity___List_Entity__ta0List_String___String__List_Entity___Set_Entity__Template.class);
      staticEnv.putTemplate("showMessagesList_String_", showMessagesList_String__Template.class);
      staticEnv.putTemplate("showSearchStats", showSearchStats_Template.class);
      staticEnv.putTemplate("showSearchStats_ta0Long", showSearchStats_ta0Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta11Long", showSearchStats_ta11Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta12Long", showSearchStats_ta12Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta13Long", showSearchStats_ta13Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta14Long", showSearchStats_ta14Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta15Long", showSearchStats_ta15Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta16Long", showSearchStats_ta16Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta17Long", showSearchStats_ta17Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta18Long", showSearchStats_ta18Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta19Long", showSearchStats_ta19Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta1Long", showSearchStats_ta1Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta21Long", showSearchStats_ta21Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta22Long", showSearchStats_ta22Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta23Long", showSearchStats_ta23Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta24Long", showSearchStats_ta24Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta25Long", showSearchStats_ta25Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta26Long", showSearchStats_ta26Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta27Long", showSearchStats_ta27Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta28Long", showSearchStats_ta28Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta29Long", showSearchStats_ta29Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta2Long", showSearchStats_ta2Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta31Long", showSearchStats_ta31Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta32Long", showSearchStats_ta32Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta33Long", showSearchStats_ta33Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta34Long", showSearchStats_ta34Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta35Long", showSearchStats_ta35Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta36Long", showSearchStats_ta36Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta37Long", showSearchStats_ta37Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta38Long", showSearchStats_ta38Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta39Long", showSearchStats_ta39Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta3Long", showSearchStats_ta3Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta41Long", showSearchStats_ta41Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta42Long", showSearchStats_ta42Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta43Long", showSearchStats_ta43Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta44Long", showSearchStats_ta44Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta45Long", showSearchStats_ta45Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta46Long", showSearchStats_ta46Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta47Long", showSearchStats_ta47Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta48Long", showSearchStats_ta48Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta4Long", showSearchStats_ta4Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta5Long", showSearchStats_ta5Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta6Long", showSearchStats_ta6Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta7Long", showSearchStats_ta7Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta8Long", showSearchStats_ta8Long_Template.class);
      staticEnv.putTemplate("showSearchStats_ta9Long", showSearchStats_ta9Long_Template.class);
      staticEnv.putTemplate("spacer", spacer_Template.class);
      staticEnv.putTemplate("table", table_Template.class);
      staticEnv.putTemplate("templateSuccessList_String_", templateSuccessList_String__Template.class);
      staticEnv.putTemplate("validateBool__String", validateBool__String_Template.class);
      staticEnv.putTemplate("wrapsubmitString", wrapsubmitString_Template.class);
      staticEnv.putTemplate("wrapsubmitString_ta0String", wrapsubmitString_ta0String_Template.class);
      staticEnv.putTemplate("accessDenied", accessDenied_Template.class);
      staticEnv.putTemplate("createCustomer", createCustomer_Template.class);
      staticEnv.putTemplate("customer", customer_Template.class);
      staticEnv.putTemplate("editCustomer", editCustomer_Template.class);
      staticEnv.putTemplate("manageCustomer", manageCustomer_Template.class);
      staticEnv.putTemplate("pagenotfound", pagenotfound_Template.class);
      staticEnv.putTemplate("root", root_Template.class);
    }
    catch(Exception se)
    { 
      System.out.println("Exception occured while instantiating base page class template and page definitions.");
      se.printStackTrace();
    }
  }

  static
  { 
    try
    { 
      emails.put("sendQueuedEmail", sendQueuedEmail_Email_Template.class);
    }
    catch(Exception se)
    { 
      System.out.println("Exception occured while instantiating base page class email definitions.");
      se.printStackTrace();
    }
  }

  static
  { 
    try
    { 
      refargclasses.put("RefArg_inputDate_1_createCustomer_ta0Customer_ta8Customerpc0", RefArg_inputDate_1_createCustomer_ta0Customer_ta8Customerpc0.class);
      refargclasses.put("RefArg_inputDate_1_editCustomerCustomer_ta0Customer_ta8Customerpc0", RefArg_inputDate_1_editCustomerCustomer_ta0Customer_ta8Customerpc0.class);
      refargclasses.put("RefArg_inputEmail_1_createCustomer_ta0Customer_ta6Customerpc0", RefArg_inputEmail_1_createCustomer_ta0Customer_ta6Customerpc0.class);
      refargclasses.put("RefArg_inputEmail_1_editCustomerCustomer_ta0Customer_ta6Customerpc0", RefArg_inputEmail_1_editCustomerCustomer_ta0Customer_ta6Customerpc0.class);
      refargclasses.put("RefArg_inputImage_1_createCustomer_ta0Customer_ta13Customerpc0", RefArg_inputImage_1_createCustomer_ta0Customer_ta13Customerpc0.class);
      refargclasses.put("RefArg_inputImage_1_editCustomerCustomer_ta0Customer_ta13Customerpc0", RefArg_inputImage_1_editCustomerCustomer_ta0Customer_ta13Customerpc0.class);
      refargclasses.put("RefArg_inputString_1_createCustomer_ta0Customer_ta0Customerpc0", RefArg_inputString_1_createCustomer_ta0Customer_ta0Customerpc0.class);
      refargclasses.put("RefArg_inputString_1_createCustomer_ta0Customer_ta2Customerpc0", RefArg_inputString_1_createCustomer_ta0Customer_ta2Customerpc0.class);
      refargclasses.put("RefArg_inputString_1_createCustomer_ta0Customer_ta4Customerpc0", RefArg_inputString_1_createCustomer_ta0Customer_ta4Customerpc0.class);
      refargclasses.put("RefArg_inputString_1_editCustomerCustomer_ta0Customer_ta0Customerpc0", RefArg_inputString_1_editCustomerCustomer_ta0Customer_ta0Customerpc0.class);
      refargclasses.put("RefArg_inputString_1_editCustomerCustomer_ta0Customer_ta2Customerpc0", RefArg_inputString_1_editCustomerCustomer_ta0Customer_ta2Customerpc0.class);
      refargclasses.put("RefArg_inputString_1_editCustomerCustomer_ta0Customer_ta4Customerpc0", RefArg_inputString_1_editCustomerCustomer_ta0Customer_ta4Customerpc0.class);
      refargclasses.put("RefArg_inputWikiText_1_createCustomer_ta0Customer_ta11Customerpc0", RefArg_inputWikiText_1_createCustomer_ta0Customer_ta11Customerpc0.class);
      refargclasses.put("RefArg_inputWikiText_1_editCustomerCustomer_ta0Customer_ta11Customerpc0", RefArg_inputWikiText_1_editCustomerCustomer_ta0Customer_ta11Customerpc0.class);
      refargclasses.put("RefArg_outputDate_1_customerCustomer_ta0Customer_ta8Customerpc0", RefArg_outputDate_1_customerCustomer_ta0Customer_ta8Customerpc0.class);
    }
    catch(Exception se)
    { 
      System.out.println("Exception occured while instantiating page reference argument class definitions.");
      se.printStackTrace();
    }
  }

  protected boolean isActionSubmit()
  { 
    return ThreadLocalServlet.get().isPostRequest || parammap.get("action-call-with-get-request-type") != null;
  }

  protected org.hibernate.Session openNewTransactionThroughGetCurrentSession()
  { 
    hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
    hibSession.beginTransaction();
    return hibSession;
  }

  public String getAbsoluteLocation()
  { 
    if(ThreadLocalServlet.getContextPath().equals(""))
    { 
      String[] req = request.getRequestURL().toString().split("/");
      StringBuffer sb = new StringBuffer();
      sb.append(req[0]);
      sb.append("/");
      sb.append(req[1]);
      sb.append("/");
      sb.append(req[2]);
      return sb.toString();
    }
    else
    { 
      String[] req = request.getRequestURL().toString().split(ThreadLocalServlet.getContextPath() + "/");
      return req[0];
    }
  }

  public webdsl.generated.domain.QueuedEmail renderEmailAndCreateQueuedEmail(String name, Object[] emailargs, Environment emailenv)
  { 
    EmailServlet s = this.renderEmail(name, emailargs, emailenv);
    webdsl.generated.domain.QueuedEmail queuedemail = new webdsl.generated.domain.QueuedEmail();
    queuedemail.setBodyNoEventsOrValidation(s.body.toString());
    queuedemail.setBccNoEventsOrValidation(s.bcc);
    queuedemail.setCcNoEventsOrValidation(s.cc);
    queuedemail.setFromNoEventsOrValidation(s.sender);
    queuedemail.setReplyToNoEventsOrValidation(s.replyTo);
    queuedemail.setSubjectNoEventsOrValidation(s.subject);
    queuedemail.setToNoEventsOrValidation(s.receivers);
    return queuedemail;
  }

  public void initRequestVars(PrintWriter out)
  { }
}