<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.List" %>
    <%@ page import = "com.itt.hospital.pojo.Patient" %>
    <%@ page import = "java.util.Iterator" %>
<!DOCTYPE html>
<html>
<head>
<title>Patient View</title>
<link rel = "stylesheet"
   type = "text/css"
   href = "cssStyling/homepage.css" />
</head>
<body >
<div align="center">
<h1>Patient Available in Hospital</h1>
</div>
<table border="1" align="center">
<tr>
<td>ID</td>
<td>PATIENT NAME</td>
<td>PATIENT AGE</td>
<td>PATIENT GENDER</td>
<td>PATIENT DISEASE</td>
</tr>
	<% List patient1 = (List)request.getAttribute("list");
	for (Iterator<Patient> iterator = patient1.iterator(); iterator.hasNext();) {
		Patient patient = (Patient) iterator.next();%>
		<tr>
		<td><%= ( patient.getId())%></td>
		<td><%= ( patient.getPatientName())%></td>
		<td><%= ( patient.getPatientAge())%></td>
		<td><%= ( patient.getPatientGender())%></td>
		<td><%= (patient.getDisease())%></td>
		</tr>
	<%
	}
	%>
	</table>
	<form action="homepage.html" method = "get" >
		<p align="left"><input type = "submit" value="HomePage"></p>
		<p align="right"><button onclick="logout()">Logout</button></p>
		</form> 		
</body>
</html>