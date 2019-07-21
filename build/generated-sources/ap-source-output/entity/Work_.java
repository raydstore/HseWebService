package entity;

import entity.Detailopscard;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-21T08:41:00")
@StaticMetamodel(Work.class)
public class Work_ { 

    public static volatile SingularAttribute<Work, String> owner;
    public static volatile CollectionAttribute<Work, Detailopscard> detailopscardCollection;
    public static volatile SingularAttribute<Work, String> lastuser;
    public static volatile SingularAttribute<Work, String> name;
    public static volatile SingularAttribute<Work, BigDecimal> id;
    public static volatile SingularAttribute<Work, Date> datecreate;
    public static volatile SingularAttribute<Work, Date> dateupdate;

}