package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\r\n");
      out.write("\t\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("\r\n");
      out.write("\t<title>Crimefile Management</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" charset=\"utf-8\" />\r\n");
      out.write("\t\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("\tcolor: #F67637;\r\n");
      out.write("\tfont-family: \"Monotype Corsiva\";\r\n");
      out.write("\tfont-size: 34px;\r\n");
      out.write("}\r\n");
      out.write(".style72 {color: #D6A55C}\r\n");
      out.write("-->\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\t<div id=\"body\">\r\n");
      out.write("\t\t<div id=\"head\"></div>\r\n");
      out.write("\t\t<div id=\"topnav\">\r\n");
      out.write("\t\t\t<a href=\"contactus.jsp\">Contact Us</a> | <a href=\"http://www.google.com\">Google</a>\t\t</div>\r\n");
      out.write("\t\t<h1><img src=\"images/logo.jpg\" width=\"401\" height=\"271\" alt=\"Logo\" /></h1>\r\n");
      out.write("\t\t<div id=\"nav\"><a href=\"index.html\"><img src=\"images/m1.gif\" width=\"101\" height=\"65\" alt=\"M1\" /></a>\r\n");
      out.write("\t\t<a href=\"http://www.freewebsitetemplates.com\"><img src=\"images/m2.gif\" width=\"97\" height=\"65\" alt=\"M2\" /></a>\r\n");
      out.write("\t\t\t<a href=\"FAQ.html\"><img src=\"images/m3.gif\" width=\"97\" height=\"65\" alt=\"M3\" /></a>\r\n");
      out.write("\t\t\t<a href=\"index.html\"><img src=\"images/m4.gif\" alt=\"M4\" width=\"97\" height=\"65\" border=\"0\" /></a>\r\n");
      out.write("\t\t\t<a href=\"aboutus .html\"><img src=\"images/m5.gif\" width=\"94\" height=\"65\" alt=\"M5\" /></a>\t\t</div>\r\n");
      out.write("\t\t<div id=\"left-box\">\r\n");
      out.write("\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t<object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0\" width=\"271\" height=\"132\">\r\n");
      out.write("                  <param name=\"movie\" value=\"images/home_flash.swf\" />\r\n");
      out.write("                  <param name=\"quality\" value=\"high\" />\r\n");
      out.write("                  <embed src=\"images/home_flash.swf\" quality=\"high\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" type=\"application/x-shockwave-flash\" width=\"271\" height=\"132\"></embed>\r\n");
      out.write("\t\t\t  </object>\r\n");
      out.write("\t\t\t\t<p>&nbsp;</p>\r\n");
      out.write("\t\t\t    <p>Already a registered member???</p>\r\n");
      out.write("\t\t\t\t<p class=\"date\"><a href=\"login.jsp\">Login Here </a></p><br /><br />\r\n");
      out.write("\t\t\t\t<p>Not a registered member???<br />  <a href=\"newregister.jsp\">SignUp Here</a>.</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div id=\"content-bot\">\r\n");
      out.write("\t\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t\t<table width=\"422\" border=\"0\" align=\"center\">\r\n");
      out.write(" \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"188\" height=\"40\"><div align=\"right\" class=\"style73\">E-mail:</div></td>\r\n");
      out.write("    <td width=\"218\">\r\n");
      out.write("     <a href=\"compose.jsp\" class=\"style73\"><strong>crimefilemanagement@gmail.com</strong></a>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"42\"><div align=\"right\" class=\"style73\">Fax:</div></td>\r\n");
      out.write("    <td><div align=\"center\" class=\"style71\">\r\n");
      out.write("      001-434343  </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"58\"><div align=\"right\" class=\"style73\">Address:</div></td>\r\n");
      out.write("    <td><p align=\"center\" class=\"style69\">Crime Station </p>\r\n");
      out.write("      <p align=\"center\" class=\"style70\"><strong>U.C Building, Sasthraji Nagar</strong></p>\r\n");
      out.write("      <p align=\"center\" class=\"style70\"><strong>Banglore-01 </strong></p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table> \r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t\t<div id=\"tray\">\r\n");
      out.write("\t\t\t<div class=\"redbox first\">\r\n");
      out.write("\t\t    <object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0\" width=\"217\" height=\"279\">\r\n");
      out.write("              <param name=\"movie\" value=\"images/mw.swf\" />\r\n");
      out.write("              <param name=\"quality\" value=\"high\" />\r\n");
      out.write("              <embed src=\"images/mw.swf\" quality=\"high\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" type=\"application/x-shockwave-flash\" width=\"217\" height=\"279\"></embed>\r\n");
      out.write("            </object>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"redbox\">\r\n");
      out.write("\t\t\t\t<h2 align=\"center\" class=\"style1\">Hot Reports </h2>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t <div> <span class=\"style13\">\r\n");
      out.write("\t\t\t     <marquee behavior=\"scroll\" direction=\"up\" scrolldelay=\"0.08\">\r\n");
      out.write("\t\t\t     <span class=\"style72\">\t\t\t     Six criminal drug addictes were found on Wednesday from a house near Capro building in US. Two of them were evacuated to a hospital\t\t         </span>\r\n");
      out.write("\t\t\t     </marquee>\r\n");
      out.write("\t\t\t\t </span>  \t\t\t\t</div> \r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t  <a href=\"http://www.freewebsitetemplates.com\"></a>\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"redbox last\">\r\n");
      out.write("\t\t\t  <object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0\" width=\"217\" height=\"279\">\r\n");
      out.write("                  <param name=\"movie\" value=\"images/missing.swf\" />\r\n");
      out.write("                  <param name=\"quality\" value=\"high\" />\r\n");
      out.write("                  <embed src=\"images/missing.swf\" quality=\"high\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" type=\"application/x-shockwave-flash\" width=\"217\" height=\"279\"></embed>\r\n");
      out.write("\t\t\t  </object>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t<div class=\"divider\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\tCopyright @ 2009, <a href=\"http://www.crimefilemanagement.com\">www.cfm.com</a>, All rights Reserved.\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style68 {color: #000000}\r\n");
      out.write(".style69 {\r\n");
      out.write("\tfont-size: 14;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #CCCCCC;\r\n");
      out.write("}\r\n");
      out.write(".style70 {\r\n");
      out.write("\tfont-size: 14;\r\n");
      out.write("\tcolor: #CCCCCC;\r\n");
      out.write("}\r\n");
      out.write(".style71 {\r\n");
      out.write("\tcolor: #CCCCCC;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
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
