<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Index JSP</h1>
	<form action="/users/new" method="POST">
		<input type="text" name="name" />
		<input type="text" name="email" />
		<input type="text" name="password" />
		<input type="number" name="age" />
		<button>Submit</button>
	</form>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Password</th>
				<th>Age</th>
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
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>