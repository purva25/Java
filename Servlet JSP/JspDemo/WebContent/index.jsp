<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.Random" %>
<%@page errorPage="errorpage.jsp" %>
<%@page isErrorPage="false" %>
<%@include file="header.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Demo</title>
</head>
<body>
	<h1>This is JSP Demo</h1>
	<%!
		int a=6;
		int b=0;
		
		public int multiply(){
			return a/b;
		}
	%>
	<h1 style="color:green"><%=
		"Entered numbers are "+a+" and "+b
	%></h1>
	<h2 style="color:blue"><%
		out.println("Multiplication of two numbers is "+multiply());
		Random rand=new Random();
		int r=rand.nextInt(100);
	%></h2>
	<h1 style="color:grey"><%= "Random number is "+r %></h1>
	
</body>
</html>
<%@include file="footer.jsp" %>