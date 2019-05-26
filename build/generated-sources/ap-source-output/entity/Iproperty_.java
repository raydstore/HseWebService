package entity;

import entity.IpropertyPK;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-25T13:33:38")
@StaticMetamodel(Iproperty.class)
public class Iproperty_ { 

    public static volatile SingularAttribute<Iproperty, String> owner;
    public static volatile SingularAttribute<Iproperty, IpropertyPK> ipropertyPK;
    public static volatile SingularAttribute<Iproperty, String> lastuser;
    public static volatile SingularAttribute<Iproperty, Date> datecreate;
    public static volatile SingularAttribute<Iproperty, Date> dateupdate;
    public static volatile SingularAttribute<Iproperty, String> type;
    public static volatile SingularAttribute<Iproperty, BigInteger> value;

}