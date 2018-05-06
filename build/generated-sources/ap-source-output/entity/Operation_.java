package entity;

import entity.Typeoperation;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T11:58:55")
@StaticMetamodel(Operation.class)
public class Operation_ { 

    public static volatile SingularAttribute<Operation, String> owner;
    public static volatile SingularAttribute<Operation, BigInteger> idinstance;
    public static volatile SingularAttribute<Operation, BigInteger> idobject;
    public static volatile SingularAttribute<Operation, String> lastuser;
    public static volatile SingularAttribute<Operation, Date> todate;
    public static volatile SingularAttribute<Operation, Typeoperation> idtypeoperation;
    public static volatile SingularAttribute<Operation, Date> indate;
    public static volatile SingularAttribute<Operation, BigDecimal> id;
    public static volatile SingularAttribute<Operation, Date> datecreate;
    public static volatile SingularAttribute<Operation, Date> dateupdate;

}