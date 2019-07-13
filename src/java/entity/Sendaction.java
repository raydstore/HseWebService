/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "SENDACTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sendaction.findAll", query = "SELECT s FROM Sendaction s")
    , @NamedQuery(name = "Sendaction.findById", query = "SELECT s FROM Sendaction s WHERE s.id = :id")
    , @NamedQuery(name = "Sendaction.findByIdStructure", query = "SELECT s FROM Sendaction s WHERE s.id = :idstructure")    
    , @NamedQuery(name = "Sendaction.findByCurdate", query = "SELECT s FROM Sendaction s WHERE s.curdate = :curdate")
    , @NamedQuery(name = "Sendaction.findByDatecreate", query = "SELECT s FROM Sendaction s WHERE s.datecreate = :datecreate")
    , @NamedQuery(name = "Sendaction.findByDateupdate", query = "SELECT s FROM Sendaction s WHERE s.dateupdate = :dateupdate")
    , @NamedQuery(name = "Sendaction.findByOwner", query = "SELECT s FROM Sendaction s WHERE s.owner = :owner")
    , @NamedQuery(name = "Sendaction.findByLastuser", query = "SELECT s FROM Sendaction s WHERE s.lastuser = :lastuser")})
public class Sendaction implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSTRUCTURE")
    private BigInteger idstructure;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CURDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date curdate;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sendaction")
    private Collection<Actionassignment> actionassignmentCollection;

    public Sendaction() {
    }

    public Sendaction(BigDecimal id) {
        this.id = id;
    }

    public Sendaction(BigDecimal id, BigInteger idstructure, Date curdate, Date datecreate, Date dateupdate) {
        this.id = id;
        this.idstructure = idstructure;
        this.curdate = curdate;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getIdstructure() {
        return idstructure;
    }

    public void setIdstructure(BigInteger idstructure) {
        this.idstructure = idstructure;
    }
    
    public Date getCurdate() {
        return curdate;
    }

    public void setCurdate(Date curdate) {
        this.curdate = curdate;
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

    @XmlTransient
    public Collection<Actionassignment> getActionassignmentCollection() {
        return actionassignmentCollection;
    }

    public void setActionassignmentCollection(Collection<Actionassignment> actionassignmentCollection) {
        this.actionassignmentCollection = actionassignmentCollection;
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
        if (!(object instanceof Sendaction)) {
            return false;
        }
        Sendaction other = (Sendaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Sendaction[ id=" + id + " ]";
    }
    
}
