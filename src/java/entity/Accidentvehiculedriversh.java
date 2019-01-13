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
@Table(name = "ACCIDENTVEHICULEDRIVERSH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentvehiculedriversh.findAll", query = "SELECT a FROM Accidentvehiculedriversh a")
    , @NamedQuery(name = "Accidentvehiculedriversh.findByIdaccidentvehicule", query = "SELECT a FROM Accidentvehiculedriversh a WHERE a.idaccidentvehicule = :idaccidentvehicule")
    , @NamedQuery(name = "Accidentvehiculedriversh.findByMembership", query = "SELECT a FROM Accidentvehiculedriversh a WHERE a.membership = :membership")
    , @NamedQuery(name = "Accidentvehiculedriversh.findByDatecreate", query = "SELECT a FROM Accidentvehiculedriversh a WHERE a.datecreate = :datecreate")
    , @NamedQuery(name = "Accidentvehiculedriversh.findByDateupdate", query = "SELECT a FROM Accidentvehiculedriversh a WHERE a.dateupdate = :dateupdate")
    , @NamedQuery(name = "Accidentvehiculedriversh.findByOwner", query = "SELECT a FROM Accidentvehiculedriversh a WHERE a.owner = :owner")
    , @NamedQuery(name = "Accidentvehiculedriversh.findByLastuser", query = "SELECT a FROM Accidentvehiculedriversh a WHERE a.lastuser = :lastuser")})
public class Accidentvehiculedriversh implements Serializable {

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
    @JoinColumn(name = "IDAGENT", referencedColumnName = "ID")
    @ManyToOne
    private Agent idagent;

    public Accidentvehiculedriversh() {
    }

    public Accidentvehiculedriversh(BigDecimal idaccidentvehicule) {
        this.idaccidentvehicule = idaccidentvehicule;
    }

    public Accidentvehiculedriversh(BigDecimal idaccidentvehicule, String membership, Date datecreate, Date dateupdate) {
        this.idaccidentvehicule = idaccidentvehicule;
        this.membership = membership;
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

    public Agent getIdagent() {
        return idagent;
    }

    public void setIdagent(Agent idagent) {
        this.idagent = idagent;
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
        if (!(object instanceof Accidentvehiculedriversh)) {
            return false;
        }
        Accidentvehiculedriversh other = (Accidentvehiculedriversh) object;
        if ((this.idaccidentvehicule == null && other.idaccidentvehicule != null) || (this.idaccidentvehicule != null && !this.idaccidentvehicule.equals(other.idaccidentvehicule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accidentvehiculedriversh[ idaccidentvehicule=" + idaccidentvehicule + " ]";
    }
    
}
