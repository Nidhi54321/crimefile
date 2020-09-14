
<%@page import="java.io.*,java.sql.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link href="default.css" rel="stylesheet" type="text/css" />
        
        
        <style type="text/css">
            <!--
            .style1 {
                color: #CC9999;
                font-weight: bold;
            }
            .style4 {
                color: #C14744;
                font-weight: bold;
            }
.style5 {color: #990000}
            -->
        </style>
    </head>
    <body>
        <div id="header">
            <div id="logo">
                <h1>CrimeStation</h1>
                <h2>within the hands of safe </h2>
            </div>
            <div id="menu">
                <ul>
                    <li class="active"><a href="adminhome.html">Adminhome </a></li>
			<li><a href="viewusercomplaint.jsp">Usercomplaint </a></li>
			<li><a href="viewusercrime.jsp">Usercrime</a></li>
			<li><a href="viewcontacts.jsp">Contacts</a></li>
			<li><a href="login.jsp">Logout</a></li>
                </ul>
            </div>
        </div>
        <div id="content">
            
            <div id="colOne">
                <h2>Welcome to crimeStation!</h2>
               
                                    
                                    <span class="style4">        </span>
                                    <form id="form1" method="post" action="viewfeedback.jsp">
                                        <%
            try {

                Class.forName("org.postgresql.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("jdbc:postgresql://localhost/crimefile", "crimefile", "root");
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery("select * from feedback");
                String name1 = "", email1 = "", message1 = "";
                                        %>          
                                        
                                        <table width="485" height="49" border="1">
                                            <tr>
                                                <td width="86" height="43" ><span class="style5">Name</span></td>
                                                <td width="89"><span class="style5">Email</span></td>
                                                <td width="222"><span class="style5">Message</span></td>
                                            </tr>
                                            <%
                                            while (rs.next()) {
                                               name1 = rs.getString("name");
                                               email1 = rs.getString("email");
                                               message1 = rs.getString("message");
                                                
                                                out.println("<tr>");
                                                out.println("<td>" + name1 + "</td>");
                                                out.println("<td>" + email1 + "</td>");
                                                out.println("<td>" + message1 + "</td>");
                                                                                               
												out.println("<td><a href='feedbackdelete.jsp?email=" +email1+"'>Delete</a></td>");
                                                out.println("<tr>");
                                            }
                                            %>
                                        </table>
                                        
                                    </form>
                                    <%

            } catch (Exception e) {
                out.println(e);
            }
                                    %>
                              <span class="style4">
                                  <p>&nbsp;</p>
                              </span></div></td>
                       
            </div>
            <div id="colTwo">
                <ul>
                    <li>
                        <div align="center"><strong> 
                            </strong>
                        </div>
                        
                    </li>
                    <li>
                        <h2>New Additions</h2>
                        <ul>
                            <li><a href="newadmin.jsp">New admin </a></li>
					<li><a href="hotnews.jsp">Hot News </a></li>
					<li><a href="viewhotnews.jsp">View Hot News </a></li>
					<li><a href="viewfeedback.jsp">View Feedback </a></li>
					<li><a href="mostwanted.jsp">Most Wanted </a></li>
					<li><a href="viewadminwanted.jsp">View/Delete MostWanted </a></li>
					<li><a href="missingperson.jsp">Missing Persons </a></li>
					<li><a href="viewadminmissing.jsp">View/Delete Missing Persons </a></li>
					<li><a href="criminalregister.jsp">Criminal Register </a></li>
					<li><a href="prisonerreg.jsp">Prisoners Register </a></li>
					<li><a href="prisonerreport.jsp">ViewPrisonerReport </a></li>
					<li><a href="history.jsp">History</a></li>
					<li><a href="viewhistory.jsp">View History</a></li>
					<li><a href="fir.jsp">FIR</a></li>
					<li><a href="firreport.jsp">FIR Report</a></li>
                        </ul>
                    </li>
                    <li>
                        <h2>Account Settings </h2>
                        <ul>
                           <li><a href="adminchangepass.jsp">Change Password </a></li>
					<li><a href="criminalreport.jsp">All CriminalReport </a></li>
                        </ul>
                    </li>
                    <li>
                        <h2>More Facilities </h2>
                        <ul>
                            <li><a href="chat.jsp">Chat</a></li>
                            <li><a href="compose.jsp">Mail</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
        <div id="footer">
            <p>Copyright &copy; 2020 cfm.</p>
        </div>
    </body>
</html>
