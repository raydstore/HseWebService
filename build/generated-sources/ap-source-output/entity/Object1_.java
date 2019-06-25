package entity;

import entity.Instance;
import entity.Property;
import entity.Typeobject;
import entity.Worksheet;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-25T11:13:24")
@StaticMetamodel(Object1.class)
public class Object1_ { 

    public static volatile SingularAttribute<Object1, String> owner;
    public static volatile CollectionAttribute<Object1, Worksheet> worksheetCollection;
    public static volatile CollectionAttribute<Object1, Instance> instanceCollection;
    public static volatile SingularAttribute<Object1, String> lastuser;
    public static volatile SingularAttribute<Object1, String> name;
    public static volatile SingularAttribute<Object1, Typeobject> idtypeobject;
    public static volatile SingularAttribute<Object1, BigDecimal> id;
    public static volatile SingularAttribute<Object1, Date> datecreate;
    public static volatile SingularAttribute<Object1, Date> dateupdate;
    public static volatile CollectionAttribute<Object1, Property> propertyCollection;

}