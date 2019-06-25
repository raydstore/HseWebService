package entity;

import entity.Accident;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-25T11:13:24")
@StaticMetamodel(Cause.class)
public class Cause_ { 

    public static volatile SingularAttribute<Cause, String> owner;
    public static volatile SingularAttribute<Cause, String> lastuser;
    public static volatile SingularAttribute<Cause, Accident> idaccident;
    public static volatile SingularAttribute<Cause, String> name;
    public static volatile SingularAttribute<Cause, BigDecimal> id;
    public static volatile SingularAttribute<Cause, Date> datecreate;
    public static volatile SingularAttribute<Cause, Date> dateupdate;

}