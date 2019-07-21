package entity;

import entity.AccidentagenttpPK;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-21T08:41:00")
@StaticMetamodel(Accidentagenttp.class)
public class Accidentagenttp_ { 

    public static volatile SingularAttribute<Accidentagenttp, String> owner;
    public static volatile SingularAttribute<Accidentagenttp, Date> dateofbirth;
    public static volatile SingularAttribute<Accidentagenttp, Date> datecreate;
    public static volatile SingularAttribute<Accidentagenttp, Date> dateupdate;
    public static volatile SingularAttribute<Accidentagenttp, BigInteger> countstopwork;
    public static volatile SingularAttribute<Accidentagenttp, String> typeaccident;
    public static volatile SingularAttribute<Accidentagenttp, String> lastuser;
    public static volatile SingularAttribute<Accidentagenttp, String> function;
    public static volatile SingularAttribute<Accidentagenttp, String> name;
    public static volatile SingularAttribute<Accidentagenttp, String> samury;
    public static volatile SingularAttribute<Accidentagenttp, AccidentagenttpPK> accidentagenttpPK;
    public static volatile SingularAttribute<Accidentagenttp, Short> accidentdomain;
    public static volatile SingularAttribute<Accidentagenttp, BigInteger> idgrid;

}