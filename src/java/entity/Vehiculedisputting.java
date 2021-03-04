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
@Table(name = "VEHICULEDISPUTTING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehiculedisputting.findAll", query = "SELECT v FROM Vehiculedisputting v")
    , @NamedQuery(name = "Vehiculedisputting.findByIdaccident", query = "SELECT v FROM Vehiculedisputting v WHERE v.idaccident = :idaccident")
    , @NamedQuery(name = "Vehiculedisputting.findByIddamagea", query = "SELECT v FROM Vehiculedisputting v WHERE v.iddamagea = :iddamagea")
    , @NamedQuery(name = "Vehiculedisputting.findByIdvehiculea", query = "SELECT v FROM Vehiculedisputting v WHERE v.idvehiculea = :idvehiculea")
    , @NamedQuery(name = "Vehiculedisputting.findByIddamageb", query = "SELECT v FROM Vehiculedisputting v WHERE v.iddamageb = :iddamageb")
    , @NamedQuery(name = "Vehiculedisputting.findByIdvehiculeb", query = "SELECT v FROM Vehiculedisputting v WHERE v.idvehiculeb = :idvehiculeb")
    , @NamedQuery(name = "Vehiculedisputting.findByDatecreate", query = "SELECT v FROM Vehiculedisputting v WHERE v.datecreate = :datecreate")
    , @NamedQuery(name = "Vehiculedisputting.findByDateupdate", query = "SELECT v FROM Vehiculedisputting v WHERE v.dateupdate = :dateupdate")
    , @NamedQuery(name = "Vehiculedisputting.findByOwner", query = "SELECT v FROM Vehiculedisputting v WHERE v.owner = :owner")
    , @NamedQuery(name = "Vehiculedisputting.findByLastuser", query = "SELECT v FROM Vehiculedisputting v WHERE v.lastuser = :lastuser")
    , @NamedQuery(name = "Vehiculedisputting.findById", query = "SELECT v FROM Vehiculedisputting v WHERE v.id = :id")})
public class Vehiculedisputting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACCIDENT")
    private BigInteger idaccident;
    @Column(name = "IDDAMAGEA")
    private BigInteger iddamagea;
    @Column(name = "IDVEHICULEA")
    private BigInteger idvehiculea;
    @Column(name = "IDDAMAGEB")
    private BigInteger iddamageb;
    @Column(name = "IDVEHICULEB")
    private BigInteger idvehiculeb;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;

    public Vehiculedisputting() {
    }

    public Vehiculedisputting(BigDecimal id) {
        this.id = id;
    }

    public Vehiculedisputting(BigDecimal id, BigInteger idaccident, Date datecreate, Date dateupdate) {
        this.id = id;
        this.idaccident = idaccident;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigInteger getIdaccident() {
        return idaccident;
    }

    public void setIdaccident(BigInteger idaccident) {
        this.idaccident = idaccident;
    }

    public BigInteger getIddamagea() {
        return iddamagea;
    }

    public void setIddamagea(BigInteger iddamagea) {
        this.iddamagea = iddamagea;
    }

    public BigInteger getIdvehiculea() {
        return idvehiculea;
    }

    public void setIdvehiculea(BigInteger idvehiculea) {
        this.idvehiculea = idvehiculea;
    }

    public BigInteger getIddamageb() {
        return iddamageb;
    }

    public void setIddamageb(BigInteger iddamageb) {
        this.iddamageb = iddamageb;
    }

    public BigInteger getIdvehiculeb() {
        return idvehiculeb;
    }

    public void setIdvehiculeb(BigInteger idvehiculeb) {
        this.idvehiculeb = idvehiculeb;
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

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
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
        if (!(object instanceof Vehiculedisputting)) {
            return false;
        }
        Vehiculedisputting other = (Vehiculedisputting) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Vehiculedisputting[ id=" + id + " ]";
    }
    
}
