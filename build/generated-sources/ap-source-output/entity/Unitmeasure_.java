package entity;

import entity.Property;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-14T12:03:22")
@StaticMetamodel(Unitmeasure.class)
public class Unitmeasure_ { 

    public static volatile SingularAttribute<Unitmeasure, String> owner;
    public static volatile SingularAttribute<Unitmeasure, String> lastuser;
    public static volatile SingularAttribute<Unitmeasure, String> name;
    public static volatile SingularAttribute<Unitmeasure, String> symbole;
    public static volatile SingularAttribute<Unitmeasure, BigDecimal> id;
    public static volatile SingularAttribute<Unitmeasure, Date> datecreate;
    public static volatile SingularAttribute<Unitmeasure, Date> dateupdate;
    public static volatile CollectionAttribute<Unitmeasure, Property> propertyCollection;

}