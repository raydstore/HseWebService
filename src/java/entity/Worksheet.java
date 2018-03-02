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
@Table(name = "WORKSHEET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Worksheet.findAll", query = "SELECT w FROM Worksheet w"),
    @NamedQuery(name = "Worksheet.findById", query = "SELECT w FROM Worksheet w WHERE w.id = :id"),
    @NamedQuery(name = "Worksheet.findByKind", query = "SELECT w FROM Worksheet w WHERE w.kind = :kind"),
    @NamedQuery(name = "Worksheet.findByConsigne", query = "SELECT w FROM Worksheet w WHERE w.consigne = :consigne"),
    @NamedQuery(name = "Worksheet.findByDatecreate", query = "SELECT w FROM Worksheet w WHERE w.datecreate = :datecreate"),
    @NamedQuery(name = "Worksheet.findByDateupdate", query = "SELECT w FROM Worksheet w WHERE w.dateupdate = :dateupdate"),
    @NamedQuery(name = "Worksheet.findByOwner", query = "SELECT w FROM Worksheet w WHERE w.owner = :owner"),
    @NamedQuery(name = "Worksheet.findByLastuser", query = "SELECT w FROM Worksheet w WHERE w.lastuser = :lastuser")})
public class Worksheet implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KIND")
    private String kind;
    @Size(max = 50)
    @Column(name = "CONSIGNE")
    private String consigne;
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
    @JoinColumn(name = "IDACTIVITY", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Activity idactivity;
    @JoinColumn(name = "IDOBJECT", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Object1 idobject;

    public Worksheet() {
    }

    public Worksheet(BigDecimal id) {
        this.id = id;
    }

    public Worksheet(BigDecimal id, String kind, Date datecreate, Date dateupdate) {
        this.id = id;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getConsigne() {
        return consigne;
    }

    public void setConsigne(String consigne) {
        this.consigne = consigne;
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

    public Activity getIdactivity() {
        return idactivity;
    }

    public void setIdactivity(Activity idactivity) {
        this.idactivity = idactivity;
    }

    public Object1 getIdobject() {
        return idobject;
    }

    public void setIdobject(Object1 idobject) {
        this.idobject = idobject;
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
        if (!(object instanceof Worksheet)) {
            return false;
        }
        Worksheet other = (Worksheet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Worksheet[ id=" + id + " ]";
    }
    
}
