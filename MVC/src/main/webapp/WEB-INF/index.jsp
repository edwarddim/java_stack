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
		<h1>All Books</h1>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Description</th>
					<th>Language</th>
					<th># of Pages</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${books}">
					<tr>
						<td><c:out value="${book.id}" /></td>
						<td>
							<a href="/books/${book.id}"><c:out value="${book.title}" /></a>
						</td>
						<td><c:out value="${book.description}" /></td>
						<td><c:out value="${book.language}" /></td>
						<td><c:out value="${book.numberOfPages}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>