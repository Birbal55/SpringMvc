<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.time.LocalDateTime;  " %>
<%@page isELIgnored = "false" %> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>

	<%
		/* String name = (String)request.getAttribute("name");
		Integer rollnumber = (Integer)request.getAttribute("rollnumber");
		LocalDateTime time = (LocalDateTime)request.getAttribute("time"); */
	%>
	<h1>Hello , This is
	<%-- <%=name %> --%>
	${name }
	</h1>
	<h1>my rollnumber is 
	<%-- <%=rollnumber %> --%>
	${rollnumber }
	</h1>
	<h1>Date And Time is 
	<%-- <%=time.toString() %> --%>
	${time }
	</h1>
	<hr>
	<c:forEach var="item" items="${marks }">
		<%-- <h1>${item }</h1> --%>
		<h1><c:out value="${item }"></c:out></h1>
	</c:forEach>
</body>
</html>