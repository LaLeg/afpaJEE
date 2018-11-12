/* Fonction permettant de Récupérer les Informations Saisies dans le Formulaire 
lors du click sur le bouton Envoyer */

function validerFormulaire() {
    
    console.log("valider formulaire");
    console.log("test");
    var noM;
    noM = document.getElementById("nom");
    console.log(noM.value);

    /* Code pour récuperer la Date de Naissance Saisie dans le Formulaire */

    var dateNaissance;
    dateNaissance = document.getElementsByName("date-naissance");
    dateNaissance = document.forms["nom-formulaire"].elements["date-naissance"].value;
    console.log(dateNaissance);

    /* Affichage de la date d'aujourd'hui*/

    var nD = new Date();
    console.log(new Date());

    /* - Comparaison de la Date de Naissance avec Celle d'Aujourd'hui avec Alerte,
       - Alerte si le champs date de naissance est vide */

    var dN = new Date(dateNaissance);

    if (dN > nD || dateNaissance =="") {
        console.log("Erreure : Date Naissance Supérieure à Celle d'Aujourd'hui !!!");
        document.getElementById("date-naissance").className="erreure";
    }else {document.getElementById("date-naissance").classList.remove("erreure");}

   /* même traitement pour le nom et prénom : alerte si les champs sont vides ou saisis par des espaces*/

    if (noM.value==""||noM.value.trim()=="") {
        document.getElementById("nom").className="erreure";
    }else {document.getElementById("nom").classList.remove("erreure");}

    var prenoM;
    prenoM=document.getElementById("prenom");
    if (prenoM.value==""||prenoM.value.trim()=="") {
        document.getElementById("prenom").className="erreure";
    }else {document.getElementById("prenom").classList.remove("erreure");}

    /* Code Alerte Ville */
    var villE;
    villE=document.getElementById("ville");
    if (villE.value==""||villE.value.trim()==""){
        document.getElementById("ville").className="erreure";
    } else {document.getElementById("ville").classList.remove("erreure");}

    /* Code pour N° de télephone si le nombre de chiffres est inférieur à 10 */

    var telephone;
    telephone = document.getElementById("phone");
    console.log(telephone);
    console.log(telephone.value);
    console.log(telephone.value.length);
    if (telephone.value.length<10||telephone.value=="") {
        document.getElementById("phone").className="erreure";
    }else{document.getElementById("phone").classList.remove("erreure");}
    /*if (telephone.value.trim()) {
        document.getElementById("phone").className="erreure";
    }else{document.getElementById("phone").classList.remove("erreure");}*/
}

