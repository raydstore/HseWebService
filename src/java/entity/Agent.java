/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "AGENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agent.findAll", query = "SELECT a FROM Agent a"),
    @NamedQuery(name = "Agent.findById", query = "SELECT a FROM Agent a WHERE a.id = :id"),
    @NamedQuery(name = "Agent.findByFirstname", query = "SELECT a FROM Agent a WHERE a.firstname = :firstname"),
    @NamedQuery(name = "Agent.findByLastname", query = "SELECT a FROM Agent a WHERE a.lastname = :lastname"),
    @NamedQuery(name = "Agent.findByHiredate", query = "SELECT a FROM Agent a WHERE a.hiredate = :hiredate"),
    @NamedQuery(name = "Agent.findByDatecreate", query = "SELECT a FROM Agent a WHERE a.datecreate = :datecreate"),
    @NamedQuery(name = "Agent.findByDateupdate", query = "SELECT a FROM Agent a WHERE a.dateupdate = :dateupdate"),
    @NamedQuery(name = "Agent.findByOwner", query = "SELECT a FROM Agent a WHERE a.owner = :owner"),
    @NamedQuery(name = "Agent.findByLastuser", query = "SELECT a FROM Agent a WHERE a.lastuser = :lastuser")})
public class Agent implements Serializable {
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
    @Column(name = "HIREDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hiredate;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idagent")
    private Collection<Jobposting> jobpostingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agent")
    private Collection<Listagent> listagentCollection;

    public Agent() {
    }

    public Agent(String id) {
        this.id = id;
    }

    public Agent(String id, String firstname, String lastname, Date hiredate, Date datecreate, Date dateupdate) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.hiredate = hiredate;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
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

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
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

    @XmlTransient
    public Collection<Jobposting> getJobpostingCollection() {
        return jobpostingCollection;
    }

    public void setJobpostingCollection(Collection<Jobposting> jobpostingCollection) {
        this.jobpostingCollection = jobpostingCollection;
    }

    @XmlTransient
    public Collection<Listagent> getListagentCollection() {
        return listagentCollection;
    }

    public void setListagentCollection(Collection<Listagent> listagentCollection) {
        this.listagentCollection = listagentCollection;
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
        if (!(object instanceof Agent)) {
            return false;
        }
        Agent other = (Agent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Agent[ id=" + id + " ]";
    }
    
}
