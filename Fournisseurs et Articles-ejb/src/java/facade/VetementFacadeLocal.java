/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entite.Fournisseur;
import entite.Vetement;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author gabrielleite
 */
@Local
public interface VetementFacadeLocal {

    void create(Vetement vetement);

    void edit(Vetement vetement);

    void remove(Vetement vetement);

    Vetement find(Object id);

    List<Vetement> findAll();

    List<Vetement> findRange(int[] range);

    int count();

    void creerVetement(String coloris,String designation,double prix,Fournisseur Fourni);

    List<Vetement> listVetement();
    
}
