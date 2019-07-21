package entity;

import entity.Detailopscard;
import entity.DetailopscardstructurePK;
import entity.Structure;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-21T08:41:00")
@StaticMetamodel(Detailopscardstructure.class)
public class Detailopscardstructure_ { 

    public static volatile SingularAttribute<Detailopscardstructure, String> owner;
    public static volatile SingularAttribute<Detailopscardstructure, DetailopscardstructurePK> detailopscardstructurePK;
    public static volatile SingularAttribute<Detailopscardstructure, String> lastuser;
    public static volatile SingularAttribute<Detailopscardstructure, Date> datecreate;
    public static volatile SingularAttribute<Detailopscardstructure, Date> dateupdate;
    public static volatile SingularAttribute<Detailopscardstructure, Detailopscard> detailopscard;
    public static volatile SingularAttribute<Detailopscardstructure, Structure> structure;

}