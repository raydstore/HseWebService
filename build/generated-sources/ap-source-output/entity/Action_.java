package entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T14:53:21")
@StaticMetamodel(Action.class)
public class Action_ { 

    public static volatile SingularAttribute<Action, BigInteger> idparent;
    public static volatile SingularAttribute<Action, String> owner;
    public static volatile SingularAttribute<Action, String> lastuser;
    public static volatile SingularAttribute<Action, BigInteger> tabindex;
    public static volatile SingularAttribute<Action, String> name;
    public static volatile SingularAttribute<Action, BigDecimal> id;
    public static volatile SingularAttribute<Action, Date> datecreate;
    public static volatile SingularAttribute<Action, Date> dateupdate;

}