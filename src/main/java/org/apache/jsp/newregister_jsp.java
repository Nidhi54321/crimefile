package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\r\n");
      out.write("\t\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("\r\n");
      out.write("\t<title>CrimeFile Management</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" charset=\"utf-8\" />\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("function doCheck()\r\n");
      out.write("{\r\n");
      out.write("  var u=document.getElementById(\"username\");\r\n");
      out.write("  var p=document.getElementById(\"password\");\r\n");
      out.write("  var c=document.getElementById(\"conpass\");\r\n");
      out.write("  var n=document.getElementById(\"name\");\r\n");
      out.write("  var a=document.getElementById(\"address\");\r\n");
      out.write("  var pi=document.getElementById(\"pincode\");\r\n");
      out.write("  var ph=document.getElementById(\"phoneno\");\r\n");
      out.write("  var e=document.getElementById(\"email\");\r\n");
      out.write("  var v=document.getElementById(\"village\");\r\n");
      out.write("  var t=document.getElementById(\"taluk\");\r\n");
      out.write("  var d=document.getElementById(\"district\");\r\n");
      out.write("  var s=document.getElementById(\"state\");\r\n");
      out.write("  \r\n");
      out.write("  if(u.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the username\");\r\n");
      out.write("\tu.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write("    if(p.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the password\");\r\n");
      out.write("\tp.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\telse if((p.value.length)<6)   \r\n");
      out.write("\t{\r\n");
      out.write("\t alert(\"password should contain atleast 6 characters \");\r\n");
      out.write("\t p.focus();\r\n");
      out.write(" return false;\r\n");
      out.write("\t }\r\n");
      out.write("\t\r\n");
      out.write("  if(c.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the confirm password\");\r\n");
      out.write("\tc.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\t   if((c.value)!=(p.value))\r\n");
      out.write("\t\t   {\r\n");
      out.write("\t\t   alert(\"Re-enter the password\");\r\n");
      out.write("\t\t   c.focus();\r\n");
      out.write("\t\t   return false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("  if(n.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the name\");\r\n");
      out.write("    n.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t  if(a.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the address\");\r\n");
      out.write("\ta.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("  if(pi.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the pincode\");\r\n");
      out.write("\tpi.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t else if(!parseInt(pi.value))\r\n");
      out.write("\t\t{    \r\n");
      out.write("                    alert(\"Enter Integer\");\r\n");
      out.write("\t\t    return false;\t\r\n");
      out.write("\t\t}\r\n");
      out.write("              else if(((pi.value.length)>6))\r\n");
      out.write("\t        {\r\n");
      out.write("\t               alert(\"Pin no: should contain 6 integers \");  \t            \r\n");
      out.write("\t               pi.focus();\r\n");
      out.write("\t               return false;\r\n");
      out.write("                 }\r\n");
      out.write("\t\r\n");
      out.write("  if(ph.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the phone number\");\r\n");
      out.write("    \r\n");
      out.write("\tph.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("   else if(!parseInt(ph.value))\r\n");
      out.write("\t\t{    \r\n");
      out.write("                    alert(\"Enter valid Phone number \");\r\n");
      out.write("\t\t    return false;\t\r\n");
      out.write("\t\t}\r\n");
      out.write("            else if(((ph.value.length)<6) || ((ph.value.length)>11))\r\n");
      out.write("\t                     {\r\n");
      out.write("\t               alert(\"Phone no should contain atleast 6 integers \");  \r\n");
      out.write("\t            \r\n");
      out.write("\t               ph.focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("\t                  }                 \r\n");
      out.write("  \r\n");
      out.write("    if(e.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the email\");\r\n");
      out.write("\te.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t else if(e.value.indexOf('@')==-1)\r\n");
      out.write("\t\t      {\r\n");
      out.write("\t\t       alert(\"Use @ email correctly\");\r\n");
      out.write("\t\t       e.focus();\r\n");
      out.write("\t\t       return false;\r\n");
      out.write("\t\t      }\r\n");
      out.write("\t\r\n");
      out.write("\t  else if(e.value.indexOf('.')==-1)\r\n");
      out.write("\t\t       {\r\n");
      out.write("\t\t        alert(\"Use . email correctly\");\r\n");
      out.write("\t\t        e.focus();\r\n");
      out.write("\t\t        return false;\r\n");
      out.write("\t\t       }\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("    if(v.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the village\");\r\n");
      out.write("\tv.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t  if(t.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the taluk\");\r\n");
      out.write("\tt.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("  if(d.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the district\");\r\n");
      out.write("\td.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    if(s.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the state\");\r\n");
      out.write("\ts.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("  </script>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("\tcolor: #F67637;\r\n");
      out.write("\tfont-family: \"Monotype Corsiva\";\r\n");
      out.write("\tfont-size: 34px;\r\n");
      out.write("}\r\n");
      out.write(".style2 {color: #D6A55C}\r\n");
      out.write("-->\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\t<div id=\"body\">\r\n");
      out.write("\t\t<div id=\"head\"></div>\r\n");
      out.write("\t\t<div id=\"topnav\">\r\n");
      out.write("\t\t\t<a href=\"contactus.jsp\">Contact Us</a> | <a href=\"http://www.google.com\">Google</a>\t\t</div>\r\n");
      out.write("\t\t<h1><img src=\"images/logo.jpg\" width=\"401\" height=\"271\" alt=\"Logo\" /></h1>\r\n");
      out.write("\t\t<div id=\"nav\"><a href=\"index.html\"><img src=\"images/m1.gif\" width=\"101\" height=\"65\" alt=\"M1\" /></a>\r\n");
      out.write("\t\t<a href=\"http://www.freewebsitetemplates.com\"><img src=\"images/m2.gif\" width=\"97\" height=\"65\" alt=\"M2\" /></a>\r\n");
      out.write("\t\t\t<a href=\"FAQ.html\"><img src=\"images/m3.gif\" width=\"97\" height=\"65\" alt=\"M3\" /></a>\r\n");
      out.write("\t\t\t<a href=\"index.html\"><img src=\"images/m4.gif\" width=\"97\" height=\"65\" alt=\"M4\" /></a><a href=\"aboutus .html\"><img src=\"images/m5.gif\" width=\"94\" height=\"65\" alt=\"M5\" /></a></div>\r\n");
      out.write("\t\t<div id=\"left-box\">\r\n");
      out.write("\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t<object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0\" width=\"271\" height=\"132\">\r\n");
      out.write("                  <param name=\"movie\" value=\"images/home_flash.swf\" />\r\n");
      out.write("                  <param name=\"quality\" value=\"high\" />\r\n");
      out.write("                  <embed src=\"images/home_flash.swf\" quality=\"high\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" type=\"application/x-shockwave-flash\" width=\"271\" height=\"132\"></embed>\r\n");
      out.write("\t\t\t  </object>\r\n");
      out.write("\t\t\t\t<p>&nbsp;</p>\r\n");
      out.write("\t\t\t    <p>Already a registered member???</p>\r\n");
      out.write("\t\t\t\t<p class=\"date\"><a href=\"login.jsp\">Login Here </a></p><br /><br />\r\n");
      out.write("\t\t\t\t<p>Not a registered member???<br />  <a href=\"newregister.jsp\">SignUp Here</a>.</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div id=\"content-bot\">\r\n");
      out.write("\t\t\t  <div class=\"inner\">\r\n");
      out.write("\t\t\t\t <form name=\"form1\"method=\"get\" action=\"registeraction.jsp\">\r\n");
      out.write("<table width=\"455\" border=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th width=\"197\" scope=\"col\"><div align=\"right\">Username:</div></th>\r\n");
      out.write("    <th width=\"248\" scope=\"col\">\r\n");
      out.write("      <div align=\"left\">\r\n");
      out.write("        <input name=\"username\" type=\"text\" id=\"username\" />\r\n");
      out.write("      </div>        </th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th scope=\"row\"><div align=\"right\">Password:</div></th>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input name=\"password\" type=\"password\" id=\"password\" maxlength=\"8\" />       </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th scope=\"row\"><div align=\"right\">Confirmpassword:</div></th>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input name=\"conpass\" type=\"password\" id=\"conpass\" maxlength=\"8\" />        </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th scope=\"row\"><div align=\"right\"> Name:</div></th>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input name=\"name\" type=\"text\" id=\"name\" />        </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th scope=\"row\"><div align=\"right\">Secret Question </div></th>\r\n");
      out.write("    <td><select name=\"select\" size=\"1\">\r\n");
      out.write("      <option>What is your pet's name?</option>\r\n");
      out.write("      <option>Which is your first school?</option>\r\n");
      out.write("      <option>Which is your native place?</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th scope=\"row\"><div align=\"right\">Answer</div></th>\r\n");
      out.write("    <td><input name=\"answer\" type=\"text\" id=\"answer\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th scope=\"row\">&nbsp;</th>\r\n");
      out.write("    <td><strong>Personal Information </strong></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th scope=\"row\"><div align=\"right\">Address:</div></th>\r\n");
      out.write("    <td>\r\n");
      out.write("      <textarea name=\"address\" id=\"address\"></textarea>      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th scope=\"row\"><div align=\"right\">Pincode:</div></th>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input name=\"pincode\" type=\"text\" id=\"pincode\" />        </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th scope=\"row\"><div align=\"right\">Phoneno:</div></th>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input name=\"phoneno\" type=\"text\" id=\"phoneno\" />       </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th scope=\"row\"><div align=\"right\">E-Mail:</div></th>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input name=\"email\" type=\"text\" id=\"email\" />        </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th scope=\"row\"><div align=\"right\">Village:</div></th>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input name=\"village\" type=\"text\" id=\"village\" />        </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th scope=\"row\"><div align=\"right\">Taluk:</div></th>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input name=\"taluk\" type=\"text\" id=\"taluk\" />       </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  <th scope=\"row\"><div align=\"right\">District:</div></th>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input name=\"district\" type=\"text\" id=\"district\" />        </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  <th scope=\"row\"><div align=\"right\">State:</div></th>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input name=\"state\" type=\"text\" id=\"state\" />       </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th scope=\"row\">&nbsp;</th>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input name=\"Submit\" type=\"Submit\" id=\"submit\" value=\"Register\" onclick=\"return doCheck()\" />\r\n");
      out.write("      <input name=\"reset\" type=\"reset\" id=\"reset\" value=\"Reset\" />       </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t\t<div id=\"tray\">\r\n");
      out.write("\t\t\t<div class=\"redbox first\">\r\n");
      out.write("\t\t    <object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0\" width=\"217\" height=\"279\">\r\n");
      out.write("              <param name=\"movie\" value=\"images/mw.swf\" />\r\n");
      out.write("              <param name=\"quality\" value=\"high\" />\r\n");
      out.write("              <embed src=\"images/mw.swf\" quality=\"high\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" type=\"application/x-shockwave-flash\" width=\"217\" height=\"279\"></embed>\r\n");
      out.write("            </object>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"redbox\">\r\n");
      out.write("\t\t\t\t<h2 align=\"center\" class=\"style1\">Hot Reports </h2>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t <div> <span class=\"style13\">\r\n");
      out.write("\t\t\t     <marquee behavior=\"scroll\" direction=\"up\" scrolldelay=\"0.08\">\r\n");
      out.write("\t\t\t     <span class=\"style2\">\t\t\t     Six criminal drug addictes were found on Wednesday from a house near Capro building in US. Two of them were evacuated to a hospital\t\t         </span>\r\n");
      out.write("\t\t\t     </marquee>\r\n");
      out.write("\t\t\t\t </span>  \t\t\t\t</div> \r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t  <a href=\"http://www.freewebsitetemplates.com\"></a>\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"redbox last\">\r\n");
      out.write("\t\t\t  <object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0\" width=\"217\" height=\"279\">\r\n");
      out.write("                  <param name=\"movie\" value=\"images/missing.swf\" />\r\n");
      out.write("                  <param name=\"quality\" value=\"high\" />\r\n");
      out.write("                  <embed src=\"images/missing.swf\" quality=\"high\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" type=\"application/x-shockwave-flash\" width=\"217\" height=\"279\"></embed>\r\n");
      out.write("\t\t\t  </object>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t<div class=\"divider\"></div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\tCopyright @ 2020, <a href=\"http://www.crimefilemanagement.com\">www.cfm.com</a>, All rights Reserved.\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
