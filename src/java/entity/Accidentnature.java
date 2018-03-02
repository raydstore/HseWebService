/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "ACCIDENTNATURE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentnature.findAll", query = "SELECT a FROM Accidentnature a"),
    @NamedQuery(name = "Accidentnature.findByIdaccident", query = "SELECT a FROM Accidentnature a WHERE a.accidentnaturePK.idaccident = :idaccident"),
    @NamedQuery(name = "Accidentnature.findByIdnature", query = "SELECT a FROM Accidentnature a WHERE a.accidentnaturePK.idnature = :idnature"),
    @NamedQuery(name = "Accidentnature.findByDatecreate", query = "SELECT a FROM Accidentnature a WHERE a.datecreate = :datecreate"),
    @NamedQuery(name = "Accidentnature.findByDateupdate", query = "SELECT a FROM Accidentnature a WHERE a.dateupdate = :dateupdate"),
    @NamedQuery(name = "Accidentnature.findByOwner", query = "SELECT a FROM Accidentnature a WHERE a.owner = :owner"),
    @NamedQuery(name = "Accidentnature.findByLastuser", query = "SELECT a FROM Accidentnature a WHERE a.lastuser = :lastuser")})
public class Accidentnature implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccidentnaturePK accidentnaturePK;
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
    @JoinColumn(name = "IDACCIDENT", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Accident accident;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accidentnature")
    private Collection<Damage> damageCollection;

    public Accidentnature() {
    }

    public Accidentnature(AccidentnaturePK accidentnaturePK) {
        this.accidentnaturePK = accidentnaturePK;
    }

    public Accidentnature(AccidentnaturePK accidentnaturePK, Date datecreate, Date dateupdate) {
        this.accidentnaturePK = accidentnaturePK;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public Accidentnature(BigInteger idaccident, BigInteger idnature) {
        this.accidentnaturePK = new AccidentnaturePK(idaccident, idnature);
    }

    public AccidentnaturePK getAccidentnaturePK() {
        return accidentnaturePK;
    }

    public void setAccidentnaturePK(AccidentnaturePK accidentnaturePK) {
        this.accidentnaturePK = accidentnaturePK;
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

    public Accident getAccident() {
        return accident;
    }

    public void setAccident(Accident accident) {
        this.accident = accident;
    }

    @XmlTransient
    public Collection<Damage> getDamageCollection() {
        return damageCollection;
    }

    public void setDamageCollection(Collection<Damage> damageCollection) {
        this.damageCollection = damageCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accidentnaturePK != null ? accidentnaturePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accidentnature)) {
            return false;
        }
        Accidentnature other = (Accidentnature) object;
        if ((this.accidentnaturePK == null && other.accidentnaturePK != null) || (this.accidentnaturePK != null && !this.accidentnaturePK.equals(other.accidentnaturePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accidentnature[ accidentnaturePK=" + accidentnaturePK + " ]";
    }
    
}
