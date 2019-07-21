package entity;

import entity.Detailopscard;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-21T08:41:00")
@StaticMetamodel(Opscard.class)
public class Opscard_ { 

    public static volatile SingularAttribute<Opscard, String> owner;
    public static volatile SingularAttribute<Opscard, String> kind;
    public static volatile SingularAttribute<Opscard, String> degree;
    public static volatile SingularAttribute<Opscard, String> description;
    public static volatile SingularAttribute<Opscard, Date> curdate;
    public static volatile SingularAttribute<Opscard, Date> datecreate;
    public static volatile SingularAttribute<Opscard, Date> dateupdate;
    public static volatile SingularAttribute<Opscard, Detailopscard> detailopscard;
    public static volatile SingularAttribute<Opscard, String> observer;
    public static volatile SingularAttribute<Opscard, String> site;
    public static volatile SingularAttribute<Opscard, String> measure;
    public static volatile SingularAttribute<Opscard, String> lastuser;
    public static volatile SingularAttribute<Opscard, String> phone;
    public static volatile SingularAttribute<Opscard, String> action;
    public static volatile SingularAttribute<Opscard, BigDecimal> id;
    public static volatile SingularAttribute<Opscard, String> state;
    public static volatile SingularAttribute<Opscard, String> jobsite;
    public static volatile SingularAttribute<Opscard, String> nameentreprise;

}