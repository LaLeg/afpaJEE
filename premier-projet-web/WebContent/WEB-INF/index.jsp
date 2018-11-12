<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page JSP</title>
</head>
<body>
	<h1>Bonjour JSP</h1>
	<%
		System.out.println("ici le code java");
	%>
	<%!int nombre1 = 10;
	int nombre2 = 90;

	int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}%>
	<%
		System.out.println("le max demandé est :" + max(10, 30));
	%>
	<%="le max demandé est :" + max(10, 30)%>
	<%
		for (int i = 0; i < 10; i++) {
	%>
	<h1>Titre en Html</h1>
	<%
		}
	%>
	<%
		int i = 15;
		if (i == 15) {
	%>
	<h1>i==10</h1>
	<%
		}
	%>


</body>
</html>