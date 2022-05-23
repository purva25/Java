<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>help page</h1>
	<%
		String name=(String) request.getAttribute("name");
		
	%>
	<h2>Name is <%=name %></h2>
	<h2>Date and Time is <%= %></h2>
</body>
</html>