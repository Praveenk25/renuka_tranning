<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link rel = "stylesheet"
   type = "text/css"
   href = "cssStyling/homepage.css" />
<title>Admin Page</title>
<script type="text/javascript" src= "javaScript/logout.js"></script> 
</head>
<% %>
<%
	if ((request.getSession(false).getAttribute("Admin") == null)) {
%>
<jsp:forward page="/login.jsp"></jsp:forward>
<%
	}
%>
<body>
	<div align="center">
		<h1>Admin's Home</h1>
		<form action="homepage.html" method = "get" >
		<p align="right"><input type = "submit" value="HomePage"></p>
		<p align="right"><button onclick="logout()">Logout</button></p>
		</form> 		
<h1>Welcome
	<%=request.getAttribute("username")%><br></h1>
	<br>
	</div>
	<div align="left">
		<a href="<%=request.getContextPath()%>/adddoctor.jsp">ADD DOCTOR</a><br>
		<br>
		<a href="<%=request.getContextPath()%>/ViewDoctorServlet">SHOW DOCTOR</a><br>
		<br>
		<a href="<%=request.getContextPath()%>/ViewPatientServlet">SHOW PATIENT</a><br>
		</div>
</body>
</html>