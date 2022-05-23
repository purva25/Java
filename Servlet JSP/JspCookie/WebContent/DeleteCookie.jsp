<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Cookie</title>
</head>
<body>
<h1>Cookie Deleted!!</h1>
	<%
		Cookie ck=null;
		Cookie [] cook=null;
		
		cook=request.getCookies();
		if(cook!=null){
			for(int i=0;i<cook.length;i++){
				ck=cook[i];
				if((ck.getName()).compareTo("user_name")==0){
					ck.setMaxAge(0);
					response.addCookie(ck);
				}
				if((ck.getName()).compareTo("user_id")==0){
					ck.setMaxAge(0);
					response.addCookie(ck);
				}
				if((ck.getName()).compareTo("user_email")==0){
					ck.setMaxAge(0);
					response.addCookie(ck);
				}
			}
		}
		else{
			out.print("Cookies are not available");
		}
	%>
	<form action="ReadCookie.jsp" method="get">
		<input type="submit" value="Click to read cookie">
	</form>
</body>
</html>