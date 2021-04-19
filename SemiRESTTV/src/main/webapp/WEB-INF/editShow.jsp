<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Edit Show</h1>
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
			<button type="submit" class="btn btn-primary">Update</button>
		</form:form>
	</div>
</body>
</html>