package entity;

import entity.Assurance;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T10:32:35")
@StaticMetamodel(Agency.class)
public class Agency_ { 

    public static volatile SingularAttribute<Agency, String> owner;
    public static volatile SingularAttribute<Agency, String> lastuser;
    public static volatile SingularAttribute<Agency, String> name;
    public static volatile CollectionAttribute<Agency, Assurance> assuranceCollection;
    public static volatile SingularAttribute<Agency, BigDecimal> id;
    public static volatile SingularAttribute<Agency, Date> datecreate;
    public static volatile SingularAttribute<Agency, Date> dateupdate;

}