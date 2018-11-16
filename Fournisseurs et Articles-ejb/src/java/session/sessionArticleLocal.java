/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entite.Article;
import entite.Fraicheur;
import entite.Vetement;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author gabrielleite
 */
@Local
public interface sessionArticleLocal {

    void creerArticle(String designation, String prix,Long id);

    void creerVetement(String designation, String prix,String Coloris,Long id);

    void crerrFraicheur(Date dt_limit,String designation, String prix,Long id);

    List<Article> listeArticle();

    List<Vetement> listeVetement();

    List<Fraicheur> listeFraicheur();
    
}
