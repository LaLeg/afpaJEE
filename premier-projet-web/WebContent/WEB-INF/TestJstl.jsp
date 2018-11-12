<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tests JSTLS</title>
</head>
<body>
	<h1>Des Tests de la TSTL :</h1>
	<br />
	<c:forEach var="i" begin="1" end="10">
		<c:if test="${i ne 5 }">
			<h2>${i }</h2>
			<br />
		</c:if>
	</c:forEach>
	
<!--1ère méthode  -->

	<table>
		<c:forEach var="i" begin="0" end="10" step="5">
			<tr>
				<c:forEach var="j" begin="1" end="5">
					<td>${j+i }</td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
<br/>

<!--2ème méthode  -->

<c:set var="nombre" value="15"></c:set>
<table>
		<c:forEach var="i" begin="1" end="3" >
			<tr>
				<c:forEach var="j" begin="1" end="5">
					<td>${nombre=nombre+1 }</td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
	
<!--3ème méthode  -->


<c:set var="valeur" value="0"></c:set>
<table>
		<c:forEach var="i" begin="1" end="${nombreLigne }" >
			<tr>
				<c:forEach var="j" begin="1" end="${ nombreColonne}">
					<td>${valeur=valeur+1 }</td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>

<!--Tableau de nombres pairs  -->

<c:set var="valeurPair" value="0"></c:set>
<table>
		<c:forEach var="i" begin="1" end="${nombreLigne }" >
			<tr>
				<c:forEach var="j" begin="1" end="${ nombreColonne}">
					
					<td>${valeurPair=valeurPair+2 }</td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
	
<!--Autre Tableau de nombres et des étoiles  -->

<c:set var="valeur" value="1"></c:set>

<table>
		<c:forEach var="i" begin="1" end="${nombreLigne }" >
			<tr>
				<c:forEach var="j" begin="1" end="${ nombreColonne}">
					<c:choose>
					<c:when test="${valeur % 5 != 0}">
					<td>${ valeur}</td>
					</c:when>
					<c:otherwise>
					<td>*</td>
					</c:otherwise>
					
					</c:choose>
					
					<c:set var="valeur" value="${valeur+1 }"></c:set>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
