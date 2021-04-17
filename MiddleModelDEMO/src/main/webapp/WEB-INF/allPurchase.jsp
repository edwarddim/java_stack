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
		<h1>All Purchases</h1>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Purchaser</th>
					<th>Item Bought</th>
					<th>Date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allPurchase }" var="purchase">
					<tr>
						<td>
							<c:out value="${purchase.purchaser.name }" />
						</td>
						<td>
							<c:out value="${purchase.purchased_item.name }" />
						</td>
						<td>
							<c:out value="${purchase.createdAt }" />
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>