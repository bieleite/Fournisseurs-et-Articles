/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entite.Fournisseur;
import entite.typeenum;
import facade.FournisseurFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author gabrielleite
 */
@Stateless
public class sessionFournisseur implements sessionFournisseurLocal {



    @EJB
    private FournisseurFacadeLocal fournisseurFacade;

    @Override
    public void creerFounisseur(String nom, String adresse, typeenum type) {
        fournisseurFacade.creerFounisseur(nom, adresse, type);
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Fournisseur> afficherFournisseur() {
        List<Fournisseur> liste = fournisseurFacade.listFournisseur(); 
        return liste;
    }
}
