package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class feedbackdelete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("Design by Free CSS Templates\r\n");
      out.write("http://www.freecsstemplates.org\r\n");
      out.write("Released for free under a Creative Commons Attribution 2.5 License\r\n");
      out.write("-->\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            <!--\r\n");
      out.write("            .style1 {\r\n");
      out.write("                color: #CC9999;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("            .style4 {\r\n");
      out.write("                color: #C14744;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write(".style5 {color: #990000}\r\n");
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
      out.write("                   <li class=\"active\"><a href=\"adminhome.html\">Adminhome </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewusercomplaint.jsp\">Usercomplaint </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewusercrime.jsp\">Usercrime</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewcontacts.jsp\">Contacts</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"login.jsp\">Logout</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("            <div id=\"colOne\">\r\n");
      out.write("                <h2>Welcome to crimeStation!</h2>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\r\n");
      out.write("            <table width=\"485\" height=\"28\" border=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td width=\"86\" height=\"22\" ><div align=\"center\"><span class=\"style6\"><strong>Matter</strong></span></div></td>\r\n");
      out.write("                    <td width=\"222\"><div align=\"center\"><span class=\"style6\"><strong>Time</strong></span></div></td>\r\n");
      out.write("                    <td width=\"222\"><div align=\"center\"><span class=\"style6\"><strong>place</strong></span></div></td>\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

        try {
            String email1 = request.getParameter("email1");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefile", "root", "");
            Statement st = con1.createStatement();
            Statement st1 = con1.createStatement();
            st1.executeUpdate("Delete from feedback where email='"+ email1 + "'");

            ResultSet rs = st.executeQuery("select name,email,message from feedback");
            String name1 = "", message1 = "";

            while (rs.next()) {
                name1 = rs.getString("name");
               email1 = rs.getString("email");
                message1 = rs.getString("message");
                 out.println("<tr>");
                out.println("<td>" + name1 + "</td>");
                out.println("<td>" + email1 + "</td>");
                out.println("<td>" + message1 + "</td>");
                               
                out.println("<td><a href='feedbackdelete.jsp?email=" + email1 + "'>Delete</a></td>");

                out.println("<tr>");
            }
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");


        } catch (Exception e) {
            out.println(e);
        }
                
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("                                    \r\n");
      out.write("                       \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"colTwo\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div align=\"center\"><strong>\r\n");
      out.write("                            </strong>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <h2>New Additions</h2>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"newadmin.jsp\">New admin </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"hotnews.jsp\">Hot News </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewhotnews.jsp\">View Hot News </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewfeedback.jsp\">View Feedback </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"mostwanted.jsp\">Most Wanted </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewadminwanted.jsp\">View/Delete MostWanted </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"missingperson.jsp\">Missing Persons </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewadminmissing.jsp\">View/Delete Missing Persons </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"criminalregister.jsp\">Criminal Register </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"prisonerreg.jsp\">Prisoners Register </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"prisonerreport.jsp\">ViewPrisonerReport </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"history.jsp\">History</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"viewhistory.jsp\">View History</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"fir.jsp\">FIR</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"firreport.jsp\">FIR Report</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <h2>Account Settings </h2>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"adminchangepass.jsp\">Change Password </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"criminalreport.jsp\">All CriminalReport </a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <h2>More Facilities </h2>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"chat.jsp\">Chat</a></li>\r\n");
      out.write("                            <li><a href=\"compose.jsp\">Mail</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"footer\">\r\n");
      out.write("            <p>Copyright &copy; 2020 cfm. Designed by<em> <span class=\"style1\"><a href=\"http://www.freecsstemplates.org/\">www.crimefilemanagement.com</a></span></em></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
