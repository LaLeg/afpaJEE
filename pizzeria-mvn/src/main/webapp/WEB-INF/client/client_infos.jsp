<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client Infos</title>
</head>
<body>
ID : ${clientInfos.id }<br>
Numéro Client : ${clientInfos.numeroClient }<br>
Nom : ${clientInfos.nom }<br>
Prénom : ${clientInfos.prenom }<br>
Adresse : ${clientInfos.adress }<br>
Tel Fixe : ${clientInfos.telFixe}<br>
Tel Portable : ${clientInfos.telPortable }<br>
Date de Naissance : ${clientInfos.id }<br>
Email : ${clientInfos.email }<br>
</body>
</html>