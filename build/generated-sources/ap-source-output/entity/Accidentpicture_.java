package entity;

import entity.Accident;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-02T10:32:57")
@StaticMetamodel(Accidentpicture.class)
public class Accidentpicture_ { 

    public static volatile SingularAttribute<Accidentpicture, String> owner;
    public static volatile SingularAttribute<Accidentpicture, Serializable> image;
    public static volatile SingularAttribute<Accidentpicture, String> lastuser;
    public static volatile SingularAttribute<Accidentpicture, Accident> idaccident;
    public static volatile SingularAttribute<Accidentpicture, String> name;
    public static volatile SingularAttribute<Accidentpicture, BigDecimal> id;
    public static volatile SingularAttribute<Accidentpicture, Date> datecreate;
    public static volatile SingularAttribute<Accidentpicture, Date> dateupdate;

}