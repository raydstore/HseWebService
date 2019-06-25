package entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-25T11:13:24")
@StaticMetamodel(Statementtask.class)
public class Statementtask_ { 

    public static volatile SingularAttribute<Statementtask, String> owner;
    public static volatile SingularAttribute<Statementtask, String> lastuser;
    public static volatile SingularAttribute<Statementtask, String> kind;
    public static volatile SingularAttribute<Statementtask, BigInteger> count;
    public static volatile SingularAttribute<Statementtask, Date> datecreate;
    public static volatile SingularAttribute<Statementtask, Date> dateupdate;
    public static volatile SingularAttribute<Statementtask, BigDecimal> idtitletask;

}