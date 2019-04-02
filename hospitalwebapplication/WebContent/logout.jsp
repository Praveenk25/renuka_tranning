<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout Page</title>
</head>
<body>
<%
  request.getSession().invalidate();
  response.sendRedirect(request.getContextPath() + "/login.jsp");

  %> 
</body>
</html>