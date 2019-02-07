package entity;

import entity.Accidentnature;
import entity.Accidentpicture;
import entity.Agent;
import entity.Aggravatingfactor;
import entity.Cause;
import entity.Recommendation;
import entity.Site;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-06T09:23:01")
@StaticMetamodel(Accident.class)
public class Accident_ { 

    public static volatile SingularAttribute<Accident, String> envirenementdamage;
    public static volatile CollectionAttribute<Accident, Aggravatingfactor> aggravatingfactorCollection;
    public static volatile SingularAttribute<Accident, String> owner;
    public static volatile SingularAttribute<Accident, Site> idsite;
    public static volatile SingularAttribute<Accident, String> sitedescription;
    public static volatile SingularAttribute<Accident, BigInteger> tabindex;
    public static volatile SingularAttribute<Accident, String> persondamage;
    public static volatile SingularAttribute<Accident, Date> curdate;
    public static volatile SingularAttribute<Accident, Date> datecreate;
    public static volatile SingularAttribute<Accident, Date> dateupdate;
    public static volatile SingularAttribute<Accident, String> classification;
    public static volatile CollectionAttribute<Accident, Recommendation> recommendationCollection;
    public static volatile SingularAttribute<Accident, Agent> idagentdeclare;
    public static volatile SingularAttribute<Accident, String> lastuser;
    public static volatile CollectionAttribute<Accident, Cause> causeCollection;
    public static volatile CollectionAttribute<Accident, Accidentnature> accidentnatureCollection;
    public static volatile SingularAttribute<Accident, Agent> idagentvalidate;
    public static volatile SingularAttribute<Accident, String> propertydamage;
    public static volatile CollectionAttribute<Accident, Accidentpicture> accidentpictureCollection;
    public static volatile SingularAttribute<Accident, String> obviouscause;
    public static volatile SingularAttribute<Accident, BigDecimal> id;
    public static volatile SingularAttribute<Accident, String> place;
    public static volatile SingularAttribute<Accident, Date> time;
    public static volatile SingularAttribute<Accident, String> event;

}