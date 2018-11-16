<%-- 
    Document   : Choix
    Created on : 06/11/2018, 11:27:57
    Author     : gabrielleite
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>
        <h1>Menu</h1>
        <p>
            <% 
                String attribut = (String) request.getAttribute("message");
                out.println(attribut);
            %>
        </p>
        <table>
            <tr>
                <td width="25%"> <a href="CreerFounisseur.jsp">Creer Fournisseur</a></td>
                <td width="25%"><a href="CreerA.jsp">Creer Article</a></td>
                <td width="25%"><a href="CreerFraicheur.jsp">Creer Fraicheur</a></td>
                <td width="25%"><a href="CreerVetement.jsp">Creer Vetement</a></td>
                <td width="25%"><a href="AccesArticle?action=afficheF">Afficher Fournisseur</a></td>
            </tr>
        </table>
    </body>
</html>
