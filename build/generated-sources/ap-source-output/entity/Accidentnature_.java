package entity;

import entity.Accident;
import entity.AccidentnaturePK;
import entity.Damage;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-21T09:24:58")
@StaticMetamodel(Accidentnature.class)
public class Accidentnature_ { 

    public static volatile SingularAttribute<Accidentnature, String> owner;
    public static volatile CollectionAttribute<Accidentnature, Damage> damageCollection;
    public static volatile SingularAttribute<Accidentnature, String> lastuser;
    public static volatile SingularAttribute<Accidentnature, AccidentnaturePK> accidentnaturePK;
    public static volatile SingularAttribute<Accidentnature, Date> datecreate;
    public static volatile SingularAttribute<Accidentnature, Date> dateupdate;
    public static volatile SingularAttribute<Accidentnature, Accident> accident;

}