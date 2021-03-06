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
@Table(name = "ENTREPRISE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entreprise.findAll", query = "SELECT e FROM Entreprise e"),
    @NamedQuery(name = "Entreprise.findById", query = "SELECT e FROM Entreprise e WHERE e.id = :id"),
    @NamedQuery(name = "Entreprise.findByName", query = "SELECT e FROM Entreprise e WHERE e.name = :name"),
    @NamedQuery(name = "Entreprise.findByPhone", query = "SELECT e FROM Entreprise e WHERE e.phone = :phone"),
    @NamedQuery(name = "Entreprise.findByFiscalenumber", query = "SELECT e FROM Entreprise e WHERE e.fiscalenumber = :fiscalenumber"),
    @NamedQuery(name = "Entreprise.findByDatecreate", query = "SELECT e FROM Entreprise e WHERE e.datecreate = :datecreate"),
    @NamedQuery(name = "Entreprise.findByDateupdate", query = "SELECT e FROM Entreprise e WHERE e.dateupdate = :dateupdate"),
    @NamedQuery(name = "Entreprise.findByOwner", query = "SELECT e FROM Entreprise e WHERE e.owner = :owner"),
    @NamedQuery(name = "Entreprise.findByLastuser", query = "SELECT e FROM Entreprise e WHERE e.lastuser = :lastuser")})
public class Entreprise implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identreprise")
    private Collection<Accidentvehiculeinsurance> accidentvehiculeinsuranceCollection;
    @Size(max = 128)
    @Column(name = "ADRESS")
    private String adress;
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
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 16)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 25)
    @Column(name = "FISCALENUMBER")
    private String fiscalenumber;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identreprise")
    private Collection<Accidentagentee> accidentagenteeCollection;

    public Entreprise() {
    }

    public Entreprise(BigDecimal id) {
        this.id = id;
    }

    public Entreprise(BigDecimal id, String name, Date datecreate, Date dateupdate) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFiscalenumber() {
        return fiscalenumber;
    }

    public void setFiscalenumber(String fiscalenumber) {
        this.fiscalenumber = fiscalenumber;
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
    public Collection<Accidentagentee> getAccidentagenteeCollection() {
        return accidentagenteeCollection;
    }

    public void setAccidentagenteeCollection(Collection<Accidentagentee> accidentagenteeCollection) {
        this.accidentagenteeCollection = accidentagenteeCollection;
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
        if (!(object instanceof Entreprise)) {
            return false;
        }
        Entreprise other = (Entreprise) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Entreprise[ id=" + id + " ]";
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @XmlTransient
    public Collection<Accidentvehiculeinsurance> getAccidentvehiculeinsuranceCollection() {
        return accidentvehiculeinsuranceCollection;
    }

    public void setAccidentvehiculeinsuranceCollection(Collection<Accidentvehiculeinsurance> accidentvehiculeinsuranceCollection) {
        this.accidentvehiculeinsuranceCollection = accidentvehiculeinsuranceCollection;
    }
    
}
