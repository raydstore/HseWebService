package entity;

import entity.Actionassignment;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(Sendaction.class)
public class Sendaction_ { 

    public static volatile SingularAttribute<Sendaction, String> owner;
    public static volatile SingularAttribute<Sendaction, BigInteger> idstructure;
    public static volatile SingularAttribute<Sendaction, String> lastuser;
    public static volatile SingularAttribute<Sendaction, BigDecimal> id;
    public static volatile SingularAttribute<Sendaction, Date> curdate;
    public static volatile SingularAttribute<Sendaction, Date> datecreate;
    public static volatile SingularAttribute<Sendaction, Date> dateupdate;
    public static volatile CollectionAttribute<Sendaction, Actionassignment> actionassignmentCollection;

}