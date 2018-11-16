/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entite.Fournisseur;
import entite.typeenum;
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
public class FournisseurFacade extends AbstractFacade<Fournisseur> implements FournisseurFacadeLocal {

    @PersistenceContext(unitName = "Fournisseurs_et_Articles-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FournisseurFacade() {
        super(Fournisseur.class);
    }

    @Override
    public void creerFounisseur(String nom, String adresse, typeenum type) {
         Fournisseur f = new Fournisseur();
        f.setNom(nom);
        f.setAdresse(adresse);
        f.setType(type);
        em.persist(f);
    }

    @Override
    public List<Fournisseur> listFournisseur() {
        List<Fournisseur> fo=null;
        String txt="SELECT fo FROM Fournisseur AS fo ";
        Query req=getEntityManager().createQuery(txt);
        List<Fournisseur> result=req.getResultList();
        return result;
    }

    @Override
    public Fournisseur rechercheFournisseur(Long id) {
        Fournisseur f = null;        
        String txt = "SELECT f FROM Fournisseur AS f WHERE f.id=:id";
        Query req = getEntityManager().createQuery(txt);
        req = req.setParameter("id", id);  
        List<Fournisseur> res = req.getResultList();
        if (res.size() >= 1)
        {
              f = (Fournisseur) res.get(0);
        }
        return f;
    }
    
}
