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
Vosu etes sur la pages  d'accueil ...


ici pour créer des todo list

    <form:form action="" method="post" modelAttribute="todo">

        <div>
            titre <input name="titre">
        </div>
        <div>
            texte <input type="text" name="texte">
        </div>
            <div>
            date <input type="number" name="date">
        </div>


        <button type="submit">Créer une todo</button>
    </form:form>


    <c:forEach var="todo" items="${lsttodo}">
            <p>${todo.titre}</p>
            <p>${todo.texte}</p>
            <p>${todo.date}</p>
<button >Effacer</button>

        </c:forEach>

</body>
</html>