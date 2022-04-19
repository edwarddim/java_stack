<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
		<h1><c:out value="${recipe.name }"/></h1>
		<h2><c:out value="${recipe.description }"/></h2>
		<h2><c:out value="${recipe.instructions }"/></h2>
		<h2>
			<fmt:formatDate type = "date" value = "${recipe.madeOn}" />
		</h2>
		<c:choose>
			<c:when test="${recipe.under30Minutes }">
				<h2>Yes</h2>
			</c:when>
			<c:otherwise>
				<h2>No</h2>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>