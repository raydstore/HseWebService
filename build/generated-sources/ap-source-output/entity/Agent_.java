package entity;

import entity.Accident;
import entity.Accidentagentsh;
import entity.Driversh;
import entity.Jobposting;
import entity.Listagent;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-11T08:43:06")
@StaticMetamodel(Agent.class)
public class Agent_ { 

    public static volatile SingularAttribute<Agent, String> owner;
    public static volatile SingularAttribute<Agent, String> firstname;
    public static volatile CollectionAttribute<Agent, Accidentagentsh> accidentagentshCollection;
    public static volatile CollectionAttribute<Agent, Listagent> listagentCollection;
    public static volatile SingularAttribute<Agent, Driversh> driversh;
    public static volatile SingularAttribute<Agent, Date> datecreate;
    public static volatile SingularAttribute<Agent, Date> dateupdate;
    public static volatile CollectionAttribute<Agent, Accident> accidentCollection1;
    public static volatile SingularAttribute<Agent, Date> hiredate;
    public static volatile SingularAttribute<Agent, String> lastname;
    public static volatile SingularAttribute<Agent, String> lastuser;
    public static volatile CollectionAttribute<Agent, Jobposting> jobpostingCollection;
    public static volatile SingularAttribute<Agent, String> id;
    public static volatile CollectionAttribute<Agent, Accident> accidentCollection;

}