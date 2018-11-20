<%-- 
    Document   : CreerA
    Created on : 06/11/2018, 11:32:51
    Author     : gabrielleite
--%>


<%@page import="java.util.List"%>
<%@page import="entite.Fournisseur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creer Article</title>
        <jsp:useBean id="listefournisseur" scope="request" class="java.util.List"></jsp:useBean>
    </head>
<body>
        <h1>Creer Article</h1>
<% List<Fournisseur> lesFour=listefournisseur;%>
        <form method="get" action="AccesArticle">
            <fieldset>
                <legend>Informations Article</legend>
                <label for="designationArticle"> Designation<span class="requis">*</span></label>
                <input type="text" name="designationArticle" value="" size="20" maxlength="20"/>
                <br/>
                <label for="prixArticle"> Prix <span class="requis">*</span></label>
                <input type="text" name="prixArticle" value="" size="80" maxlength="20"/>
                <br/>
                <label for="fournisseurArticle"> Fournisseur<span class="requis">*</span></label>
                <%--<input type="text" name="fournisseurArticle" value="" size="80" maxlength="20"/>
                <br/>--%>
                <select name="fournisseurArticle">
                    <% for (Fournisseur f:lesFour){%>
                    <option value="<%=f.getId()%>"><%=f.getNom()%></option>
                    <%}%>
                </select>
                <input type="hidden" name="action" value="insererA">
                    
            </fieldset>
            <input type="submit" value="Valider"/>
            <input type="reset" value="Remettre à zéro"/><br/>
        </form>
              <td width=25%><a href="AccesArticle?action=vide"> Retour Menu </a></td>
    </body>
</html>
