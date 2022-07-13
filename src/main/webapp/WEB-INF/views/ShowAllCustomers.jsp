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
	<table>
		<tr>
			<td>Name</td>
			<td>Action</td>
		</tr>
		<c:forEach items="${customers}" var="cus">
			<tr>
				<td>${cus.name}</td>
				<!-- <td>${cus.orders.size()} <a href="vieworders?customerId=${c.customerId}">View Order</a></td> -->
			</tr>
		</c:forEach>
	</table>
</body>
</html>