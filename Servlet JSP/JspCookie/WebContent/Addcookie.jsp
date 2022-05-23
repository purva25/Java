<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	Cookie username=new Cookie("user_name",request.getParameter("uname"));
	Cookie id=new Cookie("user_id",request.getParameter("userid"));
	Cookie email=new Cookie("user_email",request.getParameter("email"));
	
	username.setMaxAge(60*60*24);
	id.setMaxAge(60*60*24);
	email.setMaxAge(60*60*24);
	
	response.addCookie(username);
	response.addCookie(id);
	response.addCookie(email);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Cookie</title>
</head>
<body>
	<h2>Cookie created and sent to client!!</h2>
	<form action="ReadCookie.jsp" method="get">
		<input type="submit" value="Click to read cookie">
	</form>
</body>
</html>