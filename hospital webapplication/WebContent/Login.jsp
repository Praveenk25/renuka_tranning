<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date" errorPage="LoginError.html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
</head>
<body>
	<form name="form" action="<%=request.getContextPath() %>>/LoginServlet"
		method="post">

		<table align="center">

			<tr>
				<td>UserName</td>
				<%-- Taking UserName for Login --%>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
			    <td><input type="submit" value="Login"></input></td>
			    <td><button type="button">Register</button></td>
			    <td>Today's date: <%= (new java.util.Date()).toInstant()%></td>
			</tr>
		</table>
	</form>
</body>
</html>