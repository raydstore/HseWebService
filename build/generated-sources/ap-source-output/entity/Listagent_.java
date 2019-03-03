package entity;

import entity.Agent;
import entity.Jobposting;
import entity.ListagentPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-02T10:32:57")
@StaticMetamodel(Listagent.class)
public class Listagent_ { 

    public static volatile SingularAttribute<Listagent, String> owner;
    public static volatile SingularAttribute<Listagent, ListagentPK> listagentPK;
    public static volatile SingularAttribute<Listagent, Agent> agent;
    public static volatile SingularAttribute<Listagent, String> lastuser;
    public static volatile SingularAttribute<Listagent, Jobposting> jobposting;
    public static volatile SingularAttribute<Listagent, Date> datecreate;
    public static volatile SingularAttribute<Listagent, Date> dateupdate;

}