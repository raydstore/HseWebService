/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
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
@Table(name = "BIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bit.findAll", query = "SELECT b FROM Bit b"),
    @NamedQuery(name = "Bit.findById", query = "SELECT b FROM Bit b WHERE b.id = :id"),
    @NamedQuery(name = "Bit.findByName", query = "SELECT b FROM Bit b WHERE b.name = :name"),
    @NamedQuery(name = "Bit.findByIdparent", query = "SELECT b FROM Bit b WHERE b.idparent = :idparent"),
    @NamedQuery(name = "Bit.findByKind", query = "SELECT b FROM Bit b WHERE b.kind = :kind"),
    @NamedQuery(name = "Bit.findByDatecreate", query = "SELECT b FROM Bit b WHERE b.datecreate = :datecreate"),
    @NamedQuery(name = "Bit.findByDateupdate", query = "SELECT b FROM Bit b WHERE b.dateupdate = :dateupdate"),
    @NamedQuery(name = "Bit.findByOwner", query = "SELECT b FROM Bit b WHERE b.owner = :owner"),
    @NamedQuery(name = "Bit.findByLastuser", query = "SELECT b FROM Bit b WHERE b.lastuser = :lastuser"),
    @NamedQuery(name = "Bit.findByKindparent", query = "SELECT b FROM Bit b WHERE b.kindparent = :kindparent"),
    @NamedQuery(name = "Bit.findByCount", query = "SELECT b FROM Bit b WHERE b.count = :count"),
    @NamedQuery(name = "Bit.findByIdbitclass", query = "SELECT b FROM Bit b WHERE b.idbitclass = :idbitclass"),
    @NamedQuery(name = "Bit.findByKindancestor", query = "SELECT b FROM Bit b WHERE b.kindancestor = :kindancestor")})
public class Bit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 72)
    @Column(name = "NAME")
    private String name;
    @Size(max = 4)
    @Column(name = "IDPARENT")
    private String idparent;
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
    @Column(name = "COUNT")
    private BigInteger count;
    @Size(max = 4)
    @Column(name = "IDBITCLASS")
    private String idbitclass;
    @Size(max = 1)
    @Column(name = "KINDANCESTOR")
    private String kindancestor;

    public Bit() {
    }

    public Bit(String id) {
        this.id = id;
    }

    public Bit(String id, String name, String kind, Date datecreate, Date dateupdate) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
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

    public String getIdparent() {
        return idparent;
    }

    public void setIdparent(String idparent) {
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

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger count) {
        this.count = count;
    }

    public String getIdbitclass() {
        return idbitclass;
    }

    public void setIdbitclass(String idbitclass) {
        this.idbitclass = idbitclass;
    }

    public String getKindancestor() {
        return kindancestor;
    }

    public void setKindancestor(String kindancestor) {
        this.kindancestor = kindancestor;
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
        if (!(object instanceof Bit)) {
            return false;
        }
        Bit other = (Bit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Bit[ id=" + id + " ]";
    }
    
}
