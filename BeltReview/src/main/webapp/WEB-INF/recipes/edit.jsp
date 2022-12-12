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
		<h1>Edit Recipe</h1>
		<form:form method="POST" action="/recipes/${recipeObj.id}/edit" modelAttribute="recipeObj">
			<input type="hidden" name="_method" value="PUT" />
			<form:input type="hidden" path="creator" value="${user_id}" />
			<p>
				Name:
				<form:input path="name" />
				<form:errors path="name" />
			</p>
			<p>
				Description:
				<form:textarea path="description"/>
				<form:errors path="description" />
			</p>
			<p>
				Under 30 mins?
				<form:checkbox path="under30Min"/>
			</p>
			<button>Edit</button>
		</form:form>
	</div>
</body>
</html>