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
@Table(name = "ACCIDENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accident.findAll", query = "SELECT a FROM Accident a"),
    @NamedQuery(name = "Accident.findById", query = "SELECT a FROM Accident a WHERE a.id = :id"),
    @NamedQuery(name = "Accident.findByClassification", query = "SELECT a FROM Accident a WHERE a.classification = :classification"),
    @NamedQuery(name = "Accident.findByCurdate", query = "SELECT a FROM Accident a WHERE a.curdate = :curdate"),
    @NamedQuery(name = "Accident.findByTime", query = "SELECT a FROM Accident a WHERE a.time = :time"),
    @NamedQuery(name = "Accident.findBySitedescription", query = "SELECT a FROM Accident a WHERE a.sitedescription = :sitedescription"),
    @NamedQuery(name = "Accident.findByEvent", query = "SELECT a FROM Accident a WHERE a.event = :event"),
    @NamedQuery(name = "Accident.findByDatecreate", query = "SELECT a FROM Accident a WHERE a.datecreate = :datecreate"),
    @NamedQuery(name = "Accident.findByDateupdate", query = "SELECT a FROM Accident a WHERE a.dateupdate = :dateupdate"),
    @NamedQuery(name = "Accident.findByOwner", query = "SELECT a FROM Accident a WHERE a.owner = :owner"),
    @NamedQuery(name = "Accident.findByLastuser", query = "SELECT a FROM Accident a WHERE a.lastuser = :lastuser")})
public class Accident implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "CLASSIFICATION")
    private String classification;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CURDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date curdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;
    @Size(max = 100)
    @Column(name = "SITEDESCRIPTION")
    private String sitedescription;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "EVENT")
    private String event;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accident")
    private Collection<Accidentnature> accidentnatureCollection;

    public Accident() {
    }

    public Accident(BigDecimal id) {
        this.id = id;
    }

    public Accident(BigDecimal id, String classification, Date curdate, Date time, String event, Date datecreate, Date dateupdate) {
        this.id = id;
        this.classification = classification;
        this.curdate = curdate;
        this.time = time;
        this.event = event;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Date getCurdate() {
        return curdate;
    }

    public void setCurdate(Date curdate) {
        this.curdate = curdate;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getSitedescription() {
        return sitedescription;
    }

    public void setSitedescription(String sitedescription) {
        this.sitedescription = sitedescription;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
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
    public Collection<Accidentnature> getAccidentnatureCollection() {
        return accidentnatureCollection;
    }

    public void setAccidentnatureCollection(Collection<Accidentnature> accidentnatureCollection) {
        this.accidentnatureCollection = accidentnatureCollection;
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
        if (!(object instanceof Accident)) {
            return false;
        }
        Accident other = (Accident) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accident[ id=" + id + " ]";
    }
    
}