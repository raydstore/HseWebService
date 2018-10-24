package entity;

import entity.Accidentvehicule;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-24T09:46:36")
@StaticMetamodel(Accidentvehiculeowner.class)
public class Accidentvehiculeowner_ { 

    public static volatile SingularAttribute<Accidentvehiculeowner, String> owner;
    public static volatile SingularAttribute<Accidentvehiculeowner, String> lastuser;
    public static volatile SingularAttribute<Accidentvehiculeowner, BigDecimal> idaccidentvehicule;
    public static volatile SingularAttribute<Accidentvehiculeowner, String> phone;
    public static volatile SingularAttribute<Accidentvehiculeowner, String> name;
    public static volatile SingularAttribute<Accidentvehiculeowner, String> adress;
    public static volatile SingularAttribute<Accidentvehiculeowner, Accidentvehicule> accidentvehicule;
    public static volatile SingularAttribute<Accidentvehiculeowner, Date> datecreate;
    public static volatile SingularAttribute<Accidentvehiculeowner, Date> dateupdate;

}