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
		<h1>Edit User</h1>
		<form:form action="/users/${user.id}/edit" method="post" modelAttribute="user">
			<input type="hidden" name="_method" value="put">
		    <p>
		    	First Name:
		        <form:errors path="firstName"/>
		        <form:input path="firstName"/>
		    </p>
		    <p>
		    	Last Name:
		        <form:errors path="lastName"/>
		        <form:input path="lastName"/>
		    </p>
		    <p>
		    	Email:
		        <form:errors path="email"/>
		        <form:input path="email"/>
		    </p>
		    <input type="submit" value="Update"/>
		</form:form>
	</div>
</body>
</html>