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
@Table(name = "DAMAGEDEFINITION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Damagedefinition.findAll", query = "SELECT d FROM Damagedefinition d"),
    @NamedQuery(name = "Damagedefinition.findById", query = "SELECT d FROM Damagedefinition d WHERE d.id = :id"),
    @NamedQuery(name = "Damagedefinition.findByIddamage", query = "SELECT d FROM Damagedefinition d WHERE d.iddamage = :iddamage"),
    @NamedQuery(name = "Damagedefinition.findByIdgrid", query = "SELECT d FROM Damagedefinition d WHERE d.idgrid = :idgrid"),
    @NamedQuery(name = "Damagedefinition.findByAccidentdomain", query = "SELECT d FROM Damagedefinition d WHERE d.accidentdomain = :accidentdomain"),
    @NamedQuery(name = "Damagedefinition.findByName", query = "SELECT d FROM Damagedefinition d WHERE d.name = :name"),
    @NamedQuery(name = "Damagedefinition.findByDatecreate", query = "SELECT d FROM Damagedefinition d WHERE d.datecreate = :datecreate"),
    @NamedQuery(name = "Damagedefinition.findByDateupdate", query = "SELECT d FROM Damagedefinition d WHERE d.dateupdate = :dateupdate"),
    @NamedQuery(name = "Damagedefinition.findByOwner", query = "SELECT d FROM Damagedefinition d WHERE d.owner = :owner"),
    @NamedQuery(name = "Damagedefinition.findByLastuser", query = "SELECT d FROM Damagedefinition d WHERE d.lastuser = :lastuser"),
    @NamedQuery(name = "Damagedefinition.findByIddamageIdgridAcc", query = "SELECT d FROM Damagedefinition d WHERE d.iddamage = :iddamage and d.idgrid = :idgrid"
            + " and d.accidentdomain = :accidentdomain")
})
public class Damagedefinition implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDAMAGE")
    private BigInteger iddamage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGRID")
    private BigInteger idgrid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCIDENTDOMAIN")
    private BigInteger accidentdomain;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "NAME")
    private String name;
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

    public Damagedefinition() {
    }

    public Damagedefinition(BigDecimal id) {
        this.id = id;
    }

    public Damagedefinition(BigDecimal id, BigInteger iddamage, BigInteger idgrid, BigInteger accidentdomain, String name, Date datecreate, Date dateupdate) {
        this.id = id;
        this.iddamage = iddamage;
        this.idgrid = idgrid;
        this.accidentdomain = accidentdomain;
        this.name = name;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getIddamage() {
        return iddamage;
    }

    public void setIddamage(BigInteger iddamage) {
        this.iddamage = iddamage;
    }

    public BigInteger getIdgrid() {
        return idgrid;
    }

    public void setIdgrid(BigInteger idgrid) {
        this.idgrid = idgrid;
    }

    public BigInteger getAccidentdomain() {
        return accidentdomain;
    }

    public void setAccidentdomain(BigInteger accidentdomain) {
        this.accidentdomain = accidentdomain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Damagedefinition)) {
            return false;
        }
        Damagedefinition other = (Damagedefinition) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Damagedefinition[ id=" + id + " ]";
    }
    
}
