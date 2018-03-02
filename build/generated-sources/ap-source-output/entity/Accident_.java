package entity;

import entity.Accidentnature;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-02T10:05:41")
@StaticMetamodel(Accident.class)
public class Accident_ { 

    public static volatile SingularAttribute<Accident, String> owner;
    public static volatile SingularAttribute<Accident, String> lastuser;
    public static volatile CollectionAttribute<Accident, Accidentnature> accidentnatureCollection;
    public static volatile SingularAttribute<Accident, String> sitedescription;
    public static volatile SingularAttribute<Accident, BigDecimal> id;
    public static volatile SingularAttribute<Accident, Date> curdate;
    public static volatile SingularAttribute<Accident, Date> time;
    public static volatile SingularAttribute<Accident, Date> datecreate;
    public static volatile SingularAttribute<Accident, Date> dateupdate;
    public static volatile SingularAttribute<Accident, String> classification;
    public static volatile SingularAttribute<Accident, String> event;

}