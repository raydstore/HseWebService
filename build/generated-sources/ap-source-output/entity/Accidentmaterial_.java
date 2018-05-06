package entity;

import entity.Material;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T11:58:55")
@StaticMetamodel(Accidentmaterial.class)
public class Accidentmaterial_ { 

    public static volatile SingularAttribute<Accidentmaterial, String> owner;
    public static volatile SingularAttribute<Accidentmaterial, BigInteger> iddamage;
    public static volatile SingularAttribute<Accidentmaterial, String> lastuser;
    public static volatile SingularAttribute<Accidentmaterial, String> name;
    public static volatile SingularAttribute<Accidentmaterial, BigDecimal> id;
    public static volatile SingularAttribute<Accidentmaterial, Date> datecreate;
    public static volatile SingularAttribute<Accidentmaterial, Date> dateupdate;
    public static volatile SingularAttribute<Accidentmaterial, Material> idmaterial;
    public static volatile SingularAttribute<Accidentmaterial, BigInteger> accidentdomain;

}