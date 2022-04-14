<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1><c:out value="${user.firstName}" /> <c:out value="${user.lastName}" /></h1>
		<h2>ID: <c:out value="${user.id}" /></h2>
		
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Client</th>
					<th>Amount</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="sale" items="${user.sales}">
					<tr>
						<td><c:out value="${sale.client }" /></td>
						<td>$<c:out value="${sale.purchaseAmount }" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>