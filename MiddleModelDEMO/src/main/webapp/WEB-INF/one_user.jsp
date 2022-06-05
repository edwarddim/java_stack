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
		<h1>
			<c:out value="${user.name }" />
		</h1>
		<form:form action="/join/process" method="post" modelAttribute="userGroupObj">
		
			<form:input path="user" value="${user.id }" type="hidden"/>
			<p>
				Reason:
				<form:input path="reason"/>
			</p>
			<p>
				Group:
				<form:select path="group">
					<c:forEach var="group" items="${groups }">
						<form:option value="${group.id }">
							<c:out value="${group.name }" />
						</form:option>
					</c:forEach>
				</form:select>
			</p>	
			<button>Join Group</button>
		</form:form>
		<h2>Currently Joined Groups</h2>
		<ul>
			<c:forEach var="userGroup" items="${user.joined_groups }">
				<li>
					<c:out value="${userGroup.group.name }" /> - <c:out value="${userGroup.reason }" />
				</li>	
			</c:forEach>
		</ul>
	</div>
</body>
</html>