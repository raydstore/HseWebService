/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "ACTIONOPSCARD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actionopscard.findAll", query = "SELECT a FROM Actionopscard a")
    , @NamedQuery(name = "Actionopscard.findByIdaction", query = "SELECT a FROM Actionopscard a WHERE a.idaction = :idaction")
    , @NamedQuery(name = "Actionopscard.findByIdopscard", query = "SELECT a FROM Actionopscard a WHERE a.idopscard = :idopscard")
    , @NamedQuery(name = "Actionopscard.findByKind", query = "SELECT a FROM Actionopscard a WHERE a.kind = :kind")
    , @NamedQuery(name = "Actionopscard.findByDatecreate", query = "SELECT a FROM Actionopscard a WHERE a.datecreate = :datecreate")
    , @NamedQuery(name = "Actionopscard.findByDateupdate", query = "SELECT a FROM Actionopscard a WHERE a.dateupdate = :dateupdate")
    , @NamedQuery(name = "Actionopscard.findByOwner", query = "SELECT a FROM Actionopscard a WHERE a.owner = :owner")
    , @NamedQuery(name = "Actionopscard.findByLastuser", query = "SELECT a FROM Actionopscard a WHERE a.lastuser = :lastuser")})
public class Actionopscard implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACTION")
    private BigDecimal idaction;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDOPSCARD")
    private BigDecimal idopscard;
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
//    @JoinColumn(name = "IDOPSCARD", referencedColumnName = "ID")
//    @ManyToOne(optional = false)
//    private Opscard opscard;

    public Actionopscard() {
    }

    public Actionopscard(BigDecimal idaction) {
        this.idaction = idaction;
    }

    public Actionopscard(BigDecimal idaction, String kind, Date datecreate, Date dateupdate) {
        this.idaction = idaction;
        this.kind = kind;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getIdaction() {
        return idaction;
    }

    public void setIdaction(BigDecimal idaction) {
        this.idaction = idaction;
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
//
//    public Opscard getOpscard() {
//        return opscard;
//    }
//
//    public void setOpscard(Opscard opscard) {
//        this.opscard = opscard;
//    }

    public BigDecimal getIdopscard() {
        return idopscard;
    }

    public void setIdopscard(BigDecimal idopscard) {
        this.idopscard = idopscard;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaction != null ? idaction.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actionopscard)) {
            return false;
        }
        Actionopscard other = (Actionopscard) object;
        if ((this.idaction == null && other.idaction != null) || (this.idaction != null && !this.idaction.equals(other.idaction))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Actionopscard[ idaction=" + idaction + " ]";
    }
    
}
