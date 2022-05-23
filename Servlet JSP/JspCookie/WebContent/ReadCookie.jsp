<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Read Cookie</title>
</head>
<body>
	<h1>Cookie found:</h1>
	
	<%
		Cookie ck=null;
		Cookie [] cook=null;
		
		cook=request.getCookies();
		if(cook!=null){
			for(int i=0;i<cook.length;i++){
				ck=cook[i];
				out.print("Key is: "+ck.getName());
				out.print("Value is: "+ck.getValue());
			}
		}
		else{
			out.print("Cookies are not available");
		}
	%>
	<form action="DeleteCookie.jsp" method="get">
		<input type="submit" value="Click to delete cookie">
	</form>
</body>
</html>