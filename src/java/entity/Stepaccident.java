/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
 * @author master
 */
@Entity
@Table(name = "STEPACCIDENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stepaccident.findAll", query = "SELECT s FROM Stepaccident s")
    , @NamedQuery(name = "Stepaccident.findById", query = "SELECT s FROM Stepaccident s WHERE s.id = :id")
    , @NamedQuery(name = "Stepaccident.findByStep", query = "SELECT s FROM Stepaccident s WHERE s.step = :step")
    , @NamedQuery(name = "Stepaccident.findByDatecreate", query = "SELECT s FROM Stepaccident s WHERE s.datecreate = :datecreate")
    , @NamedQuery(name = "Stepaccident.findByDateupdate", query = "SELECT s FROM Stepaccident s WHERE s.dateupdate = :dateupdate")
    , @NamedQuery(name = "Stepaccident.findByOwner", query = "SELECT s FROM Stepaccident s WHERE s.owner = :owner")
    , @NamedQuery(name = "Stepaccident.findByLastuser", query = "SELECT s FROM Stepaccident s WHERE s.lastuser = :lastuser")
    , @NamedQuery(name = "Stepaccident.findByStatus", query = "SELECT s FROM Stepaccident s WHERE s.status = :status")
    , @NamedQuery(name = "Stepaccident.findByForuser", query = "SELECT s FROM Stepaccident s WHERE s.foruser = :foruser")})
public class Stepaccident implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STEP")
    private BigInteger step;
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
    @Column(name = "STATUS")
    private String status;
    @Size(max = 31)
    @Column(name = "FORUSER")
    private String foruser;
    @JoinColumn(name = "IDACCIDENT", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Accident idaccident;

    public Stepaccident() {
    }

    public Stepaccident(BigDecimal id) {
        this.id = id;
    }

    public Stepaccident(BigDecimal id, BigInteger step, Date datecreate, Date dateupdate, String status) {
        this.id = id;
        this.step = step;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
        this.status = status;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getStep() {
        return step;
    }

    public void setStep(BigInteger step) {
        this.step = step;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getForuser() {
        return foruser;
    }

    public void setForuser(String foruser) {
        this.foruser = foruser;
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
        if (!(object instanceof Stepaccident)) {
            return false;
        }
        Stepaccident other = (Stepaccident) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Stepaccident[ id=" + id + " ]";
    }
    
}
