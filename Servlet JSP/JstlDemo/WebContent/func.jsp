<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"
    prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Functions</title>
</head>
<body>
	<h1>JSTL FUNCTION</h1>
	
	<c:set var="str" value="hello"></c:set>
	<h1 style="color:green">Entered string is: <c:out value="${str}"></c:out></h1>
	<h1 style="color:green">Length of string : <c:out value="${fn:length(str)}"></c:out></h1>
	<h1 style="color:green">Uppercase string : <c:out value="${fn:toUpperCase(str)}"></c:out></h1>
	<h1 style="color:green">Substring : <c:out value="${fn:substring(str,1,4)}"></c:out></h1>
	<h1 style="color:green">Replaced string : <c:out value="${fn:replace(str,'llo','nny')}"></c:out></h1>
	<h1 style="color:green">String starts with h : <c:out value="${fn:startsWith(str,'h')}"></c:out></h1>
	<h1 style="color:green">Substring After : <c:out value="${fn:substringAfter(str,'he')}"></c:out></h1>
	<h1 style="color:green">Substring Before : <c:out value="${fn:substringBefore(str,'lo')}"></c:out></h1>
	
</body>
</html>