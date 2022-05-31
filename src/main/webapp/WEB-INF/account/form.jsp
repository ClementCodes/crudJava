<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/connecter" method="post" modelAttribute="utilise">
		<table>
		<tr>
				
				<td><label >prenom:</label></td>
				<td><form:input path="prenom" /></td>
				<td><form:errors path="prenom"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="nom">nom:</form:label></td>
				<td><form:input path="nom" /></td>
				<td><form:errors path="nom"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="username">username:</form:label></td>
				<td><form:input path="username" /></td>
				<td><form:errors path="username"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="password">password:</form:label></td>
				<td><form:password path="password" /></td>
				<td><form:errors path="password"></form:errors></td>
			</tr>
			<tr>
				<td colspan="3"><button type="submit">envoyer</button></td>
			</tr>
		</table>
	</form:form>

</body>
</html>