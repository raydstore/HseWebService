package entity;

import entity.Accidentvehiculedriverns;
import entity.Accidentvehiculedriversh;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-02T10:32:57")
@StaticMetamodel(Accidentvehiculedriver.class)
public class Accidentvehiculedriver_ { 

    public static volatile SingularAttribute<Accidentvehiculedriver, String> owner;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> licensenumber;
    public static volatile SingularAttribute<Accidentvehiculedriver, Date> dateofbirth;
    public static volatile SingularAttribute<Accidentvehiculedriver, Accidentvehiculedriversh> accidentvehiculedriversh;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> issuedby;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> adress;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> membership;
    public static volatile SingularAttribute<Accidentvehiculedriver, Date> datecreate;
    public static volatile SingularAttribute<Accidentvehiculedriver, Date> dateupdate;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> placeofbirth;
    public static volatile SingularAttribute<Accidentvehiculedriver, Date> issuedon;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> lastuser;
    public static volatile SingularAttribute<Accidentvehiculedriver, BigDecimal> idaccidentvehicule;
    public static volatile SingularAttribute<Accidentvehiculedriver, Accidentvehiculedriverns> accidentvehiculedriverns;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> name;

}