<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link rel = "stylesheet"
   type = "text/css"
   href = "cssStyling/homepage.css" />
   
<title>Patient Added Successfully</title>
</head>
<body>
	<div align="center">
		<b>Added Successfully!!!!</b><br>
		<br>
		<a href="<%=request.getContextPath()%>/patientregister.jsp">ADD MORE PATIENT</a><br>
		<br>
		<a href="<%=request.getContextPath()%>/user.jsp">CLICK HERE TO GO BACK</a><br>
		
	</div>
</body>
</html>