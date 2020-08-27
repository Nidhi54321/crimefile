package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class viewcrimereply_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            <!--\r\n");
      out.write("            .style1 {\r\n");
      out.write("                color: #CC9999;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("            .style8 {color: #660000; font-weight: bold; }\r\n");
      out.write("            -->\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("            <div id=\"logo\">\r\n");
      out.write("                <h1>CrimeStation</h1>\r\n");
      out.write("                <h2>within the hands of safe </h2>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"menu\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"active\"><a href=\"Userhomepage.html\">Home </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewadminreply.jsp\">Complaintstatus </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewcrimereply.jsp\">Crimestatus </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewcontacts.jsp\">Viewcontacts</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"feedback.jsp\">Message</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("        <div id=\"colTwo\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <div align=\"center\"><strong>\r\n");
      out.write("                    </strong>\t\t      </div>\r\n");
      out.write("                   \r\n");
      out.write("                        <div>\r\n");
      out.write("                            <div align=\"center\">\r\n");
      out.write("                              <a href=\"login.jsp\"><input type=\"button\" id=\"b1\" name=\"b1\" value=\"Logout\" /></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                   \r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <h2>New Additions</h2>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"complaint.jsp\">Complaint</a></li>\r\n");
      out.write("                        <li><a href=\"crimereport.jsp\">Crime Report</a></li>\r\n");
      out.write("                        <li><a href=\"usermostwanted.jsp\">Most Wanted </a></li>\r\n");
      out.write("                        <li><a href=\"feedback.jsp\">Feedback  </a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <h2>Account Settings </h2>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"changepassword.jsp\">Change Password</a></li>\r\n");
      out.write("                        <li><a href=\"editcomplaint.jsp\">Edit Complaint</a></li>\r\n");
      out.write("                        <li><a href=\"editregister.jsp\">Edit Account </a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <h2>More Facilities </h2>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"chat.jsp\">Chat</a></li>\r\n");
      out.write("                        <li><a href=\"compose.jsp\">Mail</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div id=\"colOne\">\r\n");
      out.write("\r\n");
      out.write("            <form name=\"form1\" method=\"post\" action=\"viewcrimereply.jsp\" >\r\n");
      out.write("\t\t\t");
    
    
    try
            {
                String a = null;
                String b = null;
                String c = null;
                                
                String c1 = (String) session.getAttribute("s1");
                out.println(c1);
                String c2 = (String) session.getAttribute("s2");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefile", "root", "");
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery("select user,crimeid,takeaction from takecrimeaction where user='" + c1 + "'");
                while (rs.next()) {
                    a = rs.getString("user");
                    b = rs.getString("crimeid");
                    c = rs.getString("takeaction");
                    
                    
                }


        
      out.write("   \r\n");
      out.write("              <table width=\"376\" border=\"1\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"163\">Userid</td>\r\n");
      out.write("                  <td width=\"197\"><label>\r\n");
      out.write("                    <input type=\"text\" name=\"user\"  value='");
      out.print(a);
      out.write("'/>\r\n");
      out.write("                  </label></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>Crimeid</td>\r\n");
      out.write("                  <td><label>\r\n");
      out.write("                    <input type=\"text\" name=\"crimeid\" value='");
      out.print(b);
      out.write("'/>\r\n");
      out.write("                  </label></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>Take Action </td>\r\n");
      out.write("                  <td><label>\r\n");
      out.write("                    <input type=\"text\" name=\"takeaction\" value='");
      out.print(c);
      out.write("'/>\r\n");
      out.write("                  </label></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("             ");

            } catch (Exception e) {
                out.println(e);
            }
        
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"footer\">\r\n");
      out.write("            <p>Copyright &copy; 2009 cfm. Designed by<em> <span class=\"style1\"><a href=\"http://www.freecsstemplates.org/\">www.crimefilemanagement.com</a></span></em></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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
          try { out.clearBuffer(); } catch (IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
