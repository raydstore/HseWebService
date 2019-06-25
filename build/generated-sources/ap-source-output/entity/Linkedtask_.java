package entity;

import entity.LinkedtaskPK;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-25T11:13:25")
@StaticMetamodel(Linkedtask.class)
public class Linkedtask_ { 

    public static volatile SingularAttribute<Linkedtask, String> owner;
    public static volatile SingularAttribute<Linkedtask, String> lastuser;
    public static volatile SingularAttribute<Linkedtask, LinkedtaskPK> linkedtaskPK;
    public static volatile SingularAttribute<Linkedtask, Date> datecreate;
    public static volatile SingularAttribute<Linkedtask, Date> dateupdate;
    public static volatile SingularAttribute<Linkedtask, BigInteger> type;

}