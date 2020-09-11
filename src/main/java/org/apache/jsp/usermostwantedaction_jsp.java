package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class usermostwantedaction_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            <!--\n");
      out.write("            .style1 {\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <h1>CrimeStation</h1>\n");
      out.write("                <h2>within the hands of safe </h2>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"adminhome.html\">my home </a></li>\n");
      out.write("                    <li><a href=\"latestnews.jsp\">latest news </a></li>\n");
      out.write("                    <li><a href=\"feedback.jsp\">feedbacks</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\">logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"content\">\n");
      out.write("            \n");
      out.write("            <div id=\"colOne\">\n");
      out.write("                <p align=\"right\"><strong><a href=\"usermostwanted.jsp\">&lt;&lt; Previous </a> </strong></p>\n");
      out.write("                <div>\n");
      out.write("                    \n");
      out.write("                    ");

            try {
                String nam = request.getParameter("name");
                String u1 = request.getParameter("user");
                String ag = request.getParameter("age");
                String addr = request.getParameter("add");
                String typeof = request.getParameter("type");
                String complexn = request.getParameter("complex");
                String ha = request.getParameter("hair");
                String buil = request.getParameter("built");
                String psp = request.getParameter("passno");
                String cased = request.getParameter("desc");


                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefile", "root", "");
                Statement st = con1.createStatement();
                st.executeUpdate("insert into mostwanted1 values('" + u1 + "'," + nam + "','" + ag + "','" + addr + "','" + typeof + "','" + complexn + "','" + ha + "','" + buil + "','" + psp + "','" + cased + "')");
                out.println("Data completed successfully");

            } catch (Exception e) {
                out.println(e);
            }


                    
      out.write("\n");
      out.write("                    <form id=\"form1\" name=\"form1\" method=\"post\" action=\"usermostwantedaction.jsp\">\n");
      out.write("                        <table width=\"502\" border=\"0\" align=\"center\">\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td width=\"486\" height=\"65\">\n");
      out.write("                                    <label>\n");
      out.write("                                        \n");
      out.write("                                        <div align=\"center\">\n");
      out.write("                                            \n");
      out.write("                                            <form method=\"post\" action=\"simple.jsp\" name=\"upform\" enctype=\"multipart/form-data\">\n");
      out.write("                                                <br>\n");
      out.write("                                                <br>\n");
      out.write("                                                <p>&nbsp;</p>\n");
      out.write("                                                <p>&nbsp;</p>\n");
      out.write("                                                <p align=\"center\">&nbsp;</p>\n");
      out.write("                                                <p align=\"center\">&nbsp;</p>\n");
      out.write("                                        </form></div>\n");
      out.write("                                </label>      </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"colTwo\">\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <div align=\"center\"><strong> \n");
      out.write("                            </strong>\n");
      out.write("                        </div>\n");
      out.write("                        <form method=\"get\" action=\"#\">\n");
      out.write("                            <div>\n");
      out.write("                                <div align=\"center\">\n");
      out.write("                                    <input type=\"text\" id=\"textfield1\" name=\"textfield1\" value=\"\" size=\"18\" />\n");
      out.write("                                    <input type=\"submit\" id=\"submit1\" name=\"submit1\" value=\"Search\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <h2>New Additions</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"newadmin.jsp\">New admin </a></li>\n");
      out.write("                            <li><a href=\"hotnews.jsp\">Hot News </a></li>\n");
      out.write("                            <li><a href=\"mostwanted.jsp\">Most Wanted </a></li>\n");
      out.write("                            <li><a href=\"missingperson.jsp\">Missing Persons </a></li>\n");
      out.write("                            <li><a href=\"criminalregister.jsp\">Criminal Register </a></li>\n");
      out.write("                            <li><a href=\"postmortum.jsp\">Post Mortum </a></li>\n");
      out.write("                            <li><a href=\"prisonerreg.jsp\">Prisoners Register </a></li>\n");
      out.write("                            <li><a href=\"history.jsp\">History</a></li>\n");
      out.write("                            <li><a href=\"fir.jsp\">FIR</a></li>\n");
      out.write("                            <li><a href=\"chargesheet.jsp\">Chargesheet</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <h2>Account Settings </h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"adminchangepass.jsp\">Change Password </a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <h2>More Facilities </h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"chatlogin.jsp\">Chat</a></li>\n");
      out.write("                            <li><a href=\"compose.jsp\">Mail</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <p>Copyright &copy; 2020 cfm. Designed by<em class=\"style1\"> <a href=\"http://www.freecsstemplates.org/\">www.crimefilemanagement.com</a></em></p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
