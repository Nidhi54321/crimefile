<%@ page import="java.io.*,java.sql.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License
-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="default.css" rel="stylesheet" type="text/css" />
<script language="javascript">
function doCheck()
{
  var a=document.getElementById("username");
  var b=document.getElementById("password");
  var c=document.getElementById("conpass");
  var d=document.getElementById("name");
  var e=document.getElementById("desig");
  var f=document.getElementById("offadd");
  var g=document.getElementById("phno");
  var h=document.getElementById("address");
  var i=document.getElementById("pincode");
 var j=document.getElementById("phoneno");
  var k=document.getElementById("email");

  if(a.value == "")
  {
    alert ("enter the username");
	a.focus();
	return false;
	}
  
    if(b.value == "")
  {
    alert ("enter the password");
	b.focus();
	return false;
	}
	
	else if((b.value.length)<6)   
	{
	 alert("password should contain atleast 6 characters ");
	 b.focus();
 return false;
	 }
	
  if(c.value == "")
  {
    alert ("enter the confirm password");
	c.focus();
	return false;
	}
	
		   if((c.value)!=(b.value))
		   {
		   alert("Re-enter the password");
		   c.focus();
		   return false;
	}
		   
	
	
	
	
  if(d.value == "")
  {
    alert ("enter the name");
    d.focus();
	return false;
	}
	
	
	
	
	 if(e.value == "")
  {
    alert ("enter the designation");
	e.focus();
	return false;
	}
	 
	 
	  if(f.value == "")
  {
    alert ("enter the official address");
	f.focus();
	return false;
	}
  
    if(g.value == "")
  {
    alert ("enter the phone no:");
    g.focus();
	return false;
	}
	
	
	
	
	
	  if(h.value == "")
  {
    alert ("enter the address");
	h.focus();
	return false;
	}

  if(i.value == "")
  {
    alert ("enter the pincode");
	i.focus();
	return false;
	}
	
	 else if(!parseInt(i.value))
		{    
                    alert("Enter Integer");
		    return false;	
		}
              else if(((i.value.length)>6))
	        {
	               alert("Pin no: should contain 6 integers ");  	            
	               i.focus();
	               return false;
                 }
	
  if(j.value == "")
  {
    alert ("enter the phone number");
	j.focus();
	return false;
	}
   else if(!parseInt(j.value))
		{    
                    alert("Enter valid Phone number ");
		    return false;	
		}
            else if(((j.value.length)<6) || ((j.value.length)>11))
	                     {
	               alert("Phone no should contain atleast 6 integers ");  
	            
	               j.focus();
                        return false;
	                  }                 
  
    if(k.value == "")
  {
    alert ("enter the email");
	k.focus();
	return false;
	}
	
	 else if(k.value.indexOf('@')==-1)
		      {
		       alert("Use @ email correctly");
		       k.focus();
		       return false;
		      }
	
	  else if(k.value.indexOf('.')==-1)
		       {
		        alert("Use . email correctly");
		        k.focus();
		        return false;
		       }
	

  }
  </script>

<style type="text/css">
<!--
.style1 {
	color: #CC9999;
	font-weight: bold;
}
.style6 {color: #CC0033}
.style10 {color: #CC0033; font-weight: bold; }
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
		<div>
                                        <%
            try {

                Class.forName("org.postgresql.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("jdbc:postgresql://localhost/crimefile", "crimefile", "root");
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery("select district,Datc,time,typeofinformation,placeofoccurence,foreignlocal,act,firno from FIR");
                String district = "", Datc = "", time = "",typeofinformation="",placeofoccurence="",foreignlocal="",act="",firno="";
                                        %>          
                                        
                                        <table width="485" height="28" border="0">
                                            <tr>
                                                <td width="86" height="22" ><div align="center"><span class="style6"><strong>District</strong></span></div></td>
                                                <td width="89"><div align="center" class="style10">Date</div></td>
                                                <td width="222"><div align="center"><span class="style6"><strong>Typeofinfor</strong></span></div></td>
												 <td width="222"><div align="center" class="style6"><strong>Placeofoccur </strong></div></td>
												  <td width="222"><div align="center" class="style6"><strong>F/Local </strong></div></td>
												 <td width="222"><div align="center" class="style6"><strong>Act </strong></div></td>
												 <td width="222"><div align="center" class="style6"><strong>FIR </strong></div></td>
                                            </tr>
                                            <%
                                            while (rs.next()) {
                                              district = rs.getString("district");
                                               Datc  = rs.getString("Datc");
                                              time= rs.getString("time");
											  typeofinformation = rs.getString("typeofinformation");
											   placeofoccurence = rs.getString("placeofoccurence");
                                               foreignlocal  = rs.getString("foreignlocal");
                                              act= rs.getString("act");
											  firno = rs.getString("firno");
                                                
                                                out.println("<tr>");
                                                out.println("<td>" + district + "</td>");
                                                out.println("<td>" + Datc + "</td>");
                                                out.println("<td>" +  time + "</td>");
                                                out.println("<td>" +  typeofinformation + "</td>");
												out.println("<td>" + placeofoccurence + "</td>");
                                                out.println("<td>" + foreignlocal + "</td>");
                                                out.println("<td>" +  act + "</td>");
                                                out.println("<td>" + firno + "</td>");                                               
                                                out.println("<tr>");
                                            }
                                            %>
           </table>
				 <%

            } catch (Exception e) {
                out.println(e);
            }
                                    %>
		</div>
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
					<li><a href="missingperson.jsp">Missing Persons </a></li>
					<li><a href="viewadminmissing.jsp">View Missing Persons </a></li>
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
	<p>Copyright &copy; 2020 cfm. </p>
</div>
</body>
</html>

