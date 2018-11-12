<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout Client</title>
</head>
<body>
<h2>Formulauire : Ajouter un client.</h2>
<form action="ajout_client" method="POST">
<label for="numero_client">Numero Client : </label> <input type="text"
			name="numero_client" placeholder="numero_client" id="numero_client" /><br>
<label for="nom">Nom : </label> <input type="text"
			name="nom" placeholder="nom" id="nom" /><br>
<label for="prenom">Prenom : </label> <input type="text"
			name="prenom" placeholder="prenom" id="prenom" /><br>
<label for="adresse">Adresse : </label> <input type="text"
			name="adresse" placeholder="adresse" id="adresse" /><br>
<label for="tel_fixe">Tel. Fixe : </label> <input type="text"
			name="tel_fixe" placeholder="tel_fixe" id="tel_fixe" /><br>
<label for="tel_portable">Tel. Portable : </label> <input type="text"
			name="tel_portable" placeholder="tel_portable" id="tel_portable" /><br>

<label for="date_naissance">Date de naissance : </label> <input type="text"
			name="date_naissance" placeholder="date_naissance" id="date_naissance" /><br>
<label for="email">Email : </label> <input type="text"
			name="email" placeholder="email" id="email" /><br>
			
<input type="submit" value="Valider"/>
</form>

</body>
</html>