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
@Table(name = "ACCIDENTAGENTEE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentagentee.findAll", query = "SELECT a FROM Accidentagentee a"),
    @NamedQuery(name = "Accidentagentee.findById", query = "SELECT a FROM Accidentagentee a WHERE a.accidentagenteePK.id = :id"),
    @NamedQuery(name = "Accidentagentee.findByIddamage", query = "SELECT a FROM Accidentagentee a WHERE a.accidentagenteePK.iddamage = :iddamage"),
    @NamedQuery(name = "Accidentagentee.findByName", query = "SELECT a FROM Accidentagentee a WHERE a.name = :name"),
    @NamedQuery(name = "Accidentagentee.findByFunction", query = "SELECT a FROM Accidentagentee a WHERE a.function = :function"),
    @NamedQuery(name = "Accidentagentee.findByDateofbirth", query = "SELECT a FROM Accidentagentee a WHERE a.dateofbirth = :dateofbirth"),
    @NamedQuery(name = "Accidentagentee.findByAccidentdomain", query = "SELECT a FROM Accidentagentee a WHERE a.accidentdomain = :accidentdomain"),
    @NamedQuery(name = "Accidentagentee.findByCountstopwork", query = "SELECT a FROM Accidentagentee a WHERE a.countstopwork = :countstopwork"),
    @NamedQuery(name = "Accidentagentee.findByTypeaccident", query = "SELECT a FROM Accidentagentee a WHERE a.typeaccident = :typeaccident"),
    @NamedQuery(name = "Accidentagentee.findBySamury", query = "SELECT a FROM Accidentagentee a WHERE a.samury = :samury"),
    @NamedQuery(name = "Accidentagentee.findByDatecreate", query = "SELECT a FROM Accidentagentee a WHERE a.datecreate = :datecreate"),
    @NamedQuery(name = "Accidentagentee.findByDateupdate", query = "SELECT a FROM Accidentagentee a WHERE a.dateupdate = :dateupdate"),
    @NamedQuery(name = "Accidentagentee.findByOwner", query = "SELECT a FROM Accidentagentee a WHERE a.owner = :owner"),
    @NamedQuery(name = "Accidentagentee.findByLastuser", query = "SELECT a FROM Accidentagentee a WHERE a.lastuser = :lastuser"),
    @NamedQuery(name = "Accidentagentee.findByIdgrid", query = "SELECT a FROM Accidentagentee a WHERE a.idgrid = :idgrid"),
    @NamedQuery(name = "Accidentagentee.findByIddamageIdgrid", query = "SELECT a FROM Accidentagentee a WHERE a.accidentagenteePK.iddamage = :iddamage and a.idgrid = :idgrid"),
})
public class Accidentagentee implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccidentagenteePK accidentagenteePK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEOFBIRTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateofbirth;
    @Size(max = 70)
    @Column(name = "FUNCTION")
    private String function;
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
    @JoinColumn(name = "IDENTREPRISE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Entreprise identreprise;

    public Accidentagentee() {
    }

    public Accidentagentee(AccidentagenteePK accidentagenteePK) {
        this.accidentagenteePK = accidentagenteePK;
    }

    public Accidentagentee(AccidentagenteePK accidentagenteePK, String name, short accidentdomain, BigInteger countstopwork, String typeaccident, String samury, Date dateofbirth, Date datecreate, Date dateupdate) {
        this.accidentagenteePK = accidentagenteePK;
        this.name = name;
        this.accidentdomain = accidentdomain;
        this.countstopwork = countstopwork;
        this.typeaccident = typeaccident;
        this.samury = samury;
        this.dateofbirth = dateofbirth;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public Accidentagentee(BigInteger id, BigInteger iddamage) {
        this.accidentagenteePK = new AccidentagenteePK(id, iddamage);
    }

    public AccidentagenteePK getAccidentagenteePK() {
        return accidentagenteePK;
    }

    public void setAccidentagenteePK(AccidentagenteePK accidentagenteePK) {
        this.accidentagenteePK = accidentagenteePK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    
    

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
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

    public Entreprise getIdentreprise() {
        return identreprise;
    }

    public void setIdentreprise(Entreprise identreprise) {
        this.identreprise = identreprise;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accidentagenteePK != null ? accidentagenteePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accidentagentee)) {
            return false;
        }
        Accidentagentee other = (Accidentagentee) object;
        if ((this.accidentagenteePK == null && other.accidentagenteePK != null) || (this.accidentagenteePK != null && !this.accidentagenteePK.equals(other.accidentagenteePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accidentagentee[ accidentagenteePK=" + accidentagenteePK + " ]";
    }
    
}
