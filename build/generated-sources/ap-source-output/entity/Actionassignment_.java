package entity;

import entity.Action;
import entity.ActionassignmentPK;
import entity.Sendaction;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(Actionassignment.class)
public class Actionassignment_ { 

    public static volatile SingularAttribute<Actionassignment, String> owner;
    public static volatile SingularAttribute<Actionassignment, String> lastuser;
    public static volatile SingularAttribute<Actionassignment, Sendaction> sendaction;
    public static volatile SingularAttribute<Actionassignment, ActionassignmentPK> actionassignmentPK;
    public static volatile SingularAttribute<Actionassignment, Action> action;
    public static volatile SingularAttribute<Actionassignment, String> state;
    public static volatile SingularAttribute<Actionassignment, Date> datecreate;
    public static volatile SingularAttribute<Actionassignment, Date> dateupdate;

}