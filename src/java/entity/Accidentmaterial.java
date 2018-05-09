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
@Table(name = "ACCIDENTMATERIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentmaterial.findAll", query = "SELECT a FROM Accidentmaterial a"),
    @NamedQuery(name = "Accidentmaterial.findById", query = "SELECT a FROM Accidentmaterial a WHERE a.id = :id"),
    @NamedQuery(name = "Accidentmaterial.findByIddamage", query = "SELECT a FROM Accidentmaterial a WHERE a.iddamage = :iddamage"),
    @NamedQuery(name = "Accidentmaterial.findByAccidentdomain", query = "SELECT a FROM Accidentmaterial a WHERE a.accidentdomain = :accidentdomain"),
    @NamedQuery(name = "Accidentmaterial.findByDamagename", query = "SELECT a FROM Accidentmaterial a WHERE a.damagename = :damagename"),
    @NamedQuery(name = "Accidentmaterial.findByName", query = "SELECT a FROM Accidentmaterial a WHERE a.name = :name"),
    @NamedQuery(name = "Accidentmaterial.findByDatecreate", query = "SELECT a FROM Accidentmaterial a WHERE a.datecreate = :datecreate"),
    @NamedQuery(name = "Accidentmaterial.findByDateupdate", query = "SELECT a FROM Accidentmaterial a WHERE a.dateupdate = :dateupdate"),
    @NamedQuery(name = "Accidentmaterial.findByOwner", query = "SELECT a FROM Accidentmaterial a WHERE a.owner = :owner"),
    @NamedQuery(name = "Accidentmaterial.findByLastuser", query = "SELECT a FROM Accidentmaterial a WHERE a.lastuser = :lastuser"),
    @NamedQuery(name = "Accidentmaterial.findByIdgrid", query = "SELECT a FROM Accidentmaterial a WHERE a.idgrid = :idgrid"),
    @NamedQuery(name = "Accidentmaterial.findByIddamageIdgridAcc", query = "SELECT a FROM Accidentmaterial a WHERE a.iddamage = :iddamage"
            + " and a.idgrid = :idgrid and a.accidentdomain = :accidentdomain"),
})
public class Accidentmaterial implements Serializable {
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
    @Column(name = "ACCIDENTDOMAIN")
    private BigInteger accidentdomain;
    @Size(max = 128)
    @Column(name = "DAMAGENAME")
    private String damagename;
    @Size(max = 128)
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGRID")
    private BigInteger idgrid;

    public Accidentmaterial() {
    }

    public Accidentmaterial(BigDecimal id) {
        this.id = id;
    }

    public Accidentmaterial(BigDecimal id, BigInteger iddamage, BigInteger accidentdomain, Date datecreate, Date dateupdate, BigInteger idgrid) {
        this.id = id;
        this.iddamage = iddamage;
        this.accidentdomain = accidentdomain;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
        this.idgrid = idgrid;
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

    public BigInteger getAccidentdomain() {
        return accidentdomain;
    }

    public void setAccidentdomain(BigInteger accidentdomain) {
        this.accidentdomain = accidentdomain;
    }

    public String getDamagename() {
        return damagename;
    }

    public void setDamagename(String damagename) {
        this.damagename = damagename;
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

    public BigInteger getIdgrid() {
        return idgrid;
    }

    public void setIdgrid(BigInteger idgrid) {
        this.idgrid = idgrid;
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
        if (!(object instanceof Accidentmaterial)) {
            return false;
        }
        Accidentmaterial other = (Accidentmaterial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accidentmaterial[ id=" + id + " ]";
    }
    
}
