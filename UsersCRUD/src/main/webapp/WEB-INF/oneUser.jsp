<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>User <c:out value="${user.id}" /></h1>
		<h1><c:out value="${user.firstName}" /> <c:out value="${user.lastName}" /></h1>
		<h1><c:out value="${user.email}" /></h1>
		<h2><c:out value="${user.createdAt}" /></h2>
		<h2><c:out value="${user.updatedAt}" /></h2>
	</div>
</body>
</html>