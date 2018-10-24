package entity;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-24T09:46:36")
@StaticMetamodel(VwInspectedsite.class)
public class VwInspectedsite_ { 

    public static volatile SingularAttribute<VwInspectedsite, String> owner;
    public static volatile SingularAttribute<VwInspectedsite, String> lastuser;
    public static volatile SingularAttribute<VwInspectedsite, Short> enable;
    public static volatile SingularAttribute<VwInspectedsite, String> name;
    public static volatile SingularAttribute<VwInspectedsite, BigInteger> periodicity;
    public static volatile SingularAttribute<VwInspectedsite, BigInteger> id;
    public static volatile SingularAttribute<VwInspectedsite, Date> datecreate;
    public static volatile SingularAttribute<VwInspectedsite, Date> dateupdate;

}