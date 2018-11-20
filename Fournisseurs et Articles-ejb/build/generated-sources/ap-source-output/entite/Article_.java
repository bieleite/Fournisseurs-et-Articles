package entite;

import entite.Fournisseur;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T11:52:09")
@StaticMetamodel(Article.class)
public class Article_ { 

    public static volatile SingularAttribute<Article, Double> prix;
    public static volatile SingularAttribute<Article, Fournisseur> Fourni;
    public static volatile SingularAttribute<Article, String> designation;
    public static volatile SingularAttribute<Article, Long> id;

}