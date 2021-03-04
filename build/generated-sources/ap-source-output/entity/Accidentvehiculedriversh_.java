package entity;

import entity.Agent;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(Accidentvehiculedriversh.class)
public class Accidentvehiculedriversh_ { 

    public static volatile SingularAttribute<Accidentvehiculedriversh, String> owner;
    public static volatile SingularAttribute<Accidentvehiculedriversh, Agent> idagent;
    public static volatile SingularAttribute<Accidentvehiculedriversh, String> lastuser;
    public static volatile SingularAttribute<Accidentvehiculedriversh, BigDecimal> idaccidentvehicule;
    public static volatile SingularAttribute<Accidentvehiculedriversh, String> membership;
    public static volatile SingularAttribute<Accidentvehiculedriversh, Date> datecreate;
    public static volatile SingularAttribute<Accidentvehiculedriversh, Date> dateupdate;

}