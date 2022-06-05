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
		<h1>One Show</h1>
		<h2>ID: <c:out value="${show.id }" /></h2>
		<h2>Title: <c:out value="${show.title }" /></h2>
		<h2>Network: <c:out value="${show.network }" /></h2>
		<h2>Release Date: <c:out value="${show.release_date }" /></h2>
		<h2>Description: <c:out value="${show.description }" /></h2>
		<h2>Created By: <c:out value="${show.creator.email}" /></h2>
		<div>
			<table class="table table-dark">
				<thead>
					<tr>
						<th>Message</th>
						<th>User</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="comment" items="${show.comments}">
						<tr>
							<td>
								<c:out value="${comment.body }" />
							</td>
							<td>
								<c:out value="${comment.author.email }" />
							</td>
							<td>
								<c:if test="${comment.author.id == user_id }">
									<a href="/comments/${comment.id}/delete">Delete</a>
								</c:if>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<br />
		<form:form action="/comments/new" method="POST" modelAttribute="commentObj">
			<form:input value="${user_id}" path="author" type="hidden"/>
			<form:input value="${show.id}" path="show" type="hidden"/>
			<p>
				Leave a Comment:
				<form:input path="body"/>
			</p>
			<button>Submit</button>
		</form:form>
	</div>
</body>
</html>