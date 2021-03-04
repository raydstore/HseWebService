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
 * @author master
 */
@Entity
@Table(name = "DELEGATEROLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Delegaterole.findAll", query = "SELECT d FROM Delegaterole d")
    , @NamedQuery(name = "Delegaterole.findById", query = "SELECT d FROM Delegaterole d WHERE d.id = :id")
    , @NamedQuery(name = "Delegaterole.findByDatecreate", query = "SELECT d FROM Delegaterole d WHERE d.datecreate = :datecreate")
    , @NamedQuery(name = "Delegaterole.findByDateupdate", query = "SELECT d FROM Delegaterole d WHERE d.dateupdate = :dateupdate")
    , @NamedQuery(name = "Delegaterole.findByOwner", query = "SELECT d FROM Delegaterole d WHERE d.owner = :owner")
    , @NamedQuery(name = "Delegaterole.findByLastuser", query = "SELECT d FROM Delegaterole d WHERE d.lastuser = :lastuser")})
public class Delegaterole implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
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
    @JoinColumn(name = "DELEGATETO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Role delegateto;
    @JoinColumn(name = "IDROLE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Role idrole;

    public Delegaterole() {
    }

    public Delegaterole(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
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

    public Role getDelegateto() {
        return delegateto;
    }

    public void setDelegateto(Role delegateto) {
        this.delegateto = delegateto;
    }

    public Role getIdrole() {
        return idrole;
    }

    public void setIdrole(Role idrole) {
        this.idrole = idrole;
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
        if (!(object instanceof Delegaterole)) {
            return false;
        }
        Delegaterole other = (Delegaterole) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Delegaterole[ id=" + id + " ]";
    }
    
}
