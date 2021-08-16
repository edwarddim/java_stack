<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
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
		<h1><c:out value="${product.name }" /></h1>
		<ul>
			<c:forEach var="cat" items="${product.categories}">
				<li>
					<c:out value="${cat.name }" />
				</li>
			</c:forEach>
		</ul>
		
		<form action="/products/${product.id}" method="POST">
			<select name="category_id" id="">
				<c:forEach var="cat" items="${categories }">
					<option value="${cat.id }">
						<c:out value="${cat.name }" />
					</option>
				</c:forEach>
			</select>
			<button>Add Category</button>
		</form>
		
	</div>
</body>
</html>