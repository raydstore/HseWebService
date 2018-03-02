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
import javax.persistence.JoinColumns;
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
@Table(name = "DAMAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Damage.findAll", query = "SELECT d FROM Damage d"),
    @NamedQuery(name = "Damage.findById", query = "SELECT d FROM Damage d WHERE d.id = :id"),
    @NamedQuery(name = "Damage.findByIdgrid", query = "SELECT d FROM Damage d WHERE d.idgrid = :idgrid"),
    @NamedQuery(name = "Damage.findByAccidentdomain", query = "SELECT d FROM Damage d WHERE d.accidentdomain = :accidentdomain"),
    @NamedQuery(name = "Damage.findByDescription", query = "SELECT d FROM Damage d WHERE d.description = :description"),
    @NamedQuery(name = "Damage.findByDatecreate", query = "SELECT d FROM Damage d WHERE d.datecreate = :datecreate"),
    @NamedQuery(name = "Damage.findByDateupdate", query = "SELECT d FROM Damage d WHERE d.dateupdate = :dateupdate"),
    @NamedQuery(name = "Damage.findByOwner", query = "SELECT d FROM Damage d WHERE d.owner = :owner"),
    @NamedQuery(name = "Damage.findByLastuser", query = "SELECT d FROM Damage d WHERE d.lastuser = :lastuser"),
    @NamedQuery(name = "Damage.findByDegree", query = "SELECT d FROM Damage d WHERE d.degree = :degree")})
public class Damage implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGRID")
    private BigInteger idgrid;
    @Column(name = "ACCIDENTDOMAIN")
    private Short accidentdomain;
    @Size(max = 100)
    @Column(name = "DESCRIPTION")
    private String description;
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
    @Column(name = "DEGREE")
    private String degree;
    @JoinColumns({
        @JoinColumn(name = "IDACCIDENT", referencedColumnName = "IDACCIDENT"),
        @JoinColumn(name = "IDNATURE", referencedColumnName = "IDNATURE")})
    @ManyToOne(optional = false)
    private Accidentnature accidentnature;

    public Damage() {
    }

    public Damage(BigDecimal id) {
        this.id = id;
    }

    public Damage(BigDecimal id, BigInteger idgrid, Date datecreate, Date dateupdate, String degree) {
        this.id = id;
        this.idgrid = idgrid;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
        this.degree = degree;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getIdgrid() {
        return idgrid;
    }

    public void setIdgrid(BigInteger idgrid) {
        this.idgrid = idgrid;
    }

    public Short getAccidentdomain() {
        return accidentdomain;
    }

    public void setAccidentdomain(Short accidentdomain) {
        this.accidentdomain = accidentdomain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Accidentnature getAccidentnature() {
        return accidentnature;
    }

    public void setAccidentnature(Accidentnature accidentnature) {
        this.accidentnature = accidentnature;
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
        if (!(object instanceof Damage)) {
            return false;
        }
        Damage other = (Damage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Damage[ id=" + id + " ]";
    }
    
}
