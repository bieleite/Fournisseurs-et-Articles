<%-- 
    Document   : CreerVetement
    Created on : 13/11/2018, 10:51:42
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
                <label for="designationVetement"> Designation<span class="requis">*</span></label>
                <input type="text" name="designationVetement" value="" size="20" maxlength="20"/>
                <br/>
                <label for="prixVetement"> Prix<span class="requis">*</span></label>
                <input type="text" name="prixVetement" value="" size="80" maxlength="20"/>
                <br/>
                <label for="fournisseurVetement"> Fournisseur<span class="requis">*</span></label>
                <input type="text" name="fournisseurVetement" value="" size="80" maxlength="20"/>
                <br/>
                <label for="colorisVetement"> Coloris<span class="requis">*</span></label>
                <input type="text" name="colorisVetement" value="" size="80" maxlength="20"/>
                <br/>
                <input type="hidden" name="action" value="insererF">
                    
            </fieldset>
            <input type="submit" value="Valider"/>
            <input type="reset" value="Remettre à zéro"/><br/>
        </form>
              <td width=25%><a href="AccesArticle?action=vide"> Retour Menu </a></td>
    </body>
</html>
