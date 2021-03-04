package entity;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(VwUserauthorizationmodule.class)
public class VwUserauthorizationmodule_ { 

    public static volatile SingularAttribute<VwUserauthorizationmodule, String> owner;
    public static volatile SingularAttribute<VwUserauthorizationmodule, String> idagent;
    public static volatile SingularAttribute<VwUserauthorizationmodule, String> authorization;
    public static volatile SingularAttribute<VwUserauthorizationmodule, BigInteger> iduser;
    public static volatile SingularAttribute<VwUserauthorizationmodule, String> password;
    public static volatile SingularAttribute<VwUserauthorizationmodule, BigInteger> idrole;
    public static volatile SingularAttribute<VwUserauthorizationmodule, String> lastuser;
    public static volatile SingularAttribute<VwUserauthorizationmodule, String> name;
    public static volatile SingularAttribute<VwUserauthorizationmodule, Date> datecreate;
    public static volatile SingularAttribute<VwUserauthorizationmodule, Date> dateupdate;
    public static volatile SingularAttribute<VwUserauthorizationmodule, String> username;
    public static volatile SingularAttribute<VwUserauthorizationmodule, String> siteuser;

}