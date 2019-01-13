package entity;

import entity.Action;
import entity.Structure;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-13T15:25:26")
@StaticMetamodel(Actionassignment.class)
public class Actionassignment_ { 

    public static volatile SingularAttribute<Actionassignment, String> owner;
    public static volatile SingularAttribute<Actionassignment, Structure> idstructure;
    public static volatile SingularAttribute<Actionassignment, String> lastuser;
    public static volatile SingularAttribute<Actionassignment, BigDecimal> id;
    public static volatile SingularAttribute<Actionassignment, Date> datecreate;
    public static volatile SingularAttribute<Actionassignment, Date> dateupdate;
    public static volatile SingularAttribute<Actionassignment, Action> idaction;
    public static volatile SingularAttribute<Actionassignment, Date> sendin;

}