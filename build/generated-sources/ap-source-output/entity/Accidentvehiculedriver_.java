package entity;

import entity.Accidentvehicule;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-24T09:46:36")
@StaticMetamodel(Accidentvehiculedriver.class)
public class Accidentvehiculedriver_ { 

    public static volatile SingularAttribute<Accidentvehiculedriver, String> owner;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> licensenumber;
    public static volatile SingularAttribute<Accidentvehiculedriver, Date> dateofbirth;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> issuedby;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> adress;
    public static volatile SingularAttribute<Accidentvehiculedriver, Accidentvehicule> accidentvehicule;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> membership;
    public static volatile SingularAttribute<Accidentvehiculedriver, Date> datecreate;
    public static volatile SingularAttribute<Accidentvehiculedriver, Date> dateupdate;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> placeofbirth;
    public static volatile SingularAttribute<Accidentvehiculedriver, Date> issuedon;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> lastuser;
    public static volatile SingularAttribute<Accidentvehiculedriver, BigDecimal> idaccidentvehicule;
    public static volatile SingularAttribute<Accidentvehiculedriver, String> name;

}