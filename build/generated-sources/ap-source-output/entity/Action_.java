package entity;

import entity.Actionassignment;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-21T08:41:00")
@StaticMetamodel(Action.class)
public class Action_ { 

    public static volatile SingularAttribute<Action, String> owner;
    public static volatile SingularAttribute<Action, String> lastuser;
    public static volatile SingularAttribute<Action, String> kind;
    public static volatile SingularAttribute<Action, String> name;
    public static volatile SingularAttribute<Action, BigDecimal> id;
    public static volatile SingularAttribute<Action, Date> datecreate;
    public static volatile SingularAttribute<Action, Date> dateupdate;
    public static volatile SingularAttribute<Action, String> state;
    public static volatile CollectionAttribute<Action, Actionassignment> actionassignmentCollection;

}