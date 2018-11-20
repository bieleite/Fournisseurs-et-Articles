<%-- 
    Document   : AffichePrixArticle
    Created on : 20/11/2018, 11:11:53
    Author     : gabrielleite
--%>

<%@page import="entite.Article"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Article</title>
    </head>
    <body>
        <h1>Afficher Article</h1>
        <p><% 
            String attribut = (String) request.getAttribute("listefournisseur");
            out.println(attribut);
            %></p>

        <hr>
    <td width=25%><a href="AccesArticle?action=vide"> Retour Menu </a></td>
    <hr>
</body>
</html>
