package entity;

import entity.Instance;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-02T10:05:41")
@StaticMetamodel(Mark.class)
public class Mark_ { 

    public static volatile SingularAttribute<Mark, String> owner;
    public static volatile CollectionAttribute<Mark, Instance> instanceCollection;
    public static volatile SingularAttribute<Mark, String> lastuser;
    public static volatile SingularAttribute<Mark, String> name;
    public static volatile SingularAttribute<Mark, BigDecimal> id;
    public static volatile SingularAttribute<Mark, Date> datecreate;
    public static volatile SingularAttribute<Mark, Date> dateupdate;

}