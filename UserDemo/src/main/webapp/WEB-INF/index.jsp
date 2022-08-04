<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Index JSP</h1>
	<form:form method="POST" action="/users/data" modelAttribute="userObj">
			<p>
				Name:
				<form:input type="text" path="name" />
				<form:errors path="name" />
			</p>
			<p>
				Email:
				<form:input type="text" path="email" />
				<form:errors path="email" />
			</p>
			<p>
				Password:
				<form:input type="text" path="password" />
				<form:errors path="password" />
			</p>
			<p>
				Age:
				<form:input type="number" path="age" />
				<form:errors path="age" />
			</p>
			<button>Submit</button>
		</form:form>
	<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Password</th>
				<th>Age</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users }">
				<tr>
					<td><c:out value="${user.name }"/></td>
					<td><c:out value="${user.email }"/></td>
					<td><c:out value="${user.password }"/></td>
					<c:choose>
						<c:when test="${user.age > 21 }">
							<td>Age over 21</td>	
						</c:when>
						<c:when test="${user.age < 21 && user.age >= 18 }">
							<td>Age between 21 and 18</td>
						</c:when>
						<c:otherwise>
							<td>Age under 18</td>
						</c:otherwise>
					</c:choose>
					<td>
						<a href="/users/${user.id}/edit">Edit</a>
						<a href="/users/${user.id}/delete">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>