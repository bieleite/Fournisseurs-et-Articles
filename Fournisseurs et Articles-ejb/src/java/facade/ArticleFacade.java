/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entite.Article;
import entite.Fournisseur;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author gabrielleite
 */
@Stateless
public class ArticleFacade extends AbstractFacade<Article> implements ArticleFacadeLocal {

    @PersistenceContext(unitName = "Fournisseurs_et_Articles-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArticleFacade() {
        super(Article.class);
    }

    @Override
    public void creerArticle(String designation, String prix,Fournisseur Fourni) {
        Article a = new Article();
        a.setDesignation(designation);
        a.setPrix(prix);
        a.setFourni(Fourni);
        em.persist(a);
    }

    @Override
    public List<Article>  listeArticle() {
        List<Article> ar=null;
        String txt="SELECT ar FROM Article AS ar ";
        Query req=getEntityManager().createQuery(txt);
        List<Article> result=req.getResultList();
        return result;
    }
    
}
