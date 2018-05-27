package entity;

import entity.VpropertyPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-24T15:35:20")
@StaticMetamodel(Vproperty.class)
public class Vproperty_ { 

    public static volatile SingularAttribute<Vproperty, String> owner;
    public static volatile SingularAttribute<Vproperty, String> lastuser;
    public static volatile SingularAttribute<Vproperty, Date> datecreate;
    public static volatile SingularAttribute<Vproperty, Date> dateupdate;
    public static volatile SingularAttribute<Vproperty, String> type;
    public static volatile SingularAttribute<Vproperty, String> value;
    public static volatile SingularAttribute<Vproperty, VpropertyPK> vpropertyPK;

}