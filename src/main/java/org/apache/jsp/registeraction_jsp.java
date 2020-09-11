package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class registeraction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        throws IOException, ServletException {

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
      out.write("\t<title>Party Time</title>\r\n");
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
      out.write(".style2 {color: #FF0000}\r\n");
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
      out.write("\t\t\t<a href=\"http://www.freewebsitetemplates.com\">Contact Us</a> | <a href=\"http://www.google.com\">Google</a>\t\t</div>\r\n");
      out.write("\t\t<h1><img src=\"images/logo.jpg\" width=\"401\" height=\"271\" alt=\"Logo\" /></h1>\r\n");
      out.write("\t\t<div id=\"nav\"><a href=\"index.html\"><img src=\"images/m1.gif\" width=\"101\" height=\"65\" alt=\"M1\" /></a>\r\n");
      out.write("\t\t<a href=\"http://www.freewebsitetemplates.com\"><img src=\"images/m2.gif\" width=\"97\" height=\"65\" alt=\"M2\" /></a>\r\n");
      out.write("\t\t\t<a href=\"FAQ.html\"><img src=\"images/m3.gif\" width=\"97\" height=\"65\" alt=\"M3\" /></a>\r\n");
      out.write("\t\t\t<a href=\"http://www.freewebsitetemplates.com\"><img src=\"images/m4.gif\" width=\"97\" height=\"65\" alt=\"M4\" /></a>\r\n");
      out.write("\t\t\t<a href=\"aboutus .html\"><img src=\"images/m5.gif\" width=\"94\" height=\"65\" alt=\"M5\" /></a>\t\t</div>\r\n");
      out.write("\t\t<div id=\"left-box\">\r\n");
      out.write("\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t<img src=\"images/pic_1.jpg\" width=\"271\" height=\"132\" alt=\"Pic 1\" />\r\n");
      out.write("\t\t\t\t<h2><img src=\"images/h_free_drink_party_on.gif\" width=\"252\" height=\"33\" alt=\"Free Drink Party On\" /></h2>\r\n");
      out.write("\t\t\t\t<p class=\"date\"><a href=\"login.jsp\">Login Here </a></p><br /><br />\r\n");
      out.write("\t\t\t\t<p>Not a registered member???<br />  <a href=\"newregister.jsp\">SignUp Here</a>.</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t  <div class=\"style1\" id=\"content\">\r\n");
      out.write("\t    <div align=\"center\" class=\"divider\">\r\n");
      out.write("\t      ");

            try {
                String user = request.getParameter("username");
                String pass = request.getParameter("password");
                String con = request.getParameter("conpass");
                String se = request.getParameter("secret");
                String an = request.getParameter("answer");
                
                
                String na = request.getParameter("name");
                String add = request.getParameter("address");
                String phone = request.getParameter("phoneno");
                String pin = request.getParameter("pincode");
                String email = request.getParameter("email");
                String vill = request.getParameter("village");
                String taluk = request.getParameter("taluk");
                String dis = request.getParameter("district");
                String state = request.getParameter("state");
                String stat = "u";
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefile", "root", "");
                Statement st = con1.createStatement();
                Statement st1 = con1.createStatement();
                st.executeUpdate("insert into login values('" + user + "','" + pass + "','" + stat + "')");
                st1.executeUpdate("insert into registration values('" + na + "','" + user + "','" + se + "','" +an+ "', '"+ add + "'," + pin + "," + phone + ",'" + email + "','" + vill + "','" + taluk + "','" + dis + "','" + state + "')");
                out.println("Congrats!!Now you are a registered Member");



            } catch (Exception e) {
                out.println(e);
            }



      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t\t<div id=\"tray\">\r\n");
      out.write("\t\t\t<div class=\"redbox first\">\r\n");
      out.write("\t\t\t\t<h2><span class=\"style1\">Most Wanted </span></h2>\r\n");
      out.write("\t\t\t\t<p>If you're looking for beautiful and professionally made templates you can find them at <a href=\"http://www.templatebeauty.com\">Template Beauty</a>.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>Nam congue dolor ut enim.</li>\r\n");
      out.write("\t\t\t\t\t<li>In consequat laoreet dui.</li>\r\n");
      out.write("\t\t\t\t\t<li>Pellentesque faucibus velit et urna.</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"redbox\">\r\n");
      out.write("\t\t\t\t<h2 align=\"center\" class=\"style1\">Hot Reports </h2>\r\n");
      out.write("\t\t\t\t<p align=\"center\" class=\"style1\"><div><marquee>\r\n");
      out.write("\t\t\t\tHot Reports \r\n");
      out.write("\t\t\t\t</marquee>\r\n");
      out.write("\t\t\t\t</div></p>\r\n");
      out.write("\t\t\t\t<p>Even more websites all about website templates on <a href=\"http://www.justwebtemplates.com\">Just Web Templates</a>.</p>\r\n");
      out.write("\t\t\t\t<p>If you're looking for beautiful and professionally made templates you can find them at <a href=\"http://www.templatebeauty.com\">Template Beauty</a>.</p><br />\r\n");
      out.write("\t\t\t  <a href=\"http://www.freewebsitetemplates.com\"></a>\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"redbox last\">\r\n");
      out.write("\t\t\t\t<h2><span class=\"style1\">Missing Persons </span></h2>\r\n");
      out.write("\t\t\t\t<p>If you're looking for beautiful and professionally made templates you can find them at <a href=\"http://www.templatebeauty.com\">Template Beauty</a>.</p>\r\n");
      out.write("\t\t\t\t<p>Even more websites all about website templates on <a href=\"http://www.justwebtemplates.com\">Just Web Templates</a>.</p>\r\n");
      out.write("\t\t\t\t<br />\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
