package entity;

import entity.Agent;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-14T12:03:22")
@StaticMetamodel(Driversh.class)
public class Driversh_ { 

    public static volatile SingularAttribute<Driversh, String> owner;
    public static volatile SingularAttribute<Driversh, Agent> agent;
    public static volatile SingularAttribute<Driversh, String> lastuser;
    public static volatile SingularAttribute<Driversh, String> id;
    public static volatile SingularAttribute<Driversh, Date> datecreate;
    public static volatile SingularAttribute<Driversh, Date> dateupdate;
    public static volatile SingularAttribute<Driversh, String> classification;

}