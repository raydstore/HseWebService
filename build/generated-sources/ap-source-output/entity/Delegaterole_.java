package entity;

import entity.Role;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(Delegaterole.class)
public class Delegaterole_ { 

    public static volatile SingularAttribute<Delegaterole, String> owner;
    public static volatile SingularAttribute<Delegaterole, Role> idrole;
    public static volatile SingularAttribute<Delegaterole, String> lastuser;
    public static volatile SingularAttribute<Delegaterole, Role> delegateto;
    public static volatile SingularAttribute<Delegaterole, BigDecimal> id;
    public static volatile SingularAttribute<Delegaterole, Date> datecreate;
    public static volatile SingularAttribute<Delegaterole, Date> dateupdate;

}