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
		<h1>Dashboard for Recipes</h1>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Name</th>
					<th>Under</th>
					<th>Posted By</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="recipe" items="${allRecipes}">
					<tr>
						<td><c:out value="${recipe.name}" /></td>
						<td><c:out value="${recipe.under30Min}" /></td>
						<td><c:out value="${recipe.creator.userName}" /></td>
						<td>
							<a href="/recipes/${recipe.id}">View</a>
							<c:if test="${user_id == recipe.creator.id }">
								<a href="/recipes/${recipe.id}/edit">Edit</a>
								<a href="/recipes/${recipe.id}/delete">Delete</a>							
							</c:if>
							<form action="/recipes/${recipe.id}" method="POST">
								<input type="hidden" name="_method" value="DELETE" />
								<button>Delete</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>