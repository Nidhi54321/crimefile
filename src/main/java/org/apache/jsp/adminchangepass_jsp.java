package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class adminchangepass_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write(" var a=document.getElementById(\"dis\");\r\n");
      out.write("  var b=document.getElementById(\"da\");\r\n");
      out.write("  var c=document.getElementById(\"ti\");\r\n");
      out.write("  var d=document.getElementById(\"toi\");\r\n");
      out.write("  var e=document.getElementById(\"place\");\r\n");
      out.write("  var f=document.getElementById(\"for\");\r\n");
      out.write("  var g=document.getElementById(\"fno\");\r\n");
      out.write("   var h=document.getElementById(\"sec\");\r\n");
      out.write("  var i=document.getElementById(\"refen\");\r\n");
      out.write("  var j=document.getElementById(\"add\");\r\n");
      out.write("  var k=document.getElementById(\"pn\");\r\n");
      out.write("  var l=document.getElementById(\"cn\");\r\n");
      out.write("  var m=document.getElementById(\"po\");\r\n");
      out.write("  var n=document.getElementById(\"rt\");\r\n");
      out.write("  \r\n");
      out.write("  var o=document.getElementById(\"ir\");\r\n");
      out.write("  var p=document.getElementById(\"di\")\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  if(a.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the district\");\r\n");
      out.write("\ta.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write("   if(b.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the date\");\r\n");
      out.write("\tb.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(c.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the time\");\r\n");
      out.write("\tc.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("   if(d.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the type\");\r\n");
      out.write("\td.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(e.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the place\");\r\n");
      out.write("\te.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(f.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter whether foreign or local\");\r\n");
      out.write("\tf.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(g.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the fir no:\");\r\n");
      out.write("g.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t if(h.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the section\");\r\n");
      out.write("\th.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(i.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the reference no:\");\r\n");
      out.write("\ti.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("   if(j.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the informant address\");\r\n");
      out.write("\tj.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(k.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the passport no:\");\r\n");
      out.write("\tk.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(l.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter complaint no:\");\r\n");
      out.write("\tl.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(m.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the police station\");\r\n");
      out.write("m.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t if(n.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the received time:\");\r\n");
      out.write("\tn.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(o.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter infm received:\");\r\n");
      out.write("\to.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t if(p.value == \"\")\r\n");
      out.write("  {\r\n");
      out.write("    alert (\"enter the distance from police station\");\r\n");
      out.write("p.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write(" </script>\r\n");
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
      out.write("\t\t\t<li class=\"active\"><a href=\"adminhome.html\">Adminhome </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewusercomplaint.jsp\">Usercomplaint </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewusercrime.jsp\">Usercrime</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewcontacts.jsp\">Contacts</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"login.jsp\">Logout</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("  <div id=\"colOne\">\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("    <div>\r\n");
      out.write("<form id=\"form1\" name=\"form1\" method=\"post\" action=\"adminchangeaction.jsp\">\r\n");
      out.write("     ");
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


            
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("</form>\r\n");

            } catch (Exception e) {
                out.println(e);
            }
        
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t\t\t<li><a href=\"viewhotnews.jsp\">View Hot News </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"addnewcontact.jsp\">Add Contacts </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"mostwanted.jsp\">Most Wanted </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewadminwanted.jsp\">View/Delete MostWanted </a></li>\r\n");
      //out.write("\t\t\t\t\t<li><a href=\"missingperson.jsp\">Missing Persons </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewadminmissing.jsp\">View/Delete Missing Persons </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"criminalregister.jsp\">Criminal Register </a></li>\r\n");
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
