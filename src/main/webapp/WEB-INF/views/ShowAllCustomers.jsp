<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show All Customer</title>
</head>
<body>
	<h1>Show All Customers</h1>
	<table border=1>
		<tr>
			<td>Name</td>
			<td>Orders Size</td>
			<td>Action</td>
		</tr>
		<c:forEach items="${customers}" var="cus">
			<tr>
				<td>${cus.name}</td>
				<td>${cus.getOrders().size()}</td> 
				<td><a href="showorders/${cus.customerId}">Show Orders</a></td> 
			</tr>
		</c:forEach>
	</table>
</body>
</html>