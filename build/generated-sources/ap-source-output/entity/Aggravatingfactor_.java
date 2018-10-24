package entity;

import entity.Accident;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-24T09:46:36")
@StaticMetamodel(Aggravatingfactor.class)
public class Aggravatingfactor_ { 

    public static volatile SingularAttribute<Aggravatingfactor, String> owner;
    public static volatile SingularAttribute<Aggravatingfactor, String> lastuser;
    public static volatile SingularAttribute<Aggravatingfactor, Accident> idaccident;
    public static volatile SingularAttribute<Aggravatingfactor, String> name;
    public static volatile SingularAttribute<Aggravatingfactor, BigDecimal> id;
    public static volatile SingularAttribute<Aggravatingfactor, Date> datecreate;
    public static volatile SingularAttribute<Aggravatingfactor, Date> dateupdate;

}