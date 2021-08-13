<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
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
		<h1>Edit</h1>
		<form:form action="/shows/${showObj.id}/edit" method="POST" modelAttribute="showObj">
			<input type="hidden" name="_method" value="put">
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