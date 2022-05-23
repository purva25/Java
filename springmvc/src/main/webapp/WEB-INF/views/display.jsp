<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String name=(String)request.getAttribute("name");
	Integer age=(Integer)request.getAttribute("age");
	String city=(String)request.getAttribute("city");
	%>
	<h1>
	Name: <%=name %><br>
	Age: <%=age %><br>
	City: <%=city %>
	</h1>
	
</body>
</html>