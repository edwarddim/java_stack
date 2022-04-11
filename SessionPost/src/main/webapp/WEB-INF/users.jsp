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
					<th>Name</th>
					<th>Email</th>
					<th>Age</th>
					<th>Age Range</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${users}">
					<tr>
						<td><c:out value="${user.name }" /></td>
						<td><c:out value="${user.email }" /></td>
						<td><c:out value="${user.age }" /></td>
						<c:choose>
							<c:when test="${user.age < 31 }">
								<td>Under 31</td>
							</c:when>
							<c:when test="${user.age < 41 }">
								<td>31-40</td>
							</c:when>
							<c:otherwise>
								<td> Older than 40</td>
							</c:otherwise>
						</c:choose>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>