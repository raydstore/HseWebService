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
@Table(name = "ACCIDENTAGENTSHBIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentagentshbit.findAll", query = "SELECT a FROM Accidentagentshbit a"),
    @NamedQuery(name = "Accidentagentshbit.findById", query = "SELECT a FROM Accidentagentshbit a WHERE a.id = :id"),
    @NamedQuery(name = "Accidentagentshbit.findByIdbit", query = "SELECT a FROM Accidentagentshbit a WHERE a.idbit = :idbit"),
    @NamedQuery(name = "Accidentagentshbit.findByIdbitclass", query = "SELECT a FROM Accidentagentshbit a WHERE a.idbitclass = :idbitclass"),
    @NamedQuery(name = "Accidentagentshbit.findByKind", query = "SELECT a FROM Accidentagentshbit a WHERE a.kind = :kind"),
    @NamedQuery(name = "Accidentagentshbit.findByDatecreate", query = "SELECT a FROM Accidentagentshbit a WHERE a.datecreate = :datecreate"),
    @NamedQuery(name = "Accidentagentshbit.findByDateupdate", query = "SELECT a FROM Accidentagentshbit a WHERE a.dateupdate = :dateupdate"),
    @NamedQuery(name = "Accidentagentshbit.findByOwner", query = "SELECT a FROM Accidentagentshbit a WHERE a.owner = :owner"),
    @NamedQuery(name = "Accidentagentshbit.findByLastuser", query = "SELECT a FROM Accidentagentshbit a WHERE a.lastuser = :lastuser")})
public class Accidentagentshbit implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "IDBIT")
    private String idbit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "IDBITCLASS")
    private String idbitclass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KIND")
    private String kind;
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
    @JoinColumns({
        @JoinColumn(name = "IDDAMAGE", referencedColumnName = "IDDAMAGE"),
        @JoinColumn(name = "IDAGENT", referencedColumnName = "IDAGENT")})
    @ManyToOne(optional = false)
    private Accidentagentsh accidentagentsh;

    public Accidentagentshbit() {
    }

    public Accidentagentshbit(BigDecimal id) {
        this.id = id;
    }

    public Accidentagentshbit(BigDecimal id, String idbit, String idbitclass, String kind, Date datecreate, Date dateupdate) {
        this.id = id;
        this.idbit = idbit;
        this.idbitclass = idbitclass;
        this.kind = kind;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getIdbit() {
        return idbit;
    }

    public void setIdbit(String idbit) {
        this.idbit = idbit;
    }

    public String getIdbitclass() {
        return idbitclass;
    }

    public void setIdbitclass(String idbitclass) {
        this.idbitclass = idbitclass;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

    public Accidentagentsh getAccidentagentsh() {
        return accidentagentsh;
    }

    public void setAccidentagentsh(Accidentagentsh accidentagentsh) {
        this.accidentagentsh = accidentagentsh;
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
        if (!(object instanceof Accidentagentshbit)) {
            return false;
        }
        Accidentagentshbit other = (Accidentagentshbit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accidentagentshbit[ id=" + id + " ]";
    }
    
}