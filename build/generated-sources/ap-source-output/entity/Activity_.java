package entity;

import entity.Worksheet;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-14T12:03:22")
@StaticMetamodel(Activity.class)
public class Activity_ { 

    public static volatile SingularAttribute<Activity, String> owner;
    public static volatile CollectionAttribute<Activity, Worksheet> worksheetCollection;
    public static volatile SingularAttribute<Activity, String> lastuser;
    public static volatile SingularAttribute<Activity, String> name;
    public static volatile SingularAttribute<Activity, BigDecimal> id;
    public static volatile SingularAttribute<Activity, Date> datecreate;
    public static volatile SingularAttribute<Activity, Date> dateupdate;

}