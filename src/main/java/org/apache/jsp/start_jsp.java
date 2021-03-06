package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import sukhwinder.chat.*;

public final class start_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String roomname = request.getParameter("rn");
	String nickname = (String)session.getAttribute("nickname");
	ChatRoomList roomlist = (ChatRoomList) application.getAttribute("chatroomlist");
	if (nickname == null)
	{
		response.sendRedirect("chatlogin.jsp");
	}
	else if (roomname == null)
	{
		response.sendRedirect("listrooms.jsp");
	}
	else
	{
		ChatRoom chatRoom = roomlist.getRoom(roomname);
		if (chatRoom == null)
		{
			out.write("<font color=\"red\" size=\"+1\">Room " + roomname + " not found</font>");
			out.close();
			return;
		}
		ChatRoom chatRoomOld = roomlist.getRoomOfChatter(nickname);
		if (chatRoomOld != null && chatRoom != null)
		{
			Chatter chatter = chatRoomOld.getChatter(nickname);
			
			if (!chatRoomOld.getName().equals(chatRoom.getName()))
			{
				chatRoomOld.removeChatter(nickname);
				chatRoom.addChatter(chatter);
				if (!chatRoomOld.getName().equalsIgnoreCase("StartUp"))
				{
					chatRoomOld.addMessage(new Message("system", nickname + " has left and joined " + 	chatRoom.getName() + ".", new java.util.Date().getTime()));
				}
				chatRoom.addMessage(new Message("system", nickname + " has joined.", new java.util.Date().getTime()));
				chatter.setEnteredInRoomAt(new java.util.Date().getTime());

			}

			if (session.getAttribute("nickname") == null)
			{
				session.setAttribute("nickname", nickname);
			}
			response.sendRedirect("chat.jsp");
		}
		else
		{
			out.write("<span class=\"error\">Some error occured");
		}
	}	

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
