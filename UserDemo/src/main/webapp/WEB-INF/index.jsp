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
		<h1>Dashboard</h1>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Id</th>
					<th>Full Name</th>
					<th>Email</th>
					<th>Password</th>
					<th>Age</th>
					<th>Created At</th>
					<th>Updated At</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="oneUser" items="${allUsers }">
					<tr>
						<td><c:out value="${oneUser.id}" /></td>
						<td>
							<a href="/users/${oneUser.id}">						
								<c:out value="${oneUser.fullName}" />
							</a>
						</td>
						<td><c:out value="${oneUser.email}" /></td>
						<td><c:out value="${oneUser.password}" /></td>
						<td><c:out value="${oneUser.age}" /></td>
						<td><c:out value="${oneUser.createdAt}" /></td>
						<td><c:out value="${oneUser.updatedAt}" /></td>
						<td>
							<form action="/users/${oneUser.id}" method="POST">
								<input type="hidden" name="_method" value="delete">
								<button class="btn btn-danger">Delete</button>
							</form>
							<a class="btn btn-warning" href="/users/${oneUser.id}/edit">Edit</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<form:form modelAttribute="userObj" method="POST" action="/users/new" >
			<p>
				Name:
				<form:input type="text" path="fullName"/>
				<form:errors path="fullName" />
			</p>
			<p>
				Email:
				<form:input type="email" path="email" />
				<form:errors path="email" />
			</p>
			<p>
				Password:
				<form:input type="password" path="password" />
				<form:errors path="password" />
			</p>
			<p>
				Age:
				<form:input type="number" path="age" />
				<form:errors path="age" />
			</p>
			<button>Submit</button>
		</form:form>
	</div>
</body>
</html>