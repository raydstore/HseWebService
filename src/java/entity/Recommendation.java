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
@Table(name = "RECOMMENDATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recommendation.findAll", query = "SELECT r FROM Recommendation r"),
    @NamedQuery(name = "Recommendation.findById", query = "SELECT r FROM Recommendation r WHERE r.id = :id"),
    @NamedQuery(name = "Recommendation.findByName", query = "SELECT r FROM Recommendation r WHERE r.name = :name"),
    @NamedQuery(name = "Recommendation.findByDatecreate", query = "SELECT r FROM Recommendation r WHERE r.datecreate = :datecreate"),
    @NamedQuery(name = "Recommendation.findByDateupdate", query = "SELECT r FROM Recommendation r WHERE r.dateupdate = :dateupdate"),
    @NamedQuery(name = "Recommendation.findByOwner", query = "SELECT r FROM Recommendation r WHERE r.owner = :owner"),
    @NamedQuery(name = "Recommendation.findByLastuser", query = "SELECT r FROM Recommendation r WHERE r.lastuser = :lastuser"),
    @NamedQuery(name = "Recommendation.findByIdaccident", query = "SELECT r FROM Recommendation r WHERE r.idaccident.id = :idaccident")
})
public class Recommendation implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
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
    @JoinColumn(name = "IDACCIDENT", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Accident idaccident;

    public Recommendation() {
    }

    public Recommendation(BigDecimal id) {
        this.id = id;
    }

    public Recommendation(BigDecimal id, String name, Date datecreate, Date dateupdate) {
        this.id = id;
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

    public Accident getIdaccident() {
        return idaccident;
    }

    public void setIdaccident(Accident idaccident) {
        this.idaccident = idaccident;
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
        if (!(object instanceof Recommendation)) {
            return false;
        }
        Recommendation other = (Recommendation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Recommendation[ id=" + id + " ]";
    }
    
}
