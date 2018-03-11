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
@Table(name = "MARK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mark.findAll", query = "SELECT m FROM Mark m"),
    @NamedQuery(name = "Mark.findById", query = "SELECT m FROM Mark m WHERE m.id = :id"),
    @NamedQuery(name = "Mark.findByName", query = "SELECT m FROM Mark m WHERE m.name = :name"),
    @NamedQuery(name = "Mark.findByDatecreate", query = "SELECT m FROM Mark m WHERE m.datecreate = :datecreate"),
    @NamedQuery(name = "Mark.findByDateupdate", query = "SELECT m FROM Mark m WHERE m.dateupdate = :dateupdate"),
    @NamedQuery(name = "Mark.findByOwner", query = "SELECT m FROM Mark m WHERE m.owner = :owner"),
    @NamedQuery(name = "Mark.findByLastuser", query = "SELECT m FROM Mark m WHERE m.lastuser = :lastuser")})
public class Mark implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmark")
    private Collection<Accidentvehicule> accidentvehiculeCollection;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmark")
    private Collection<Instance> instanceCollection;

    public Mark() {
    }

    public Mark(BigDecimal id) {
        this.id = id;
    }

    public Mark(BigDecimal id, String name, Date datecreate, Date dateupdate) {
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
    public Collection<Instance> getInstanceCollection() {
        return instanceCollection;
    }

    public void setInstanceCollection(Collection<Instance> instanceCollection) {
        this.instanceCollection = instanceCollection;
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
        if (!(object instanceof Mark)) {
            return false;
        }
        Mark other = (Mark) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Mark[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<Accidentvehicule> getAccidentvehiculeCollection() {
        return accidentvehiculeCollection;
    }

    public void setAccidentvehiculeCollection(Collection<Accidentvehicule> accidentvehiculeCollection) {
        this.accidentvehiculeCollection = accidentvehiculeCollection;
    }
    
}
