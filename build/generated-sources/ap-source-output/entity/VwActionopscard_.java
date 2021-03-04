package entity;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(VwActionopscard.class)
public class VwActionopscard_ { 

    public static volatile SingularAttribute<VwActionopscard, String> owner;
    public static volatile SingularAttribute<VwActionopscard, String> lastuser;
    public static volatile SingularAttribute<VwActionopscard, String> kind;
    public static volatile SingularAttribute<VwActionopscard, String> name;
    public static volatile SingularAttribute<VwActionopscard, String> id;
    public static volatile SingularAttribute<VwActionopscard, BigInteger> idopscard;
    public static volatile SingularAttribute<VwActionopscard, BigInteger> idaction;
    public static volatile SingularAttribute<VwActionopscard, String> state;
    public static volatile SingularAttribute<VwActionopscard, Date> datecreate;
    public static volatile SingularAttribute<VwActionopscard, Date> dateupdate;

}