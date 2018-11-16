<%-- 
    Document   : CreerFounisseur
    Created on : 06/11/2018, 11:32:21
    Author     : gabrielleite
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creer Founisseur</title>
    </head>
    <body>
        <h1>Creer Fournisseur</h1>
        <form method="get" action="AccesArticle">
            <fieldset>
                <legend>Informations Fournisseur</legend>
                <label for="nomFournisseur"> Nom<span class="requis">*</span></label>
                <input type="text" name="nomFournisseur" value="" size="20" maxlength="20"/>
                <br/>
                <label for="adresseFournisseur"> Adresse<span class="requis">*</span></label>
                <input type="text" name="adresseFournisseur" value="" size="80" maxlength="20"/>
                <br/>
                <input type="hidden" name="action" value="insererF">
                <tr><td> Type de fournisseur</td><td><SELECT size="1" name="type">
                            <option value="N"> Grand</option>
                            <option value="R">Petit </option>
                        </select></td></tr>
                    
            </fieldset>
            <input type="submit" value="Valider"/>
            <input type="reset" value="Remettre à zéro"/><br/>
        </form>
              <td width=25%><a href="AccesArticle?action=vide"> Retour Menu </a></td>
    </body>
</html>
