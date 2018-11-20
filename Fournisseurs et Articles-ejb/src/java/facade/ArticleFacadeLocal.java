/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entite.Article;
import entite.Fournisseur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author gabrielleite
 */
@Local
public interface ArticleFacadeLocal {

    void create(Article article);

    void edit(Article article);

    void remove(Article article);

    Article find(Object id);

    List<Article> findAll();

    List<Article> findRange(int[] range);

    int count();

    void creerArticle(String designation, double prix,Fournisseur Fourni);

    List<Article> listeArticle();

    List<Article> articleFounisseur(Fournisseur fournis);

    double sommePrixArticle(Fournisseur fournis);

   
    
}
