<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Customer</title>
</head>
<body>
	<h2>New Customer</h2>
	<form action="savecustomer" method="post">
		Name: <input type="text" name="name"/><br>
		<input type="submit" value="Save Customer"/>
	</form>	
</body>
</html>