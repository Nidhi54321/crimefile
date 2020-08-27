package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javazoom.sendmail.Keys;
import javazoom.sendmail.ComposeBean;
import java.util.*;

public final class compose_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static List _jspx_dependants;

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
      			"errorhandler.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      javazoom.sendmail.ComposeBean composebean = null;
      synchronized (session) {
        composebean = (javazoom.sendmail.ComposeBean) _jspx_page_context.getAttribute("composebean", PageContext.SESSION_SCOPE);
        if (composebean == null){
          composebean = new javazoom.sendmail.ComposeBean();
          _jspx_page_context.setAttribute("composebean", composebean, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("composebean"), "smtpserver", "smtp.yourcompany.com", null, null, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("composebean"), "allowattachment", "false", null, null, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("composebean"), "to", "support@yourcompany.com", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
 String PREURI = request.getContextPath()+request.getServletPath().substring(0,request.getServletPath().lastIndexOf("/")); 
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<LINK REL=STYLESHEET TYPE=\"text/css\" HREF=\"styles.css\">\r\n");
      out.write("<script language=\"JavaScript\"><!--\r\n");
      out.write("function sendmail()\r\n");
      out.write("{\r\n");
      out.write("  document.compose.submit();\r\n");
      out.write("}\r\n");
 if (composebean.getAllowattachment()) {
      out.write("\r\n");
      out.write("function attachform()\r\n");
      out.write("{\r\n");
      out.write("  document.compose.action=\"");
      out.print( response.encodeURL(PREURI+Keys.ATTACHFORM+"?nocache="+System.currentTimeMillis()) );
      out.write("\";\r\n");
      out.write("  document.compose.submit();\r\n");
      out.write("}\r\n");
 } 
      out.write("\r\n");
      out.write("function checkForm()\r\n");
      out.write("{\r\n");
      out.write("  var field = \"");
      out.print( request.getAttribute(Keys.ERRORKEY));
      out.write("\";\r\n");
      out.write("  if (field != \"");
      out.print( ComposeBean.NOERROR );
      out.write("\")\r\n");
      out.write("  {\r\n");
      out.write("    alert(\"");
      out.print( request.getAttribute(Keys.ERRORMSGKEY));
      out.write("\");\r\n");
      out.write("    document.compose.");
      out.print( request.getAttribute(Keys.ERRORKEY));
      out.write(".focus();\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("<title>Contact technical support</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("\tcolor: #990033;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".style2 {color: #FFFFFF}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#CC6633\" onLoad=\"checkForm()\">\r\n");
      out.write("<span class=\"style2\"></span>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td bgcolor=\"#EEEEEE\">\r\n");
      out.write("      <table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("        <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("          <td><font face=\"Arial, Helvetica, sans-serif\" size=\"-2\"><a href=\"../blank/index.html\"></a></font></td>\r\n");
      out.write("          <td align=\"center\"><span class=\"style1\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Crimefile Management  : Email to support\r\n");
      out.write("            <font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>contact</b></font></font></span></td>\r\n");
      out.write("          <td align=\"right\"><font face=\"Arial, Helvetica, sans-serif\" size=\"-2\"><a href=\"../resume/index.html\"></a></font></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<hr noshade size=\"1\">\r\n");
      out.write(" <form name=\"form1\" method=\"post\" action=\"mailsent.jsp\">\r\n");
      out.write("\r\n");
      out.write("  <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" width=\"542\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>&nbsp;</td>\r\n");
      out.write("      <td align=\"center\" class=\"Field\"><p>&nbsp;</p>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td bgcolor=\"#EEEEFF\" align=\"center\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td bgcolor=\"#EEEEEE\">&nbsp; </td>\r\n");
      out.write("      <td align=\"center\" valign=\"top\">\r\n");
      out.write("        <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#FFFFFF\">\r\n");
      out.write("              <table border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"15%\" align=\"right\" nowrap class=\"MandatoryField\">To\r\n");
      out.write("                    : </td>\r\n");
      out.write("                  <td>\r\n");
      out.write("                    <input type=\"text\" name=\"to\" value =\"crimestation@gmail.com\"/>                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"15%\" align=\"right\" nowrap class=\"MandatoryField\">From\r\n");
      out.write("                    : </td>\r\n");
      out.write("                  <td>\r\n");
      out.write("                    <input type=\"text\" name=\"from\" >                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"15%\" align=\"right\" nowrap class=\"Field\">CC\r\n");
      out.write("                    : </td>\r\n");
      out.write("                  <td>\r\n");
      out.write("                    <input type=\"text\" name=\"cc\" >                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"15%\" align=\"right\" class=\"MandatoryField\">Bcc\r\n");
      out.write("                    : </td>\r\n");
      out.write("                  <td><input type=\"text\" name=\"bcc\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"15%\" align=\"right\" class=\"MandatoryField\">Subject\r\n");
      out.write("                    : </td>\r\n");
      out.write("                  <td>\r\n");
      out.write("                    <input type=\"text\" name=\"subject\" >                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr align=\"center\">\r\n");
      out.write("                  <td colspan=\"2\" class=\"Field\">&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table>            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#FFFFFF\"><textarea name=\"msg\" cols=\"54\" rows=\"8\" wrap=\"HARD\" />\r\n");
      out.write("            \r\n");
      out.write("            </textarea>            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#EEEEEE\"><label>\r\n");
      out.write("              <input type=\"submit\" name=\"Submit\" value=\"send\">\r\n");
      out.write("              <input type=\"reset\" name=\"Submit2\" value=\"clear\">\r\n");
      out.write("            </label></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td valign=\"top\" bgcolor=\"#EEEEEE\">\r\n");
      out.write("        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td nowrap>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("              <hr noshade size=\"1\">\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"homelink\" align=\"center\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\" >&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</form>\r\n");
      out.write("<hr noshade size=\"1\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"center\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">cfms</font><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">\r\n");
      out.write("      &copy; Copyright  2005-2009</font></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
