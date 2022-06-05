<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1><c:out value="${item.name }" /></h1>
		<h1>Saved</h1>
		<ul>
			<c:forEach items="${item.orders }" var="order">
				<li>
					<c:out value="${order.purchaser.name }" />
				</li>				
			</c:forEach>
		</ul>
		<h1>Potential</h1>
		<ul>
			<c:forEach items="${users }" var="user">
				<li>
					<c:out value="${user.name }" />
				</li>				
			</c:forEach>
		</ul>
	</div>
</body>
</html>