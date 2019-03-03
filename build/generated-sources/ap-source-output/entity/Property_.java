package entity;

import entity.Object1;
import entity.PropertyPK;
import entity.Unitmeasure;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-02T10:32:57")
@StaticMetamodel(Property.class)
public class Property_ { 

    public static volatile SingularAttribute<Property, String> owner;
    public static volatile SingularAttribute<Property, Object1> object1;
    public static volatile SingularAttribute<Property, Unitmeasure> idunitmeasure;
    public static volatile SingularAttribute<Property, String> lastuser;
    public static volatile SingularAttribute<Property, String> name;
    public static volatile SingularAttribute<Property, Date> datecreate;
    public static volatile SingularAttribute<Property, Date> dateupdate;
    public static volatile SingularAttribute<Property, String> type;
    public static volatile SingularAttribute<Property, PropertyPK> propertyPK;

}