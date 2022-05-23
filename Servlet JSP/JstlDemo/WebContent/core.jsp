<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
	<h1>JSTL Core</h1>
	
	<c:set var="age" value="19" scope="application"></c:set>
	<h1>My Age is: <c:out value="${age}"></c:out></h1>
	<c:if test="${age>18}">
		<h2 style="color:green">My age is<c:out value="${age}">,you are eligible for voting.</c:out></h2>
	</c:if>
	
	<c:forEach var="i" begin="0" end="5">
	<h2 style="color:red">value is: <c:out value="${i}"></c:out></h2>
	</c:forEach>
	
	<c:set var="marks" value="65"></c:set>
	<c:choose>
		<c:when test="${marks>=75 }">
			<h2 style="color:green">Your Grade is A with <c:out value="${marks}"></c:out> marks.</h2>
		</c:when>
		<c:when test="${marks<75 && marks>40}">
			<h2 style="color:orange">Your Grade is B with <c:out value="${marks}"></c:out> marks.</h2>
		</c:when>
		<c:when test="${marks<40}">
			<h2 style="color:red">Your Grade is C with <c:out value="${marks}"></c:out> marks.</h2>
		</c:when>
		<c:otherwise>
			<h2>you were absent for exam.</h2>
		</c:otherwise>
	</c:choose>
	<a href="demo.jsp">Click here to visit page 2</a><br>
	
	
	
</body>
</html>