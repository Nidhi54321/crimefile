package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mostwanted_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".style2 {\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("}\r\n");
      out.write(".style6 {\r\n");
      out.write("\tcolor: #CC0033;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".style7 {color: #CC0000; font-weight: bold; }\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function doWanted()\r\n");
      out.write("{\r\n");
      out.write(" var a=document.getElementById(\"name\");\r\n");
      out.write("  var b=document.getElementById(\"age\");\r\n");
      out.write("  var c=document.getElementById(\"add\");\r\n");
      out.write("  var d=document.getElementById(\"type\");\r\n");
      out.write("  var e=document.getElementById(\"complex\");\r\n");
      out.write("   var f=document.getElementById(\"hair\");\r\n");
      out.write("  var g=document.getElementById(\"built\");\r\n");
      out.write("  var h=document.getElementById(\"passno\");\r\n");
      out.write("  var i=document.getElementById(\"desc\");\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  if(a.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the name\");\r\n");
      out.write("\ta.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write("   if(b.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the age\");\r\n");
      out.write("\tb.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t else if(!parseInt(b.value))\r\n");
      out.write("\t\t{    \r\n");
      out.write("                    alert(\"Enter Integer\");\r\n");
      out.write("\t\t    return false;\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t \r\n");
      out.write("\t if(c.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the address\");\r\n");
      out.write("\tc.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("   if(d.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the type of crime\");\r\n");
      out.write("\td.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(e.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the complexion\");\r\n");
      out.write("\te.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(f.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the hair colour\");\r\n");
      out.write("\tf.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write("   if(g.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the built\");\r\n");
      out.write("\tg.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(h.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the passport no:\");\r\n");
      out.write("\th.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("   if(i.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the case description\");\r\n");
      out.write("\ti.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
      out.write("\t\t  <form id=\"form1\" name=\"form1\" method=\"post\" action=\"mostwantedaction.jsp\">\r\n");
      out.write("<table width=\"502\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"40\" colspan=\"2\"><div align=\"center\" class=\"style1\">MOST WANTED </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"229\" height=\"36\"><div align=\"right\" class=\"style7\"><span class=\"style2\">Name:</span></div></td>\r\n");
      out.write("    <td width=\"257\">\r\n");
      out.write("      <label>\r\n");
      out.write("        <input name=\"name\" type=\"text\" id=\"name\" />\r\n");
      out.write("        </label>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"35\"><div align=\"right\" class=\"style7\">Age:</div></td>\r\n");
      out.write("    <td><input name=\"age\" type=\"text\" id=\"age\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"40\"><div align=\"right\" class=\"style7\">Address:</div></td>\r\n");
      out.write("    <td>\r\n");
      out.write("      <label>\r\n");
      out.write("        <textarea name=\"add\" id=\"add\"></textarea>\r\n");
      out.write("        </label>       </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"33\"><div align=\"right\" class=\"style7\">Type of crime: </div></td>\r\n");
      out.write("    <td><input name=\"type\" type=\"text\" id=\"type\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"39\" colspan=\"2\"><strong>Descriptive Particulars : </strong></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"35\"><div align=\"right\" class=\"style7\">Complexion:</div></td>\r\n");
      out.write("    <td><input name=\"complex\" type=\"text\" id=\"complex\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"32\"><div align=\"right\" class=\"style7\">Hair:</div></td>\r\n");
      out.write("    <td><input name=\"hair\" type=\"text\" id=\"hair\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"32\"><div align=\"right\" class=\"style7\">Built:</div></td>\r\n");
      out.write("    <td><input name=\"built\" type=\"text\" id=\"built\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"32\"><div align=\"right\" class=\"style7\">Passport no: </div></td>\r\n");
      out.write("    <td><input name=\"passno\" type=\"text\" id=\"passno\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"71\"><div align=\"right\" class=\"style6\">Case Description: </div></td>\r\n");
      out.write("    <td><textarea name=\"desc\" cols=\"30\" rows=\"4\" id=\"desc\"></textarea></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"56\" colspan=\"2\">\r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("      <div align=\"center\"><a href=\"mwLargeUpload.jsp\">click here to upload photo</a>  </div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"65\" colspan=\"2\">\r\n");
      out.write("      <label>\r\n");
      out.write("        \r\n");
      out.write("        <div align=\"center\">\r\n");
      out.write("          <input type=\"submit\" name=\"Submit\" value=\"Submit\" onclick=\"return doWanted()\"/>\r\n");
      out.write("          \r\n");
      out.write("          <input type=\"reset\" name=\"Submit2\" value=\"Reset\" onclick=\"return doWanted()\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("      </label>      </td>\r\n");
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
      out.write("\t\t  </li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<h2>New Additions</h2>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"newadmin.jsp\">New admin </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"hotnews.jsp\">Hot News </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewhotnews.jsp\">View Hot News </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"addnewcontact.jsp\">Add Contacts </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"mostwanted.jsp\">Most Wanted </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewadminwanted.jsp\">View/Delete MostWanted </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"missingperson.jsp\">Missing Persons </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewadminmissing.jsp\">View/Delete Missing Persons </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"criminalregister.jsp\">Criminal Register </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewcomplaintreply.jsp\">View Allcomplaintreply </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"prisonerreg.jsp\">Prisoners Register </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"prisonerreport.jsp\">ViewPrisonerReport </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"history.jsp\">History</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewhistory.jsp\">View History</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"fir.jsp\">FIR</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"firreport.jsp\">FIR Report</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<h2>Account Settings </h2>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"adminchangepass.jsp\">Change Password </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"criminalreport.jsp\">All CriminalReport </a></li>\r\n");
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
