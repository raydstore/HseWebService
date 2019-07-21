package entity;

import entity.Operation;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-21T08:41:00")
@StaticMetamodel(Typeoperation.class)
public class Typeoperation_ { 

    public static volatile SingularAttribute<Typeoperation, String> owner;
    public static volatile SingularAttribute<Typeoperation, String> lastuser;
    public static volatile CollectionAttribute<Typeoperation, Operation> operationCollection;
    public static volatile SingularAttribute<Typeoperation, String> name;
    public static volatile SingularAttribute<Typeoperation, BigDecimal> id;
    public static volatile SingularAttribute<Typeoperation, Date> datecreate;
    public static volatile SingularAttribute<Typeoperation, Date> dateupdate;

}