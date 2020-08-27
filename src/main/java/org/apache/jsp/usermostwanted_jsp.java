package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usermostwanted_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function doValue()\r\n");
      out.write("{\r\n");
      out.write(" var cn=document.getElementById(\"crimeno\");\r\n");
      out.write("  var ui=document.getElementById(\"userid\");\r\n");
      out.write("  var ni=document.getElementById(\"nameinformant\");\r\n");
      out.write("  var d=document.getElementById(\"det\");\r\n");
      out.write("  var a=document.getElementById(\"address\");\r\n");
      out.write("  var des=document.getElementById(\"description\");\r\n");
      out.write("  var da1=document.getElementById(\"da\");\r\n");
      out.write("   \r\n");
      out.write("    if(cn.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the crimeno\");\r\n");
      out.write("\tcn.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write("   if(ui.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the userid\");\r\n");
      out.write("\tui.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(ni.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the name of informant\");\r\n");
      out.write("\tni.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("   if(a.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the address\");\r\n");
      out.write("\ta.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(d.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the details\");\r\n");
      out.write("\td.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(des.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the description\");\r\n");
      out.write("\tdes.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(da.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the date\");\r\n");
      out.write("\tda.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t}\r\n");
      out.write(" </script>\r\n");
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
      out.write("\t\t\t<li class=\"active\"><a href=\"adminhome.html\">my home </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"latestnews.jsp\">latest news </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"feedback.jsp\">feedbacks</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"login.jsp\">logout</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("  <div id=\"colTwo\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t  <div align=\"center\"><strong> \r\n");
      out.write("\t\t\t    </strong>\t\t      </div>\r\n");
      out.write("\t\t\t  <form method=\"get\" action=\"#\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t  <input type=\"text\" id=\"textfield1\" name=\"textfield1\" value=\"\" size=\"18\" />\r\n");
      out.write("\t\t\t\t\t\t  <input type=\"submit\" id=\"submit1\" name=\"submit1\" value=\"Search\" />\r\n");
      out.write("\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t  </form>\r\n");
      out.write("\t\t  </li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<h2>New Additions</h2>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"complaint.jsp\">Complaint</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"crimereport.jsp\">Crime Report</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"usermostwanted.jsp\">Most Wanted </a></li>\r\n");
      out.write("\t\t\t\t    <li><a href=\"feedback.jsp\">Feedback  </a></li>\r\n");
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
      out.write("<form method=\"post\" action=\"usermostwantedaction.jsp\" >\r\n");
      out.write("  <table width=\"402\" border=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"42\" colspan=\"2\"><div align=\"center\" class=\"style1\">MOST WANTED </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"189\" height=\"53\"><div align=\"right\"><span class=\"style2\">Name:</span></div></td>\r\n");
      out.write("    <td width=\"197\">\r\n");
      out.write("      <label>\r\n");
      out.write("        <input name=\"name\" type=\"text\" id=\"name\" />\r\n");
      out.write("        </label>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"22\"><label>\r\n");
      out.write("      <div align=\"right\">UserId</div>\r\n");
      out.write("    </label></td>\r\n");
      out.write("    <td><input name=\"user\" type=\"text\" id=\"user\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"47\"><div align=\"right\">Age:</div></td>\r\n");
      out.write("    <td><input name=\"age\" type=\"text\" id=\"age\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"49\"><div align=\"right\">Type of crime: </div></td>\r\n");
      out.write("    <td><input name=\"type\" type=\"text\" id=\"type\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" colspan=\"2\"><strong>Descriptive Particulars : </strong></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"31\"><div align=\"right\">Complexion:</div></td>\r\n");
      out.write("    <td><input name=\"complex\" type=\"text\" id=\"complex\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"35\"><div align=\"right\">Hair:</div></td>\r\n");
      out.write("    <td><input name=\"hair\" type=\"text\" id=\"hair\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"33\"><div align=\"right\">Built:</div></td>\r\n");
      out.write("    <td><input name=\"built\" type=\"text\" id=\"built\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"75\"><strong>Case Description: </strong></td>\r\n");
      out.write("    <td><textarea name=\"desc\" cols=\"30\" rows=\"4\" id=\"desc\"></textarea></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"70\" colspan=\"2\"><div align=\"center\"><a href=\"simple.jsp\">Click here to upload the photos</a></div></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"left\"><div align=\"center\">\r\n");
      out.write("        <input type=\"submit\" name=\"Submit2\" value=\"Submit\" /> \r\n");
      out.write("        <input type=\"reset\" name=\"Reset\" value=\"Cancel\" />\r\n");
      out.write("      </div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form> \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p>Copyright &copy; 2009 cfm. Designed by<em> <span class=\"style1\"><a href=\"http://www.freecsstemplates.org/\">www.crimefilemanagement.com</a></span></em></p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
