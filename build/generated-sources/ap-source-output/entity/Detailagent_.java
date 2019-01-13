package entity;

import entity.Agent;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-13T15:25:26")
@StaticMetamodel(Detailagent.class)
public class Detailagent_ { 

    public static volatile SingularAttribute<Detailagent, String> owner;
    public static volatile SingularAttribute<Detailagent, String> idstructure;
    public static volatile SingularAttribute<Detailagent, Agent> agent;
    public static volatile SingularAttribute<Detailagent, Date> datecreate;
    public static volatile SingularAttribute<Detailagent, Date> dateupdate;
    public static volatile SingularAttribute<Detailagent, String> worksystem;
    public static volatile SingularAttribute<Detailagent, String> idagent;
    public static volatile SingularAttribute<Detailagent, String> namefunction;
    public static volatile SingularAttribute<Detailagent, Date> daterecruitment;
    public static volatile SingularAttribute<Detailagent, String> pointingsystem;
    public static volatile SingularAttribute<Detailagent, String> lastuser;
    public static volatile SingularAttribute<Detailagent, String> idfunction;
    public static volatile SingularAttribute<Detailagent, String> category;

}