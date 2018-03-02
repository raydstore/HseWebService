package entity;

import entity.Jobposting;
import entity.Listagent;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-02T10:05:41")
@StaticMetamodel(Agent.class)
public class Agent_ { 

    public static volatile SingularAttribute<Agent, String> owner;
    public static volatile SingularAttribute<Agent, String> firstname;
    public static volatile SingularAttribute<Agent, String> lastuser;
    public static volatile CollectionAttribute<Agent, Jobposting> jobpostingCollection;
    public static volatile CollectionAttribute<Agent, Listagent> listagentCollection;
    public static volatile SingularAttribute<Agent, String> id;
    public static volatile SingularAttribute<Agent, Date> datecreate;
    public static volatile SingularAttribute<Agent, Date> dateupdate;
    public static volatile SingularAttribute<Agent, Date> hiredate;
    public static volatile SingularAttribute<Agent, String> lastname;

}