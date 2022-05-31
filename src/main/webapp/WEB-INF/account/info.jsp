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

Connection reussit 
	<div>${utilise.prenom} ${utilise.nom} ${utilise.username} ${utilise.password}
	</div>

	<form:form action="/accueil" method="post" modelAttribute="utilise">
	
	
			<button type="submit">pages accueil</button>
		
	</form:form>
</body>
</html>