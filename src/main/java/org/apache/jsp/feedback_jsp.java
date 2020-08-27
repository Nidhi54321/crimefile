package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\r\n");
      out.write("Design by Free CSS Templates\r\n");
      out.write("http://www.freecsstemplates.org\r\n");
      out.write("Released for free under a Creative Commons Attribution 2.5 License\r\n");
      out.write("-->\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function doFeed()\r\n");
      out.write("{\r\n");
      out.write(" var a=document.getElementById(\"name1\");\r\n");
      out.write("  var b=document.getElementById(\"email1\");\r\n");
      out.write("  var c=document.getElementById(\"mess1\");\r\n");
      out.write("   \r\n");
      out.write("if(a.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the name\");\r\n");
      out.write("\ta.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write("   if(b.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the email\");\r\n");
      out.write("\tb.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t else if(b.value.indexOf('@')==-1)\r\n");
      out.write("\t\t      {\r\n");
      out.write("\t\t       alert(\"Use @ email correctly\");\r\n");
      out.write("\t\t       b.focus();\r\n");
      out.write("\t\t       return false;\r\n");
      out.write("\t\t      }\r\n");
      out.write("\t\r\n");
      out.write("\t  else if(b.value.indexOf('.')==-1)\r\n");
      out.write("\t\t       {\r\n");
      out.write("\t\t        alert(\"Use . email correctly\");\r\n");
      out.write("\t\t        b.focus();\r\n");
      out.write("\t\t        return false;\r\n");
      out.write("\t\t       }\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t if(c.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the message\");\r\n");
      out.write("\tc.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("\tcolor: #CC9999;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".style5 {color: #CC0033}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<div id=\"logo\">\r\n");
      out.write("\t\t<h1>CrimeStation</h1>\r\n");
      out.write("\t\t<h2>within the hands of safe </h2>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"menu\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"Userhomepage.html\">Home </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewadminreply.jsp\">Complaintstatus </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewcrimereply.jsp\">Crimestatus </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewcontacts.jsp\">Viewcontacts</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"feedback.jsp\">Message</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("  <div id=\"colTwo\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t  <div align=\"center\"><strong> \r\n");
      out.write("\t\t\t    </strong>\t\t      </div>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t  <a href=\"login.jsp\"><input type=\"button\" id=\"b1\" name=\"b1\" value=\"Logout\" /></a>\r\n");
      out.write("\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t  </li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<h2>New Additions</h2>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"complaint.jsp\">Complaint</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"crimereport.jsp\">Crime Report</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"usermissingperson.jsp\">Missing Person </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewmissingperson.jsp\">View Missing Person </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewmostwanted.jsp\">View Mostwanted Person</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<h2>Account Settings </h2>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"changepassword.jsp\">Change Password</a></li>\r\n");
      out.write("\t\t\t\t    <li><a href=\"editcomplaint.jsp\">Edit Complaint</a></li>\r\n");
      out.write("\t\t\t        <li><a href=\"editregister.jsp\">Edit Account </a></li>\r\n");
      out.write("\t\t        </ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<h2>More Facilities </h2>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"chat.jsp\">Chat</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"compose.jsp\">Mail</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div>\r\n");
      out.write("\r\n");
      out.write("<form id=\"form1\" name=\"form1\" method=\"post\" action=\"feedbackaction.jsp\">\r\n");
      out.write("<table width=\"422\" border=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"49\" colspan=\"2\"><div align=\"center\"><strong>FEEDBACK  </strong></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"188\" height=\"54\"><div align=\"right\">Name:</div></td>\r\n");
      out.write("    <td width=\"218\">\r\n");
      out.write("      <label>\r\n");
      out.write("        <div align=\"justify\">\r\n");
      out.write("          <input name=\"name1\" type=\"text\" id=\"name1\" />\r\n");
      out.write("        </div>\r\n");
      out.write("      </label>\r\n");
      out.write("        <div align=\"justify\"></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"52\"><div align=\"right\">E-mail:</div></td>\r\n");
      out.write("    <td>\r\n");
      out.write("      <label>\r\n");
      out.write("      <div align=\"justify\">\r\n");
      out.write("        <input name=\"email1\" type=\"text\" id=\"email1\" />\r\n");
      out.write("      </div>\r\n");
      out.write("      </label>\r\n");
      out.write("      <div align=\"justify\"></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"57\"><div align=\"right\">Message:</div></td>\r\n");
      out.write("    <td><div align=\"justify\">\r\n");
      out.write("      <textarea name=\"mess1\" id=\"mess1\"></textarea>\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"73\" colspan=\"2\">\r\n");
      out.write("      <label>\r\n");
      out.write("        <div align=\"center\">\r\n");
      out.write("          <input type=\"submit\" name=\"Submit\" value=\"Submit\" onclick=\"return doFeed()\"/>\r\n");
      out.write("      \r\n");
      out.write("        <input type=\"reset\" name=\"reset\" value=\"Reset\" />\r\n");
      out.write("      </div>\r\n");
      out.write("      </label>\r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"65\" colspan=\"2\"><div align=\"center\"><a href=\"compose.jsp\">crimefilemanagement@gmail.com</a></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("   </form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p>Copyright &copy; 2009 cfm. Designed by<em> <span class=\"style1\"><a href=\"http://www.crimefilemanagement.com\">www.crimefilemanagement.com</a></span></em></p>\r\n");
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
