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
@Table(name = "INSPECTPLANNING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inspectplanning.findAll", query = "SELECT i FROM Inspectplanning i")
    , @NamedQuery(name = "Inspectplanning.findById", query = "SELECT i FROM Inspectplanning i WHERE i.id = :id")
    , @NamedQuery(name = "Inspectplanning.findByDatefirst", query = "SELECT i FROM Inspectplanning i WHERE i.datefirst = :datefirst")
    , @NamedQuery(name = "Inspectplanning.findByDatelast", query = "SELECT i FROM Inspectplanning i WHERE i.datelast = :datelast")
    , @NamedQuery(name = "Inspectplanning.findByDatecreate", query = "SELECT i FROM Inspectplanning i WHERE i.datecreate = :datecreate")
    , @NamedQuery(name = "Inspectplanning.findByDateupdate", query = "SELECT i FROM Inspectplanning i WHERE i.dateupdate = :dateupdate")
    , @NamedQuery(name = "Inspectplanning.findByOwner", query = "SELECT i FROM Inspectplanning i WHERE i.owner = :owner")
    , @NamedQuery(name = "Inspectplanning.findByLastuser", query = "SELECT i FROM Inspectplanning i WHERE i.lastuser = :lastuser")})
public class Inspectplanning implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
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
    @JoinColumn(name = "IDINSPECTEDSITE", referencedColumnName = "IDSITE")
    @ManyToOne(optional = false)
    private Inspectedsite idinspectedsite;

    public Inspectplanning() {
    }

    public Inspectplanning(BigDecimal id) {
        this.id = id;
    }

    public Inspectplanning(BigDecimal id, Date datefirst, Date datelast, Date datecreate, Date dateupdate) {
        this.id = id;
        this.datefirst = datefirst;
        this.datelast = datelast;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
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

    public Inspectedsite getIdinspectedsite() {
        return idinspectedsite;
    }

    public void setIdinspectedsite(Inspectedsite idinspectedsite) {
        this.idinspectedsite = idinspectedsite;
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
        if (!(object instanceof Inspectplanning)) {
            return false;
        }
        Inspectplanning other = (Inspectplanning) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Inspectplanning[ id=" + id + " ]";
    }
    
}
