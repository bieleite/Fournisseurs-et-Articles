/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entite.Fournisseur;
import entite.typeenum;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author gabrielleite
 */
@Local
public interface sessionFournisseurLocal {

    void creerFounisseur(String nom, String adresse, typeenum type);

    List<Fournisseur> afficherFournisseur();
    
}
