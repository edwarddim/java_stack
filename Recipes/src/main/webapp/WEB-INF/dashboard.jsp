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
		<h1>Welcome <c:out value="${user.firstName }"/>!</h1>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Name</th>
					<th>Under 30 mins?</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="recipe" items="${recipes}">
					<tr>
						<td><c:out value="${recipe.name }"/></td>
						<td>
							<c:choose>
								<c:when test="${recipe.under30Minutes }">
									Yes
								</c:when>
								<c:otherwise>
									No
								</c:otherwise>
							</c:choose>
						</td>
						<td>
							<a href="/recipes/${recipe.id}">View Instructions</a>
							<c:if test="${user_id == recipe.creator.id }">
								<a href="/recipes/edit/${recipe.id}">Edit</a>
								<a href="/recipes/delete/${recipe.id}">Delete</a>
							</c:if>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>