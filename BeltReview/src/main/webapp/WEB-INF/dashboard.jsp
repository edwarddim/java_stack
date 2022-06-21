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
		<h1>Welcome, <c:out value="${user.userName}" /></h1>
		<a href="/questions/new">Ask a Question</a>
		<table class="table">
			<thead>
				<tr>
					<th>Question</th>
					<th>Creator</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="question" items="${allQuestions}">
					<tr>
						<td><c:out value="${question.text}" /></td>
						<td><c:out value="${question.creator.userName}" /></td>
						<td>
							<c:if test="${user_id == question.creator.id }">
								<a href="">Edit</a>
								<form action="/questions/${question.id}" method="POST">
									<input type="hidden" name="_method" value="DELETE" />
									<button>Delete</button>
								</form>
								<a href="/questions/${question.id}/delete">DELETE</a>
							</c:if>
							<a href="">Show</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>