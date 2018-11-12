<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="ressources/CSS/Produits-Alimentaires.css">
<meta charset="UTF-8">
<title>Produits Alimentaires</title>
</head>
<body>
	<div>
		<h1 class="ListeNosProduits">Ici la Liste de Nos Produits :</h1>
	</div>
	<div id="produits-alimentaires">
		<c:forEach items="${produits }" var="produit">
			<div class="produit">
				<h1 class="prix">${produit.prix }€</h1>
				<a href="DetailsProduitServlet?url=${produit.url }&nom=${produit.nom }&prix=${ produit.prix}">
				<img src=${produit.url } alt="${produit.nom }"
					title="${produit.nom }" class="ImageProduit"/></a>
				<p>${produit.nom}</p>
			</div>
		</c:forEach>
	</div>
	<div>
		<a href="Accueil">Retour à l'Accueil</a>
	</div>
</body>
</html>