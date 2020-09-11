package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class editcomplaint_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("            function doJob()\r\n");
      out.write("            {\r\n");
      out.write("                var cmp=document.getElementById(\"comploaintno\");\r\n");
      out.write("                var ui=document.getElementById(\"userid\");\r\n");
      out.write("                var ds=document.getElementById(\"detailssuspect\");\r\n");
      out.write("                var t=document.getElementById(\"typecrime\");\r\n");
      out.write("                var to=document.getElementById(\"typeothers\");\r\n");
      out.write("                \r\n");
      out.write("                if(cmp.value == \"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"Enter the complaint no:\");\r\n");
      out.write("                        cmp.focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                    if(ui.value == \"\")\r\n");
      out.write("                        {\r\n");
      out.write("                            alert(\"Enter the user id:\");\r\n");
      out.write("                            ui.focus();\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        if(ds.value == \"\")\r\n");
      out.write("                            {\r\n");
      out.write("                                alert(\"Enter the details suspect\");\r\n");
      out.write("                                ds.focus();\r\n");
      out.write("                                return false;\r\n");
      out.write("                            }\r\n");
      out.write("                            \r\n");
      out.write("                            if(t.value == \"\")\r\n");
      out.write("                                {\r\n");
      out.write("                                    alert(\"Enter the type of crime\");\r\n");
      out.write("                                    t.focus();\r\n");
      out.write("                                    return false;\r\n");
      out.write("                                }\r\n");
      out.write("                                \r\n");
      out.write("                                if(to.value == \"\")\r\n");
      out.write("                                    {\r\n");
      out.write("                                        alert(\"Enter the type of other crimes\");\r\n");
      out.write("                                        to.focus();\r\n");
      out.write("                                        return false;\r\n");
      out.write("                                    }\r\n");
      out.write("                                }\r\n");
      out.write("        </script>\r\n");
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
      out.write("<form name=\"form1\" method=\"get\" action=\"editcomplaintaction.jsp\">\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            ");
 try {

                //              
                String a = null;
                String b = null;
                String c = null;
                String d = null;
                String e = null;
                String f = null;
                String c1 = (String) session.getAttribute("s1");
                out.println(c1);
                String c2 = (String) session.getAttribute("s2");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefile", "root", "");
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery("select complaintno,detailssuspect,Description,Datc,typeofcrime,others from complaintreg where userid='" + c1 + "'");
                while (rs.next()) {
                    a = rs.getString("complaintno");
                    b = rs.getString("detailssuspect");
                    c = rs.getString("Description");
                    d = rs.getString("Datc");
                    e = rs.getString("typeofcrime");
                    f = rs.getString("others");

                }


            
      out.write("   \r\n");
      out.write("            \r\n");
      out.write("            <table width=\"487\" border=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th width=\"184\" scope=\"col\"><div align=\"right\">Complaintno:</div></th>\r\n");
      out.write("                    <th width=\"287\" scope=\"col\"><div align=\"left\">\r\n");
      out.write("                            \r\n");
      out.write("                            <input name=\"complaintno\" type=\"text\" id=\"complaintno\" value='");
      out.print(a);
      out.write("' />\r\n");
      out.write("                            \r\n");
      out.write("                    </div></th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"row\"><div align=\"right\">Detailssuspect:</div></th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input name=\"detailssuspect\" type=\"text\" id=\"detailssuspect\" value='");
      out.print(b);
      out.write("'/>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"row\"><div align=\"right\">Description:</div></th>\r\n");
      out.write("                    <td><label>\r\n");
      out.write("                            <input type=\"text\" name=\"description\"  value='");
      out.print(c);
      out.write("'/>\r\n");
      out.write("                    </label></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"row\"><div align=\"right\">Date:</div></th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input name=\"date\" type=\"text\" id=\"date\" value='");
      out.print(d);
      out.write("'/>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"row\"><div align=\"right\">Typeofcrime:</div></th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select name=\"typecrime\" id=\"typecrime\" value='");
      out.print(e);
      out.write("'>\r\n");
      out.write("                            <option>civil</option>\r\n");
      out.write("                            <option>Others</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                <th scope=\"row\"><div align=\"right\">others:</div></th>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"text\" name=\"others\" id=\"others\" value='");
      out.print(f);
      out.write("' >\r\n");
      out.write("                </td>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"row\"><div align=\"right\"></div></th>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"row\">&nbsp;</th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"submit\" name=\"Submit\" value=\"Register\" onclick=\"return doJob()\" />\r\n");
      out.write("                        <input type=\"Reset\" name=\"Reset\" value=\"Cancel\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");

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
