package entity;

import entity.Accident;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(Stepaccident.class)
public class Stepaccident_ { 

    public static volatile SingularAttribute<Stepaccident, String> owner;
    public static volatile SingularAttribute<Stepaccident, String> lastuser;
    public static volatile SingularAttribute<Stepaccident, String> foruser;
    public static volatile SingularAttribute<Stepaccident, Accident> idaccident;
    public static volatile SingularAttribute<Stepaccident, BigInteger> step;
    public static volatile SingularAttribute<Stepaccident, BigDecimal> id;
    public static volatile SingularAttribute<Stepaccident, Date> datecreate;
    public static volatile SingularAttribute<Stepaccident, Date> dateupdate;
    public static volatile SingularAttribute<Stepaccident, String> status;

}