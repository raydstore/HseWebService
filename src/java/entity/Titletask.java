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
@Table(name = "TITLETASK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Titletask.findAll", query = "SELECT t FROM Titletask t"),
    @NamedQuery(name = "Titletask.findById", query = "SELECT t FROM Titletask t WHERE t.id = :id"),
    @NamedQuery(name = "Titletask.findByName", query = "SELECT t FROM Titletask t WHERE t.name = :name"),
    @NamedQuery(name = "Titletask.findByIdparent", query = "SELECT t FROM Titletask t WHERE t.idparent = :idparent"),
    @NamedQuery(name = "Titletask.findByKind", query = "SELECT t FROM Titletask t WHERE t.kind = :kind"),
    @NamedQuery(name = "Titletask.findByDatecreate", query = "SELECT t FROM Titletask t WHERE t.datecreate = :datecreate"),
    @NamedQuery(name = "Titletask.findByDateupdate", query = "SELECT t FROM Titletask t WHERE t.dateupdate = :dateupdate"),
    @NamedQuery(name = "Titletask.findByOwner", query = "SELECT t FROM Titletask t WHERE t.owner = :owner"),
    @NamedQuery(name = "Titletask.findByLastuser", query = "SELECT t FROM Titletask t WHERE t.lastuser = :lastuser"),
    @NamedQuery(name = "Titletask.findByKindparent", query = "SELECT t FROM Titletask t WHERE t.kindparent = :kindparent")})
public class Titletask implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "NAME")
    private String name;
    @Column(name = "IDPARENT")
    private BigInteger idparent;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KIND")
    private String kind;
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
    @Size(max = 1)
    @Column(name = "KINDPARENT")
    private String kindparent;
    

    public Titletask() {
    }

    public Titletask(BigDecimal id) {
        this.id = id;
    }

    public Titletask(BigDecimal id, String name, String kind, Date datecreate, Date dateupdate) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getIdparent() {
        return idparent;
    }

    public void setIdparent(BigInteger idparent) {
        this.idparent = idparent;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

    public String getKindparent() {
        return kindparent;
    }

    public void setKindparent(String kindparent) {
        this.kindparent = kindparent;
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
        if (!(object instanceof Titletask)) {
            return false;
        }
        Titletask other = (Titletask) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Titletask[ id=" + id + " ]";
    }
    
}
