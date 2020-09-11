package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class criminalregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function doValue()\r\n");
      out.write("{\r\n");
      out.write(" var a=document.getElementById(\"crm\");\r\n");
      out.write("  var b=document.getElementById(\"na\");\r\n");
      out.write("  var c=document.getElementById(\"nn\");\r\n");
      out.write("  var d=document.getElementById(\"ag\");\r\n");
      out.write("  var e=document.getElementById(\"occ\");\r\n");
      out.write("  var f=document.getElementById(\"ct\"); \r\n");
      out.write("  var g=document.getElementById(\"add\");\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  if(a.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the criminal no:\");\r\n");
      out.write("\ta.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write("   if(b.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the name\");\r\n");
      out.write("\tb.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(c.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the nick name\");\r\n");
      out.write("\tc.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("   if(d.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the age\");\r\n");
      out.write("\td.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(e.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the occupation\");\r\n");
      out.write("\te.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(f.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the crimetype\");\r\n");
      out.write("\tf.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(g.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the address\");\r\n");
      out.write("g.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t} \r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<div id=\"logo\">\r\n");
      out.write("\t\t<h1>CrimeStation</h1>\r\n");
      out.write("\t\t<h2>within the hands of safe </h2>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"menu\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"adminhome.html\">my home </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"latestnews.jsp\">latest news </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"feedback.jsp\">feedbacks</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"login.jsp\">logout</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("  <div id=\"colOne\">\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("    <div>\r\n");
      out.write("\t\t  <form id=\"form1\" name=\"form1\" method=\"post\" action=\"criminalregisteraction.jsp\">\r\n");
      out.write("\r\n");
      out.write("<table width=\"409\" border=\"1\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"57\" colspan=\"2\"><div align=\"center\"><strong>CRIMINALS REGISTER</strong></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"150\" height=\"47\"><div align=\"right\" class=\"style12\">Criminal No :</div></td>\r\n");
      out.write("    <td width=\"243\"><label>\r\n");
      out.write("      \r\n");
      out.write("        <div align=\"left\">\r\n");
      out.write("          <label>\r\n");
      out.write("          <select name=\"select\">\r\n");
      out.write("          </select>\r\n");
      out.write("          </label>\r\n");
      out.write("        </div>\r\n");
      out.write("    </label>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"46\"><div align=\"right\" class=\"style12\">Name :</div></td>\r\n");
      out.write("    <td><label>\r\n");
      out.write("      <input type=\"text\" name=\"na\" id=\"na\" />\r\n");
      out.write("    </label></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"41\"><div align=\"right\" class=\"style12\">Nickname :</div></td>\r\n");
      out.write("    <td><label>\r\n");
      out.write("      <input type=\"text\" name=\"nn\" id=\"nn\" />\r\n");
      out.write("    </label></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"43\"><div align=\"right\" class=\"style11 style2\"><strong>Age :</strong></div></td>\r\n");
      out.write("    <td><label>\r\n");
      out.write("      <input type=\"text\" name=\"ag\" id=\"ag\" />\r\n");
      out.write("    </label></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"42\"><div align=\"right\" class=\"style12\">Occupation</div></td>\r\n");
      out.write("    <td><label>\r\n");
      out.write("      <input type=\"text\" name=\"occ\" id=\"occ\" />\r\n");
      out.write("    </label></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"38\"><div align=\"right\" class=\"style12\">Crime type:</div></td>\r\n");
      out.write("    <td><label>\r\n");
      out.write("      <input type=\"text\" name=\"ct\" id=\"ct\" />\r\n");
      out.write("    </label></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"41\"><div align=\"right\" class=\"style12\">Address :</div></td>\r\n");
      out.write("    <td>\r\n");
      out.write("      <label></label><label>\r\n");
      out.write("      <textarea name=\"add1\" id=\"add1\"></textarea>\r\n");
      out.write("      </label>\r\n");
      out.write("        <label></label></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"42\"><div align=\"right\" class=\"style12\">Most Wanted:</div></td>\r\n");
      out.write("    <td>\r\n");
      out.write("      <label>\r\n");
      out.write("    <span class=\"style1\"></span>    \r\n");
      out.write("    <input type=\"radio\" name=\"radio\" id=\"radio\" value=\"radio\" />Yes        </label>\r\n");
      out.write("  \r\n");
      out.write("      <label><span class=\"style4\"></span>\r\n");
      out.write("      <input type=\"radio\" name=\"radio2\" id=\"radio2\" value=\"radio\" />No      </label></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"52\" colspan=\"2\">\r\n");
      out.write("      <label>\r\n");
      out.write("        <div align=\"center\">\r\n");
      out.write("          <input type=\"submit\" name=\"button\" id=\"button\" value=\"SAVE\" onclick=\"return doValue()\" />\r\n");
      out.write("          <input type=\"reset\" name=\"button2\" id=\"button2\" value=\"CLEAR\" />\r\n");
      out.write("        </div>\r\n");
      out.write("      </label>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("  </div>\r\n");
      out.write("\t<div id=\"colTwo\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t  <div align=\"center\"><strong> \r\n");
      out.write("\t\t\t    </strong>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t\t  <form method=\"get\" action=\"#\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t  <input type=\"text\" id=\"textfield1\" name=\"textfield1\" value=\"\" size=\"18\" />\r\n");
      out.write("\t\t\t\t\t\t  <input type=\"submit\" id=\"submit1\" name=\"submit1\" value=\"Search\" />\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t  </form>\r\n");
      out.write("\t\t  </li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<h2>New Additions</h2>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"newadmin.jsp\">New admin </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"hotnews.jsp\">Hot News </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"mostwanted.jsp\">Most Wanted </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"missingperson.jsp\">Missing Persons </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"criminalregister.jsp\">Criminal Register </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"postmortum.jsp\">Post Mortum </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"prisonerreg.jsp\">Prisoners Register </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"history.jsp\">History</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"fir.jsp\">FIR</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"chargesheet.jsp\">Chargesheet</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<h2>Account Settings </h2>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"adminchangepass.jsp\">Change Password </a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<h2>More Facilities </h2>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"chatlogin.jsp\">Chat</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"compose.jsp\">Mail</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p>Copyright &copy; 2020 cfm. Designed by<em class=\"style1\"> <a href=\"http://www.freecsstemplates.org/\">www.crimefilemanagement.com</a></em></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
