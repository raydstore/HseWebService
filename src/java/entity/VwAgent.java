/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
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
@Table(name = "VW$AGENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwAgent.findAll", query = "SELECT v FROM VwAgent v")
    , @NamedQuery(name = "VwAgent.findById", query = "SELECT v FROM VwAgent v WHERE v.id = :id")
    , @NamedQuery(name = "VwAgent.findByFirstname", query = "SELECT v FROM VwAgent v WHERE v.firstname = :firstname")
    , @NamedQuery(name = "VwAgent.findByLastname", query = "SELECT v FROM VwAgent v WHERE v.lastname = :lastname")
    , @NamedQuery(name = "VwAgent.findByDateofbirth", query = "SELECT v FROM VwAgent v WHERE v.dateofbirth = :dateofbirth")
    , @NamedQuery(name = "VwAgent.findByPlaceofbirth", query = "SELECT v FROM VwAgent v WHERE v.placeofbirth = :placeofbirth")
    , @NamedQuery(name = "VwAgent.findByFamilysituation", query = "SELECT v FROM VwAgent v WHERE v.familysituation = :familysituation")
    , @NamedQuery(name = "VwAgent.findByAdress", query = "SELECT v FROM VwAgent v WHERE v.adress = :adress")
    , @NamedQuery(name = "VwAgent.findByDatecreate", query = "SELECT v FROM VwAgent v WHERE v.datecreate = :datecreate")
    , @NamedQuery(name = "VwAgent.findByDateupdate", query = "SELECT v FROM VwAgent v WHERE v.dateupdate = :dateupdate")
    , @NamedQuery(name = "VwAgent.findByOwner", query = "SELECT v FROM VwAgent v WHERE v.owner = :owner")
    , @NamedQuery(name = "VwAgent.findByLastuser", query = "SELECT v FROM VwAgent v WHERE v.lastuser = :lastuser")
    , @NamedQuery(name = "VwAgent.findByIdstructure", query = "SELECT v FROM VwAgent v WHERE v.idstructure = :idstructure")
    , @NamedQuery(name = "VwAgent.findByIdfunction", query = "SELECT v FROM VwAgent v WHERE v.idfunction = :idfunction")
    , @NamedQuery(name = "VwAgent.findByNamefunction", query = "SELECT v FROM VwAgent v WHERE v.namefunction = :namefunction")
    , @NamedQuery(name = "VwAgent.findByDaterecruitment", query = "SELECT v FROM VwAgent v WHERE v.daterecruitment = :daterecruitment")
    , @NamedQuery(name = "VwAgent.findByCategory", query = "SELECT v FROM VwAgent v WHERE v.category = :category")
    , @NamedQuery(name = "VwAgent.findByWorksystem", query = "SELECT v FROM VwAgent v WHERE v.worksystem = :worksystem")
    , @NamedQuery(name = "VwAgent.findByPointingsystem", query = "SELECT v FROM VwAgent v WHERE v.pointingsystem = :pointingsystem")})
public class VwAgent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "LASTNAME")
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEOFBIRTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateofbirth;
    @Size(max = 31)
    @Column(name = "PLACEOFBIRTH")
    private String placeofbirth;
    @Size(max = 1)
    @Column(name = "FAMILYSITUATION")
    private String familysituation;
    @Size(max = 128)
    @Column(name = "ADRESS")
    private String adress;
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
    @Size(max = 8)
    @Column(name = "IDSTRUCTURE")
    private String idstructure;
    @Size(max = 15)
    @Column(name = "IDFUNCTION")
    private String idfunction;
    @Size(max = 64)
    @Column(name = "NAMEFUNCTION")
    private String namefunction;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATERECRUITMENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date daterecruitment;
    @Size(max = 8)
    @Column(name = "CATEGORY")
    private String category;
    @Size(max = 8)
    @Column(name = "WORKSYSTEM")
    private String worksystem;
    @Size(max = 8)
    @Column(name = "POINTINGSYSTEM")
    private String pointingsystem;

    public VwAgent() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPlaceofbirth() {
        return placeofbirth;
    }

    public void setPlaceofbirth(String placeofbirth) {
        this.placeofbirth = placeofbirth;
    }

    public String getFamilysituation() {
        return familysituation;
    }

    public void setFamilysituation(String familysituation) {
        this.familysituation = familysituation;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

    public String getIdstructure() {
        return idstructure;
    }

    public void setIdstructure(String idstructure) {
        this.idstructure = idstructure;
    }

    public String getIdfunction() {
        return idfunction;
    }

    public void setIdfunction(String idfunction) {
        this.idfunction = idfunction;
    }

    public String getNamefunction() {
        return namefunction;
    }

    public void setNamefunction(String namefunction) {
        this.namefunction = namefunction;
    }

    public Date getDaterecruitment() {
        return daterecruitment;
    }

    public void setDaterecruitment(Date daterecruitment) {
        this.daterecruitment = daterecruitment;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWorksystem() {
        return worksystem;
    }

    public void setWorksystem(String worksystem) {
        this.worksystem = worksystem;
    }

    public String getPointingsystem() {
        return pointingsystem;
    }

    public void setPointingsystem(String pointingsystem) {
        this.pointingsystem = pointingsystem;
    }
    
}
