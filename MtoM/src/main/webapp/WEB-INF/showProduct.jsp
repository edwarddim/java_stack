<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1><c:out value="${product.name }" /></h1>
		<h2>Exisiting Categories</h2>
		<ul>
			<c:forEach var="category" items="${ product.categories}">
				<li>
					<c:out value="${category.name }" />
				</li>
			</c:forEach>
		</ul>
		
		<hr />
		<h2>Add new Category</h2>
		<form:form method="POST" action="/join" modelAttribute="prodCatObj">
			<form:input path="product" value="${product.id }" type="hidden"/>
			<form:select path="category">
				<c:forEach var="category" items="${ categories}">
					<form:option value="${category.id }">
						<c:out value="${category.name }" />
					</form:option>
				</c:forEach>
			</form:select>
			<button>Submit</button>
		</form:form>
	</div>
</body>
</html>