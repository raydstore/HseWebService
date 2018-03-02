/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "UNITMEASURE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unitmeasure.findAll", query = "SELECT u FROM Unitmeasure u"),
    @NamedQuery(name = "Unitmeasure.findById", query = "SELECT u FROM Unitmeasure u WHERE u.id = :id"),
    @NamedQuery(name = "Unitmeasure.findByName", query = "SELECT u FROM Unitmeasure u WHERE u.name = :name"),
    @NamedQuery(name = "Unitmeasure.findBySymbole", query = "SELECT u FROM Unitmeasure u WHERE u.symbole = :symbole"),
    @NamedQuery(name = "Unitmeasure.findByDatecreate", query = "SELECT u FROM Unitmeasure u WHERE u.datecreate = :datecreate"),
    @NamedQuery(name = "Unitmeasure.findByDateupdate", query = "SELECT u FROM Unitmeasure u WHERE u.dateupdate = :dateupdate"),
    @NamedQuery(name = "Unitmeasure.findByOwner", query = "SELECT u FROM Unitmeasure u WHERE u.owner = :owner"),
    @NamedQuery(name = "Unitmeasure.findByLastuser", query = "SELECT u FROM Unitmeasure u WHERE u.lastuser = :lastuser")})
public class Unitmeasure implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "NAME")
    private String name;
    @Size(max = 4)
    @Column(name = "SYMBOLE")
    private String symbole;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idunitmeasure")
    private Collection<Property> propertyCollection;

    public Unitmeasure() {
    }

    public Unitmeasure(BigDecimal id) {
        this.id = id;
    }

    public Unitmeasure(BigDecimal id, String name, Date datecreate, Date dateupdate) {
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

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
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
    public Collection<Property> getPropertyCollection() {
        return propertyCollection;
    }

    public void setPropertyCollection(Collection<Property> propertyCollection) {
        this.propertyCollection = propertyCollection;
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
        if (!(object instanceof Unitmeasure)) {
            return false;
        }
        Unitmeasure other = (Unitmeasure) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Unitmeasure[ id=" + id + " ]";
    }
    
}
