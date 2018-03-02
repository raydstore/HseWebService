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
@Table(name = "STATEMENTTASK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Statementtask.findAll", query = "SELECT s FROM Statementtask s"),
    @NamedQuery(name = "Statementtask.findByIdtitletask", query = "SELECT s FROM Statementtask s WHERE s.idtitletask = :idtitletask"),
    @NamedQuery(name = "Statementtask.findByKind", query = "SELECT s FROM Statementtask s WHERE s.kind = :kind"),
    @NamedQuery(name = "Statementtask.findByCount", query = "SELECT s FROM Statementtask s WHERE s.count = :count"),
    @NamedQuery(name = "Statementtask.findByDatecreate", query = "SELECT s FROM Statementtask s WHERE s.datecreate = :datecreate"),
    @NamedQuery(name = "Statementtask.findByDateupdate", query = "SELECT s FROM Statementtask s WHERE s.dateupdate = :dateupdate"),
    @NamedQuery(name = "Statementtask.findByOwner", query = "SELECT s FROM Statementtask s WHERE s.owner = :owner"),
    @NamedQuery(name = "Statementtask.findByLastuser", query = "SELECT s FROM Statementtask s WHERE s.lastuser = :lastuser")})
public class Statementtask implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTITLETASK")
    private BigDecimal idtitletask;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KIND")
    private String kind;
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

    public Statementtask() {
    }

    public Statementtask(BigDecimal idtitletask) {
        this.idtitletask = idtitletask;
    }

    public Statementtask(BigDecimal idtitletask, String kind, BigInteger count, Date datecreate, Date dateupdate) {
        this.idtitletask = idtitletask;
        this.kind = kind;
        this.count = count;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getIdtitletask() {
        return idtitletask;
    }

    public void setIdtitletask(BigDecimal idtitletask) {
        this.idtitletask = idtitletask;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtitletask != null ? idtitletask.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statementtask)) {
            return false;
        }
        Statementtask other = (Statementtask) object;
        if ((this.idtitletask == null && other.idtitletask != null) || (this.idtitletask != null && !this.idtitletask.equals(other.idtitletask))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Statementtask[ idtitletask=" + idtitletask + " ]";
    }
    
}
