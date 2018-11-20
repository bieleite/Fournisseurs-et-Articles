/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entite.Fournisseur;
import entite.Vetement;
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
public class VetementFacade extends AbstractFacade<Vetement> implements VetementFacadeLocal {

    @PersistenceContext(unitName = "Fournisseurs_et_Articles-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VetementFacade() {
        super(Vetement.class);
    }

    @Override
    public void creerVetement(String coloris,String designation,double prix,Fournisseur Fourni) {
        Vetement v = new Vetement();
        v.setColoris(coloris);
        v.setDesignation(designation);
        v.setPrix(prix);
        v.setFourni(Fourni);
        em.persist(v);
    }

    @Override
    public List<Vetement> listVetement() {
        List<Vetement> ve=null;
        String txt="SELECT ve FROM Vetement AS ve ";
        Query req=getEntityManager().createQuery(txt);
        List<Vetement> result=req.getResultList();
        return result;
    }
    
}
