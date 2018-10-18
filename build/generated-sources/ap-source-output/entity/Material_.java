package entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-14T12:03:22")
@StaticMetamodel(Material.class)
public class Material_ { 

    public static volatile SingularAttribute<Material, String> owner;
    public static volatile SingularAttribute<Material, String> lastuser;
    public static volatile SingularAttribute<Material, String> kind;
    public static volatile SingularAttribute<Material, String> name;
    public static volatile SingularAttribute<Material, BigDecimal> id;
    public static volatile SingularAttribute<Material, Date> datecreate;
    public static volatile SingularAttribute<Material, Date> dateupdate;

}