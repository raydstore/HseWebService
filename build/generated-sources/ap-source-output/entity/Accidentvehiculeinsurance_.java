package entity;

import entity.Accidentvehicule;
import entity.Entreprise;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-24T09:46:36")
@StaticMetamodel(Accidentvehiculeinsurance.class)
public class Accidentvehiculeinsurance_ { 

    public static volatile SingularAttribute<Accidentvehiculeinsurance, String> owner;
    public static volatile SingularAttribute<Accidentvehiculeinsurance, Date> datelast;
    public static volatile SingularAttribute<Accidentvehiculeinsurance, String> lastuser;
    public static volatile SingularAttribute<Accidentvehiculeinsurance, BigDecimal> idaccidentvehicule;
    public static volatile SingularAttribute<Accidentvehiculeinsurance, String> policynumber;
    public static volatile SingularAttribute<Accidentvehiculeinsurance, Date> datefirst;
    public static volatile SingularAttribute<Accidentvehiculeinsurance, Accidentvehicule> accidentvehicule;
    public static volatile SingularAttribute<Accidentvehiculeinsurance, Date> datecreate;
    public static volatile SingularAttribute<Accidentvehiculeinsurance, Date> dateupdate;
    public static volatile SingularAttribute<Accidentvehiculeinsurance, Entreprise> identreprise;

}