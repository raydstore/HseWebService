package entity;

import entity.Accident;
import entity.Detailopscard;
import entity.Detailsite;
import entity.Label;
import entity.Site;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-04T15:45:04")
@StaticMetamodel(Site.class)
public class Site_ { 

    public static volatile SingularAttribute<Site, String> owner;
    public static volatile SingularAttribute<Site, Site> idparent;
    public static volatile SingularAttribute<Site, Detailsite> detailsite;
    public static volatile CollectionAttribute<Site, Detailopscard> detailopscardCollection;
    public static volatile SingularAttribute<Site, String> lastuser;
    public static volatile CollectionAttribute<Site, Site> siteCollection;
    public static volatile SingularAttribute<Site, String> name;
    public static volatile SingularAttribute<Site, Date> datecreate;
    public static volatile SingularAttribute<Site, Date> dateupdate;
    public static volatile SingularAttribute<Site, Label> idlabel;
    public static volatile SingularAttribute<Site, BigDecimal> id;
    public static volatile CollectionAttribute<Site, Accident> accidentCollection1;

}