package entity;

import entity.Accidentvehicule;
import entity.Agency;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(Assurance.class)
public class Assurance_ { 

    public static volatile SingularAttribute<Assurance, String> owner;
    public static volatile SingularAttribute<Assurance, Date> datelast;
    public static volatile SingularAttribute<Assurance, String> lastuser;
    public static volatile SingularAttribute<Assurance, Accidentvehicule> idaccidentvehicule;
    public static volatile SingularAttribute<Assurance, Date> datefirst;
    public static volatile SingularAttribute<Assurance, BigDecimal> id;
    public static volatile SingularAttribute<Assurance, Date> datecreate;
    public static volatile SingularAttribute<Assurance, Date> dateupdate;
    public static volatile SingularAttribute<Assurance, Agency> idagency;
    public static volatile SingularAttribute<Assurance, String> policy;

}