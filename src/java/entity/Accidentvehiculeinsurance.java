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
@Table(name = "ACCIDENTVEHICULEINSURANCE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentvehiculeinsurance.findAll", query = "SELECT a FROM Accidentvehiculeinsurance a")
    , @NamedQuery(name = "Accidentvehiculeinsurance.findByIdaccidentvehicule", query = "SELECT a FROM Accidentvehiculeinsurance a WHERE a.idaccidentvehicule = :idaccidentvehicule")
    , @NamedQuery(name = "Accidentvehiculeinsurance.findByPolicynumber", query = "SELECT a FROM Accidentvehiculeinsurance a WHERE a.policynumber = :policynumber")
    , @NamedQuery(name = "Accidentvehiculeinsurance.findByDatefirst", query = "SELECT a FROM Accidentvehiculeinsurance a WHERE a.datefirst = :datefirst")
    , @NamedQuery(name = "Accidentvehiculeinsurance.findByDatelast", query = "SELECT a FROM Accidentvehiculeinsurance a WHERE a.datelast = :datelast")
    , @NamedQuery(name = "Accidentvehiculeinsurance.findByDatecreate", query = "SELECT a FROM Accidentvehiculeinsurance a WHERE a.datecreate = :datecreate")
    , @NamedQuery(name = "Accidentvehiculeinsurance.findByDateupdate", query = "SELECT a FROM Accidentvehiculeinsurance a WHERE a.dateupdate = :dateupdate")
    , @NamedQuery(name = "Accidentvehiculeinsurance.findByOwner", query = "SELECT a FROM Accidentvehiculeinsurance a WHERE a.owner = :owner")
    , @NamedQuery(name = "Accidentvehiculeinsurance.findByLastuser", query = "SELECT a FROM Accidentvehiculeinsurance a WHERE a.lastuser = :lastuser")})
public class Accidentvehiculeinsurance implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACCIDENTVEHICULE")
    private BigDecimal idaccidentvehicule;
//    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "POLICYNUMBER")
    private String policynumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEFIRST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datefirst;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATELAST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datelast;
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
    @JoinColumn(name = "IDENTREPRISE", referencedColumnName = "ID")
    @ManyToOne(optional = true)
    private Entreprise identreprise;

    public Accidentvehiculeinsurance() {
    }

    public Accidentvehiculeinsurance(BigDecimal idaccidentvehicule) {
        this.idaccidentvehicule = idaccidentvehicule;
    }

    public Accidentvehiculeinsurance(BigDecimal idaccidentvehicule, String policynumber, Date datefirst, Date datelast, Date datecreate, Date dateupdate) {
        this.idaccidentvehicule = idaccidentvehicule;
        this.policynumber = policynumber;
        this.datefirst = datefirst;
        this.datelast = datelast;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getIdaccidentvehicule() {
        return idaccidentvehicule;
    }

    public void setIdaccidentvehicule(BigDecimal idaccidentvehicule) {
        this.idaccidentvehicule = idaccidentvehicule;
    }

    public String getPolicynumber() {
        return policynumber;
    }

    public void setPolicynumber(String policynumber) {
        this.policynumber = policynumber;
    }

    public Date getDatefirst() {
        return datefirst;
    }

    public void setDatefirst(Date datefirst) {
        this.datefirst = datefirst;
    }

    public Date getDatelast() {
        return datelast;
    }

    public void setDatelast(Date datelast) {
        this.datelast = datelast;
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

    public Entreprise getIdentreprise() {
        return identreprise;
    }

    public void setIdentreprise(Entreprise identreprise) {
        this.identreprise = identreprise;
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
        if (!(object instanceof Accidentvehiculeinsurance)) {
            return false;
        }
        Accidentvehiculeinsurance other = (Accidentvehiculeinsurance) object;
        if ((this.idaccidentvehicule == null && other.idaccidentvehicule != null) || (this.idaccidentvehicule != null && !this.idaccidentvehicule.equals(other.idaccidentvehicule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accidentvehiculeinsurance[ idaccidentvehicule=" + idaccidentvehicule + " ]";
    }
    
}
