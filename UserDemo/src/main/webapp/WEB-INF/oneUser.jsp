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
		<h1>One User</h1>
		<h2>Name: <c:out value="${user.fullName}" /> </h2>
		<h2>Email: <c:out value="${user.email}" /> </h2>
		<h2>Age: <c:out value="${user.age}" /> </h2>
		<c:if test="${ user.age < 18 }">
			<p>You are a minor</p>
		</c:if>
		<c:choose>
			<c:when test="${ user.age > 21 }">
				<p>You are over 21 and you are Edward</p>
			</c:when>
			<c:when test="${ user.age > 18 }">
				<p>You are over 18</p>
			</c:when>
			<c:otherwise>
				<p>You are a minor</p>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>