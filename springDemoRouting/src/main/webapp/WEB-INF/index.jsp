<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form"%>
	<!--<c:out value="someVariable"/> -->
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>AWESOME PROJ BRUH</title>
	<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css" />
	<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
	<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h1 style="color:red;">Hello World</h1>
		
		<%-- ${num}
		
		<c:out value="${color}"/>
		<c:out value="${num}"/>
		
		<c:forEach var = "i" begin="1" end="${num}" >
		    <div class="box" style='background-color: <c:out value="${color}"/>'>${i}</div>
		</c:forEach> --%>
		
		<form action="/process_user" method="POST">
			Username: <input type="text" name="user_name">
			<input class="btn-primary" type="submit" value="Submit me!">
		</form>
		
	</div>

</body>
</html>