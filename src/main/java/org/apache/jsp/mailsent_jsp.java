package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class mailsent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<LINK REL=STYLESHEET TYPE=\"text/css\" HREF=\"styles.css\">\n");
      out.write("<title>Email support</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#FFFFFF\" text=\"#000000\">\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;    </p>\n");
      out.write("    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td bgcolor=\"#EEEEEE\">\n");
      out.write("      <table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\n");
      out.write("        <tr bgcolor=\"#FFFFFF\">\n");
      out.write("          <td><font face=\"Arial, Helvetica, sans-serif\" size=\"-2\"><a href=\"../blank/\"></a></font></td>\n");
      out.write("          <td align=\"center\"><font color=\"#FF0000\" face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>CrimeFile Management  :<font color=\"#CC0000\"> <font color=\"#FF0000\">Email to support\n");
      out.write("            </font></font><font color=\"#FF0000\" face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>contact</b></font></b></font></td>\n");
      out.write("          <td align=\"right\"><font face=\"Arial, Helvetica, sans-serif\" size=\"-2\"><a href=\"../resume/\"></a></font></td>\n");
      out.write("        </tr>\n");
      out.write("      </table>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<hr noshade size=\"1\">\n");
      out.write("<br>\n");
      out.write("<br>\n");

            try {
                String userid = request.getParameter("name");
                String em = request.getParameter("email");
                 String sub = request.getParameter("subject");
                  String mess = request.getParameter("msg");
                 
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefile", "root", "");
                Statement st = con1.createStatement();
                //Statement st1 = con1.createStatement();
                st.executeUpdate("insert into mail values('" + userid + "','" + em + "' ,'" + sub + "' ,'" + mess + "' )");
               // st1.executeUpdate("insert into register values('" + logname + "','" + fname + "','" + midname + "','" + question + "','" + answer + "','" + org + "','" + address + "','" + city + "','" + state + "'," + postcode + ",'" + country + "'," + hphone + "   ," + mphone + ",'" + fax + "','" + account + "','" + select4 + "','" + birthday + "','" + email + "')");
                out.println("Thank You , mail"  + userid +  " has been succesfully send to crimefile@gmail.com ");



            } catch (Exception e) {
                out.println(e);
            }



      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<hr noshade size=\"1\">\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">cyberspace</font><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">\n");
      out.write("      &copy; Copyright  2019-2020</font></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<p>&nbsp;</p>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
