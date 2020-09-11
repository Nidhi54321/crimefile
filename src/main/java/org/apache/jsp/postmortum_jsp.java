package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class postmortum_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("function Postm()\r\n");
      out.write("{\r\n");
      out.write("  \r\n");
      out.write("var a=document.getElementById(\"postm\");\r\n");
      out.write("\r\n");
      out.write("var b=document.getElementById(\"doctn\");\r\n");
      out.write("\r\n");
      out.write("var c=document.getElementById(\"polst\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var d=document.getElementById(\"postd\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("if(a.value==\" \")\r\n");
      out.write(" {\r\n");
      out.write("  alert(\"enter postmortem no:\");\r\n");
      out.write("  a.focus();\r\n");
      out.write(" return false;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write(" if(b.value==\" \")\r\n");
      out.write(" {\r\n");
      out.write("  alert(\"enter doctor's name:\");\r\n");
      out.write(" b.focus();\r\n");
      out.write(" return false;\r\n");
      out.write("  } \r\n");
      out.write("  \r\n");
      out.write("  if(c.value==\" \")\r\n");
      out.write(" {\r\n");
      out.write("  alert(\"enter police station :\");\r\n");
      out.write(" c.focus();\r\n");
      out.write(" return false;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write(" if(d.value==\" \")\r\n");
      out.write(" {\r\n");
      out.write("  alert(\"enter postmortem date:\");\r\n");
      out.write("  d.focus();\r\n");
      out.write(" return false;\r\n");
      out.write("  } \r\n");
      out.write("  \r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".style2 {font-size: 18px}\r\n");
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
      out.write("\t\t<form name=\"form1\" method=\"get\" action=\"postmortemaction.jsp\" >\r\n");
      out.write("<table width=\"447\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"2\"><div align=\"center\" class=\"style2\">POSTMORTEM REPORT</div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"219\" height=\"38\"><div align=\"right\"><span class=\"style2\">Postmortem No</span><strong>:</strong></div></td>\r\n");
      out.write("    <td width=\"212\">\r\n");
      out.write("      <label>\r\n");
      out.write("      <input type=\"text\" name=\"postm\" id=\"postm\" />\r\n");
      out.write("      </label>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\"><div align=\"right\"><span class=\"style2\">Doctor's Name</span><span class=\"style1\">:</span></div></td>\r\n");
      out.write("    <td><input type=\"text\" name=\"doctn\" id=\"doctn\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"34\"><div align=\"right\" class=\"style2\">Police Station:</div></td>\r\n");
      out.write("    <td><input type=\"text\" name=\"polst\" id=\"polst\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"39\"><div align=\"right\" class=\"style2\">Postmortem Date:</div></td>\r\n");
      out.write("    <td><input type=\"text\" name=\"postd\" id=\"postd\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"39\" colspan=\"2\"><label>\r\n");
      out.write("      <div align=\"center\">\r\n");
      out.write("        <input type=\"submit\" name=\"button\" id=\"button\" value=\"Submit\" onclick=\"return Postm()\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("    </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>  \r\n");
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
      out.write("\t\t\t\t\t<li><a href=\"postmortum.jsp\">Post Mortem </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"prisonerreg.jsp\">Prisoners Register</a></li>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
