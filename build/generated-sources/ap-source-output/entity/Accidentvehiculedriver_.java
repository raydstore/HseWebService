package entity;

import entity.Accidentvehicule;
import entity.Driver;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T14:53:21")
@StaticMetamodel(Accidentvehiculedriver.class)
public class Accidentvehiculedriver_ { 

    public static volatile SingularAttribute<Accidentvehiculedriver, String> owner;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> lastuser;
    public static volatile SingularAttribute<Accidentvehiculedriver, Driver> iddriver;
    public static volatile SingularAttribute<Accidentvehiculedriver, Accidentvehicule> idaccidentvehicule;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> permit;
    public static volatile SingularAttribute<Accidentvehiculedriver, BigDecimal> id;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> membership;
    public static volatile SingularAttribute<Accidentvehiculedriver, Date> datecreate;
    public static volatile SingularAttribute<Accidentvehiculedriver, Date> dateupdate;

}