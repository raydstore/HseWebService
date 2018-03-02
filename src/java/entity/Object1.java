/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author boutarfa
 */
@Entity
@Table(name = "OBJECT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Object1.findAll", query = "SELECT o FROM Object1 o"),
    @NamedQuery(name = "Object1.findById", query = "SELECT o FROM Object1 o WHERE o.id = :id"),
    @NamedQuery(name = "Object1.findByName", query = "SELECT o FROM Object1 o WHERE o.name = :name"),
    @NamedQuery(name = "Object1.findByDatecreate", query = "SELECT o FROM Object1 o WHERE o.datecreate = :datecreate"),
    @NamedQuery(name = "Object1.findByDateupdate", query = "SELECT o FROM Object1 o WHERE o.dateupdate = :dateupdate"),
    @NamedQuery(name = "Object1.findByOwner", query = "SELECT o FROM Object1 o WHERE o.owner = :owner"),
    @NamedQuery(name = "Object1.findByLastuser", query = "SELECT o FROM Object1 o WHERE o.lastuser = :lastuser")})
public class Object1 implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "NAME")
    private String name;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idobject")
    private Collection<Worksheet> worksheetCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "object1")
    private Collection<Property> propertyCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idobject")
    private Collection<Instance> instanceCollection;
    @JoinColumn(name = "IDTYPEOBJECT", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Typeobject idtypeobject;

    public Object1() {
    }

    public Object1(BigDecimal id) {
        this.id = id;
    }

    public Object1(BigDecimal id, String name, Date datecreate, Date dateupdate) {
        this.id = id;
        this.name = name;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @XmlTransient
    public Collection<Worksheet> getWorksheetCollection() {
        return worksheetCollection;
    }

    public void setWorksheetCollection(Collection<Worksheet> worksheetCollection) {
        this.worksheetCollection = worksheetCollection;
    }

    @XmlTransient
    public Collection<Property> getPropertyCollection() {
        return propertyCollection;
    }

    public void setPropertyCollection(Collection<Property> propertyCollection) {
        this.propertyCollection = propertyCollection;
    }

    @XmlTransient
    public Collection<Instance> getInstanceCollection() {
        return instanceCollection;
    }

    public void setInstanceCollection(Collection<Instance> instanceCollection) {
        this.instanceCollection = instanceCollection;
    }

    public Typeobject getIdtypeobject() {
        return idtypeobject;
    }

    public void setIdtypeobject(Typeobject idtypeobject) {
        this.idtypeobject = idtypeobject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Object1)) {
            return false;
        }
        Object1 other = (Object1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Object1[ id=" + id + " ]";
    }
    
}
