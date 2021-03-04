package entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(Actionopscard.class)
public class Actionopscard_ { 

    public static volatile SingularAttribute<Actionopscard, String> owner;
    public static volatile SingularAttribute<Actionopscard, String> lastuser;
    public static volatile SingularAttribute<Actionopscard, String> kind;
    public static volatile SingularAttribute<Actionopscard, BigDecimal> idaction;
    public static volatile SingularAttribute<Actionopscard, BigDecimal> idopscard;
    public static volatile SingularAttribute<Actionopscard, Date> datecreate;
    public static volatile SingularAttribute<Actionopscard, Date> dateupdate;

}