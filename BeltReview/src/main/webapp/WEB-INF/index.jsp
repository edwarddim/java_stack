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
		<div>
			<h1>Registration</h1>
			<form:form action="/register" method="post" modelAttribute="newUser">
				<p>
					Username:
					<form:input path="userName" />
					<form:errors path="userName" />
				</p>
				<p>
					Email:
					<form:input path="email" />
					<form:errors path="email" />
				</p>
				<p>
					Password:
					<form:input path="password" />
					<form:errors path="password" />
				</p>
				<p>
					Confirm Password:
					<form:input path="confirm" />
					<form:errors path="confirm" />
				</p>
				<button>Register</button>
			</form:form>
		</div>
		<div>
			<h1>Login</h1>
			<form:form action="/login" method="post" modelAttribute="newLogin">
				<p>
					Email:
					<form:input path="email" />
					<form:errors path="email" />
				</p>
				<p>
					Password:
					<form:input path="password" />
					<form:errors path="password" />
				</p>
				<button>Login</button>
			</form:form>	
		</div>
	</div>
</body>
</html>