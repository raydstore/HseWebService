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
@Table(name = "ACTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Action.findAll", query = "SELECT a FROM Action a"),
    @NamedQuery(name = "Action.findById", query = "SELECT a FROM Action a WHERE a.id = :id"),
    @NamedQuery(name = "Action.findByIdparent", query = "SELECT a FROM Action a WHERE a.idparent = :idparent"),
    @NamedQuery(name = "Action.findByTabindex", query = "SELECT a FROM Action a WHERE a.tabindex = :tabindex"),
    @NamedQuery(name = "Action.findByName", query = "SELECT a FROM Action a WHERE a.name = :name"),
    @NamedQuery(name = "Action.findByDatecreate", query = "SELECT a FROM Action a WHERE a.datecreate = :datecreate"),
    @NamedQuery(name = "Action.findByDateupdate", query = "SELECT a FROM Action a WHERE a.dateupdate = :dateupdate"),
    @NamedQuery(name = "Action.findByOwner", query = "SELECT a FROM Action a WHERE a.owner = :owner"),
    @NamedQuery(name = "Action.findByLastuser", query = "SELECT a FROM Action a WHERE a.lastuser = :lastuser")
})
public class Action implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPARENT")
    private BigInteger idparent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TABINDEX")
    private BigInteger tabindex;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
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

    public Action() {
    }

    public Action(BigDecimal id) {
        this.id = id;
    }

    public Action(BigDecimal id, BigInteger idparent, BigInteger tabindex, String name, Date datecreate, Date dateupdate) {
        this.id = id;
        this.idparent = idparent;
        this.tabindex = tabindex;
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

    public BigInteger getIdparent() {
        return idparent;
    }

    public void setIdparent(BigInteger idparent) {
        this.idparent = idparent;
    }

    public BigInteger getTabindex() {
        return tabindex;
    }

    public void setTabindex(BigInteger tabindex) {
        this.tabindex = tabindex;
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
        if (!(object instanceof Action)) {
            return false;
        }
        Action other = (Action) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Action[ id=" + id + " ]";
    }
    
}
