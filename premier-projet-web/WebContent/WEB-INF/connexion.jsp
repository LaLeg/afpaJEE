<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Connexion</title>
</head>
<body>
<div>
    <p> Bonjour Mr/Mme <span id="Nom">LEGHTAS</span>, Vous êtes bien connecté.</p>

</div>

    <form method="post" action="">
        <fieldset>

            <label for="login"> Login : </label> <input type="text" id="login" name="login"
                                                        placeholder="Saisissez votre login">
            <label for="MdP"> Mot de Passe : </label> <input type="text" id="MdP" name="MdP"
                                                             placeholder="Saisissez votre mot de passe">
            <legend>Formulaire de connexion</legend>
        </fieldset>



    </form>

<a href="Accueil">Accueil</a>
</body>
</html>