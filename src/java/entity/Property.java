/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boutarfa
 */
@Entity
@Table(name = "PROPERTY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Property.findAll", query = "SELECT p FROM Property p"),
    @NamedQuery(name = "Property.findById", query = "SELECT p FROM Property p WHERE p.propertyPK.id = :id"),
    @NamedQuery(name = "Property.findByIdobject", query = "SELECT p FROM Property p WHERE p.propertyPK.idobject = :idobject"),
    @NamedQuery(name = "Property.findByName", query = "SELECT p FROM Property p WHERE p.name = :name"),
    @NamedQuery(name = "Property.findByType", query = "SELECT p FROM Property p WHERE p.type = :type"),
    @NamedQuery(name = "Property.findByDatecreate", query = "SELECT p FROM Property p WHERE p.datecreate = :datecreate"),
    @NamedQuery(name = "Property.findByDateupdate", query = "SELECT p FROM Property p WHERE p.dateupdate = :dateupdate"),
    @NamedQuery(name = "Property.findByOwner", query = "SELECT p FROM Property p WHERE p.owner = :owner"),
    @NamedQuery(name = "Property.findByLastuser", query = "SELECT p FROM Property p WHERE p.lastuser = :lastuser")})
public class Property implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PropertyPK propertyPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TYPE")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATECREATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateupdate;
    @Size(max = 31)
    @Column(name = "OWNER")
    private String owner;
    @Size(max = 31)
    @Column(name = "LASTUSER")
    private String lastuser;
    @JoinColumn(name = "IDOBJECT", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Object1 object1;
    @JoinColumn(name = "IDUNITMEASURE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Unitmeasure idunitmeasure;

    public Property() {
    }

    public Property(PropertyPK propertyPK) {
        this.propertyPK = propertyPK;
    }

    public Property(PropertyPK propertyPK, String name, String type, Date datecreate, Date dateupdate) {
        this.propertyPK = propertyPK;
        this.name = name;
        this.type = type;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public Property(BigInteger id, BigInteger idobject) {
        this.propertyPK = new PropertyPK(id, idobject);
    }

    public PropertyPK getPropertyPK() {
        return propertyPK;
    }

    public void setPropertyPK(PropertyPK propertyPK) {
        this.propertyPK = propertyPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(Date datecreate) {
        this.datecreate = datecreate;
    }

    public Date getDateupdate() {
        return dateupdate;
    }

    public void setDateupdate(Date dateupdate) {
        this.dateupdate = dateupdate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLastuser() {
        return lastuser;
    }

    public void setLastuser(String lastuser) {
        this.lastuser = lastuser;
    }

    public Object1 getObject1() {
        return object1;
    }

    public void setObject1(Object1 object1) {
        this.object1 = object1;
    }

    public Unitmeasure getIdunitmeasure() {
        return idunitmeasure;
    }

    public void setIdunitmeasure(Unitmeasure idunitmeasure) {
        this.idunitmeasure = idunitmeasure;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertyPK != null ? propertyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Property)) {
            return false;
        }
        Property other = (Property) object;
        if ((this.propertyPK == null && other.propertyPK != null) || (this.propertyPK != null && !this.propertyPK.equals(other.propertyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Property[ propertyPK=" + propertyPK + " ]";
    }
    
}
