<%-- 
    Document   : RechercheFournisseur
    Created on : 20/11/2018, 10:30:10
    Author     : gabrielleite
--%>

<%@page import="java.util.List"%>
<%@page import="entite.Fournisseur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:useBean id="listefournisseur" scope="request" class="java.util.List"></jsp:useBean>
    </head>
<body>
        <h1>Creer Article</h1>
<% List<Fournisseur> lesFour=listefournisseur;%>
<form method="get" action="AccesArticle">
    <fieldset>
 
                <select name="fournisseurArticle">
                    <% for (Fournisseur f:lesFour){%>
                    <option value="<%=f.getId()%>"><%=f.getNom()%></option>
                    <%}%>
                </select>
                <input type="hidden" name="action" value="afficheAF">
                    
            </fieldset>
            <input type="submit" value="Valider"/>
            <input type="reset" value="Remettre à zéro"/><br/>
        </form>
              <td width=25%><a href="AccesArticle?action=vide"> Retour Menu </a></td>
    </body>
</html>
