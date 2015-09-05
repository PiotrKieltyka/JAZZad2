<%@ page import="java.util.Map"%>
<%@ page import="main.java.model.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="javax.servlet.ServletContext" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
    ServletContext context = request.getServletContext();
    HashMap<String, userMod> userRepo = (HashMap<String, userMod>) context.getAttribute("userRepo");
%>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Select your next step</title>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Arimo:light">
    <style>
	      body {
    	    font-family: 'Arimo', serif;
        	font-size: 20px;
      		}
    </style>
</head>
<body>
	<table width="500px" align="center" style="margin-top:15px">
		<tr>
		<td>

                <div><h1>Choose who should have Premium access</h1></div>

                <div><h3>List of Standard users</h3>
                <table cellpadding="10px">
                            <%
                                for (Map.Entry<String, userMod> entry : userRepo.entrySet()) {
                                    userMod user = entry.getValue();

                                    if (!user.getPremium()) {
                                        out.println("<tr><td>");
                                        out.println("<b>Username: </b>" + user.getUsername());
                                        out.println("</td><td><b>Email: </b>" + user.getEmail());
                                        out.println("</td><td><a href='Premium?username=" + user.getUsername() + "&premium=yes'>Start Premium access</a>");
                                        out.println("</td></tr>");
                                    }
                                }    
                                %>
                    </table>
                </div>
                <div><h3>List of Premium users</h3>
                <table cellpadding="10px">
                            <%
                                for (Map.Entry<String, userMod> entry : userRepo.entrySet()) {
                                    userMod user = entry.getValue();

                                    if (user.getPremium()) {
                                        out.println("<tr><td>");
                                        out.println("<b>Username: </b>" + user.getUsername());
                                        out.println("</td><td><b>Email: </b>" + user.getEmail());
                                        out.println("</td><td><a href='Premium?username=" + user.getUsername() + "&premium=no'>Stop Premium access</a>");
                                        out.println("</td></tr>");
                                    }
                                }    
                            %>
                </table>
                </div>
                    
            <p>
                <a href='main_menu.jsp'>Back</a>
            </p>        
                    
		</td>
		</tr>
	</table>
</body>
</html>