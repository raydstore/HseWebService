package entity;

import entity.Accidentvehiculedriver;
import entity.Accidentvehiculeinsurance;
import entity.Accidentvehiculeowner;
import entity.Mark;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-26T12:01:37")
@StaticMetamodel(Accidentvehicule.class)
public class Accidentvehicule_ { 

    public static volatile SingularAttribute<Accidentvehicule, String> owner;
    public static volatile SingularAttribute<Accidentvehicule, String> matricule;
    public static volatile SingularAttribute<Accidentvehicule, String> kind;
    public static volatile SingularAttribute<Accidentvehicule, String> destination;
    public static volatile SingularAttribute<Accidentvehicule, Accidentvehiculeinsurance> accidentvehiculeinsurance;
    public static volatile SingularAttribute<Accidentvehicule, Mark> idmark;
    public static volatile SingularAttribute<Accidentvehicule, String> source;
    public static volatile SingularAttribute<Accidentvehicule, Date> datecreate;
    public static volatile SingularAttribute<Accidentvehicule, Date> dateupdate;
    public static volatile SingularAttribute<Accidentvehicule, String> classification;
    public static volatile SingularAttribute<Accidentvehicule, Accidentvehiculeowner> accidentvehiculeowner;
    public static volatile SingularAttribute<Accidentvehicule, BigInteger> iddamage;
    public static volatile SingularAttribute<Accidentvehicule, String> lastuser;
    public static volatile SingularAttribute<Accidentvehicule, String> name;
    public static volatile SingularAttribute<Accidentvehicule, Accidentvehiculedriver> accidentvehiculedriver;
    public static volatile SingularAttribute<Accidentvehicule, BigDecimal> id;
    public static volatile SingularAttribute<Accidentvehicule, BigInteger> accidentdomain;
    public static volatile SingularAttribute<Accidentvehicule, BigInteger> idgrid;

}