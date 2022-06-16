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
		<form:form method="POST" action="/chefs/new" modelAttribute="chefObj">
			<p>
				Name:
				<form:input type="text" path="name"/>
				<form:errors path="name" />
			</p>
			<p>
				DOB:
				<form:input type="date" path="dob"/>
				<form:errors path="dob" />
			</p>
			<button>Create</button>
		</form:form>
		<h3 class="text-success">
			<c:out value="${success}" />
		</h3>
	</div>
</body>
</html>