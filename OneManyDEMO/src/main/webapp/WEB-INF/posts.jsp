<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Create a Post</h1>
		<form:form action="" method="POST" modelAttribute="postObj">
			<p>
		        <form:label path="title">Ttile</form:label>
		        <form:input path="title"/>
		        <form:errors path="title"/>
			</p>
			<p>
		        <form:label path="description">Description</form:label>
		        <form:input path="description"/>
		        <form:errors path="description"/>
			</p>
			<p>
				<form:select path="creator">
					<c:forEach items="${allUsers }" var="user">
						<form:option value="${user.id }">
							<c:out value="${user.name }" />
						</form:option>
					</c:forEach>
				</form:select>
			</p>
			<button type="submit">Create User</button>
		</form:form>
	</div>
</body>
</html>