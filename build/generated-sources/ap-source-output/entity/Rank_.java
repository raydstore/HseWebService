package entity;

import entity.Grid;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-11T19:02:58")
@StaticMetamodel(Rank.class)
public class Rank_ { 

    public static volatile SingularAttribute<Rank, String> owner;
    public static volatile SingularAttribute<Rank, String> lastuser;
    public static volatile SingularAttribute<Rank, String> name;
    public static volatile SingularAttribute<Rank, Short> investigation;
    public static volatile SingularAttribute<Rank, BigDecimal> id;
    public static volatile SingularAttribute<Rank, Date> datecreate;
    public static volatile SingularAttribute<Rank, Date> dateupdate;
    public static volatile CollectionAttribute<Rank, Grid> gridCollection;

}