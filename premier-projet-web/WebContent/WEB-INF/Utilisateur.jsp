<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Utilisateur</title>
</head>
<body>
<c:out value ="bonjour"/>
</br>
<c:out value="${jstl}"></c:out>
<ul>
    <li>Nom</li>
    <li>Prénom</li>
    <li>Date de naissance</li>
</ul>
<a href="Accueil">Accueil</a>
</body>
</html>