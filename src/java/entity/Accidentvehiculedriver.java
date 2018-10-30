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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "ACCIDENTVEHICULEDRIVER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentvehiculedriver.findAll", query = "SELECT a FROM Accidentvehiculedriver a")
    , @NamedQuery(name = "Accidentvehiculedriver.findByIdaccidentvehicule", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.idaccidentvehicule = :idaccidentvehicule")
    , @NamedQuery(name = "Accidentvehiculedriver.findByName", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.name = :name")
    , @NamedQuery(name = "Accidentvehiculedriver.findByAdress", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.adress = :adress")    
    , @NamedQuery(name = "Accidentvehiculedriver.findByMembership", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.membership = :membership")
    , @NamedQuery(name = "Accidentvehiculedriver.findByLicensenumber", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.licensenumber = :licensenumber")
    , @NamedQuery(name = "Accidentvehiculedriver.findByDatecreate", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.datecreate = :datecreate")
    , @NamedQuery(name = "Accidentvehiculedriver.findByDateupdate", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.dateupdate = :dateupdate")
    , @NamedQuery(name = "Accidentvehiculedriver.findByOwner", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.owner = :owner")
    , @NamedQuery(name = "Accidentvehiculedriver.findByLastuser", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.lastuser = :lastuser")
    , @NamedQuery(name = "Accidentvehiculedriver.findByIssuedon", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.issuedon = :issuedon")
    , @NamedQuery(name = "Accidentvehiculedriver.findByIssuedby", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.issuedby = :issuedby")
    , @NamedQuery(name = "Accidentvehiculedriver.findByDateofbirth", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.dateofbirth = :dateofbirth")
    , @NamedQuery(name = "Accidentvehiculedriver.findByPlaceofbirth", query = "SELECT a FROM Accidentvehiculedriver a WHERE a.placeofbirth = :placeofbirth")})
public class Accidentvehiculedriver implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACCIDENTVEHICULE")
    private BigDecimal idaccidentvehicule;
//    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "NAME")
    private String name;
//    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "ADRESS")
    private String adress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "MEMBERSHIP")
    private String membership;
//    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "LICENSENUMBER")
    private String licensenumber;
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
    @Column(name = "ISSUEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date issuedon;
//    @Basic(optional = false)
    @Size(min = 1, max = 64)
    @Column(name = "ISSUEDBY")
    private String issuedby;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEOFBIRTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateofbirth;
    @Size(max = 31)
    @Column(name = "PLACEOFBIRTH")
    private String placeofbirth;
//    @JoinColumn(name = "IDACCIDENTVEHICULE", referencedColumnName = "ID", insertable = false, updatable = false)
//    @OneToOne(optional = false)
//    private Accidentvehicule accidentvehicule;

    public Accidentvehiculedriver() {
    }

    public Accidentvehiculedriver(BigDecimal idaccidentvehicule) {
        this.idaccidentvehicule = idaccidentvehicule;
    }

    public Accidentvehiculedriver(BigDecimal idaccidentvehicule, String name, String membership, String licensenumber, Date datecreate, Date dateupdate, Date issuedon, String issuedby, Date dateofbirth) {
        this.idaccidentvehicule = idaccidentvehicule;
        this.name = name;
        this.membership = membership;
        this.licensenumber = licensenumber;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
        this.issuedon = issuedon;
        this.issuedby = issuedby;
        this.dateofbirth = dateofbirth;
    }

    public BigDecimal getIdaccidentvehicule() {
        return idaccidentvehicule;
    }

    public void setIdaccidentvehicule(BigDecimal idaccidentvehicule) {
        this.idaccidentvehicule = idaccidentvehicule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber;
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

    public Date getIssuedon() {
        return issuedon;
    }

    public void setIssuedon(Date issuedon) {
        this.issuedon = issuedon;
    }

    public String getIssuedby() {
        return issuedby;
    }

    public void setIssuedby(String issuedby) {
        this.issuedby = issuedby;
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

    
    
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaccidentvehicule != null ? idaccidentvehicule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accidentvehiculedriver)) {
            return false;
        }
        Accidentvehiculedriver other = (Accidentvehiculedriver) object;
        if ((this.idaccidentvehicule == null && other.idaccidentvehicule != null) || (this.idaccidentvehicule != null && !this.idaccidentvehicule.equals(other.idaccidentvehicule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accidentvehiculedriver[ idaccidentvehicule=" + idaccidentvehicule + " ]";
    }
    
}
