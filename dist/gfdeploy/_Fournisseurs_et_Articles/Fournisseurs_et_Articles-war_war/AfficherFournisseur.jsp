<%-- 
    Document   : AfficherFournisseur
    Created on : 13/11/2018, 08:52:29
    Author     : gabrielleite
--%>

<%@page import="entite.Fournisseur"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:useBean id="listefournisseur" scope="request" class="java.util.List"></jsp:useBean>
        <title>Fournisseur</title>
    </head>
    <body>
        <h1>Afficher Fournisseur</h1>
        <p><% 
            String attribut = (String) request.getAttribute("message");
            out.println(attribut);
            %></p>
        <table border width=50%>
            <tr> 
                <td>Numero</td>
                <td>Nom</td>
                <td>Adresse</td>
                <td>Type</td>
            </tr>
            <% List<Fournisseur> lesFour=listefournisseur;
                for(Fournisseur cp : lesFour){%>
                <tr>
                    <td width=15%><%=cp.getId()%></td>
                    <td width=15%><%=cp.getNom()%></td>
                    <td width=15%><%=cp.getAdresse()%></td>
                    <td width=15%><%=cp.getType()%></td>
                </tr><%}%>     
        </table>
        <hr>
    <td width=25%><a href="AccesArticle?action=vide"> Retour Menu </a></td>
    <hr>
</body>
</html>
