<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loging JSP</title>
</head>
<body>
	<h1>loging servlet associé</h1>
	<br />
	<p>traitement avec JSTL et EL
	<p></p>
	<br />
	<c:out value="${login }"></c:out>
	<br />
	<c:out value="${MDP }"></c:out>
	<br />
	<input type="text" name="login" id="login" value="${login}" />
	<br />
	<input type="text" name="mdp" id="mdp" value="${MDP}" />
	<br /> ${jean_infos.nom}
	<br /> ${jean_infos.prenom}
	<br /> ${jean_infos.dateNaissance}
	<br /> ${jean_infos.numeroEtRue}
	<br /> ${jean_infos.ville}
	<br /> ${jean_infos.pays}
	<br /> ${jean_infos.numeroTelephone}
	<br /> ${jean_infos.email}
	<br /> ${jean_infos.vosCommentaires}
	<br /> nombre1 = ${nombre1} et nombre2 = ${nombre2}
	<br /> nombre1 + nombre2 = ${nombre1 + nombre2}
	<br /> nombre1 gt(superieur) nombre2 : ${nombre1 gt nombre2 }
	<br /> nombre1 lt(inferieur) nombre2 : ${nombre1 lt nombre2 }
	<br /> nombre1 le(inferieur ou egal) nombre2 : ${nombre1 le nombre2 }
	<br /> nombre1 ge(superieur ou egal) nombre2 : ${nombre2 ge nombre2 }
	<br /> nombre1 eq(equal) nombre2 : ${nombre1 eq nombre2 }
	<br /> nombre1 ne(non equal) nombre2 : ${nombre1 ne nombre2 }



</body>
</html>