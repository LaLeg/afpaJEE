<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Collection</title>
</head>
<body>

<c:forEach var="chaine" items="${liste }" varStatus="indice">

<li> ${indice.index} : ${chaine}</li>

</c:forEach>
</body>
</html>