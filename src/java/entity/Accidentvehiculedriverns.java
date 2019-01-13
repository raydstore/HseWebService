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
@Table(name = "ACCIDENTVEHICULEDRIVERNS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentvehiculedriverns.findAll", query = "SELECT a FROM Accidentvehiculedriverns a")
    , @NamedQuery(name = "Accidentvehiculedriverns.findByIdaccidentvehicule", query = "SELECT a FROM Accidentvehiculedriverns a WHERE a.idaccidentvehicule = :idaccidentvehicule")
    , @NamedQuery(name = "Accidentvehiculedriverns.findByMembership", query = "SELECT a FROM Accidentvehiculedriverns a WHERE a.membership = :membership")
    , @NamedQuery(name = "Accidentvehiculedriverns.findByName", query = "SELECT a FROM Accidentvehiculedriverns a WHERE a.name = :name")
    , @NamedQuery(name = "Accidentvehiculedriverns.findByDateofbirth", query = "SELECT a FROM Accidentvehiculedriverns a WHERE a.dateofbirth = :dateofbirth")
    , @NamedQuery(name = "Accidentvehiculedriverns.findByPlaceofbirth", query = "SELECT a FROM Accidentvehiculedriverns a WHERE a.placeofbirth = :placeofbirth")
    , @NamedQuery(name = "Accidentvehiculedriverns.findByAdress", query = "SELECT a FROM Accidentvehiculedriverns a WHERE a.adress = :adress")
    , @NamedQuery(name = "Accidentvehiculedriverns.findByDatecreate", query = "SELECT a FROM Accidentvehiculedriverns a WHERE a.datecreate = :datecreate")
    , @NamedQuery(name = "Accidentvehiculedriverns.findByDateupdate", query = "SELECT a FROM Accidentvehiculedriverns a WHERE a.dateupdate = :dateupdate")
    , @NamedQuery(name = "Accidentvehiculedriverns.findByOwner", query = "SELECT a FROM Accidentvehiculedriverns a WHERE a.owner = :owner")
    , @NamedQuery(name = "Accidentvehiculedriverns.findByLastuser", query = "SELECT a FROM Accidentvehiculedriverns a WHERE a.lastuser = :lastuser")})
public class Accidentvehiculedriverns implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACCIDENTVEHICULE")
    private BigDecimal idaccidentvehicule;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "MEMBERSHIP")
    private String membership;
    @Size(max = 64)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEOFBIRTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateofbirth;
    @Size(max = 31)
    @Column(name = "PLACEOFBIRTH")
    private String placeofbirth;
    @Size(max = 128)
    @Column(name = "ADRESS")
    private String adress;
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

    public Accidentvehiculedriverns() {
    }

    public Accidentvehiculedriverns(BigDecimal idaccidentvehicule) {
        this.idaccidentvehicule = idaccidentvehicule;
    }

    public Accidentvehiculedriverns(BigDecimal idaccidentvehicule, String membership, Date dateofbirth, Date datecreate, Date dateupdate) {
        this.idaccidentvehicule = idaccidentvehicule;
        this.membership = membership;
        this.dateofbirth = dateofbirth;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getIdaccidentvehicule() {
        return idaccidentvehicule;
    }

    public void setIdaccidentvehicule(BigDecimal idaccidentvehicule) {
        this.idaccidentvehicule = idaccidentvehicule;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPlaceofbirth() {
        return placeofbirth;
    }

    public void setPlaceofbirth(String placeofbirth) {
        this.placeofbirth = placeofbirth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
        hash += (idaccidentvehicule != null ? idaccidentvehicule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accidentvehiculedriverns)) {
            return false;
        }
        Accidentvehiculedriverns other = (Accidentvehiculedriverns) object;
        if ((this.idaccidentvehicule == null && other.idaccidentvehicule != null) || (this.idaccidentvehicule != null && !this.idaccidentvehicule.equals(other.idaccidentvehicule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accidentvehiculedriverns[ idaccidentvehicule=" + idaccidentvehicule + " ]";
    }
    
}
