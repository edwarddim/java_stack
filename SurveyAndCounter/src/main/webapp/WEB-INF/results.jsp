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
		<h1>Results</h1>
		<h2><c:out value="${full_name}" /></h2>
		<h2><c:out value="${email}" /></h2>
		<h2><c:out value="${fav_language}" /></h2>
		<h2><c:out value="${comments}" /></h2>
	</div>
</body>
</html>