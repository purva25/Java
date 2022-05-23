 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Session Tracking Demo</h1>
<form action="page1.jsp" method="get">
	<table>
		<tr>
			<td>Enter Username:</td>
			<td><input type="text" name="uname"></td>
		</tr>
		<tr>
			<td><input type="submit" name="submit"></td>
		</tr>
	</table>
</form>
<h3 style="color:red"><%
	String msg=request.getParameter("status");
	if(msg!=null){
		out.print(msg);
	}
%></h3>
</body>
</html>