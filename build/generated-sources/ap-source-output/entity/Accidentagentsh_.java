package entity;

import entity.AccidentagentshPK;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-02T10:05:41")
@StaticMetamodel(Accidentagentsh.class)
public class Accidentagentsh_ { 

    public static volatile SingularAttribute<Accidentagentsh, String> owner;
    public static volatile SingularAttribute<Accidentagentsh, String> typeaccident;
    public static volatile SingularAttribute<Accidentagentsh, String> lastuser;
    public static volatile SingularAttribute<Accidentagentsh, AccidentagentshPK> accidentagentshPK;
    public static volatile SingularAttribute<Accidentagentsh, String> samury;
    public static volatile SingularAttribute<Accidentagentsh, Date> datecreate;
    public static volatile SingularAttribute<Accidentagentsh, Date> dateupdate;
    public static volatile SingularAttribute<Accidentagentsh, BigInteger> countstopwork;
    public static volatile SingularAttribute<Accidentagentsh, Short> accidentdomain;

}