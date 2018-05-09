package entity;

import entity.DpropertyPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-08T16:11:34")
@StaticMetamodel(Dproperty.class)
public class Dproperty_ { 

    public static volatile SingularAttribute<Dproperty, String> owner;
    public static volatile SingularAttribute<Dproperty, String> lastuser;
    public static volatile SingularAttribute<Dproperty, DpropertyPK> dpropertyPK;
    public static volatile SingularAttribute<Dproperty, Date> datecreate;
    public static volatile SingularAttribute<Dproperty, Date> dateupdate;
    public static volatile SingularAttribute<Dproperty, String> type;
    public static volatile SingularAttribute<Dproperty, Date> value;

}