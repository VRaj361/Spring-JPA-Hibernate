<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Order</title>
</head>
<body>
	<h2>New Order</h2>
	<form action="saveorder" method="post">

		Customer: <select name="customer.customerId">
			<option>Select customer</option>

			<c:forEach items="${customers}" var="c">
				<option value="${c.customerId}">${c.name}</option>
			</c:forEach>
		</select> Total Amount : <input type="text" name="totalAmount"><Br>
		<br> <input type="submit" value="Save Order" />
	</form>
	
</body>
</html>