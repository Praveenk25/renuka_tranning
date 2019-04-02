<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="com.itt.hospital.constants.Constants" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Register Page</title>
<link rel="stylesheet" href="cssStyling/registerstyle.css">
</head>
<body>
	<div align="center">
		<form name="form"
			action="<%=request.getContextPath()%>/RegisterServlet" method="post">
			<table>
				<tr>
					<%!String welcomemsg = Constants.PROVIDE_DETAILS;%>
					<%=welcomemsg%>
				<tr>
					<td><b>Full Name</b></td>
					<td><input type="text" name="full_name" required="required" maxlength="30" /></td>
				</tr>
				<tr>
					<td><b>Email</b></td>
					<td><input type="email" name="email" required="required" /></td>
				<tr>
				<tr>
					<td><b>UserName</b></td>
					<td><input type="text" name="username" required="required"  maxlength="30"  /></td>
				</tr>
				<tr>
					<td><b>Password</b></td>
					<td><input type="password" name="password" required="required"  maxlength="30"  /></td>
				</tr>
				<tr>
					<td><b>Role</b></td>
					<td><select name="role">
							<option value="User">User</option>
					</select></td>
				</tr>
				<td><input type="submit" value="Register"></input></td>
			</table>
		</form>
	</div>
</body>
</html>
