package entity;

import entity.Excuse;
import entity.ExcuseagentPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-02T10:05:41")
@StaticMetamodel(Excuseagent.class)
public class Excuseagent_ { 

    public static volatile SingularAttribute<Excuseagent, String> owner;
    public static volatile SingularAttribute<Excuseagent, String> case1;
    public static volatile SingularAttribute<Excuseagent, String> lastuser;
    public static volatile SingularAttribute<Excuseagent, Excuse> excuse;
    public static volatile SingularAttribute<Excuseagent, ExcuseagentPK> excuseagentPK;
    public static volatile SingularAttribute<Excuseagent, Date> datecreate;
    public static volatile SingularAttribute<Excuseagent, Date> dateupdate;

}