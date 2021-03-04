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
@Table(name = "ACCIDENTAGENTTP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentagenttp.findAll", query = "SELECT a FROM Accidentagenttp a"),
    @NamedQuery(name = "Accidentagenttp.findById", query = "SELECT a FROM Accidentagenttp a WHERE a.accidentagenttpPK.id = :id"),
    @NamedQuery(name = "Accidentagenttp.findByIddamage", query = "SELECT a FROM Accidentagenttp a WHERE a.accidentagenttpPK.iddamage = :iddamage"),
    @NamedQuery(name = "Accidentagenttp.findByName", query = "SELECT a FROM Accidentagenttp a WHERE a.name = :name"),
    @NamedQuery(name = "Accidentagenttp.findByAccidentdomain", query = "SELECT a FROM Accidentagenttp a WHERE a.accidentdomain = :accidentdomain"),
    @NamedQuery(name = "Accidentagenttp.findByTypeaccident", query = "SELECT a FROM Accidentagenttp a WHERE a.typeaccident = :typeaccident"),
    @NamedQuery(name = "Accidentagenttp.findBySamury", query = "SELECT a FROM Accidentagenttp a WHERE a.samury = :samury"),
    @NamedQuery(name = "Accidentagenttp.findByFunction", query = "SELECT a FROM Accidentagenttp a WHERE a.function = :function"),
    @NamedQuery(name = "Accidentagenttp.findByDatecreate", query = "SELECT a FROM Accidentagenttp a WHERE a.datecreate = :datecreate"),
    @NamedQuery(name = "Accidentagenttp.findByDateofbirth", query = "SELECT a FROM Accidentagenttp a WHERE a.dateofbirth = :dateofbirth"),
    @NamedQuery(name = "Accidentagenttp.findByDateupdate", query = "SELECT a FROM Accidentagenttp a WHERE a.dateupdate = :dateupdate"),
    @NamedQuery(name = "Accidentagenttp.findByOwner", query = "SELECT a FROM Accidentagenttp a WHERE a.owner = :owner"),
    @NamedQuery(name = "Accidentagenttp.findByLastuser", query = "SELECT a FROM Accidentagenttp a WHERE a.lastuser = :lastuser"),
    @NamedQuery(name = "Accidentagenttp.findByCountstopwork", query = "SELECT a FROM Accidentagenttp a WHERE a.countstopwork = :countstopwork"),
    @NamedQuery(name = "Accidentagenttp.findByIdgrid", query = "SELECT a FROM Accidentagenttp a WHERE a.idgrid = :idgrid"),
    @NamedQuery(name = "Accidentagenttp.findByIddamageIdgrid", query = "SELECT a FROM Accidentagenttp a WHERE a.accidentagenttpPK.iddamage = :iddamage and a.idgrid = :idgrid")
})
public class Accidentagenttp implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccidentagenttpPK accidentagenttpPK;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "COUNTSTOPWORK")
    private BigInteger countstopwork;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGRID")
    private BigInteger idgrid;

    public Accidentagenttp() {
    }

    public Accidentagenttp(AccidentagenttpPK accidentagenttpPK) {
        this.accidentagenttpPK = accidentagenttpPK;
    }

    public Accidentagenttp(AccidentagenttpPK accidentagenttpPK, String name, short accidentdomain, String typeaccident, String function, Date dateofbirth, String samury, Date datecreate, Date dateupdate, BigInteger countstopwork, BigInteger idgrid) {
        this.accidentagenttpPK = accidentagenttpPK;
        this.name = name;
        this.accidentdomain = accidentdomain;
        this.typeaccident = typeaccident;
        this.function = function;
        this.dateofbirth = dateofbirth;
        this.samury = samury;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
        this.countstopwork = countstopwork;
        this.idgrid = idgrid;
    }

    public Accidentagenttp(BigInteger id, BigInteger iddamage) {
        this.accidentagenttpPK = new AccidentagenttpPK(id, iddamage);
    }

    public AccidentagenttpPK getAccidentagenttpPK() {
        return accidentagenttpPK;
    }

    public void setAccidentagenttpPK(AccidentagenttpPK accidentagenttpPK) {
        this.accidentagenttpPK = accidentagenttpPK;
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

    public BigInteger getCountstopwork() {
        return countstopwork;
    }

    public void setCountstopwork(BigInteger countstopwork) {
        this.countstopwork = countstopwork;
    }

    public BigInteger getIdgrid() {
        return idgrid;
    }

    public void setIdgrid(BigInteger idgrid) {
        this.idgrid = idgrid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accidentagenttpPK != null ? accidentagenttpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accidentagenttp)) {
            return false;
        }
        Accidentagenttp other = (Accidentagenttp) object;
        if ((this.accidentagenttpPK == null && other.accidentagenttpPK != null) || (this.accidentagenttpPK != null && !this.accidentagenttpPK.equals(other.accidentagenttpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accidentagenttp[ accidentagenttpPK=" + accidentagenttpPK + " ]";
    }
    
}
