<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modifier Client</title>
</head>
<body>
<h2>Mise à jour Client</h2>
<form action="modifier_client" method="POST">
<input type="text"
			name="id" placeholder="id" id="id" value="${client.id }" hidden="hidden"/><br>
<label for="numero_client">Numero Client : </label> <input type="text"
			name="numero_client" placeholder="numero_client" id="numero_client" value="${client.numeroClient}"/><br>
<label for="nom">Nom : </label> <input type="text"
			name="nom" placeholder="nom" id="nom" value="${client.nom }" /><br>
<label for="prenom">Prenom : </label> <input type="text"
			name="prenom" placeholder="prenom" id="prenom" value="${client.prenom }" /><br>
<label for="adresse">Adresse : </label> <input type="text"
			name="adresse" placeholder="adresse" id="adresse" value="${client.adress }"/><br>
<label for="tel_fixe">Tel. Fixe : </label> <input type="text"
			name="tel_fixe" placeholder="tel_fixe" id="tel_fixe" value="${client.telFixe }"/><br>
<label for="tel_portable">Tel. Portable : </label> <input type="text"
			name="tel_portable" placeholder="tel_portable" id="tel_portable" value="${client.telPortable}" /><br>

<label for="date_naissance">Date de naissance : </label> <input type="text"
			name="date_naissance" placeholder="date_naissance" id="date_naissance" value="${client.dateNaissance }" /><br>
<label for="email">Email : </label> <input type="text"
			name="email" placeholder="email" id="email" value="${client.email }"/><br>
			
<input type="submit" value="Valider"/>

</form>

</body>
</html>