package entity;

import entity.VwPropertyPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-25T11:13:24")
@StaticMetamodel(VwProperty.class)
public class VwProperty_ { 

    public static volatile SingularAttribute<VwProperty, String> owner;
    public static volatile SingularAttribute<VwProperty, VwPropertyPK> vwPropertyPK;
    public static volatile SingularAttribute<VwProperty, String> lastuser;
    public static volatile SingularAttribute<VwProperty, String> name;
    public static volatile SingularAttribute<VwProperty, Date> datecreate;
    public static volatile SingularAttribute<VwProperty, Date> dateupdate;
    public static volatile SingularAttribute<VwProperty, String> type;
    public static volatile SingularAttribute<VwProperty, String> value;

}