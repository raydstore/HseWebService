/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "DETAILSITE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detailsite.findAll", query = "SELECT d FROM Detailsite d"),
    @NamedQuery(name = "Detailsite.findByIdsite", query = "SELECT d FROM Detailsite d WHERE d.idsite = :idsite"),
    @NamedQuery(name = "Detailsite.findByPath", query = "SELECT d FROM Detailsite d WHERE d.path = :path"),
    @NamedQuery(name = "Detailsite.findByRank", query = "SELECT d FROM Detailsite d WHERE d.rank = :rank"),
    @NamedQuery(name = "Detailsite.findByCount", query = "SELECT d FROM Detailsite d WHERE d.count = :count"),
    @NamedQuery(name = "Detailsite.findByDatecreate", query = "SELECT d FROM Detailsite d WHERE d.datecreate = :datecreate"),
    @NamedQuery(name = "Detailsite.findByDateupdate", query = "SELECT d FROM Detailsite d WHERE d.dateupdate = :dateupdate"),
    @NamedQuery(name = "Detailsite.findByOwner", query = "SELECT d FROM Detailsite d WHERE d.owner = :owner"),
    @NamedQuery(name = "Detailsite.findByLastuser", query = "SELECT d FROM Detailsite d WHERE d.lastuser = :lastuser")})
public class Detailsite implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSITE")
    private BigDecimal idsite;
    @Size(max = 31)
    @Column(name = "PATH")
    private String path;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RANK")
    private BigInteger rank;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COUNT")
    private BigInteger count;
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
    // , referencedColumnName = "ID", insertable = false, updatable = false(optional = false)
//    @JoinColumn(name = "IDSITE")
//    @OneToOne
//    @MapsId
//    private Site site;

    public Detailsite() {
    }

    public Detailsite(BigDecimal idsite) {
        this.idsite = idsite;
    }

    public Detailsite(BigDecimal idsite, BigInteger rank, BigInteger count, Date datecreate, Date dateupdate) {
        this.idsite = idsite;
        this.rank = rank;
        this.count = count;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getIdsite() {
        return idsite;
    }

    public void setIdsite(BigDecimal idsite) {
        this.idsite = idsite;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BigInteger getRank() {
        return rank;
    }

    public void setRank(BigInteger rank) {
        this.rank = rank;
    }

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger count) {
        this.count = count;
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
        if (!(object instanceof Detailsite)) {
            return false;
        }
        Detailsite other = (Detailsite) object;
        if ((this.idsite == null && other.idsite != null) || (this.idsite != null && !this.idsite.equals(other.idsite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Detailsite[ idsite=" + idsite + " ]";
    }
    
}
