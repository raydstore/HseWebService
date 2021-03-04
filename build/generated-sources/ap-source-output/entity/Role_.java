package entity;

import entity.Delegaterole;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(Role.class)
public class Role_ { 

    public static volatile SingularAttribute<Role, String> owner;
    public static volatile SingularAttribute<Role, String> lastuser;
    public static volatile SingularAttribute<Role, String> name;
    public static volatile SingularAttribute<Role, BigDecimal> id;
    public static volatile SingularAttribute<Role, Date> datecreate;
    public static volatile SingularAttribute<Role, Date> dateupdate;
    public static volatile CollectionAttribute<Role, Delegaterole> delegateroleCollection1;
    public static volatile CollectionAttribute<Role, Delegaterole> delegateroleCollection;

}