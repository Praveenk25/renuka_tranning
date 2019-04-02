<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>User Page</title>
 <link rel = "stylesheet"
   type = "text/css"
   href = "cssStyling/homepage.css" />
</head>
<%
if ((request.getSession(false).getAttribute("User") == null)) {
%>
<jsp:forward page="/login.jsp"></jsp:forward>
<%
	}
%>
<body>
	<div align="center">
		<h1>User's Home</h1>
	<form action="homepage.html" method = "get" >
		<p align="right"><input type = "submit" value="HomePage"></p>
		<p align="right"><button onclick="logout()">Logout</button></p>
		</form> 
<h1>Welcome
	<%=request.getAttribute("username")%></h1>
	</div>
	<div align="left">
	    <a href="<%=request.getContextPath()%>/ViewDoctorServlet">SHOW DOCTOR</a><br>
	    <br>
	    <a href="<%=request.getContextPath()%>/patientregister.jsp">ADD PATIENT</a><br>
	    <br>
	</div>

</body>
</html>