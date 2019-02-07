package entity;

import entity.Accident;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-06T09:23:01")
@StaticMetamodel(Accidentfile.class)
public class Accidentfile_ { 

    public static volatile SingularAttribute<Accidentfile, String> owner;
    public static volatile SingularAttribute<Accidentfile, String> path;
    public static volatile SingularAttribute<Accidentfile, String> lastuser;
    public static volatile SingularAttribute<Accidentfile, Accident> idaccident;
    public static volatile SingularAttribute<Accidentfile, String> name;
    public static volatile SingularAttribute<Accidentfile, BigDecimal> id;
    public static volatile SingularAttribute<Accidentfile, Date> datecreate;
    public static volatile SingularAttribute<Accidentfile, Date> dateupdate;

}