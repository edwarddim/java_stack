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
	<div class="container">
		<form:form method="POST" action="/users/${userObj.id}/edit" modelAttribute="userObj">
			<input type="hidden" name="_method" value="put">
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
	</div>
</body>
</html>