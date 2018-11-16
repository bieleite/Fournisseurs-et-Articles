/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entite.Fournisseur;
import entite.typeenum;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author gabrielleite
 */
@Local
public interface FournisseurFacadeLocal {

    void create(Fournisseur fournisseur);

    void edit(Fournisseur fournisseur);

    void remove(Fournisseur fournisseur);

    Fournisseur find(Object id);

    List<Fournisseur> findAll();

    List<Fournisseur> findRange(int[] range);

    int count();

    void creerFounisseur(String nom, String adresse, typeenum type);

    List<Fournisseur> listFournisseur();

    Fournisseur rechercheFournisseur(Long id);
    
}
