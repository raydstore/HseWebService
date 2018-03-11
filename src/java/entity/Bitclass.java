/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
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
@Table(name = "BITCLASS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bitclass.findAll", query = "SELECT b FROM Bitclass b"),
    @NamedQuery(name = "Bitclass.findById", query = "SELECT b FROM Bitclass b WHERE b.id = :id"),
    @NamedQuery(name = "Bitclass.findByName", query = "SELECT b FROM Bitclass b WHERE b.name = :name"),
    @NamedQuery(name = "Bitclass.findByDatecreate", query = "SELECT b FROM Bitclass b WHERE b.datecreate = :datecreate"),
    @NamedQuery(name = "Bitclass.findByDateupdate", query = "SELECT b FROM Bitclass b WHERE b.dateupdate = :dateupdate"),
    @NamedQuery(name = "Bitclass.findByOwner", query = "SELECT b FROM Bitclass b WHERE b.owner = :owner"),
    @NamedQuery(name = "Bitclass.findByLastuser", query = "SELECT b FROM Bitclass b WHERE b.lastuser = :lastuser"),
    @NamedQuery(name = "Bitclass.findByKind", query = "SELECT b FROM Bitclass b WHERE b.kind = :kind")})
public class Bitclass implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
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
    @Size(min = 1, max = 1)
    @Column(name = "KIND")
    private String kind;

    public Bitclass() {
    }

    public Bitclass(String id) {
        this.id = id;
    }

    public Bitclass(String id, String name, Date datecreate, Date dateupdate, String kind) {
        this.id = id;
        this.name = name;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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
        if (!(object instanceof Bitclass)) {
            return false;
        }
        Bitclass other = (Bitclass) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Bitclass[ id=" + id + " ]";
    }
    
}
