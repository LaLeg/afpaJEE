<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="ressources/CSS/index.css">
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
<div>
    <h1 class="bienvenue">
        Bienvenue, Vous êtes à l'accueil
    </h1>
</div>
<div>
    <a href="Accueil">Accueil</a>
    <a href="Produits">Produits</a>
    <a href="ProduitsAlimentaires">Produits Alimentaires</a>
    <a href="Utilisateur">Utilisateur</a>
    <a href="connexion">Connexion</a>
    <a href="inscription">Formulaire Client</a>
    
</div>
<div>
    <a href="Utilisateur.html"><img
            src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOGDtb7Ywg5kR7kx0Ao5S59OmDuGcXosvhYf2egt-DNhK6pPLW"
            alt="image-utilisateur"
            title="inscription Ici"
            class="image-utilisateur"
    /></a>
    <a href="Produit.html">
        <img src="https://images.yourstory.com/2016/08/125-fall-in-love.png?auto=compress"
             alt="image-produit"
             title="Produits Ici"
             class="image-produit"/>
    </a>
</div>
<div>
    <input type="number">
    <input type="date">
    <input type="color">
    <input type="checkbox">
    <input type="radio">

</div>
<script>
    /*alert("test js");
    alert(13+12);
    console.log(13+15);
    console.log("Je peux afficher du texte");*/
    var a;
    a=1;
    var b;
    b=9;
    console.log(a+b);
    console.log(typeof (a));
    console.log(a="string !?")

</script>
</body>
</html>