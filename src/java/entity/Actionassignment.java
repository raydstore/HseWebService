/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "ACTIONASSIGNMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actionassignment.findAll", query = "SELECT a FROM Actionassignment a"),
    @NamedQuery(name = "Actionassignment.findById", query = "SELECT a FROM Actionassignment a WHERE a.id = :id"),
    @NamedQuery(name = "Actionassignment.findBySendin", query = "SELECT a FROM Actionassignment a WHERE a.sendin = :sendin"),
    @NamedQuery(name = "Actionassignment.findByDatecreate", query = "SELECT a FROM Actionassignment a WHERE a.datecreate = :datecreate"),
    @NamedQuery(name = "Actionassignment.findByDateupdate", query = "SELECT a FROM Actionassignment a WHERE a.dateupdate = :dateupdate"),
    @NamedQuery(name = "Actionassignment.findByOwner", query = "SELECT a FROM Actionassignment a WHERE a.owner = :owner"),
    @NamedQuery(name = "Actionassignment.findByLastuser", query = "SELECT a FROM Actionassignment a WHERE a.lastuser = :lastuser")})
public class Actionassignment implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SENDIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendin;
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
    @JoinColumn(name = "IDACTION", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Action idaction;
    @JoinColumn(name = "IDSTRUCTURE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Structure idstructure;

    public Actionassignment() {
    }

    public Actionassignment(BigDecimal id) {
        this.id = id;
    }

    public Actionassignment(BigDecimal id, Date sendin, Date datecreate, Date dateupdate) {
        this.id = id;
        this.sendin = sendin;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getSendin() {
        return sendin;
    }

    public void setSendin(Date sendin) {
        this.sendin = sendin;
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

    public Action getIdaction() {
        return idaction;
    }

    public void setIdaction(Action idaction) {
        this.idaction = idaction;
    }

    public Structure getIdstructure() {
        return idstructure;
    }

    public void setIdstructure(Structure idstructure) {
        this.idstructure = idstructure;
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
        if (!(object instanceof Actionassignment)) {
            return false;
        }
        Actionassignment other = (Actionassignment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Actionassignment[ id=" + id + " ]";
    }
    
}
