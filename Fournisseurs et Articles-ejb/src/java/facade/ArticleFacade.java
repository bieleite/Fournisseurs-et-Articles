/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entite.Article;
import entite.Fournisseur;
import java.util.List;
import java.util.Set;
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
    public void creerArticle(String designation, double prix,Fournisseur Fourni) {
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

    @Override
    public List<Article> articleFounisseur(Fournisseur fournis) {
        Article result = null;
        Query req = getEntityManager().createQuery("SELECT a FROM Article AS a WHERE a.Fourni=:fournis");
        req.setParameter("fournis", fournis);
        List<Article> l = req.getResultList();
        return l;
    }

    @Override
    public double sommePrixArticle(Fournisseur fournis) {
//         Article result = null;
        Query req = getEntityManager().createQuery("SELECT SUM(a.prix) FROM Article AS a WHERE a.Fourni=:fournis");
        req.setParameter("fournis", fournis);
        double d = (double)req.getSingleResult();
        return d;
    }

   
    
    
}
