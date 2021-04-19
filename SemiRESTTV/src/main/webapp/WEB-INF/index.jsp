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
		<table class="table table-dark">
			<thead>
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Network</th>
					<th>Release Date</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allShows}" var="show">
					<tr>
						<td><c:out value="${show.id }" /></td>
						<td><c:out value="${show.title }" /></td>
						<td><c:out value="${show.network }" /></td>
						<td><c:out value="${show.release_date }" /></td>
						<td>
							<a href="/shows/${show.id}">Show</a>
							<a href="/shows/${show.id}/edit">Edit</a>
							<a href="/shows/${show.id}/delete">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<form:form action="/shows/new" method="POST" modelAttribute="showObj">
			<p>
				Title:
				<form:input path="title" type="text" />
				<form:errors path="title" />
			</p>
			<p>
				Network:
				<form:input path="network" type="text" />
				<form:errors path="network" />
			</p>
			<p>
				Release Date:
				<form:input path="release_date" type="date" />
				<form:errors path="release_date" />
			</p>
			<p>
				Description:
				<form:input path="description" type="text" />
				<form:errors path="description" />
			</p>
			<button type="submit" class="btn btn-primary">Create</button>
		</form:form>
	</div>
</body>
</html>