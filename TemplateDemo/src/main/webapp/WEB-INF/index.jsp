<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
	<h1>Registration and Login</h1>
	<table>
		<thead>
			<th>Name</th>
		</thead>
		<tbody>
		    <c:forEach var="watermelon" items="${allUsers}">
				<tr>
					<td>
						<c:out value="${watermelon}"/>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>