/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
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
@Table(name = "DRIVER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Driver.findAll", query = "SELECT d FROM Driver d"),
    @NamedQuery(name = "Driver.findById", query = "SELECT d FROM Driver d WHERE d.id = :id"),
    @NamedQuery(name = "Driver.findByClassification", query = "SELECT d FROM Driver d WHERE d.classification = :classification"),
    @NamedQuery(name = "Driver.findByDatecreate", query = "SELECT d FROM Driver d WHERE d.datecreate = :datecreate"),
    @NamedQuery(name = "Driver.findByDateupdate", query = "SELECT d FROM Driver d WHERE d.dateupdate = :dateupdate"),
    @NamedQuery(name = "Driver.findByOwner", query = "SELECT d FROM Driver d WHERE d.owner = :owner"),
    @NamedQuery(name = "Driver.findByLastuser", query = "SELECT d FROM Driver d WHERE d.lastuser = :lastuser")})
public class Driver implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "CLASSIFICATION")
    private String classification;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddriver")
    private Collection<Accidentvehiculedriver> accidentvehiculedriverCollection;

    public Driver() {
    }

    public Driver(String id) {
        this.id = id;
    }

    public Driver(String id, String classification, Date datecreate, Date dateupdate) {
        this.id = id;
        this.classification = classification;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
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
    public Collection<Accidentvehiculedriver> getAccidentvehiculedriverCollection() {
        return accidentvehiculedriverCollection;
    }

    public void setAccidentvehiculedriverCollection(Collection<Accidentvehiculedriver> accidentvehiculedriverCollection) {
        this.accidentvehiculedriverCollection = accidentvehiculedriverCollection;
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
        if (!(object instanceof Driver)) {
            return false;
        }
        Driver other = (Driver) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Driver[ id=" + id + " ]";
    }
    
}
