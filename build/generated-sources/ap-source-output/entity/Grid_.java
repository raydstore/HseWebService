package entity;

import entity.Element;
import entity.Rank;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T14:53:21")
@StaticMetamodel(Grid.class)
public class Grid_ { 

    public static volatile SingularAttribute<Grid, String> owner;
    public static volatile SingularAttribute<Grid, String> lastuser;
    public static volatile SingularAttribute<Grid, Rank> idrank;
    public static volatile SingularAttribute<Grid, String> name;
    public static volatile SingularAttribute<Grid, String> degree;
    public static volatile SingularAttribute<Grid, BigDecimal> id;
    public static volatile SingularAttribute<Grid, Date> datecreate;
    public static volatile SingularAttribute<Grid, Date> dateupdate;
    public static volatile SingularAttribute<Grid, Element> idelement;

}