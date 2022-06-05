<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
	<meta charset="ISO-8859-1">
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
				<c:forEach var="user" items="${ users}">
					<tr>
						<td><c:out value="${user.name }" /></td>
						<td><c:out value="${user.email }" /></td>
						<td><c:out value="${user.age }" /></td>
						<c:choose>
							<c:when test="${user.age < 31 }">
								<td> Younger than 30</td>
							</c:when>
							<c:when test="${user.age < 41 }">
								<td> 31~40 </td>
							</c:when>
							<c:otherwise>
								<td> Older than 40</td>
							</c:otherwise>
						</c:choose>
						<!--  						
						<c:if test="${user.age < 31 }">
							<td>Yes</td>
						</c:if>
						-->
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>