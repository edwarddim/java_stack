<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Users</h1>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>ID</th>
					<th>Full Name</th>
					<th>Email</th>
					<th>Created At</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${users}">
					<tr>
						<td><c:out value="${user.id}" /></td>
						<td><c:out value="${user.firstName}" /> <c:out value="${user.lastName}" /></td>
						<td><c:out value="${user.email}" /></td>
						<td><c:out value="${user.createdAt}" /></td>
						<td>
							<a href="">Show</a>
							<a href="">Edit</a>
							<a href="">Delete</a>
						</td>		
					</tr>		
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>