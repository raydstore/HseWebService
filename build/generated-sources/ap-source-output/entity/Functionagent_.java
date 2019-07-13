package entity;

import entity.Function1;
import entity.FunctionagentPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-11T19:02:58")
@StaticMetamodel(Functionagent.class)
public class Functionagent_ { 

    public static volatile SingularAttribute<Functionagent, String> owner;
    public static volatile SingularAttribute<Functionagent, FunctionagentPK> functionagentPK;
    public static volatile SingularAttribute<Functionagent, String> period;
    public static volatile SingularAttribute<Functionagent, String> lastuser;
    public static volatile SingularAttribute<Functionagent, Function1> idfunction;
    public static volatile SingularAttribute<Functionagent, Date> datecreate;
    public static volatile SingularAttribute<Functionagent, Date> dateupdate;

}