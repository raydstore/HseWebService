package entity;

import entity.Accidentvehiculedriver;
import entity.Assurance;
import entity.Entreprise;
import entity.Mark;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T10:32:35")
@StaticMetamodel(Accidentvehicule.class)
public class Accidentvehicule_ { 

    public static volatile SingularAttribute<Accidentvehicule, String> owner;
    public static volatile SingularAttribute<Accidentvehicule, String> matricule;
    public static volatile SingularAttribute<Accidentvehicule, String> kind;
    public static volatile SingularAttribute<Accidentvehicule, String> destination;
    public static volatile SingularAttribute<Accidentvehicule, Mark> idmark;
    public static volatile SingularAttribute<Accidentvehicule, String> source;
    public static volatile SingularAttribute<Accidentvehicule, Date> datecreate;
    public static volatile SingularAttribute<Accidentvehicule, Date> dateupdate;
    public static volatile SingularAttribute<Accidentvehicule, String> classification;
    public static volatile SingularAttribute<Accidentvehicule, Entreprise> identreprise;
    public static volatile CollectionAttribute<Accidentvehicule, Accidentvehiculedriver> accidentvehiculedriverCollection;
    public static volatile SingularAttribute<Accidentvehicule, BigInteger> iddamage;
    public static volatile SingularAttribute<Accidentvehicule, String> lastuser;
    public static volatile SingularAttribute<Accidentvehicule, String> name;
    public static volatile CollectionAttribute<Accidentvehicule, Assurance> assuranceCollection;
    public static volatile SingularAttribute<Accidentvehicule, BigDecimal> id;
    public static volatile SingularAttribute<Accidentvehicule, BigInteger> accidentdomain;
    public static volatile SingularAttribute<Accidentvehicule, BigInteger> idgrid;

}