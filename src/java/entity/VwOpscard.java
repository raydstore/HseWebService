/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "VW$OPSCARD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwOpscard.findAll", query = "SELECT v FROM VwOpscard v")
    , @NamedQuery(name = "VwOpscard.findById", query = "SELECT v FROM VwOpscard v WHERE v.id = :id")
    , @NamedQuery(name = "VwOpscard.findByObserver", query = "SELECT v FROM VwOpscard v WHERE v.observer = :observer")
    , @NamedQuery(name = "VwOpscard.findByCurdate", query = "SELECT v FROM VwOpscard v WHERE v.curdate = :curdate")
    , @NamedQuery(name = "VwOpscard.findBySite", query = "SELECT v FROM VwOpscard v WHERE v.site = :site")
    , @NamedQuery(name = "VwOpscard.findByMeasure", query = "SELECT v FROM VwOpscard v WHERE v.measure = :measure")
    , @NamedQuery(name = "VwOpscard.findByDescription", query = "SELECT v FROM VwOpscard v WHERE v.description = :description")
    , @NamedQuery(name = "VwOpscard.findByState", query = "SELECT v FROM VwOpscard v WHERE v.state = :state")
    , @NamedQuery(name = "VwOpscard.findByKind", query = "SELECT v FROM VwOpscard v WHERE v.kind = :kind")
    , @NamedQuery(name = "VwOpscard.findByDatecreate", query = "SELECT v FROM VwOpscard v WHERE v.datecreate = :datecreate")
    , @NamedQuery(name = "VwOpscard.findByDateupdate", query = "SELECT v FROM VwOpscard v WHERE v.dateupdate = :dateupdate")
    , @NamedQuery(name = "VwOpscard.findByOwner", query = "SELECT v FROM VwOpscard v WHERE v.owner = :owner")
    , @NamedQuery(name = "VwOpscard.findByLastuser", query = "SELECT v FROM VwOpscard v WHERE v.lastuser = :lastuser")
    , @NamedQuery(name = "VwOpscard.findByPhone", query = "SELECT v FROM VwOpscard v WHERE v.phone = :phone")
    , @NamedQuery(name = "VwOpscard.findByAction", query = "SELECT v FROM VwOpscard v WHERE v.action = :action")
    , @NamedQuery(name = "VwOpscard.findByDegree", query = "SELECT v FROM VwOpscard v WHERE v.degree = :degree")
    , @NamedQuery(name = "VwOpscard.findByDegreename", query = "SELECT v FROM VwOpscard v WHERE v.degreename = :degreename")
    , @NamedQuery(name = "VwOpscard.findByZone", query = "SELECT v FROM VwOpscard v WHERE v.zone = :zone")
    , @NamedQuery(name = "VwOpscard.findByNameentreprise", query = "SELECT v FROM VwOpscard v WHERE v.nameentreprise = :nameentreprise")
    , @NamedQuery(name = "VwOpscard.findByIdsite", query = "SELECT v FROM VwOpscard v WHERE v.idsite = :idsite")
    , @NamedQuery(name = "VwOpscard.findBySitename", query = "SELECT v FROM VwOpscard v WHERE v.sitename = :sitename")
    , @NamedQuery(name = "VwOpscard.findByJobsite", query = "SELECT v FROM VwOpscard v WHERE v.jobsite = :jobsite")
    , @NamedQuery(name = "VwOpscard.findByJobsitename", query = "SELECT v FROM VwOpscard v WHERE v.jobsitename = :jobsitename")
    , @NamedQuery(name = "VwOpscard.findByIdwork", query = "SELECT v FROM VwOpscard v WHERE v.idwork = :idwork")
    , @NamedQuery(name = "VwOpscard.findByNamework", query = "SELECT v FROM VwOpscard v WHERE v.namework = :namework")
    , @NamedQuery(name = "VwOpscard.findByStarttype", query = "SELECT v FROM VwOpscard v WHERE v.starttype = :starttype")
    , @NamedQuery(name = "VwOpscard.findByNamestart", query = "SELECT v FROM VwOpscard v WHERE v.namestart = :namestart")
    , @NamedQuery(name = "VwOpscard.findByKinddetail", query = "SELECT v FROM VwOpscard v WHERE v.kinddetail = :kinddetail")
    , @NamedQuery(name = "VwOpscard.findByNamekinddetail", query = "SELECT v FROM VwOpscard v WHERE v.namekinddetail = :namekinddetail")})
public class VwOpscard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigInteger id;
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
    @Column(name = "STATE")
    private String state;
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
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 31)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 512)
    @Column(name = "ACTION")
    private String action;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "DEGREE")
    private String degree;
    @Size(max = 5)
    @Column(name = "DEGREENAME")
    private String degreename;
    @Size(max = 64)
    @Column(name = "ZONE")
    private String zone;
    @Size(max = 64)
    @Column(name = "NAMEENTREPRISE")
    private String nameentreprise;
    @Column(name = "IDSITE")
    private BigInteger idsite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "SITENAME")
    private String sitename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "JOBSITE")
    private String jobsite;
    @Size(max = 6)
    @Column(name = "JOBSITENAME")
    private String jobsitename;
    @Column(name = "IDWORK")
    private BigInteger idwork;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "NAMEWORK")
    private String namework;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "STARTTYPE")
    private String starttype;
    @Size(max = 26)
    @Column(name = "NAMESTART")
    private String namestart;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KINDDETAIL")
    private String kinddetail;
    @Size(max = 20)
    @Column(name = "NAMEKINDDETAIL")
    private String namekinddetail;

    public VwOpscard() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDegreename() {
        return degreename;
    }

    public void setDegreename(String degreename) {
        this.degreename = degreename;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getNameentreprise() {
        return nameentreprise;
    }

    public void setNameentreprise(String nameentreprise) {
        this.nameentreprise = nameentreprise;
    }

    public BigInteger getIdsite() {
        return idsite;
    }

    public void setIdsite(BigInteger idsite) {
        this.idsite = idsite;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getJobsite() {
        return jobsite;
    }

    public void setJobsite(String jobsite) {
        this.jobsite = jobsite;
    }

    public String getJobsitename() {
        return jobsitename;
    }

    public void setJobsitename(String jobsitename) {
        this.jobsitename = jobsitename;
    }

    public BigInteger getIdwork() {
        return idwork;
    }

    public void setIdwork(BigInteger idwork) {
        this.idwork = idwork;
    }

    public String getNamework() {
        return namework;
    }

    public void setNamework(String namework) {
        this.namework = namework;
    }

    public String getStarttype() {
        return starttype;
    }

    public void setStarttype(String starttype) {
        this.starttype = starttype;
    }

    public String getNamestart() {
        return namestart;
    }

    public void setNamestart(String namestart) {
        this.namestart = namestart;
    }

    public String getKinddetail() {
        return kinddetail;
    }

    public void setKinddetail(String kinddetail) {
        this.kinddetail = kinddetail;
    }

    public String getNamekinddetail() {
        return namekinddetail;
    }

    public void setNamekinddetail(String namekinddetail) {
        this.namekinddetail = namekinddetail;
    }
    
}
