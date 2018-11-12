<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
td, tr, th, table{
border: green 2px solid;
border-collapse: collapse;
}
</style>
</head>
<body>
	<table>
	<tr>
	<th>Id</th>
	<th>Libelle</th>
	<th>Reference</th>
	<th>Prix</th>
	<th>URL</th>
	<th>Modifier</th>
	<th>Supprimer</th>
	</tr>
		<c:forEach items="${pizza}" var="varPizza">
			<tr>
				<td>${varPizza.id }</td>
				<td>${varPizza.libelle }</td>
				<td>${varPizza.reference }</td>
				<td>${varPizza.prix }</td>
				<td>${varPizza.urlImage }</td>
				<td><a href="modifier_pizza?id=${varPizza.id }">Modifier</a></td>
				<td><a href="suppression_pizza?id=${varPizza.id}">Supprimer</a></td>

			</tr>
		</c:forEach>
	</table>
	
	<a href="ajout_pizza">Ajouter une pizza</a>
</body>
</html>