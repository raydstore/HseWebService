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
@Table(name = "INSTANCE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instance.findAll", query = "SELECT i FROM Instance i"),
    @NamedQuery(name = "Instance.findById", query = "SELECT i FROM Instance i WHERE i.id = :id"),
    @NamedQuery(name = "Instance.findByIdobject", query = "SELECT i FROM Instance i WHERE i.idobject.id = :idobject"),
    @NamedQuery(name = "Instance.findByIdsite", query = "SELECT i FROM Instance i WHERE i.idsite = :idsite"),
    @NamedQuery(name = "Instance.findByDatecreate", query = "SELECT i FROM Instance i WHERE i.datecreate = :datecreate"),
    @NamedQuery(name = "Instance.findByDateupdate", query = "SELECT i FROM Instance i WHERE i.dateupdate = :dateupdate"),
    @NamedQuery(name = "Instance.findByOwner", query = "SELECT i FROM Instance i WHERE i.owner = :owner"),
    @NamedQuery(name = "Instance.findByLastuser", query = "SELECT i FROM Instance i WHERE i.lastuser = :lastuser")})
public class Instance implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
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
    @JoinColumn(name = "IDMARK", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Mark idmark;
    @JoinColumn(name = "IDOBJECT", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Object1 idobject;
    @NotNull
    @Column(name = "IDSITE")
    private BigDecimal idsite;
//    @JoinColumn(name = "IDSITE", referencedColumnName = "ID")
//    @ManyToOne(optional = false)
//    private Site idsite;

    public Instance() {
    }

    public Instance(BigDecimal id) {
        this.id = id;
    }

    public Instance(BigDecimal id, Date datecreate, Date dateupdate) {
        this.id = id;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }
    
     public BigDecimal getIdsite() {
        return idsite;
    }

    public void setIdsite(BigDecimal idsite) {
        this.idsite = idsite;
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

    public Mark getIdmark() {
        return idmark;
    }

    public void setIdmark(Mark idmark) {
        this.idmark = idmark;
    }

    public Object1 getIdobject() {
        return idobject;
    }

    public void setIdobject(Object1 idobject) {
        this.idobject = idobject;
    }

//    public Site getIdsite() {
//        return idsite;
//    }
//
//    public void setIdsite(Site idsite) {
//        this.idsite = idsite;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instance)) {
            return false;
        }
        Instance other = (Instance) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Instance[ id=" + id + " ]";
    }
    
}
