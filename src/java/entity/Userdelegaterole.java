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
 * @author master
 */
@Entity
@Table(name = "USERDELEGATEROLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userdelegaterole.findAll", query = "SELECT u FROM Userdelegaterole u")
    , @NamedQuery(name = "Userdelegaterole.findById", query = "SELECT u FROM Userdelegaterole u WHERE u.id = :id")
    , @NamedQuery(name = "Userdelegaterole.findByIdmanager", query = "SELECT u FROM Userdelegaterole u WHERE u.idmanager = :idmanager")
    , @NamedQuery(name = "Userdelegaterole.findByIdrolemanager", query = "SELECT u FROM Userdelegaterole u WHERE u.idrolemanager = :idrolemanager")
    , @NamedQuery(name = "Userdelegaterole.findByIduserdelegate", query = "SELECT u FROM Userdelegaterole u WHERE u.iduserdelegate = :iduserdelegate")
    , @NamedQuery(name = "Userdelegaterole.findByIdroledelegate", query = "SELECT u FROM Userdelegaterole u WHERE u.idroledelegate = :idroledelegate")
    , @NamedQuery(name = "Userdelegaterole.findByDatefirst", query = "SELECT u FROM Userdelegaterole u WHERE u.datefirst = :datefirst")
    , @NamedQuery(name = "Userdelegaterole.findByDatelast", query = "SELECT u FROM Userdelegaterole u WHERE u.datelast = :datelast")
    , @NamedQuery(name = "Userdelegaterole.findByDatecreate", query = "SELECT u FROM Userdelegaterole u WHERE u.datecreate = :datecreate")
    , @NamedQuery(name = "Userdelegaterole.findByDateupdate", query = "SELECT u FROM Userdelegaterole u WHERE u.dateupdate = :dateupdate")
    , @NamedQuery(name = "Userdelegaterole.findByOwner", query = "SELECT u FROM Userdelegaterole u WHERE u.owner = :owner")
    , @NamedQuery(name = "Userdelegaterole.findByLastuser", query = "SELECT u FROM Userdelegaterole u WHERE u.lastuser = :lastuser")})
public class Userdelegaterole implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMANAGER")
    private BigInteger idmanager;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDROLEMANAGER")
    private BigInteger idrolemanager;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUSERDELEGATE")
    private BigInteger iduserdelegate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDROLEDELEGATE")
    private BigInteger idroledelegate;
    @Column(name = "DATEFIRST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datefirst;
    @Column(name = "DATELAST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datelast;
    @Column(name = "DATECREATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreate;
    @Column(name = "DATEUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateupdate;
    @Size(max = 31)
    @Column(name = "OWNER")
    private String owner;
    @Size(max = 31)
    @Column(name = "LASTUSER")
    private String lastuser;

    public Userdelegaterole() {
    }

    public Userdelegaterole(BigDecimal id) {
        this.id = id;
    }

    public Userdelegaterole(BigDecimal id, BigInteger idmanager, BigInteger idrolemanager, BigInteger iduserdelegate, BigInteger idroledelegate) {
        this.id = id;
        this.idmanager = idmanager;
        this.idrolemanager = idrolemanager;
        this.iduserdelegate = iduserdelegate;
        this.idroledelegate = idroledelegate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getIdmanager() {
        return idmanager;
    }

    public void setIdmanager(BigInteger idmanager) {
        this.idmanager = idmanager;
    }

    public BigInteger getIdrolemanager() {
        return idrolemanager;
    }

    public void setIdrolemanager(BigInteger idrolemanager) {
        this.idrolemanager = idrolemanager;
    }

    public BigInteger getIduserdelegate() {
        return iduserdelegate;
    }

    public void setIduserdelegate(BigInteger iduserdelegate) {
        this.iduserdelegate = iduserdelegate;
    }

    public BigInteger getIdroledelegate() {
        return idroledelegate;
    }

    public void setIdroledelegate(BigInteger idroledelegate) {
        this.idroledelegate = idroledelegate;
    }

    public Date getDatefirst() {
        return datefirst;
    }

    public void setDatefirst(Date datefirst) {
        this.datefirst = datefirst;
    }

    public Date getDatelast() {
        return datelast;
    }

    public void setDatelast(Date datelast) {
        this.datelast = datelast;
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
        if (!(object instanceof Userdelegaterole)) {
            return false;
        }
        Userdelegaterole other = (Userdelegaterole) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Userdelegaterole[ id=" + id + " ]";
    }
    
}
