package entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-11T19:02:58")
@StaticMetamodel(Titletask.class)
public class Titletask_ { 

    public static volatile SingularAttribute<Titletask, BigInteger> idparent;
    public static volatile SingularAttribute<Titletask, String> owner;
    public static volatile SingularAttribute<Titletask, String> kindparent;
    public static volatile SingularAttribute<Titletask, String> lastuser;
    public static volatile SingularAttribute<Titletask, String> kind;
    public static volatile SingularAttribute<Titletask, String> name;
    public static volatile SingularAttribute<Titletask, BigDecimal> id;
    public static volatile SingularAttribute<Titletask, Date> datecreate;
    public static volatile SingularAttribute<Titletask, Date> dateupdate;

}