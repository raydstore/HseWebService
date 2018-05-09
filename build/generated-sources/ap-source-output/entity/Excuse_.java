package entity;

import entity.Excuseagent;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-08T16:11:34")
@StaticMetamodel(Excuse.class)
public class Excuse_ { 

    public static volatile SingularAttribute<Excuse, String> owner;
    public static volatile SingularAttribute<Excuse, String> lastuser;
    public static volatile CollectionAttribute<Excuse, Excuseagent> excuseagentCollection;
    public static volatile SingularAttribute<Excuse, String> name;
    public static volatile SingularAttribute<Excuse, BigDecimal> id;
    public static volatile SingularAttribute<Excuse, Date> datecreate;
    public static volatile SingularAttribute<Excuse, Date> dateupdate;

}