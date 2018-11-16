/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entite.Article;
import entite.Fournisseur;
import entite.Fraicheur;
import entite.Vetement;
import facade.ArticleFacadeLocal;
import facade.FournisseurFacadeLocal;
import facade.FraicheurFacadeLocal;
import facade.VetementFacadeLocal;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author gabrielleite
 */
@Stateless
public class sessionArticle implements sessionArticleLocal {

    @EJB
    private VetementFacadeLocal vetementFacade;

    @EJB
    private FraicheurFacadeLocal fraicheurFacade;

    @EJB
    private ArticleFacadeLocal articleFacade;

    @EJB
    private FournisseurFacadeLocal fournisseurFacade;

    @Override
    public void creerArticle(String designation, String prix,Long id) {
        Fournisseur Fourni = fournisseurFacade.rechercheFournisseur(id);
        if(Fourni !=null){
        articleFacade.creerArticle(designation, prix, Fourni);}
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void creerVetement(String designation, String prix,String Coloris,Long id) {
        Fournisseur Fourni = fournisseurFacade.rechercheFournisseur(id);
        if(Fourni !=null){
        vetementFacade.creerVetement(designation, prix,Coloris, Fourni);}
    }

    @Override
    public void crerrFraicheur(Date dt_limit,String designation, String prix,Long id) {
        Fournisseur Fourni = fournisseurFacade.rechercheFournisseur(id);
        if(Fourni !=null){
        fraicheurFacade.creerFraicheur(dt_limit,designation, prix, Fourni);}
    }

    @Override
    public List<Article> listeArticle() {
        List<Article> liste = articleFacade.listeArticle();
        return liste;
    }

    @Override
    public List<Vetement> listeVetement() {
        List<Vetement> liste = vetementFacade.listVetement(); 
        return liste;
    }

    @Override
    public List<Fraicheur> listeFraicheur() {
        List<Fraicheur> liste = fraicheurFacade.listFraicheur(); 
        return liste;
    }
}
