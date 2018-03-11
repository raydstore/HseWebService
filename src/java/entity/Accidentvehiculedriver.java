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
@Table(name = "ACCIDENTVEHICULEDRIVER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentvehiculedriver.findAll", query = "SELECT a FROM Accidentvehiculedriver a"),
    @NamedQuery(name = "Accidentvehiculedriver.findById", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.id = :id"),
    @NamedQuery(name = "Accidentvehiculedriver.findByMembership", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.membership = :membership"),
    @NamedQuery(name = "Accidentvehiculedriver.findByPermit", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.permit = :permit"),
    @NamedQuery(name = "Accidentvehiculedriver.findByDatecreate", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.datecreate = :datecreate"),
    @NamedQuery(name = "Accidentvehiculedriver.findByDateupdate", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.dateupdate = :dateupdate"),
    @NamedQuery(name = "Accidentvehiculedriver.findByOwner", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.owner = :owner"),
    @NamedQuery(name = "Accidentvehiculedriver.findByLastuser", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.lastuser = :lastuser")})
public class Accidentvehiculedriver implements Serializable {
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
    @Column(name = "MEMBERSHIP")
    private String membership;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "PERMIT")
    private String permit;
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
    @JoinColumn(name = "IDACCIDENTVEHICULE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Accidentvehicule idaccidentvehicule;
    @JoinColumn(name = "IDDRIVER", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Driver iddriver;

    public Accidentvehiculedriver() {
    }

    public Accidentvehiculedriver(BigDecimal id) {
        this.id = id;
    }

    public Accidentvehiculedriver(BigDecimal id, String membership, String permit, Date datecreate, Date dateupdate) {
        this.id = id;
        this.membership = membership;
        this.permit = permit;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
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

    public Accidentvehicule getIdaccidentvehicule() {
        return idaccidentvehicule;
    }

    public void setIdaccidentvehicule(Accidentvehicule idaccidentvehicule) {
        this.idaccidentvehicule = idaccidentvehicule;
    }

    public Driver getIddriver() {
        return iddriver;
    }

    public void setIddriver(Driver iddriver) {
        this.iddriver = iddriver;
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
        if (!(object instanceof Accidentvehiculedriver)) {
            return false;
        }
        Accidentvehiculedriver other = (Accidentvehiculedriver) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accidentvehiculedriver[ id=" + id + " ]";
    }
    
}
