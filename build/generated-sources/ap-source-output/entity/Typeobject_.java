package entity;

import entity.Object1;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-02T10:32:57")
@StaticMetamodel(Typeobject.class)
public class Typeobject_ { 

    public static volatile SingularAttribute<Typeobject, String> owner;
    public static volatile CollectionAttribute<Typeobject, Object1> object1Collection;
    public static volatile SingularAttribute<Typeobject, String> lastuser;
    public static volatile SingularAttribute<Typeobject, String> name;
    public static volatile SingularAttribute<Typeobject, BigDecimal> id;
    public static volatile SingularAttribute<Typeobject, Date> datecreate;
    public static volatile SingularAttribute<Typeobject, Date> dateupdate;

}