package entite;

import entite.Article;
import entite.typeenum;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T11:52:09")
@StaticMetamodel(Fournisseur.class)
public class Fournisseur_ { 

    public static volatile SingularAttribute<Fournisseur, String> adresse;
    public static volatile SingularAttribute<Fournisseur, Long> id;
    public static volatile SingularAttribute<Fournisseur, typeenum> type;
    public static volatile ListAttribute<Fournisseur, Article> articles;
    public static volatile SingularAttribute<Fournisseur, String> nom;

}