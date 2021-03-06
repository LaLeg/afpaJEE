<%@page import="fr.leghtas.bean.Personne"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="ressources/CSS/Formulaire.css">
<meta charset="ISO-8859-1">
<title>Inscription</title>
</head>
<body>
<%
Personne jean = (Personne)request.getAttribute("jean-infos");
%>
<div>

    <form action="InscriptionOkServlet" method="post" style="width: 250px; margin: auto"name="nom-formulaire">
        <fieldset>
            <legend>Vos coordonn�es :</legend>

            <input type="radio" name="civilite" id="madame-civilite" value="Madame"/>
            <label for="madame-civilite" class="inline">Mme</label>
            <input type="radio" name="civilite" id="monsieur-monsieur" value="Monsieur"/>
            <label for="monsieur-monsieur" class="inline">Mr</label>

            <label for="nom">Nom :</label>
            <input type="nom" name="nom" size="20"
                   maxlength="40" placeholder="nom" value=<%=jean.getNom() %> id="nom"/>

            <label for="prenom">Pr�nom :</label>
            <input type="prenom" name="prenom" size="20"
                   maxlength="40" placeholder="prenom"value="<%=jean.getPrenom() %>" id="prenom"/>

            <label for="date-naissance">Date de naissance :</label>
            <input type="date" name="date-naissance"  id="date-naissance" placeholder="date de naissance" value="<%=jean.getDateNaissance()%>"/>

            <label for="adresse">N� et rue :</label>
            <input type="text" name="adresse" placeholder="numero et rue" value="<%=jean.getNumeroEtRue() %>" id="adresse"/>

            <label for="ville">Ville :</label>
            <input type="text" name="ville" size="20"
                   maxlength="40" placeholder=<%=jean.getVille() %> id="ville"/>

            <label for="ville">D�partement :</label>
            <select name="departement">
                <option value=""></option>
                <option value='01'>01 - Ain</option>
                <option value='02'>02 - Aisne</option>
                <option value='03'>03 - Allier</option>
                <option value='04'>04 - Alpes de Haute Provence</option>
                <option value='05'>05 - Alpes (Hautes)</option>
                <option value='06'>06 - Alpes Maritimes</option>
                <option value='07'>07 - Ard&egrave;che</option>
                <option value='08'>08 - Ardennes</option>
                <option value='09'>09 - Ari&egrave;ge</option>
                <option value='10'>10 - Aube</option>
                <option value='11'>11 - Aude</option>
                <option value='12'>12 - Aveyron</option>
                <option value='13'>13 - Bouches du Rh&ocirc;ne</option>
                <option value='14'>14 - Calvados</option>
                <option value='15'>15 - Cantal</option>
                <option value='16'>16 - Charente</option>
                <option value='17'>17 - Charente Maritime</option>
                <option value='18'>18 - Cher</option>
                <option value='19'>19 - Corr&egrave;ze</option>
                <option value='20'>20 - Corse</option>
                <option value='21'>21 - C&ocirc;te d&acute;Or</option>
                <option value='22'>22 - C&ocirc;tes d&acute;Armor</option>
                <option value='23'>23 - Creuse</option>
                <option value='24'>24 - Dordogne</option>
                <option value='25'>25 - Doubs</option>
                <option value='26'>26 - Dr&ocirc;me</option>
                <option value='27'>27 - Eure</option>
                <option value='28'>28 - Eure et Loir</option>
                <option value='29'>29 - Finist&egrave;re</option>
                <option value='30'>30 - Gard</option>
                <option value='31'>31 - Garonne (Haute)</option>
                <option value='32'>32 - Gers</option>
                <option value='33'>33 - Gironde</option>
                <option value='34'>34 - H&eacute;rault</option>
                <option value='35'>35 - Ille et Vilaine</option>
                <option value='36'>36 - Indre</option>
                <option value='37'>37 - Indre et Loire</option>
                <option value='38'>38 - Is&egrave;re</option>
                <option value='39'>39 - Jura</option>
                <option value='40'>40 - Landes</option>
                <option value='41'>41 - Loir et Cher</option>
                <option value='42'>42 - Loire</option>
                <option value='43'>43 - Loire (Haute)</option>
                <option value='44'>44 - Loire Atlantique</option>
                <option value='45'>45 - Loiret</option>
                <option value='46'>46 - Lot</option>
                <option value='47'>47 - Lot et Garonne</option>
                <option value='48'>48 - Loz&egrave;re</option>
                <option value='49'>49 - Maine et Loire</option>
                <option value='50'>50 - Manche</option>
                <option value='51'>51 - Marne</option>
                <option value='52'>52 - Marne (Haute)</option>
                <option value='53'>53 - Mayenne</option>
                <option value='54'>54 - Meurthe et Moselle</option>
                <option value='55'>55 - Meuse</option>
                <option value='56'>56 - Morbihan</option>
                <option value='57'>57 - Moselle</option>
                <option value='58'>58 - Ni&egrave;vre</option>
                <option value='59'>59 - Nord</option>
                <option value='60'>60 - Oise</option>
                <option value='61'>61 - Orne</option>
                <option value='62'>62 - Pas de Calais</option>
                <option value='63'>63 - Puy de D&ocirc;me</option>
                <option value='64'>64 - Pyr&eacute;n&eacute;es Atlantiques</option>
                <option value='65'>65 - Pyr&eacute;n&eacute;es (Hautes)</option>
                <option value='66'>66 - Pyr&eacute;n&eacute;es Orientales</option>
                <option value='67'>67 - Rhin (Bas)</option>
                <option value='68'>68 - Rhin (Haut)</option>
                <option value='69'>69 - Rh&ocirc;ne</option>
                <option value='70'>70 - Sa&ocirc;ne (Haute)</option>
                <option value='71'>71 - Sa&ocirc;ne et Loire</option>
                <option value='72'>72 - Sarthe</option>
                <option value='73'>73 - Savoie</option>
                <option value='74'>74 - Savoie (Haute)</option>
                <option value='75'>75 - Paris (Dept.)</option>
                <option value='76'>76 - Seine Maritime</option>
                <option value='77'>77 - Seine et Marne</option>
                <option value='78'>78 - Yvelines</option>
                <option value='79'>79 - S&egrave;vres (Deux)</option>
                <option value='80'>80 - Somme</option>
                <option value='81'>81 - Tarn</option>
                <option value='82'>82 - Tarn et Garonne</option>
                <option value='83'>83 - Var</option>
                <option value='84'>84 - Vaucluse</option>
                <option value='85'>85 - Vend&eacute;e</option>
                <option value='86'>86 - Vienne</option>
                <option value='87'>87 - Vienne (Haute)</option>
                <option value='88'>88 - Vosges</option>
                <option value='89'>89 - Yonne</option>
                <option value='90'>90 - Belfort (Territoire de)</option>
                <option value='91'>91 - Essonne</option>
                <option value='92'>92 - Hauts de Seine</option>
                <option value='93'>93 - Seine Saint Denis</option>
                <option value='94'>94 - Val de Marne</option>
                <option value='95'>95 - Val d&acute;Oise</option>
                <option value='98'>98 - Mayotte</option>
                <option value='9A'>9A - Guadeloupe</option>
                <option value='9B'>9B - Guyane</option>
                <option value='9C'>9C - Martinique</option>
                <option value='9D'>9D - R&eacute;union</option>
            </select>

            <label for="pays">Pays :</label>
            <select name="pays" id="pays">
                <option value="France" selected="selected">France</option>
                <option value="Afghanistan">Afghanistan</option>
                <option value="Afrique_Centrale">Afrique_Centrale</option>
                <option value="Afrique_du_sud">Afrique_du_Sud</option>
                <option value="Albanie">Albanie</option>
                <option value="Algerie">Algerie</option>
                <option value="Allemagne">Allemagne</option>
                <option value="Andorre">Andorre</option>
                <option value="Angola">Angola</option>
                <option value="Anguilla">Anguilla</option>
                <option value="Arabie_Saoudite">Arabie_Saoudite</option>
                <option value="Argentine">Argentine</option>
                <option value="Armenie">Armenie</option>
                <option value="Australie">Australie</option>
                <option value="Autriche">Autriche</option>
                <option value="Azerbaidjan">Azerbaidjan</option>
                <option value="Bahamas">Bahamas</option>
                <option value="Bangladesh">Bangladesh</option>
                <option value="Barbade">Barbade</option>
                <option value="Bahrein">Bahrein</option>
                <option value="Belgique">Belgique</option>
                <option value="Belize">Belize</option>
                <option value="Benin">Benin</option>
                <option value="Bermudes">Bermudes</option>
                <option value="Bielorussie">Bielorussie</option>
                <option value="Bolivie">Bolivie</option>
                <option value="Botswana">Botswana</option>
                <option value="Bhoutan">Bhoutan</option>
                <option value="Boznie_Herzegovine">Boznie_Herzegovine</option>
                <option value="Bresil">Bresil</option>
                <option value="Brunei">Brunei</option>
                <option value="Bulgarie">Bulgarie</option>
                <option value="Burkina_Faso">Burkina_Faso</option>
                <option value="Burundi">Burundi</option>
                <option value="Caiman">Caiman</option>
                <option value="Cambodge">Cambodge</option>
                <option value="Cameroun">Cameroun</option>
                <option value="Canada">Canada</option>
                <option value="Canaries">Canaries</option>
                <option value="Cap_vert">Cap_Vert</option>
                <option value="Chili">Chili</option>
                <option value="Chine">Chine</option>
                <option value="Chypre">Chypre</option>
                <option value="Colombie">Colombie</option>
                <option value="Comores">Colombie</option>
                <option value="Congo">Congo</option>
                <option value="Congo_democratique">Congo_democratique</option>
                <option value="Cook">Cook</option>
                <option value="Coree_du_Nord">Coree_du_Nord</option>
                <option value="Coree_du_Sud">Coree_du_Sud</option>
                <option value="Costa_Rica">Costa_Rica</option>
                <option value="Cote_d_Ivoire">C�te_d_Ivoire</option>
                <option value="Croatie">Croatie</option>
                <option value="Cuba">Cuba</option>
                <option value="Danemark">Danemark</option>
                <option value="Djibouti">Djibouti</option>
                <option value="Dominique">Dominique</option>
                <option value="Egypte">Egypte</option>
                <option value="Emirats_Arabes_Unis">Emirats_Arabes_Unis</option>
                <option value="Equateur">Equateur</option>
                <option value="Erythree">Erythree</option>
                <option value="Espagne">Espagne</option>
                <option value="Estonie">Estonie</option>
                <option value="Etats_Unis">Etats_Unis</option>
                <option value="Ethiopie">Ethiopie</option>
                <option value="Falkland">Falkland</option>
                <option value="Feroe">Feroe</option>
                <option value="Fidji">Fidji</option>
                <option value="Finlande">Finlande</option>
                <option value="France">France</option>
                <option value="Gabon">Gabon</option>
                <option value="Gambie">Gambie</option>
                <option value="Georgie">Georgie</option>
                <option value="Ghana">Ghana</option>
                <option value="Gibraltar">Gibraltar</option>
                <option value="Grece">Grece</option>
                <option value="Grenade">Grenade</option>
                <option value="Groenland">Groenland</option>
                <option value="Guadeloupe">Guadeloupe</option>
                <option value="Guam">Guam</option>
                <option value="Guatemala">Guatemala</option>
                <option value="Guernesey">Guernesey</option>
                <option value="Guinee">Guinee</option>
                <option value="Guinee_Bissau">Guinee_Bissau</option>
                <option value="Guinee equatoriale">Guinee_Equatoriale</option>
                <option value="Guyana">Guyana</option>
                <option value="Guyane_Francaise ">Guyane_Francaise</option>
                <option value="Haiti">Haiti</option>
                <option value="Hawaii">Hawaii</option>
                <option value="Honduras">Honduras</option>
                <option value="Hong_Kong">Hong_Kong</option>
                <option value="Hongrie">Hongrie</option>
                <option value="Inde">Inde</option>
                <option value="Indonesie">Indonesie</option>
                <option value="Iran">Iran</option>
                <option value="Iraq">Iraq</option>
                <option value="Irlande">Irlande</option>
                <option value="Islande">Islande</option>
                <option value="Israel">Israel</option>
                <option value="Italie">italie</option>
                <option value="Jamaique">Jamaique</option>
                <option value="Jan Mayen">Jan Mayen</option>
                <option value="Japon">Japon</option>
                <option value="Jersey">Jersey</option>
                <option value="Jordanie">Jordanie</option>
                <option value="Kazakhstan">Kazakhstan</option>
                <option value="Kenya">Kenya</option>
                <option value="Kirghizstan">Kirghizistan</option>
                <option value="Kiribati">Kiribati</option>
                <option value="Koweit">Koweit</option>
                <option value="Laos">Laos</option>
                <option value="Lesotho">Lesotho</option>
                <option value="Lettonie">Lettonie</option>
                <option value="Liban">Liban</option>
                <option value="Liberia">Liberia</option>
                <option value="Liechtenstein">Liechtenstein</option>
                <option value="Lituanie">Lituanie</option>
                <option value="Luxembourg">Luxembourg</option>
                <option value="Lybie">Lybie</option>
                <option value="Macao">Macao</option>
                <option value="Macedoine">Macedoine</option>
                <option value="Madagascar">Madagascar</option>
                <option value="Mad�re">Mad�re</option>
                <option value="Malaisie">Malaisie</option>
                <option value="Malawi">Malawi</option>
                <option value="Maldives">Maldives</option>
                <option value="Mali">Mali</option>
                <option value="Malte">Malte</option>
                <option value="Man">Man</option>
                <option value="Mariannes du Nord">Mariannes du Nord</option>
                <option value="Maroc">Maroc</option>
                <option value="Marshall">Marshall</option>
                <option value="Martinique">Martinique</option>
                <option value="Maurice">Maurice</option>
                <option value="Mauritanie">Mauritanie</option>
                <option value="Mayotte">Mayotte</option>
                <option value="Mexique">Mexique</option>
                <option value="Micronesie">Micronesie</option>
                <option value="Midway">Midway</option>
                <option value="Moldavie">Moldavie</option>
                <option value="Monaco">Monaco</option>
                <option value="Mongolie">Mongolie</option>
                <option value="Montserrat">Montserrat</option>
                <option value="Mozambique">Mozambique</option>
                <option value="Namibie">Namibie</option>
                <option value="Nauru">Nauru</option>
                <option value="Nepal">Nepal</option>
                <option value="Nicaragua">Nicaragua</option>
                <option value="Niger">Niger</option>
                <option value="Nigeria">Nigeria</option>
                <option value="Niue">Niue</option>
                <option value="Norfolk">Norfolk</option>
                <option value="Norvege">Norvege</option>
                <option value="Nouvelle_Caledonie">Nouvelle_Caledonie</option>
                <option value="Nouvelle_Zelande">Nouvelle_Zelande</option>
                <option value="Oman">Oman</option>
                <option value="Ouganda">Ouganda</option>
                <option value="Ouzbekistan">Ouzbekistan</option>
                <option value="Pakistan">Pakistan</option>
                <option value="Palau">Palau</option>
                <option value="Palestine">Palestine</option>
                <option value="Panama">Panama</option>
                <option value="Papouasie_Nouvelle_Guinee">Papouasie_Nouvelle_Guinee</option>
                <option value="Paraguay">Paraguay</option>
                <option value="Pays_Bas">Pays_Bas</option>
                <option value="Perou">Perou</option>
                <option value="Philippines">Philippines</option>
                <option value="Pologne">Pologne</option>
                <option value="Polynesie">Polynesie</option>
                <option value="Porto_Rico">Porto_Rico</option>
                <option value="Portugal">Portugal</option>
                <option value="Qatar">Qatar</option>
                <option value="Republique_Dominicaine">Republique_Dominicaine</option>
                <option value="Republique_Tcheque">Republique_Tcheque</option>
                <option value="Reunion">Reunion</option>
                <option value="Roumanie">Roumanie</option>
                <option value="Royaume_Uni">Royaume_Uni</option>
                <option value="Russie">Russie</option>
                <option value="Rwanda">Rwanda</option>
                <option value="Sahara Occidental">Sahara Occidental</option>
                <option value="Sainte_Lucie">Sainte_Lucie</option>
                <option value="Saint_Marin">Saint_Marin</option>
                <option value="Salomon">Salomon</option>
                <option value="Salvador">Salvador</option>
                <option value="Samoa_Occidentales">Samoa_Occidentales</option>
                <option value="Samoa_Americaine">Samoa_Americaine</option>
                <option value="Sao_Tome_et_Principe">Sao_Tome_et_Principe</option>
                <option value="Senegal">Senegal</option>
                <option value="Seychelles">Seychelles</option>
                <option value="Sierra Leone">Sierra Leone</option>
                <option value="Singapour">Singapour</option>
                <option value="Slovaquie">Slovaquie</option>
                <option value="Slovenie">Slovenie</option>
                <option value="Somalie">Somalie</option>
                <option value="Soudan">Soudan</option>
                <option value="Sri_Lanka">Sri_Lanka</option>
                <option value="Suede">Suede</option>
                <option value="Suisse">Suisse</option>
                <option value="Surinam">Surinam</option>
                <option value="Swaziland">Swaziland</option>
                <option value="Syrie">Syrie</option>
                <option value="Tadjikistan">Tadjikistan</option>
                <option value="Taiwan">Taiwan</option>
                <option value="Tonga">Tonga</option>
                <option value="Tanzanie">Tanzanie</option>
                <option value="Tchad">Tchad</option>
                <option value="Thailande">Thailande</option>
                <option value="Tibet">Tibet</option>
                <option value="Timor_Oriental">Timor_Oriental</option>
                <option value="Togo">Togo</option>
                <option value="Trinite_et_Tobago">Trinite_et_Tobago</option>
                <option value="Tristan da cunha">Tristan de cuncha</option>
                <option value="Tunisie">Tunisie</option>
                <option value="Turkmenistan">Turmenistan</option>
                <option value="Turquie">Turquie</option>
                <option value="Ukraine">Ukraine</option>
                <option value="Uruguay">Uruguay</option>
                <option value="Vanuatu">Vanuatu</option>
                <option value="Vatican">Vatican</option>
                <option value="Venezuela">Venezuela</option>
                <option value="Vierges_Americaines">Vierges_Americaines</option>
                <option value="Vierges_Britanniques">Vierges_Britanniques</option>
                <option value="Vietnam">Vietnam</option>
                <option value="Wake">Wake</option>
                <option value="Wallis et Futuma">Wallis et Futuma</option>
                <option value="Yemen">Yemen</option>
                <option value="Yougoslavie">Yougoslavie</option>
                <option value="Zambie">Zambie</option>
                <option value="Zimbabwe">Zimbabwe</option>
            </select>

            <label for="phone">N� de t�l�phone :</label>
            <input type="tel" name="phone"
                   maxlength="10" placeholder=<%=jean.getNumeroTelephone() %> id="phone"/>

            <label >E-mail :</label>
            <input type="email" placeholder=<%=jean.getEmail() %> id="email">

            <label for="comments">Vos commentaires :</label>
            <textarea name="comments" id="comments" cols="20" rows="4" selectionDirection="backward"></textarea>
        </fieldset>

        <div>
            <button type="button"
            onclick="validerFormulaire()">Envoyer</button>
            <!--<input type="submit" value="Envoyer"
            onclick="validerFormulaire()"/>-->
            <input type="reset" value="Annuler"/>
             <input type="submit" value="valider"/>
        </div>

    </form>
</div>
<script src="ressources/JS/formulaire.js" type="text/javascript"></script>
</body>
</html>