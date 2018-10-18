package entity;

import entity.Inspectplanning;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-14T12:03:22")
@StaticMetamodel(Inspectedsite.class)
public class Inspectedsite_ { 

    public static volatile SingularAttribute<Inspectedsite, String> owner;
    public static volatile SingularAttribute<Inspectedsite, BigDecimal> idsite;
    public static volatile SingularAttribute<Inspectedsite, String> lastuser;
    public static volatile CollectionAttribute<Inspectedsite, Inspectplanning> inspectplanningCollection;
    public static volatile SingularAttribute<Inspectedsite, Short> enable;
    public static volatile SingularAttribute<Inspectedsite, BigInteger> periodicity;
    public static volatile SingularAttribute<Inspectedsite, Date> datecreate;
    public static volatile SingularAttribute<Inspectedsite, Date> dateupdate;

}