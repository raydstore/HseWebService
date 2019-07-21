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
import javax.persistence.ManyToOne;
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
@Table(name = "DETAILOPSCARD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detailopscard.findAll", query = "SELECT d FROM Detailopscard d")
    , @NamedQuery(name = "Detailopscard.findByIdopscard", query = "SELECT d FROM Detailopscard d WHERE d.idopscard = :idopscard")
    , @NamedQuery(name = "Detailopscard.findByZone", query = "SELECT d FROM Detailopscard d WHERE d.zone = :zone")
    , @NamedQuery(name = "Detailopscard.findByStarttype", query = "SELECT d FROM Detailopscard d WHERE d.starttype = :starttype")
    , @NamedQuery(name = "Detailopscard.findByKind", query = "SELECT d FROM Detailopscard d WHERE d.kind = :kind")
    , @NamedQuery(name = "Detailopscard.findByDatecreate", query = "SELECT d FROM Detailopscard d WHERE d.datecreate = :datecreate")
    , @NamedQuery(name = "Detailopscard.findByDateupdate", query = "SELECT d FROM Detailopscard d WHERE d.dateupdate = :dateupdate")
    , @NamedQuery(name = "Detailopscard.findByOwner", query = "SELECT d FROM Detailopscard d WHERE d.owner = :owner")
    , @NamedQuery(name = "Detailopscard.findByLastuser", query = "SELECT d FROM Detailopscard d WHERE d.lastuser = :lastuser")})
public class Detailopscard implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDOPSCARD")
    private BigDecimal idopscard;
    @Size(max = 64)
    @Column(name = "ZONE")
    private String zone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "STARTTYPE")
    private String starttype;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KIND")
    private String kind;
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
//    @JoinColumn(name = "IDOPSCARD", referencedColumnName = "ID", insertable = false, updatable = false)
//    @OneToOne(optional = false)
//    private Opscard opscard;
    @JoinColumn(name = "IDSITE", referencedColumnName = "ID")
    @ManyToOne
    private Site idsite;
    @JoinColumn(name = "IDWORK", referencedColumnName = "ID")
    @ManyToOne
    private Work idwork;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detailopscard")
    private Collection<Detailopscardstructure> detailopscardstructureCollection;

    public Detailopscard() {
    }

    public Detailopscard(BigDecimal idopscard) {
        this.idopscard = idopscard;
    }

    public Detailopscard(BigDecimal idopscard, String starttype, String kind, Date datecreate, Date dateupdate) {
        this.idopscard = idopscard;
        this.starttype = starttype;
        this.kind = kind;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getIdopscard() {
        return idopscard;
    }

    public void setIdopscard(BigDecimal idopscard) {
        this.idopscard = idopscard;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getStarttype() {
        return starttype;
    }

    public void setStarttype(String starttype) {
        this.starttype = starttype;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

//    public Opscard getOpscard() {
//        return opscard;
//    }
//
//    public void setOpscard(Opscard opscard) {
//        this.opscard = opscard;
//    }

    public Site getIdsite() {
        return idsite;
    }

    public void setIdsite(Site idsite) {
        this.idsite = idsite;
    }

    public Work getIdwork() {
        return idwork;
    }

    public void setIdwork(Work idwork) {
        this.idwork = idwork;
    }

    @XmlTransient
    public Collection<Detailopscardstructure> getDetailopscardstructureCollection() {
        return detailopscardstructureCollection;
    }

    public void setDetailopscardstructureCollection(Collection<Detailopscardstructure> detailopscardstructureCollection) {
        this.detailopscardstructureCollection = detailopscardstructureCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idopscard != null ? idopscard.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detailopscard)) {
            return false;
        }
        Detailopscard other = (Detailopscard) object;
        if ((this.idopscard == null && other.idopscard != null) || (this.idopscard != null && !this.idopscard.equals(other.idopscard))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Detailopscard[ idopscard=" + idopscard + " ]";
    }
    
}
