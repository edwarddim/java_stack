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
		<h1>hello world</h1>
		
		<form:form method="POST" action="/recipes/new" modelAttribute="recipeObj">
			<p>
				Name:
				<form:input type="text" path="name"/>
				<form:errors path="name"/>
			</p>
			<p>
				Calories:
				<form:input type="number" path="calories"/>
				<form:errors path="calories"/>
			</p>
			<p>
				Chef:
				<form:select path="creator">
					<c:forEach var="chef" items="${chefs}">
						<form:option value="${chef.id}">
							<c:out value="${chef.name }" />
						</form:option>
					</c:forEach>
				</form:select>
			</p>
			<button>Create</button>
		</form:form>
		
		
	</div>
</body>
</html>