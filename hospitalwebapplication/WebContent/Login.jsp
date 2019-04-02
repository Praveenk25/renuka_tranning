<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date"
	import="com.itt.hospital.constants.Constants"
	errorPage="loginerror.html"%>
<!DOCTYPE html>
<html>
<head>
<title>login</title>
 <link rel = "stylesheet"
   type = "text/css"
   href = "cssStyling/homepage.css" />
</head>
       <marquee>
			<b><%=welcomemsg%></b>
		    </marquee>
<body>
	<div align="center">
		<form name="form" action="<%=request.getContextPath()%>/LoginServlet"
			method="post">
			<%!String welcomemsg = Constants.WELCOME_MSG;%>
			<table>
				<tr>
					<td><b>Username</b></td>
					<%-- Taking UserName for Login --%>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td><b>Password</b></td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"></input></td>
					<td><a href="register.jsp"><b>New User!!! Click here
								to Register</b></a> <br>
					<td><b>Today's date: <%=(new java.util.Date()).toInstant()%></b></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>