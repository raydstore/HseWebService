package entity;

import entity.AccidentagenteePK;
import entity.Entreprise;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-13T15:25:26")
@StaticMetamodel(Accidentagentee.class)
public class Accidentagentee_ { 

    public static volatile SingularAttribute<Accidentagentee, String> owner;
    public static volatile SingularAttribute<Accidentagentee, Date> datecreate;
    public static volatile SingularAttribute<Accidentagentee, Date> dateupdate;
    public static volatile SingularAttribute<Accidentagentee, BigInteger> countstopwork;
    public static volatile SingularAttribute<Accidentagentee, Entreprise> identreprise;
    public static volatile SingularAttribute<Accidentagentee, String> typeaccident;
    public static volatile SingularAttribute<Accidentagentee, String> lastuser;
    public static volatile SingularAttribute<Accidentagentee, String> function;
    public static volatile SingularAttribute<Accidentagentee, String> name;
    public static volatile SingularAttribute<Accidentagentee, String> samury;
    public static volatile SingularAttribute<Accidentagentee, AccidentagenteePK> accidentagenteePK;
    public static volatile SingularAttribute<Accidentagentee, Short> accidentdomain;
    public static volatile SingularAttribute<Accidentagentee, BigInteger> idgrid;

}