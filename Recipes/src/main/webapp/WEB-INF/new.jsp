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
		<h1>Create A Recipe</h1>
		<form:form action="/recipes/new" method="post" modelAttribute="recipeObj">
				<form:input type="hidden" path="creator" value="${user_id}" />
				<p>
					Name:
					<form:input path="name" />
					<form:errors path="name" />
				</p>
				<p>
					Description:
					<form:input path="description" />
					<form:errors path="description" />
				</p>
				<p>
					Instructions:
					<form:input path="instructions" />
					<form:errors path="instructions" />
				</p>
				<p>
					Made On:
					<form:input type="date" path="madeOn" />
					<form:errors path="madeOn" />
				</p>
				<p>
					Under 30 mins?
					Yes
					<form:radiobutton path="under30Minutes" value="true"/>
					No
					<form:radiobutton path="under30Minutes" value="false"/>
				</p>
				<button>Create</button>
			</form:form>
	</div>
</body>
</html>