package entity;

import entity.Activity;
import entity.Object1;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-26T12:01:37")
@StaticMetamodel(Worksheet.class)
public class Worksheet_ { 

    public static volatile SingularAttribute<Worksheet, String> owner;
    public static volatile SingularAttribute<Worksheet, Object1> idobject;
    public static volatile SingularAttribute<Worksheet, String> lastuser;
    public static volatile SingularAttribute<Worksheet, String> consigne;
    public static volatile SingularAttribute<Worksheet, String> kind;
    public static volatile SingularAttribute<Worksheet, BigDecimal> id;
    public static volatile SingularAttribute<Worksheet, Date> datecreate;
    public static volatile SingularAttribute<Worksheet, Date> dateupdate;
    public static volatile SingularAttribute<Worksheet, Activity> idactivity;

}