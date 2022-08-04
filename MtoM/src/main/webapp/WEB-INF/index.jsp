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
		<h1>Product</h1>
		<form:form method="POST" action="/prods/new" modelAttribute="productObj">
			<form:input path="name" />
			<form:input path="description" />
			<form:input path="price" />
			<button>Create Product</button>
		</form:form>
		<h1>Category</h1>
		<form:form method="POST" action="/cats/new" modelAttribute="categoryObj">
			<form:input path="name" />

			<button>Create Category</button>
		</form:form>
	</div>
</body>
</html>