package entity;

import entity.Grid;
import entity.Nature;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-21T08:41:00")
@StaticMetamodel(Element.class)
public class Element_ { 

    public static volatile SingularAttribute<Element, String> owner;
    public static volatile SingularAttribute<Element, String> lastuser;
    public static volatile SingularAttribute<Element, String> name;
    public static volatile SingularAttribute<Element, BigDecimal> id;
    public static volatile SingularAttribute<Element, Date> datecreate;
    public static volatile SingularAttribute<Element, Date> dateupdate;
    public static volatile CollectionAttribute<Element, Grid> gridCollection;
    public static volatile SingularAttribute<Element, Nature> idnature;

}