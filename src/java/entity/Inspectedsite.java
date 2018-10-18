/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "INSPECTEDSITE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inspectedsite.findAll", query = "SELECT i FROM Inspectedsite i")
    , @NamedQuery(name = "Inspectedsite.findByIdsite", query = "SELECT i FROM Inspectedsite i WHERE i.idsite = :idsite")
    , @NamedQuery(name = "Inspectedsite.findByEnable", query = "SELECT i FROM Inspectedsite i WHERE i.enable = :enable")
    , @NamedQuery(name = "Inspectedsite.findByDatecreate", query = "SELECT i FROM Inspectedsite i WHERE i.datecreate = :datecreate")
    , @NamedQuery(name = "Inspectedsite.findByDateupdate", query = "SELECT i FROM Inspectedsite i WHERE i.dateupdate = :dateupdate")
    , @NamedQuery(name = "Inspectedsite.findByOwner", query = "SELECT i FROM Inspectedsite i WHERE i.owner = :owner")
    , @NamedQuery(name = "Inspectedsite.findByLastuser", query = "SELECT i FROM Inspectedsite i WHERE i.lastuser = :lastuser")
    , @NamedQuery(name = "Inspectedsite.findByPeriodicity", query = "SELECT i FROM Inspectedsite i WHERE i.periodicity = :periodicity")})
public class Inspectedsite implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSITE")
    private BigDecimal idsite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ENABLE")
    private short enable;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERIODICITY")
    private BigInteger periodicity;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idinspectedsite")
    private Collection<Inspectplanning> inspectplanningCollection;
//    @JoinColumn(name = "IDSITE", referencedColumnName = "ID", insertable = false, updatable = false)
//    @OneToOne(optional = false)
//    private Site site;

    public Inspectedsite() {
    }

    public Inspectedsite(BigDecimal idsite) {
        this.idsite = idsite;
    }

    public Inspectedsite(BigDecimal idsite, short enable, Date datecreate, Date dateupdate, BigInteger periodicity) {
        this.idsite = idsite;
        this.enable = enable;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
        this.periodicity = periodicity;
    }

    public BigDecimal getIdsite() {
        return idsite;
    }

    public void setIdsite(BigDecimal idsite) {
        this.idsite = idsite;
    }

    public short getEnable() {
        return enable;
    }

    public void setEnable(short enable) {
        this.enable = enable;
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

    public BigInteger getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(BigInteger periodicity) {
        this.periodicity = periodicity;
    }

    @XmlTransient
    public Collection<Inspectplanning> getInspectplanningCollection() {
        return inspectplanningCollection;
    }

    public void setInspectplanningCollection(Collection<Inspectplanning> inspectplanningCollection) {
        this.inspectplanningCollection = inspectplanningCollection;
    }

//    public Site getSite() {
//        return site;
//    }
//
//    public void setSite(Site site) {
//        this.site = site;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsite != null ? idsite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inspectedsite)) {
            return false;
        }
        Inspectedsite other = (Inspectedsite) object;
        if ((this.idsite == null && other.idsite != null) || (this.idsite != null && !this.idsite.equals(other.idsite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Inspectedsite[ idsite=" + idsite + " ]";
    }
    
}
