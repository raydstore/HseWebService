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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "ACCIDENTVEHICULE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentvehicule.findAll", query = "SELECT a FROM Accidentvehicule a"),
    @NamedQuery(name = "Accidentvehicule.findById", query = "SELECT a FROM Accidentvehicule a WHERE a.id = :id"),
    @NamedQuery(name = "Accidentvehicule.findByIddamage", query = "SELECT a FROM Accidentvehicule a WHERE a.iddamage = :iddamage"),
    @NamedQuery(name = "Accidentvehicule.findByAccidentdomain", query = "SELECT a FROM Accidentvehicule a WHERE a.accidentdomain = :accidentdomain"),
    @NamedQuery(name = "Accidentvehicule.findByName", query = "SELECT a FROM Accidentvehicule a WHERE a.name = :name"),
    @NamedQuery(name = "Accidentvehicule.findByKind", query = "SELECT a FROM Accidentvehicule a WHERE a.kind = :kind"),
    @NamedQuery(name = "Accidentvehicule.findByClassification", query = "SELECT a FROM Accidentvehicule a WHERE a.classification = :classification"),
    @NamedQuery(name = "Accidentvehicule.findBySource", query = "SELECT a FROM Accidentvehicule a WHERE a.source = :source"),
    @NamedQuery(name = "Accidentvehicule.findByDestination", query = "SELECT a FROM Accidentvehicule a WHERE a.destination = :destination"),
    @NamedQuery(name = "Accidentvehicule.findByDatecreate", query = "SELECT a FROM Accidentvehicule a WHERE a.datecreate = :datecreate"),
    @NamedQuery(name = "Accidentvehicule.findByDateupdate", query = "SELECT a FROM Accidentvehicule a WHERE a.dateupdate = :dateupdate"),
    @NamedQuery(name = "Accidentvehicule.findByOwner", query = "SELECT a FROM Accidentvehicule a WHERE a.owner = :owner"),
    @NamedQuery(name = "Accidentvehicule.findByLastuser", query = "SELECT a FROM Accidentvehicule a WHERE a.lastuser = :lastuser"),
    @NamedQuery(name = "Accidentvehicule.findByMatricule", query = "SELECT a FROM Accidentvehicule a WHERE a.matricule = :matricule"),
    @NamedQuery(name = "Accidentvehicule.findByDamageAccdomClas", query = "SELECT a FROM Accidentvehicule a WHERE  a.iddamage = :iddamage and "
                     + "a.accidentdomain = :accidentdomain and a.classification = :classification")
})
public class Accidentvehicule implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDAMAGE")
    private BigInteger iddamage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCIDENTDOMAIN")
    private BigInteger accidentdomain;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "KIND")
    private String kind;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "CLASSIFICATION")
    private String classification;
    @Size(max = 31)
    @Column(name = "SOURCE")
    private String source;
    @Size(max = 31)
    @Column(name = "DESTINATION")
    private String destination;
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
    @Size(min = 1, max = 14)
    @Column(name = "MATRICULE")
    private String matricule;
    @JoinColumn(name = "IDENTREPRISE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Entreprise identreprise;
    @JoinColumn(name = "IDMARK", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Mark idmark;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idaccidentvehicule")
    private Collection<Assurance> assuranceCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idaccidentvehicule")
    private Collection<Accidentvehiculedriver> accidentvehiculedriverCollection;

    public Accidentvehicule() {
    }

    public Accidentvehicule(BigDecimal id) {
        this.id = id;
    }

    public Accidentvehicule(BigDecimal id, BigInteger iddamage, BigInteger accidentdomain, String name, String kind, String classification, Date datecreate, Date dateupdate, String matricule) {
        this.id = id;
        this.iddamage = iddamage;
        this.accidentdomain = accidentdomain;
        this.name = name;
        this.kind = kind;
        this.classification = classification;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
        this.matricule = matricule;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getIddamage() {
        return iddamage;
    }

    public void setIddamage(BigInteger iddamage) {
        this.iddamage = iddamage;
    }

    public BigInteger getAccidentdomain() {
        return accidentdomain;
    }

    public void setAccidentdomain(BigInteger accidentdomain) {
        this.accidentdomain = accidentdomain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Entreprise getIdentreprise() {
        return identreprise;
    }

    public void setIdentreprise(Entreprise identreprise) {
        this.identreprise = identreprise;
    }

    public Mark getIdmark() {
        return idmark;
    }

    public void setIdmark(Mark idmark) {
        this.idmark = idmark;
    }

    @XmlTransient
    public Collection<Assurance> getAssuranceCollection() {
        return assuranceCollection;
    }

    public void setAssuranceCollection(Collection<Assurance> assuranceCollection) {
        this.assuranceCollection = assuranceCollection;
    }

    @XmlTransient
    public Collection<Accidentvehiculedriver> getAccidentvehiculedriverCollection() {
        return accidentvehiculedriverCollection;
    }

    public void setAccidentvehiculedriverCollection(Collection<Accidentvehiculedriver> accidentvehiculedriverCollection) {
        this.accidentvehiculedriverCollection = accidentvehiculedriverCollection;
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
        if (!(object instanceof Accidentvehicule)) {
            return false;
        }
        Accidentvehicule other = (Accidentvehicule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accidentvehicule[ id=" + id + " ]";
    }
    
}
