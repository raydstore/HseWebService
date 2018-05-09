package entity;

import entity.NpropertyPK;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-08T16:11:34")
@StaticMetamodel(Nproperty.class)
public class Nproperty_ { 

    public static volatile SingularAttribute<Nproperty, String> owner;
    public static volatile SingularAttribute<Nproperty, String> lastuser;
    public static volatile SingularAttribute<Nproperty, Date> datecreate;
    public static volatile SingularAttribute<Nproperty, Date> dateupdate;
    public static volatile SingularAttribute<Nproperty, NpropertyPK> npropertyPK;
    public static volatile SingularAttribute<Nproperty, String> type;
    public static volatile SingularAttribute<Nproperty, BigDecimal> value;

}