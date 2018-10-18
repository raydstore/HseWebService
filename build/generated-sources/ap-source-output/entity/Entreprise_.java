package entity;

import entity.Accidentagentee;
import entity.Accidentvehicule;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-14T12:03:22")
@StaticMetamodel(Entreprise.class)
public class Entreprise_ { 

    public static volatile SingularAttribute<Entreprise, String> owner;
    public static volatile CollectionAttribute<Entreprise, Accidentvehicule> accidentvehiculeCollection;
    public static volatile SingularAttribute<Entreprise, String> lastuser;
    public static volatile SingularAttribute<Entreprise, String> phone;
    public static volatile SingularAttribute<Entreprise, String> name;
    public static volatile SingularAttribute<Entreprise, String> adress;
    public static volatile SingularAttribute<Entreprise, BigDecimal> id;
    public static volatile SingularAttribute<Entreprise, Date> datecreate;
    public static volatile SingularAttribute<Entreprise, Date> dateupdate;
    public static volatile SingularAttribute<Entreprise, String> fiscalenumber;
    public static volatile CollectionAttribute<Entreprise, Accidentagentee> accidentagenteeCollection;

}