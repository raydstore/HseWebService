package entity;

import entity.Mark;
import entity.Object1;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-14T12:03:22")
@StaticMetamodel(Instance.class)
public class Instance_ { 

    public static volatile SingularAttribute<Instance, String> owner;
    public static volatile SingularAttribute<Instance, Object1> idobject;
    public static volatile SingularAttribute<Instance, BigDecimal> idsite;
    public static volatile SingularAttribute<Instance, String> lastuser;
    public static volatile SingularAttribute<Instance, Mark> idmark;
    public static volatile SingularAttribute<Instance, BigDecimal> id;
    public static volatile SingularAttribute<Instance, Date> datecreate;
    public static volatile SingularAttribute<Instance, Date> dateupdate;

}