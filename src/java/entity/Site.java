/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author boutarfa
 */
@Entity
@Table(name = "SITE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Site.findAll", query = "SELECT s FROM Site s"),
    @NamedQuery(name = "Site.findById", query = "SELECT s FROM Site s WHERE s.id = :id"),
    @NamedQuery(name = "Site.findByIdparent", query = "SELECT s FROM Site s WHERE s.idparent = :idparent"),
    @NamedQuery(name = "Site.findByName", query = "SELECT s FROM Site s WHERE s.name = :name"),
    @NamedQuery(name = "Site.findByDatecreate", query = "SELECT s FROM Site s WHERE s.datecreate = :datecreate"),
    @NamedQuery(name = "Site.findByDateupdate", query = "SELECT s FROM Site s WHERE s.dateupdate = :dateupdate"),
    @NamedQuery(name = "Site.findByOwner", query = "SELECT s FROM Site s WHERE s.owner = :owner"),
    @NamedQuery(name = "Site.findByLastuser", query = "SELECT s FROM Site s WHERE s.lastuser = :lastuser")})
public class Site implements Serializable {
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
    @Column(name = "NAME")
    private String name;
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
    @JoinColumn(name = "IDLABEL", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Label idlabel;
    @OneToMany(mappedBy = "idparent")
    private Collection<Site> siteCollection;
    @JoinColumn(name = "IDPARENT", referencedColumnName = "ID")
    @ManyToOne
    private Site idparent;
//    @Column(name = "IDPARENT")
//    private BigDecimal idparent;
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "site")
//    private Detailsite detailsite;

//    public BigDecimal getIdparent() {
//        return idparent;
//    }
//
//    public void setIdparent(BigDecimal idparent) {
//        this.idparent = idparent;
//    }


    public Site() {
    }

    public Site(BigDecimal id) {
        this.id = id;
    }

    public Site(BigDecimal id, String name, Date datecreate, Date dateupdate) {
        this.id = id;
        this.name = name;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Label getIdlabel() {
        return idlabel;
    }

    public void setIdlabel(Label idlabel) {
        this.idlabel = idlabel;
    }

    @XmlTransient
    public Collection<Site> getSiteCollection() {
        return siteCollection;
    }

    public void setSiteCollection(Collection<Site> siteCollection) {
        this.siteCollection = siteCollection;
    }

    public Site getIdparent() {
        return idparent;
    }

    public void setIdparent(Site idparent) {
        this.idparent = idparent;
    }

//    public Detailsite getDetailsite() {
//        return detailsite;
//    }
//
//    public void setDetailsite(Detailsite detailsite) {
//        this.detailsite = detailsite;
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
        if (!(object instanceof Site)) {
            return false;
        }
        Site other = (Site) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Site[ id=" + id + " ]";
    }
    
}
