<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page isErrorPage="true" %>
    
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>${item.name }</h1>
		<table class="table table-dark">
			<thead>
				<tr>
					<td>First Name</td>
					<td>Last Name</td>
					<td>Action</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${item.users }" var="user">
					<tr>
						<td><c:out value="${user.first_name }" /> </td>
						<td><c:out value="${user.last_name }" /> </td>
						<td>
							<form action="/items" method="post">
								<input type="hidden" name="_method" value="delete" />
								<input name="item_id" type="hidden" value="${item.id }" />
								<input name="user_id" type="hidden" value="${user.id }" />
								<button class="btn btn-danger" type="submit">Delete</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<form action="/items" method="post">
			<input name="item_id" type="hidden" value="${item.id }" />
			<select name="user_id" id="">
				<c:forEach items="${ users}" var="user">
					<option value="${user.id }">${user.first_name } ${user.last_name }</option>
				</c:forEach>
			</select>
			<button type="submit">Create</button>
		</form>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>