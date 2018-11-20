/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entite.Article;
import entite.Fournisseur;
import entite.Fraicheur;
import java.util.Date;
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
public class FraicheurFacade extends AbstractFacade<Fraicheur> implements FraicheurFacadeLocal {

    @PersistenceContext(unitName = "Fournisseurs_et_Articles-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FraicheurFacade() {
        super(Fraicheur.class);
    }

    @Override
    public void creerFraicheur(Date dt_limite,String designation,double prix,Fournisseur Fourni) {
        Fraicheur f = new Fraicheur();
        f.setDt_limite(dt_limite);
        f.setDesignation(designation);
        f.setPrix(prix);
        f.setFourni(Fourni);
        em.persist(f);
    }

    @Override
    public List<Fraicheur> listFraicheur() {
        List<Fraicheur> fr=null;
        String txt="SELECT fr FROM Fraicheur AS fr ";
        Query req=getEntityManager().createQuery(txt);
        List<Fraicheur> result=req.getResultList();
        return result;
    }
    
}
