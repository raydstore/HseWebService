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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "ACCIDENTVEHICULEOWNER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentvehiculeowner.findAll", query = "SELECT a FROM Accidentvehiculeowner a")
    , @NamedQuery(name = "Accidentvehiculeowner.findByIdaccidentvehicule", query = "SELECT a FROM Accidentvehiculeowner a WHERE a.idaccidentvehicule = :idaccidentvehicule")
    , @NamedQuery(name = "Accidentvehiculeowner.findByName", query = "SELECT a FROM Accidentvehiculeowner a WHERE a.name = :name")
    , @NamedQuery(name = "Accidentvehiculeowner.findByAdress", query = "SELECT a FROM Accidentvehiculeowner a WHERE a.adress = :adress")
    , @NamedQuery(name = "Accidentvehiculeowner.findByPhone", query = "SELECT a FROM Accidentvehiculeowner a WHERE a.phone = :phone")
    , @NamedQuery(name = "Accidentvehiculeowner.findByDatecreate", query = "SELECT a FROM Accidentvehiculeowner a WHERE a.datecreate = :datecreate")
    , @NamedQuery(name = "Accidentvehiculeowner.findByDateupdate", query = "SELECT a FROM Accidentvehiculeowner a WHERE a.dateupdate = :dateupdate")
    , @NamedQuery(name = "Accidentvehiculeowner.findByOwner", query = "SELECT a FROM Accidentvehiculeowner a WHERE a.owner = :owner")
    , @NamedQuery(name = "Accidentvehiculeowner.findByLastuser", query = "SELECT a FROM Accidentvehiculeowner a WHERE a.lastuser = :lastuser")})
public class Accidentvehiculeowner implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACCIDENTVEHICULE")
    private BigDecimal idaccidentvehicule;
//    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "NAME")
    private String name;
//    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "ADRESS")
    private String adress;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 40)
    @Column(name = "PHONE")
    private String phone;
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
    @JoinColumn(name = "IDACCIDENTVEHICULE", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Accidentvehicule accidentvehicule;

    public Accidentvehiculeowner() {
    }

    public Accidentvehiculeowner(BigDecimal idaccidentvehicule) {
        this.idaccidentvehicule = idaccidentvehicule;
    }

    public Accidentvehiculeowner(BigDecimal idaccidentvehicule, String name, String adress, Date datecreate, Date dateupdate) {
        this.idaccidentvehicule = idaccidentvehicule;
        this.name = name;
        this.adress = adress;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getIdaccidentvehicule() {
        return idaccidentvehicule;
    }

    public void setIdaccidentvehicule(BigDecimal idaccidentvehicule) {
        this.idaccidentvehicule = idaccidentvehicule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Accidentvehicule getAccidentvehicule() {
        return accidentvehicule;
    }

    public void setAccidentvehicule(Accidentvehicule accidentvehicule) {
        this.accidentvehicule = accidentvehicule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaccidentvehicule != null ? idaccidentvehicule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accidentvehiculeowner)) {
            return false;
        }
        Accidentvehiculeowner other = (Accidentvehiculeowner) object;
        if ((this.idaccidentvehicule == null && other.idaccidentvehicule != null) || (this.idaccidentvehicule != null && !this.idaccidentvehicule.equals(other.idaccidentvehicule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accidentvehiculeowner[ idaccidentvehicule=" + idaccidentvehicule + " ]";
    }
    
}
