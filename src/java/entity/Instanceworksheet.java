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
@Table(name = "INSTANCEWORKSHEET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instanceworksheet.findAll", query = "SELECT i FROM Instanceworksheet i"),
    @NamedQuery(name = "Instanceworksheet.findById", query = "SELECT i FROM Instanceworksheet i WHERE i.id = :id"),
    @NamedQuery(name = "Instanceworksheet.findByIdworksheet", query = "SELECT i FROM Instanceworksheet i WHERE i.idworksheet = :idworksheet"),
    @NamedQuery(name = "Instanceworksheet.findByIdinstance", query = "SELECT i FROM Instanceworksheet i WHERE i.idinstance = :idinstance"),
    @NamedQuery(name = "Instanceworksheet.findByIdobject", query = "SELECT i FROM Instanceworksheet i WHERE i.idobject = :idobject"),
    @NamedQuery(name = "Instanceworksheet.findByFirstdate", query = "SELECT i FROM Instanceworksheet i WHERE i.firstdate = :firstdate"),
    @NamedQuery(name = "Instanceworksheet.findByLastdate", query = "SELECT i FROM Instanceworksheet i WHERE i.lastdate = :lastdate"),
    @NamedQuery(name = "Instanceworksheet.findByDatecreate", query = "SELECT i FROM Instanceworksheet i WHERE i.datecreate = :datecreate"),
    @NamedQuery(name = "Instanceworksheet.findByDateupdate", query = "SELECT i FROM Instanceworksheet i WHERE i.dateupdate = :dateupdate"),
    @NamedQuery(name = "Instanceworksheet.findByOwner", query = "SELECT i FROM Instanceworksheet i WHERE i.owner = :owner"),
    @NamedQuery(name = "Instanceworksheet.findByLastuser", query = "SELECT i FROM Instanceworksheet i WHERE i.lastuser = :lastuser")})
public class Instanceworksheet implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDWORKSHEET")
    private BigInteger idworksheet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDINSTANCE")
    private BigInteger idinstance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDOBJECT")
    private BigInteger idobject;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FIRSTDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LASTDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastdate;
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

    public Instanceworksheet() {
    }

    public Instanceworksheet(BigDecimal id) {
        this.id = id;
    }

    public Instanceworksheet(BigDecimal id, BigInteger idworksheet, BigInteger idinstance, BigInteger idobject, Date firstdate, Date lastdate, Date datecreate, Date dateupdate) {
        this.id = id;
        this.idworksheet = idworksheet;
        this.idinstance = idinstance;
        this.idobject = idobject;
        this.firstdate = firstdate;
        this.lastdate = lastdate;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getIdworksheet() {
        return idworksheet;
    }

    public void setIdworksheet(BigInteger idworksheet) {
        this.idworksheet = idworksheet;
    }

    public BigInteger getIdinstance() {
        return idinstance;
    }

    public void setIdinstance(BigInteger idinstance) {
        this.idinstance = idinstance;
    }

    public BigInteger getIdobject() {
        return idobject;
    }

    public void setIdobject(BigInteger idobject) {
        this.idobject = idobject;
    }

    public Date getFirstdate() {
        return firstdate;
    }

    public void setFirstdate(Date firstdate) {
        this.firstdate = firstdate;
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
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
        if (!(object instanceof Instanceworksheet)) {
            return false;
        }
        Instanceworksheet other = (Instanceworksheet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Instanceworksheet[ id=" + id + " ]";
    }
    
}
