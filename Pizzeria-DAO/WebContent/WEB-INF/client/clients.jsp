<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Clients</title>
<style>
td, tr, th, table{
border: green 2px solid;
border-collapse: collapse;
}
</style>
</head>
<body>
Liste des Clients
<table>
<c:forEach items="${listeClients}" var="client">
<tr>
<td>${client.id }</td>
<td>${client.numeroClient}</td>
<td>${client.nom }</td>
<td>${client.prenom}</td>
<td>${client.adress }</td>
<td>${client.telFixe }</td>
<td>${client.telPortable }</td>
<td>${client.dateNaissance }</td>
<td>${client.email}</td>
<td><a href="client_infos?id=${client.id }">Client_Infos</a></td>
<td><a href="modifier_client?id=${client.id }">Modifier</a></td>
</tr>
</c:forEach>
</table>
<a href="ajout_client">Ajouter un client</a>
</body>
</html>