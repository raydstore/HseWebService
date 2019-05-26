package entity;

import entity.Accidentnature;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-25T13:33:38")
@StaticMetamodel(Damage.class)
public class Damage_ { 

    public static volatile SingularAttribute<Damage, String> owner;
    public static volatile SingularAttribute<Damage, String> lastuser;
    public static volatile SingularAttribute<Damage, String> degree;
    public static volatile SingularAttribute<Damage, String> description;
    public static volatile SingularAttribute<Damage, BigDecimal> id;
    public static volatile SingularAttribute<Damage, Date> datecreate;
    public static volatile SingularAttribute<Damage, Date> dateupdate;
    public static volatile SingularAttribute<Damage, Accidentnature> accidentnature;
    public static volatile SingularAttribute<Damage, Short> accidentdomain;
    public static volatile SingularAttribute<Damage, BigInteger> idgrid;

}