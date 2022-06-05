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
		<h1>Users Page</h1>
		<form:form action="/users/new" method="POST" modelAttribute="userObj">
			<p>
		        <form:label path="name">Name</form:label>
		        <form:input path="name"/>
		        <form:errors path="name"/>
			</p>
			<p>
		        <form:label path="email">Email</form:label>
		        <form:input path="email"/>
		        <form:errors path="email"/>
			</p>
			<p>
		        <form:label path="password">Password</form:label>
		        <form:input path="password"/>
		        <form:errors path="password"/>
			</p>
			<button type="submit">Create User</button>
		</form:form>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Password</th>
					<th>Details</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allUsers}" var="user">
					<tr>
						<td>
							<c:out value="${user.id }" />
						</td>
						<td>
							<c:out value="${user.name }" />
						</td>
						<td>
							<c:out value="${user.email }" />
						</td>
						<td>
							<c:out value="${user.password }" />
						</td>
						<td>
							<a href="/users/${user.id }">Details</a>
							<a href="/users/${user.id }/edit">Edit</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>