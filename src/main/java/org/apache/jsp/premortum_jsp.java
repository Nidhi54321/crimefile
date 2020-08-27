package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class premortum_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Crimefile Management</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("function doValue()\n");
      out.write("{\n");
      out.write(" var a=document.getElementById(\"prn\");\n");
      out.write("  var b=document.getElementById(\"psn\");\n");
      out.write("  var c=document.getElementById(\"dn\");\n");
      out.write("  var d=document.getElementById(\"ps\");\n");
      out.write("  var e=document.getElementById(\"date\");\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  if(a.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the premortem no\");\n");
      out.write("\ta.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("  \n");
      out.write("   if(b.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the postmortem no\");\n");
      out.write("\tb.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t if(c.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the doctor's name\");\n");
      out.write("\tc.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("   if(d.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the police station\");\n");
      out.write("\td.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t if(e.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the premortem date\");\n");
      out.write("\te.focus();\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<form id=\"form1\" name=\"form1\" method=\"post\" action=\"premortemaction.jsp\">\n");
      out.write("<table width=\"432\" border=\"1\" align=\"center\">\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"48\" colspan=\"2\"><div align=\"center\"><strong>PREMORTEM DETAILS</strong></div></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"186\" height=\"40\"><div align=\"right\">Premortem No:</div></td>\n");
      out.write("    <td width=\"230\"><label>\n");
      out.write("      <input type=\"text\" name=\"prn\" id=\"prn\" />\n");
      out.write("    </label></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"41\"><div align=\"right\">Postmortem No:</div></td>\n");
      out.write("    <td><label>\n");
      out.write("    <input type=\"text\" name=\"psn\" id=\"psn\" />\n");
      out.write("    </label></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"48\"><div align=\"right\">Doctors Name:</div></td>\n");
      out.write("    <td><label>\n");
      out.write("    <input type=\"text\" name=\"dn\" id=\"dn\" />\n");
      out.write("    </label></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"49\"><div align=\"right\">Police Station:</div></td>\n");
      out.write("    <td><label>\n");
      out.write("    <input type=\"text\" name=\"ps\" id=\"ps\" />\n");
      out.write("    </label></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"40\"><div align=\"right\">Premortem Date:</div></td>\n");
      out.write("    <td><label>\n");
      out.write("    <input type=\"text\" name=\"da\" id=\"da\" />\n");
      out.write("    </label></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"42\" colspan=\"2\">\n");
      out.write("      <label>\n");
      out.write("        <div align=\"center\">\n");
      out.write("          <input type=\"submit\" name=\"button\" id=\"button\" value=\"Save\" onclick=\"return doValue()\" />\n");
      out.write("          <label>\n");
      out.write("          <input type=\"reset\" name=\"Reset\" value=\"Reset\" />\n");
      out.write("          </label>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      </label>       </td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</form> \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
