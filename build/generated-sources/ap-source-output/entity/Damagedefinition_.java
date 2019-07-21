package entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-21T08:41:00")
@StaticMetamodel(Damagedefinition.class)
public class Damagedefinition_ { 

    public static volatile SingularAttribute<Damagedefinition, String> owner;
    public static volatile SingularAttribute<Damagedefinition, BigInteger> iddamage;
    public static volatile SingularAttribute<Damagedefinition, String> lastuser;
    public static volatile SingularAttribute<Damagedefinition, String> name;
    public static volatile SingularAttribute<Damagedefinition, BigDecimal> id;
    public static volatile SingularAttribute<Damagedefinition, Date> datecreate;
    public static volatile SingularAttribute<Damagedefinition, Date> dateupdate;
    public static volatile SingularAttribute<Damagedefinition, BigInteger> accidentdomain;
    public static volatile SingularAttribute<Damagedefinition, BigInteger> idgrid;

}