package entity;

import entity.Inspectedsite;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(Inspectplanning.class)
public class Inspectplanning_ { 

    public static volatile SingularAttribute<Inspectplanning, String> owner;
    public static volatile SingularAttribute<Inspectplanning, Date> datelast;
    public static volatile SingularAttribute<Inspectplanning, String> lastuser;
    public static volatile SingularAttribute<Inspectplanning, Inspectedsite> idinspectedsite;
    public static volatile SingularAttribute<Inspectplanning, Date> datefirst;
    public static volatile SingularAttribute<Inspectplanning, BigDecimal> id;
    public static volatile SingularAttribute<Inspectplanning, Date> datecreate;
    public static volatile SingularAttribute<Inspectplanning, Date> dateupdate;

}