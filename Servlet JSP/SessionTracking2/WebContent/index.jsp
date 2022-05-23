<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:green">Session Tracking</h1>
<%
	Date CT=new Date(session.getCreationTime());
	Date LT=new Date(session.getLastAccessedTime());
	
	String Usernameattribute=new String("Username");
	String U_name=new String ("purva");
	String Visit=new String("Vistcount");
	
	Integer Vcount=new Integer(0);
	String msg=null;
	
	if(session.isNew()){
		msg="Welcome to MIT";
		session.setAttribute(Usernameattribute, U_name);
		session.setAttribute(Visit,Vcount);
	}
	else{
		msg="Hey Student, How are you?";
		Vcount=(Integer)session.getAttribute(Visit);
		Vcount=Vcount+1;
	}
%>

<table>
	<tr>
		<td>Sesssion ID: </td>
		<td><% out.print(session.getId());%></td>
	</tr>
	<tr>
		<td>Creation Time: </td>
		<td><%= CT%></td>
	</tr>
	<tr>
		<td>Last Access Time: </td>
		<td><%= LT%></td>
	</tr>
	<tr>
		<td>UserID: </td>
		<td><%=U_name%></td>
	</tr>
	<tr>
		<td>Remark: </td>
		<td><%=msg%></td>
	</tr>
	<tr>
		<td>Visit count: </td>
		<td><%=Vcount%></td>
	</tr>
</table>

</body>
</html>