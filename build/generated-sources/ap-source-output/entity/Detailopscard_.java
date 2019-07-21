package entity;

import entity.Detailopscardstructure;
import entity.Site;
import entity.Work;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-21T08:41:00")
@StaticMetamodel(Detailopscard.class)
public class Detailopscard_ { 

    public static volatile SingularAttribute<Detailopscard, String> owner;
    public static volatile SingularAttribute<Detailopscard, Site> idsite;
    public static volatile SingularAttribute<Detailopscard, String> lastuser;
    public static volatile SingularAttribute<Detailopscard, String> zone;
    public static volatile SingularAttribute<Detailopscard, String> kind;
    public static volatile SingularAttribute<Detailopscard, String> starttype;
    public static volatile SingularAttribute<Detailopscard, Work> idwork;
    public static volatile SingularAttribute<Detailopscard, BigDecimal> idopscard;
    public static volatile SingularAttribute<Detailopscard, Date> datecreate;
    public static volatile SingularAttribute<Detailopscard, Date> dateupdate;
    public static volatile CollectionAttribute<Detailopscard, Detailopscardstructure> detailopscardstructureCollection;

}