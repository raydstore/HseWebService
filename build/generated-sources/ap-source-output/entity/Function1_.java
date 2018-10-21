package entity;

import entity.Functionagent;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-21T09:24:58")
@StaticMetamodel(Function1.class)
public class Function1_ { 

    public static volatile SingularAttribute<Function1, String> owner;
    public static volatile SingularAttribute<Function1, String> lastuser;
    public static volatile CollectionAttribute<Function1, Functionagent> functionagentCollection;
    public static volatile SingularAttribute<Function1, String> name;
    public static volatile SingularAttribute<Function1, BigDecimal> id;
    public static volatile SingularAttribute<Function1, Date> datecreate;
    public static volatile SingularAttribute<Function1, Date> dateupdate;

}