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
@Table(name = "DETAILOPSCARDSTRUCTURE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detailopscardstructure.findAll", query = "SELECT d FROM Detailopscardstructure d")
    , @NamedQuery(name = "Detailopscardstructure.findByIdopscard", query = "SELECT d FROM Detailopscardstructure d WHERE d.detailopscardstructurePK.idopscard = :idopscard")
    , @NamedQuery(name = "Detailopscardstructure.findByIdstructure", query = "SELECT d FROM Detailopscardstructure d WHERE d.detailopscardstructurePK.idstructure = :idstructure")
    , @NamedQuery(name = "Detailopscardstructure.findByDatecreate", query = "SELECT d FROM Detailopscardstructure d WHERE d.datecreate = :datecreate")
    , @NamedQuery(name = "Detailopscardstructure.findByDateupdate", query = "SELECT d FROM Detailopscardstructure d WHERE d.dateupdate = :dateupdate")
    , @NamedQuery(name = "Detailopscardstructure.findByOwner", query = "SELECT d FROM Detailopscardstructure d WHERE d.owner = :owner")
    , @NamedQuery(name = "Detailopscardstructure.findByLastuser", query = "SELECT d FROM Detailopscardstructure d WHERE d.lastuser = :lastuser")})
public class Detailopscardstructure implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetailopscardstructurePK detailopscardstructurePK;
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
    @JoinColumn(name = "IDOPSCARD", referencedColumnName = "IDOPSCARD", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Detailopscard detailopscard;
    @JoinColumn(name = "IDSTRUCTURE", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Structure structure;

    public Detailopscardstructure() {
    }

    public Detailopscardstructure(DetailopscardstructurePK detailopscardstructurePK) {
        this.detailopscardstructurePK = detailopscardstructurePK;
    }

    public Detailopscardstructure(DetailopscardstructurePK detailopscardstructurePK, Date datecreate, Date dateupdate) {
        this.detailopscardstructurePK = detailopscardstructurePK;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public Detailopscardstructure(BigInteger idopscard, BigInteger idstructure) {
        this.detailopscardstructurePK = new DetailopscardstructurePK(idopscard, idstructure);
    }

    public DetailopscardstructurePK getDetailopscardstructurePK() {
        return detailopscardstructurePK;
    }

    public void setDetailopscardstructurePK(DetailopscardstructurePK detailopscardstructurePK) {
        this.detailopscardstructurePK = detailopscardstructurePK;
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

    public Detailopscard getDetailopscard() {
        return detailopscard;
    }

    public void setDetailopscard(Detailopscard detailopscard) {
        this.detailopscard = detailopscard;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detailopscardstructurePK != null ? detailopscardstructurePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detailopscardstructure)) {
            return false;
        }
        Detailopscardstructure other = (Detailopscardstructure) object;
        if ((this.detailopscardstructurePK == null && other.detailopscardstructurePK != null) || (this.detailopscardstructurePK != null && !this.detailopscardstructurePK.equals(other.detailopscardstructurePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Detailopscardstructure[ detailopscardstructurePK=" + detailopscardstructurePK + " ]";
    }
    
}
