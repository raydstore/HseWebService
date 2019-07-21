package entity;

import entity.Element;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-21T08:41:00")
@StaticMetamodel(Nature.class)
public class Nature_ { 

    public static volatile SingularAttribute<Nature, String> owner;
    public static volatile SingularAttribute<Nature, String> lastuser;
    public static volatile CollectionAttribute<Nature, Element> elementCollection;
    public static volatile SingularAttribute<Nature, String> name;
    public static volatile SingularAttribute<Nature, BigDecimal> id;
    public static volatile SingularAttribute<Nature, Date> datecreate;
    public static volatile SingularAttribute<Nature, Date> dateupdate;

}