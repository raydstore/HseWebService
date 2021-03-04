package entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> idagent;
    public static volatile SingularAttribute<Users, String> owner;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, String> lastuser;
    public static volatile SingularAttribute<Users, String> name;
    public static volatile SingularAttribute<Users, BigDecimal> id;
    public static volatile SingularAttribute<Users, Date> datecreate;
    public static volatile SingularAttribute<Users, Date> dateupdate;
    public static volatile SingularAttribute<Users, String> username;

}