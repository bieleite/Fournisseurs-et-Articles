/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entite.Fournisseur;
import entite.typeenum;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.sessionArticleLocal;
import session.sessionFournisseurLocal;

/**
 *
 * @author gabrielleite
 */
@WebServlet(urlPatterns = {"/AccesArticle"})
public class AccesArticle extends HttpServlet {

    @EJB
    private sessionArticleLocal sessionArticle;

    @EJB
    private sessionFournisseurLocal sessionFournisseur;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
            
            
        String jspClient=null;
        String act=request.getParameter("action");
            if((act==null)||(act.equals("vide")))
            {
                jspClient="/Choix.jsp";
                request.setAttribute("message","pas d'information");
            }
            else if(act.equals("insererF"))
            {
                jspClient="/Choix.jsp";
                doActionInsererF(request,response);
            }
            else if(act.equals("insererA"))
            {
                jspClient="/CreerA.jsp";
                doActionInsererA(request,response);
            }
            else if(act.equals("insererV"))
            {
                jspClient="/CreerVetement.jsp";
                doActionInsererV(request,response);
            }
            else if(act.equals("insererFr"))
            {
                jspClient="/CreerFraicheur.jsp";
                doActionInsererFr(request,response);
            }
            else if(act.equals("afficheF"))
            {
                jspClient="/AfficherFournisseur.jsp";
                List<Fournisseur> list= sessionFournisseur.afficherFournisseur();
                request.setAttribute("listefournisseur",list);
                request.setAttribute("message","Liste des fournisseurs existants");
            }
            
        RequestDispatcher Rd;
        Rd = getServletContext().getRequestDispatcher(jspClient);
        Rd.forward(request, response);
        
//        String nom = request.getParameter("nomFournisseur");
//        String adresse = request.getParameter("adresseFournisseur");
//        String ident = request.getParameter("identifiantFournisseur");
//        Integer id = Integer.valueOf(ident);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AccesArticle</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AccesArticle at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    protected void doActionInsererF(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        enumtyp typ = enumtyp.valueOf(ty)
        String nom = request.getParameter("nomFournisseur");
        String adresse = request.getParameter("adresseFournisseur");
        String ty = request.getParameter("type");
        String message;
        if(nom.trim().isEmpty()|| adresse.trim().isEmpty()||ty.trim().isEmpty()){
            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires." + "<br/><a href=\"CreerFounisseur.jsp\">Clique ici </a>pour accéder au formulaire de creation d'un fournisseur.";
        }
        else {
            typeenum typ = typeenum.valueOf(ty);
            sessionFournisseur.creerFounisseur(nom, adresse, typ);
            message= "Fournisseur créé avec succès !";
            
        }
        request.setAttribute("message", message);
        
    }
    protected void doActionInsererA(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String designation = request.getParameter("designationArticle");
        String prix = request.getParameter("prixArticle");
        String idd = request.getParameter("fournisseurArticle");
        String message;
        if(designation.trim().isEmpty()|| prix.trim().isEmpty()||idd.trim().isEmpty()){
            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires." + "<br/><a href=\"CreerFounisseur.jsp\">Clique ici </a>pour accéder au formulaire de creation d'un fournisseur.";
        }
        else {
            Long id = Long.valueOf(idd);
            sessionArticle.creerArticle(designation, prix, id);
            message= "Article créé avec succès !";
            
        }
        request.setAttribute("message", message);
        
    }
    protected void doActionInsererV(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String designation = request.getParameter("designationVetement");
        String prix = request.getParameter("prixVetement");
        String idd = request.getParameter("fournisseurVetement");
        String coloris = request.getParameter("colorisVetement");
        String message;
        if(designation.trim().isEmpty()|| prix.trim().isEmpty()||idd.trim().isEmpty()||coloris.trim().isEmpty()){
            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires." + "<br/><a href=\"CreerFounisseur.jsp\">Clique ici </a>pour accéder au formulaire de creation d'un fournisseur.";
        }
        else {
            Long id = Long.valueOf(idd);
            sessionArticle.creerVetement(designation, prix, coloris, id);
            message= "Article créé avec succès !";
            
        }
        request.setAttribute("message", message);
    }
    protected void doActionInsererFr(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String designation = request.getParameter("designationFraicheur");
        String prix = request.getParameter("prixFraicheur");
        String idd = request.getParameter("fournisseurFraicheur");
        String date_lim = request.getParameter("dtlimitFraicheur");
        String message;
        if(designation.trim().isEmpty()|| prix.trim().isEmpty()||idd.trim().isEmpty()||date_lim.trim().isEmpty()){
            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires." + "<br/><a href=\"CreerFounisseur.jsp\">Clique ici </a>pour accéder au formulaire de creation d'un fournisseur.";
        }
        else {
            Long id = Long.valueOf(idd);
            Date d = Date.valueOf(date_lim);   
            sessionArticle.crerrFraicheur(d, designation, prix, id);
            message= "Article créé avec succès !";
            
        }
        request.setAttribute("message", message);
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
