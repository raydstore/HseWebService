package entity;

import entity.Actionassignment;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-25T13:33:38")
@StaticMetamodel(Structure.class)
public class Structure_ { 

    public static volatile SingularAttribute<Structure, String> owner;
    public static volatile SingularAttribute<Structure, String> lastuser;
    public static volatile SingularAttribute<Structure, String> name;
    public static volatile SingularAttribute<Structure, BigDecimal> id;
    public static volatile SingularAttribute<Structure, Date> datecreate;
    public static volatile SingularAttribute<Structure, Date> dateupdate;
    public static volatile CollectionAttribute<Structure, Actionassignment> actionassignmentCollection;

}