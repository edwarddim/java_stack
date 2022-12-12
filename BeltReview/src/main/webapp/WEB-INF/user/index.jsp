<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Log and Reg</h1>
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
		<hr />
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
</body>
</html>