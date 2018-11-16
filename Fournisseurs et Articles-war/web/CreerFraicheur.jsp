<%-- 
    Document   : CreerFraicheur
    Created on : 13/11/2018, 10:55:25
    Author     : gabrielleite
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<body>
        <h1>Creer Vetement</h1>
        <form method="get" action="AccesArticle">
            <fieldset>
                <legend>Informations Vetement</legend>
                <label for="designationFraicheur"> Designation<span class="requis">*</span></label>
                <input type="text" name="designationFraicheur" value="" size="20" maxlength="20"/>
                <br/>
                <label for="prixFraicheur"> Prix<span class="requis">*</span></label>
                <input type="text" name="prixFraicheur" value="" size="80" maxlength="20"/>
                <br/>
                <label for="fournisseurFraicheur"> Fournisseur<span class="requis">*</span></label>
                <input type="text" name="fournisseurFraicheur" value="" size="80" maxlength="20"/>
                <br/>
                <label for="dtlimitFraicheur"> Date<span class="requis">*</span></label>
                <input type="date" name="dtlimitFraicheur" value="" size="20" maxlength="20"/>
                <br/>
                <input type="hidden" name="action" value="insererFr">
                    
            </fieldset>
            <input type="submit" value="Valider"/>
            <input type="reset" value="Remettre à zéro"/><br/>
        </form>
              <td width=25%><a href="AccesArticle?action=vide"> Retour Menu </a></td>
    </body>
</html>
