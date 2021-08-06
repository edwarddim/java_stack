<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Hello World</h1>
		<h2>Name: <c:out value="${name}" /></h2>
		<h2>Age: <c:out value="${age}"/></h2>
	</div>
</body>
</html>