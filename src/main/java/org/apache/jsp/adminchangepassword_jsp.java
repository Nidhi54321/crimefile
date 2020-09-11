package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class adminchangepassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function doCheck()\r\n");
      out.write("{\r\n");
      out.write("  var un=document.getElementById(\"username\");\r\n");
      out.write("  var op=document.getElementById(\"oldpassword\");\r\n");
      out.write("  var np=document.getElementById(\"newpassword\");\r\n");
      out.write("  var cp=document.getElementById(\"confirmpassword\");\r\n");
      out.write("  \r\n");
      out.write("    if(un.value == \"\")\r\n");
      out.write(" {\r\n");
      out.write("  alert(\"Enter the user name\");\r\n");
      out.write("  un.focus();\r\n");
      out.write("  return false;\r\n");
      out.write("  }\r\n");
      out.write("     if(op.value == \"\")\r\n");
      out.write(" {\r\n");
      out.write("  alert(\"Enter the old password\");\r\n");
      out.write("  op.focus();\r\n");
      out.write("  return false;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      if(np.value == \"\")\r\n");
      out.write(" {\r\n");
      out.write("  alert(\"Enter the new password\");\r\n");
      out.write("  np.focus();\r\n");
      out.write("  return false;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("   if(cp.value == \"\")\r\n");
      out.write(" {\r\n");
      out.write("  alert(\"Enter the confirm password\");\r\n");
      out.write(" cp.focus();\r\n");
      out.write("  return false;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<div id=\"logo\">\r\n");
      out.write("\t\t<h1>CrimeStation</h1>\r\n");
      out.write("\t\t<h2>within the hands of safe </h2>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"menu\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"adminhome.html\">Adminhome </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewusercomplaint.jsp\">Usercomplaint </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewusercrime.jsp\">Usercrime</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewcontacts.jsp\">Contacts</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"login.jsp\">Logout</a></li>\r\n");
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
      out.write("<form id=\"form1\" name=\"form1\" method=\"post\" action=\"changepassaction.jsp\">\r\n");
      out.write("    \r\n");
      out.write("    ");
 try {

                //              
                String a = null;
                
                String c1 = (String) session.getAttribute("s1");
                out.println(c1);
                String c2 = (String) session.getAttribute("s2");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefile", "root", "");
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery("select username from login where username='" + c1 + "'");
                while (rs.next()) {
                    a = rs.getString("username");
                   

                }


            
      out.write("   \r\n");
      out.write("<table width=\"371\" border=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"58\" colspan=\"2\"><div align=\"center\" class=\"style1\">CHANGE PASSWORD </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"151\" height=\"34\"><div align=\"right\" class=\"style2\">Username<strong>:</strong></div></td>\r\n");
      out.write("    <td width=\"204\"><label>\r\n");
      out.write("      <div align=\"justify\">\r\n");
      out.write("        <input name=\"username\" type=\"text\" id=\"username\"  value='");
      out.print(a);
      out.write("'/>\r\n");
      out.write("      </div>\r\n");
      out.write("    </label></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"35\"><div align=\"right\" class=\"style2\">Old Password<strong>: </strong></div></td>\r\n");
      out.write("    <td><div align=\"justify\">\r\n");
      out.write("      <input name=\"oldpassword\" type=\"password\" id=\"oldpassword\" />\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"31\"><div align=\"right\" class=\"style2\">New Password<strong>: </strong></div></td>\r\n");
      out.write("    <td><div align=\"justify\">\r\n");
      out.write("      <input name=\"newpassword\" type=\"password\" id=\"newpassword\" />\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"31\"><div align=\"right\"><span class=\"style2\">Confirm Password</span><strong>: </strong></div></td>\r\n");
      out.write("    <td><div align=\"justify\">\r\n");
      out.write("      <input name=\"confirmpassword\" type=\"password\" id=\"confirmpassword\" />\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"27\">&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"37\" colspan=\"2\">\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("      <input type=\"submit\" name=\"Submit\" value=\"Change\" onclick=\"return doCheck()\"/>\r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write("     \r\n");
      out.write("        <input type=\"reset\" name=\"reset\" value=\"Reset\" />\r\n");
      out.write("      </div>\r\n");
      out.write("                \r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");

            } catch (Exception e) {
                out.println(e);
            }
        
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p>Copyright &copy; 2020 cfm. Designed by<em> <span class=\"style1\"><a href=\"http://www.freecsstemplates.org/\">www.crimefilemanagement.com</a></span></em></p>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
