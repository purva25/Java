<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name=request.getParameter("uname");
		String update=null;
		if(name.equals("purva")){
			session.setAttribute("username", name);
			update=response.encodeUrl("page2.jsp?username=+name");
		}
		else{
			response.sendRedirect("index.jsp?status=username not valid");
		}
	%>
	<a href='<%=update %>'>Click here to send data to page 2</a>
</body>
</html>