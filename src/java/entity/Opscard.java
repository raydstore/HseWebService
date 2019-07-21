/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "OPSCARD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Opscard.findAll", query = "SELECT o FROM Opscard o"),
    @NamedQuery(name = "Opscard.findById", query = "SELECT o FROM Opscard o WHERE o.id = :id"),
    @NamedQuery(name = "Opscard.findByObserver", query = "SELECT o FROM Opscard o WHERE o.observer = :observer"),
    @NamedQuery(name = "Opscard.findByCurdate", query = "SELECT o FROM Opscard o WHERE o.curdate = :curdate"),
    @NamedQuery(name = "Opscard.findBySite", query = "SELECT o FROM Opscard o WHERE o.site = :site"),
    @NamedQuery(name = "Opscard.findByMeasure", query = "SELECT o FROM Opscard o WHERE o.measure = :measure"),
    @NamedQuery(name = "Opscard.findByDescription", query = "SELECT o FROM Opscard o WHERE o.description = :description"),
    @NamedQuery(name = "Opscard.findByKind", query = "SELECT o FROM Opscard o WHERE o.kind = :kind"),
    @NamedQuery(name = "Opscard.findByDegree", query = "SELECT o FROM Opscard o WHERE o.degree = :degree"),
    @NamedQuery(name = "Opscard.findByState", query = "SELECT o FROM Opscard o WHERE o.state = :state"),
    @NamedQuery(name = "Opscard.findByJobsite", query = "SELECT o FROM Opscard o WHERE o.jobsite = :jobsite"),
    @NamedQuery(name = "Opscard.findByNameentreprise", query = "SELECT o FROM Opscard o WHERE o.nameentreprise = :nameentreprise"),
    @NamedQuery(name = "Opscard.findByPhone", query = "SELECT o FROM Opscard o WHERE o.phone = :phone"),
    @NamedQuery(name = "Opscard.findByAction", query = "SELECT o FROM Opscard o WHERE o.action = :action"),
    @NamedQuery(name = "Opscard.findByDatecreate", query = "SELECT o FROM Opscard o WHERE o.datecreate = :datecreate"),
    @NamedQuery(name = "Opscard.findByDateupdate", query = "SELECT o FROM Opscard o WHERE o.dateupdate = :dateupdate"),
    @NamedQuery(name = "Opscard.findByOwner", query = "SELECT o FROM Opscard o WHERE o.owner = :owner"),
    @NamedQuery(name = "Opscard.findByLastuser", query = "SELECT o FROM Opscard o WHERE o.lastuser = :lastuser")})
public class Opscard implements Serializable {

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "opscard")
//    private Collection<Actionopscard> actionopscardCollection;

    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 31)
    @Column(name = "PHONE")
    private String phone;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "opscard")
//    private Collection<Actionopscard> actionopscardCollection;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 64)
    @Column(name = "OBSERVER")
    private String observer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CURDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date curdate;
    @Size(max = 64)
    @Column(name = "SITE")
    private String site;
    @Size(max = 512)
    @Column(name = "MEASURE")
    private String measure;
    @Size(max = 512)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KIND")
    private String kind;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "DEGREE")
    private String degree;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "STATE")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "JOBSITE")
    private String jobsite;
    @Size(max = 64)
    @Column(name = "NAMEENTREPRISE")
    private String nameentreprise;
    @Size(max = 512)
    @Column(name = "ACTION")
    private String action;
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
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    
    @JoinColumn(name = "ID", referencedColumnName = "IDOPSCARD", insertable = false, updatable = false)
    @OneToOne(optional = false)
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "opscard")
    private Detailopscard detailopscard;

    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "opscard")
//    private Collection<Actionopscard> actionopscardCollection;
//    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    
    public Opscard() {
    }

    public Opscard(BigDecimal id) {
        this.id = id;
    }

    public Opscard(BigDecimal id, Date curdate, String kind, String degree, String state, String jobsite, String nameentreprise, String phone, Date datecreate, Date dateupdate) {
        this.id = id;
        this.curdate = curdate;
        this.kind = kind;
        this.degree = degree;
        this.state = state;
        this.jobsite = jobsite;
        this.nameentreprise = nameentreprise;
        this.phone = phone;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getObserver() {
        return observer;
    }

    public void setObserver(String observer) {
        this.observer = observer;
    }

    public Date getCurdate() {
        return curdate;
    }

    public void setCurdate(Date curdate) {
        this.curdate = curdate;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getJobsite() {
        return jobsite;
    }

    public void setJobsite(String jobsite) {
        this.jobsite = jobsite;
    }

    public String getNameentreprise() {
        return nameentreprise;
    }

    public void setNameentreprise(String nameentreprise) {
        this.nameentreprise = nameentreprise;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Opscard)) {
            return false;
        }
        Opscard other = (Opscard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Opscard[ id=" + id + " ]";
    }

//    @XmlTransient
//    public Collection<Actionopscard> getActionopscardCollection() {
//        return actionopscardCollection;
//    }
//
//    public void setActionopscardCollection(Collection<Actionopscard> actionopscardCollection) {
//        this.actionopscardCollection = actionopscardCollection;
//    }

    public Detailopscard getDetailopscard() {
        return detailopscard;
    }

    public void setDetailopscard(Detailopscard detailopscard) {
        this.detailopscard = detailopscard;
    }

//    @XmlTransient
//    public Collection<Actionopscard> getActionopscardCollection() {
//        return actionopscardCollection;
//    }
//
//    public void setActionopscardCollection(Collection<Actionopscard> actionopscardCollection) {
//        this.actionopscardCollection = actionopscardCollection;
//    }

//    @XmlTransient
//    public Collection<Actionopscard> getActionopscardCollection() {
//        return actionopscardCollection;
//    }
//
//    public void setActionopscardCollection(Collection<Actionopscard> actionopscardCollection) {
//        this.actionopscardCollection = actionopscardCollection;
//    }
    
}
