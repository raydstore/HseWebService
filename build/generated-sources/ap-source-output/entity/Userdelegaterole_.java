package entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(Userdelegaterole.class)
public class Userdelegaterole_ { 

    public static volatile SingularAttribute<Userdelegaterole, String> owner;
    public static volatile SingularAttribute<Userdelegaterole, Date> datelast;
    public static volatile SingularAttribute<Userdelegaterole, BigInteger> idmanager;
    public static volatile SingularAttribute<Userdelegaterole, String> lastuser;
    public static volatile SingularAttribute<Userdelegaterole, BigInteger> iduserdelegate;
    public static volatile SingularAttribute<Userdelegaterole, BigInteger> idroledelegate;
    public static volatile SingularAttribute<Userdelegaterole, Date> datefirst;
    public static volatile SingularAttribute<Userdelegaterole, BigDecimal> id;
    public static volatile SingularAttribute<Userdelegaterole, Date> datecreate;
    public static volatile SingularAttribute<Userdelegaterole, Date> dateupdate;
    public static volatile SingularAttribute<Userdelegaterole, BigInteger> idrolemanager;

}