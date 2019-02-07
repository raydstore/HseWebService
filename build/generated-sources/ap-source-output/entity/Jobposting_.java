package entity;

import entity.Agent;
import entity.Listagent;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-06T09:23:01")
@StaticMetamodel(Jobposting.class)
public class Jobposting_ { 

    public static volatile SingularAttribute<Jobposting, String> owner;
    public static volatile SingularAttribute<Jobposting, Agent> idagent;
    public static volatile SingularAttribute<Jobposting, Date> datelast;
    public static volatile SingularAttribute<Jobposting, String> lastuser;
    public static volatile CollectionAttribute<Jobposting, Listagent> listagentCollection;
    public static volatile SingularAttribute<Jobposting, Date> datefirst;
    public static volatile SingularAttribute<Jobposting, BigDecimal> id;
    public static volatile SingularAttribute<Jobposting, Date> datecreate;
    public static volatile SingularAttribute<Jobposting, Date> dateupdate;

}