<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored = "false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${Header }</h1>
	<p>${Description }</p>
	<h1 style="green">${msg }</h1>
	<hr>
	<h1>Welcome, ${user.userName }</h1>
	<h1>Your email address is ${user.email }</h1>
	<h1>Your password is ${user.password } try to secure the password</h1>
</body>
</html>