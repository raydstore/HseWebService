package entity;

import entity.Accidentvehiculedriver;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T10:32:35")
@StaticMetamodel(Driver.class)
public class Driver_ { 

    public static volatile SingularAttribute<Driver, String> owner;
    public static volatile CollectionAttribute<Driver, Accidentvehiculedriver> accidentvehiculedriverCollection;
    public static volatile SingularAttribute<Driver, String> lastuser;
    public static volatile SingularAttribute<Driver, String> id;
    public static volatile SingularAttribute<Driver, Date> datecreate;
    public static volatile SingularAttribute<Driver, Date> dateupdate;
    public static volatile SingularAttribute<Driver, String> classification;

}