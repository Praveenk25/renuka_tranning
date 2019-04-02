<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.sql.ResultSet"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet"
   type = "text/css"
   href = "cssStyling/homepage.css" />
<title>View Doctor</title>
</head>
<body>
<h1>Doctors Available in hospital</h1>
<table border="1" align="center">
<tr>
<td>ID</td>
<td>DOCTOR NAME</td>
<td>DOCTOR SPECIALITY</td>
</tr>
<%	ResultSet rs=(ResultSet)request.getAttribute("rs");
if (rs != null) {
	while (rs.next()) {
				%>
				<tr>
<td><%=rs.getInt(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
</tr>
<%
}
}
%>
</table>
<form action="homepage.html" method = "get" >
		<p align="left"><input type = "submit" value="HomePage"></p>
		<p align="right"><button onclick="logout()">Logout</button></p>
		</form> 		
</body>
</html>