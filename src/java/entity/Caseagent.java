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
@Table(name = "CASEAGENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caseagent.findAll", query = "SELECT c FROM Caseagent c"),
    @NamedQuery(name = "Caseagent.findById", query = "SELECT c FROM Caseagent c WHERE c.id = :id"),
    @NamedQuery(name = "Caseagent.findByCase1", query = "SELECT c FROM Caseagent c WHERE c.case1 = :case1"),
    @NamedQuery(name = "Caseagent.findByDatefirst", query = "SELECT c FROM Caseagent c WHERE c.datefirst = :datefirst"),
    @NamedQuery(name = "Caseagent.findByDatelast", query = "SELECT c FROM Caseagent c WHERE c.datelast = :datelast"),
    @NamedQuery(name = "Caseagent.findByDatecreate", query = "SELECT c FROM Caseagent c WHERE c.datecreate = :datecreate"),
    @NamedQuery(name = "Caseagent.findByDateupdate", query = "SELECT c FROM Caseagent c WHERE c.dateupdate = :dateupdate"),
    @NamedQuery(name = "Caseagent.findByOwner", query = "SELECT c FROM Caseagent c WHERE c.owner = :owner"),
    @NamedQuery(name = "Caseagent.findByLastuser", query = "SELECT c FROM Caseagent c WHERE c.lastuser = :lastuser"),
    @NamedQuery(name = "Caseagent.findByIdjobposting", query = "SELECT c FROM Caseagent c WHERE c.idjobposting = :idjobposting"),
    @NamedQuery(name = "Caseagent.findByIdagent", query = "SELECT c FROM Caseagent c WHERE c.idagent = :idagent"),
    @NamedQuery(name = "Caseagent.findByIdjobpostingCase", query = "SELECT c FROM Caseagent c WHERE c.idjobposting = :idjobposting and c.case1 = :case1")
})
public class Caseagent implements Serializable {
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
    @Column(name = "CASE")
    private String case1;
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
    @NotNull
    @Column(name = "IDJOBPOSTING")
    private BigDecimal idjobposting;
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "IDAGENT")
    private String idagent;
//    @JoinColumns({
//        @JoinColumn(name = "IDJOBPOSTING", referencedColumnName = "IDJOBPOSTING"),
//        @JoinColumn(name = "IDAGENT", referencedColumnName = "IDAGENT")})
//    @ManyToOne(optional = false)
//    private Listagent listagent;

    public Caseagent() {
    }

    public Caseagent(BigDecimal id) {
        this.id = id;
    }

    public Caseagent(BigDecimal id, BigDecimal idjobposting, String idagent, String case1, Date datefirst, Date datelast, Date datecreate, Date dateupdate) {
        this.id = id;
        this.idjobposting = idjobposting;
        this.idagent      = idagent;
        this.case1        = case1;
        this.datefirst    = datefirst;
        this.datelast     = datelast;
        this.datecreate   = datecreate;
        this.dateupdate   = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getCase1() {
        return case1;
    }

    public void setCase1(String case1) {
        this.case1 = case1;
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
    

    public BigDecimal getIdjobposting() {
        return idjobposting;
    }

    public void setIdjobposting(BigDecimal idjobposting) {
        this.idjobposting = idjobposting;
    }

    public String getIdagent() {
        return idagent;
    }

    public void setIdagent(String idagent) {
        this.idagent = idagent;
    }
    
    
    
//    public Listagent getListagent() {
//        return listagent;
//    }
//
//    public void setListagent(Listagent listagent) {
//        this.listagent = listagent;
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
        if (!(object instanceof Caseagent)) {
            return false;
        }
        Caseagent other = (Caseagent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Caseagent[ id=" + id + " ]";
    }
    
}
