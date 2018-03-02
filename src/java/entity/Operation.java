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
@Table(name = "OPERATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operation.findAll", query = "SELECT o FROM Operation o"),
    @NamedQuery(name = "Operation.findById", query = "SELECT o FROM Operation o WHERE o.id = :id"),
    @NamedQuery(name = "Operation.findByIdinstance", query = "SELECT o FROM Operation o WHERE o.idinstance = :idinstance"),
    @NamedQuery(name = "Operation.findByIdobject", query = "SELECT o FROM Operation o WHERE o.idobject = :idobject"),
    @NamedQuery(name = "Operation.findByIndate", query = "SELECT o FROM Operation o WHERE o.indate = :indate"),
    @NamedQuery(name = "Operation.findByTodate", query = "SELECT o FROM Operation o WHERE o.todate = :todate"),
    @NamedQuery(name = "Operation.findByDatecreate", query = "SELECT o FROM Operation o WHERE o.datecreate = :datecreate"),
    @NamedQuery(name = "Operation.findByDateupdate", query = "SELECT o FROM Operation o WHERE o.dateupdate = :dateupdate"),
    @NamedQuery(name = "Operation.findByOwner", query = "SELECT o FROM Operation o WHERE o.owner = :owner"),
    @NamedQuery(name = "Operation.findByLastuser", query = "SELECT o FROM Operation o WHERE o.lastuser = :lastuser")})
public class Operation implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
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
    @Column(name = "INDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date indate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TODATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date todate;
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
    @JoinColumn(name = "IDTYPEOPERATION", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Typeoperation idtypeoperation;

    public Operation() {
    }

    public Operation(BigDecimal id) {
        this.id = id;
    }

    public Operation(BigDecimal id, BigInteger idinstance, BigInteger idobject, Date indate, Date todate, Date datecreate, Date dateupdate) {
        this.id = id;
        this.idinstance = idinstance;
        this.idobject = idobject;
        this.indate = indate;
        this.todate = todate;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
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

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
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

    public Typeoperation getIdtypeoperation() {
        return idtypeoperation;
    }

    public void setIdtypeoperation(Typeoperation idtypeoperation) {
        this.idtypeoperation = idtypeoperation;
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
        if (!(object instanceof Operation)) {
            return false;
        }
        Operation other = (Operation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Operation[ id=" + id + " ]";
    }
    
}
