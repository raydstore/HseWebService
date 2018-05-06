package entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T11:58:55")
@StaticMetamodel(Detailsite.class)
public class Detailsite_ { 

    public static volatile SingularAttribute<Detailsite, String> owner;
    public static volatile SingularAttribute<Detailsite, BigDecimal> idsite;
    public static volatile SingularAttribute<Detailsite, String> path;
    public static volatile SingularAttribute<Detailsite, String> lastuser;
    public static volatile SingularAttribute<Detailsite, BigInteger> count;
    public static volatile SingularAttribute<Detailsite, BigInteger> rank;
    public static volatile SingularAttribute<Detailsite, Date> datecreate;
    public static volatile SingularAttribute<Detailsite, Date> dateupdate;

}