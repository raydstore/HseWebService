package entity;

import entity.Accident;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-25T13:33:38")
@StaticMetamodel(Actionaccident.class)
public class Actionaccident_ { 

    public static volatile SingularAttribute<Actionaccident, String> owner;
    public static volatile SingularAttribute<Actionaccident, String> lastuser;
    public static volatile SingularAttribute<Actionaccident, String> kind;
    public static volatile SingularAttribute<Actionaccident, Accident> idaccident;
    public static volatile SingularAttribute<Actionaccident, BigDecimal> idaction;
    public static volatile SingularAttribute<Actionaccident, Date> datecreate;
    public static volatile SingularAttribute<Actionaccident, Date> dateupdate;

}