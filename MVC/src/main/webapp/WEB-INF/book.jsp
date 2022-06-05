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
		<h1><c:out value="${book.title}" /></h1>
		<p>Description: <c:out value="${book.description }" /></p>
		<p>Language: <c:out value="${book.language }" /></p>
		<p># of Pages: <c:out value="${book.numberOfPages }" /></p>
		<br />
		<p>Created At: <c:out value="${book.createdAt }" /></p>
		<p>Updated At: <c:out value="${book.updatedAt }" /></p>
	</div>
	<form action="/books/${book.id}" method="post">
		<input type="hidden" name="_method" value="delete">
		<button class="btn btn-danger">Delete</button>
	</form>
</body>
</html>