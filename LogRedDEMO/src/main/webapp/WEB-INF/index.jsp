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
		<h1>Register</h1>
		<p><form:errors path="userObj.*"/></p>
	    <form:form method="POST" action="/registration" modelAttribute="userObj">
	        <p>
	            <form:label path="email">Email:</form:label>
	            <form:input type="email" path="email"/>
	            
	        </p>
	        <p>
	            <form:label path="password">Password:</form:label>
	            <form:password path="password"/>
	          
	        </p>
	        <p>
	            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
	            <form:password path="passwordConfirmation"/>
	     
	        </p>
	        <input type="submit" value="Register!"/>
	    </form:form>
	    <h1>Login</h1>
	    <p><c:out value="${error}" /></p>
        <form method="post" action="/login">
	        <p>
	            <label for="email">Email</label>
	            <input type="text" id="email" name="email"/>
	        </p>
	        <p>
	            <label for="password">Password</label>
	            <input type="password" id="password" name="password"/>
	        </p>
	        <input type="submit" value="Login!"/>
	    </form>
	</div>
</body>
</html>