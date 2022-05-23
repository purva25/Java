<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Form</h1>
	<form method="post" action="processform">
		<table>
			<tr>
				<td>Name: </td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Age: </td>
				<td><input type="number" name="age"></td>
			</tr>
			<tr>
				<td>City: </td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td><button type="submit" name="submit">Submit</button></td>
			</tr>
		</table>
	</form>
</body>
</html>