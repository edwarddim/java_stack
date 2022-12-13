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
		<h1>Name: <c:out value="${product.name }" /></h1>
		<h1>Price: <c:out value="${product.price }" /></h1>
	
	
		<h2>Relationship Info</h2>
		<ul>	
			<c:forEach var="catProd" items="${productCategories }">
				<li>
					<c:out value="${catProd.category.name }" />
					<c:out value="${catProd.createdAt }" />
				</li>	
			</c:forEach>
		</ul>
		<h2>Category Info</h2>

		<ul>
			<c:forEach var="category" items="${product.categories }">
				<li>
					<c:out value="${category.name }" />
					<c:out value="${category.createdAt }" />
				</li>	
			</c:forEach>
		</ul>
	
	</div>
</body>
</html>