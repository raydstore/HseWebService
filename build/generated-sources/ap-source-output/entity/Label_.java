package entity;

import entity.Site;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-13T15:25:26")
@StaticMetamodel(Label.class)
public class Label_ { 

    public static volatile SingularAttribute<Label, String> owner;
    public static volatile SingularAttribute<Label, String> lastuser;
    public static volatile CollectionAttribute<Label, Site> siteCollection;
    public static volatile SingularAttribute<Label, String> name;
    public static volatile SingularAttribute<Label, BigDecimal> id;
    public static volatile SingularAttribute<Label, Date> datecreate;
    public static volatile SingularAttribute<Label, Date> dateupdate;

}