/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LISTAGENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Listagent.findAll", query = "SELECT l FROM Listagent l"),
    @NamedQuery(name = "Listagent.findByIdjobposting", query = "SELECT l FROM Listagent l WHERE l.listagentPK.idjobposting = :idjobposting"),
    @NamedQuery(name = "Listagent.findByIdagent", query = "SELECT l FROM Listagent l WHERE l.listagentPK.idagent = :idagent"),
    @NamedQuery(name = "Listagent.findByDatecreate", query = "SELECT l FROM Listagent l WHERE l.datecreate = :datecreate"),
    @NamedQuery(name = "Listagent.findByDateupdate", query = "SELECT l FROM Listagent l WHERE l.dateupdate = :dateupdate"),
    @NamedQuery(name = "Listagent.findByOwner", query = "SELECT l FROM Listagent l WHERE l.owner = :owner"),
    @NamedQuery(name = "Listagent.findByLastuser", query = "SELECT l FROM Listagent l WHERE l.lastuser = :lastuser")})
public class Listagent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ListagentPK listagentPK;
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
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listagent")
//    private Collection<Caseagent> caseagentCollection;
    @JoinColumn(name = "IDAGENT", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Agent agent;
    @JoinColumn(name = "IDJOBPOSTING", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Jobposting jobposting;

    public Listagent() {
    }

    public Listagent(ListagentPK listagentPK) {
        this.listagentPK = listagentPK;
    }

    public Listagent(ListagentPK listagentPK, Date datecreate, Date dateupdate) {
        this.listagentPK = listagentPK;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public Listagent(BigInteger idjobposting, String idagent) {
        this.listagentPK = new ListagentPK(idjobposting, idagent);
    }

    public ListagentPK getListagentPK() {
        return listagentPK;
    }

    public void setListagentPK(ListagentPK listagentPK) {
        this.listagentPK = listagentPK;
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

//    @XmlTransient
//    public Collection<Caseagent> getCaseagentCollection() {
//        return caseagentCollection;
//    }
//
//    public void setCaseagentCollection(Collection<Caseagent> caseagentCollection) {
//        this.caseagentCollection = caseagentCollection;
//    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Jobposting getJobposting() {
        return jobposting;
    }

    public void setJobposting(Jobposting jobposting) {
        this.jobposting = jobposting;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (listagentPK != null ? listagentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Listagent)) {
            return false;
        }
        Listagent other = (Listagent) object;
        if ((this.listagentPK == null && other.listagentPK != null) || (this.listagentPK != null && !this.listagentPK.equals(other.listagentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Listagent[ listagentPK=" + listagentPK + " ]";
    }
    
}
