package entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-26T12:01:37")
@StaticMetamodel(Instanceworksheet.class)
public class Instanceworksheet_ { 

    public static volatile SingularAttribute<Instanceworksheet, String> owner;
    public static volatile SingularAttribute<Instanceworksheet, BigInteger> idinstance;
    public static volatile SingularAttribute<Instanceworksheet, BigInteger> idobject;
    public static volatile SingularAttribute<Instanceworksheet, BigInteger> idworksheet;
    public static volatile SingularAttribute<Instanceworksheet, String> lastuser;
    public static volatile SingularAttribute<Instanceworksheet, Date> firstdate;
    public static volatile SingularAttribute<Instanceworksheet, BigDecimal> id;
    public static volatile SingularAttribute<Instanceworksheet, Date> datecreate;
    public static volatile SingularAttribute<Instanceworksheet, Date> dateupdate;
    public static volatile SingularAttribute<Instanceworksheet, Date> lastdate;

}