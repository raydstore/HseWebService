package entity;

import entity.Accident;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T17:08:23")
@StaticMetamodel(Recommendation.class)
public class Recommendation_ { 

    public static volatile SingularAttribute<Recommendation, String> owner;
    public static volatile SingularAttribute<Recommendation, String> lastuser;
    public static volatile SingularAttribute<Recommendation, Accident> idaccident;
    public static volatile SingularAttribute<Recommendation, String> name;
    public static volatile SingularAttribute<Recommendation, BigDecimal> id;
    public static volatile SingularAttribute<Recommendation, Date> datecreate;
    public static volatile SingularAttribute<Recommendation, Date> dateupdate;

}