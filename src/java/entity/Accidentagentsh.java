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
@Table(name = "ACCIDENTAGENTSH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentagentsh.findAll", query = "SELECT a FROM Accidentagentsh a"),
    @NamedQuery(name = "Accidentagentsh.findByIddamage", query = "SELECT a FROM Accidentagentsh a WHERE a.accidentagentshPK.iddamage = :iddamage"),
    @NamedQuery(name = "Accidentagentsh.findByIdagent", query = "SELECT a FROM Accidentagentsh a WHERE a.accidentagentshPK.idagent = :idagent"),
    @NamedQuery(name = "Accidentagentsh.findByAccidentdomain", query = "SELECT a FROM Accidentagentsh a WHERE a.accidentdomain = :accidentdomain"),
    @NamedQuery(name = "Accidentagentsh.findByCountstopwork", query = "SELECT a FROM Accidentagentsh a WHERE a.countstopwork = :countstopwork"),
    @NamedQuery(name = "Accidentagentsh.findByTypeaccident", query = "SELECT a FROM Accidentagentsh a WHERE a.typeaccident = :typeaccident"),
    @NamedQuery(name = "Accidentagentsh.findBySamury", query = "SELECT a FROM Accidentagentsh a WHERE a.samury = :samury"),
    @NamedQuery(name = "Accidentagentsh.findByDatecreate", query = "SELECT a FROM Accidentagentsh a WHERE a.datecreate = :datecreate"),
    @NamedQuery(name = "Accidentagentsh.findByDateupdate", query = "SELECT a FROM Accidentagentsh a WHERE a.dateupdate = :dateupdate"),
    @NamedQuery(name = "Accidentagentsh.findByOwner", query = "SELECT a FROM Accidentagentsh a WHERE a.owner = :owner"),
    @NamedQuery(name = "Accidentagentsh.findByLastuser", query = "SELECT a FROM Accidentagentsh a WHERE a.lastuser = :lastuser"),
    @NamedQuery(name = "Accidentagentsh.findByIdgrid", query = "SELECT a FROM Accidentagentsh a WHERE a.idgrid = :idgrid"),
    @NamedQuery(name = "Accidentagentsh.findByIddamageIdgrid", query = "SELECT a FROM Accidentagentsh a WHERE a.accidentagentshPK.iddamage = :iddamage and a.idgrid = :idgrid"),
})
public class Accidentagentsh implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccidentagentshPK accidentagentshPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCIDENTDOMAIN")
    private short accidentdomain;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COUNTSTOPWORK")
    private BigInteger countstopwork;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TYPEACCIDENT")
    private String typeaccident;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 512)
    @Column(name = "SAMURY")
    private String samury;
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
    @Column(name = "IDGRID")
    private BigInteger idgrid;
    @JoinColumn(name = "IDAGENT", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Agent agent;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accidentagentsh")
    private Collection<Accidentagentshbit> accidentagentshbitCollection;

    public Accidentagentsh() {
    }

    public Accidentagentsh(AccidentagentshPK accidentagentshPK) {
        this.accidentagentshPK = accidentagentshPK;
    }

    public Accidentagentsh(AccidentagentshPK accidentagentshPK, short accidentdomain, BigInteger countstopwork, String typeaccident, String samury, Date datecreate, Date dateupdate) {
        this.accidentagentshPK = accidentagentshPK;
        this.accidentdomain = accidentdomain;
        this.countstopwork = countstopwork;
        this.typeaccident = typeaccident;
        this.samury = samury;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public Accidentagentsh(BigInteger iddamage, String idagent) {
        this.accidentagentshPK = new AccidentagentshPK(iddamage, idagent);
    }

    public AccidentagentshPK getAccidentagentshPK() {
        return accidentagentshPK;
    }

    public void setAccidentagentshPK(AccidentagentshPK accidentagentshPK) {
        this.accidentagentshPK = accidentagentshPK;
    }

    public short getAccidentdomain() {
        return accidentdomain;
    }

    public void setAccidentdomain(short accidentdomain) {
        this.accidentdomain = accidentdomain;
    }

    public BigInteger getCountstopwork() {
        return countstopwork;
    }

    public void setCountstopwork(BigInteger countstopwork) {
        this.countstopwork = countstopwork;
    }

    public String getTypeaccident() {
        return typeaccident;
    }

    public void setTypeaccident(String typeaccident) {
        this.typeaccident = typeaccident;
    }

    public String getSamury() {
        return samury;
    }

    public void setSamury(String samury) {
        this.samury = samury;
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

    public BigInteger getIdgrid() {
        return idgrid;
    }

    public void setIdgrid(BigInteger idgrid) {
        this.idgrid = idgrid;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    @XmlTransient
    public Collection<Accidentagentshbit> getAccidentagentshbitCollection() {
        return accidentagentshbitCollection;
    }

    public void setAccidentagentshbitCollection(Collection<Accidentagentshbit> accidentagentshbitCollection) {
        this.accidentagentshbitCollection = accidentagentshbitCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accidentagentshPK != null ? accidentagentshPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accidentagentsh)) {
            return false;
        }
        Accidentagentsh other = (Accidentagentsh) object;
        if ((this.accidentagentshPK == null && other.accidentagentshPK != null) || (this.accidentagentshPK != null && !this.accidentagentshPK.equals(other.accidentagentshPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accidentagentsh[ accidentagentshPK=" + accidentagentshPK + " ]";
    }
    
}
