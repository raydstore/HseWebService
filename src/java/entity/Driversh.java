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
@Table(name = "DRIVERSH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Driversh.findAll", query = "SELECT d FROM Driversh d"),
    @NamedQuery(name = "Driversh.findById", query = "SELECT d FROM Driversh d WHERE d.id = :id"),
    @NamedQuery(name = "Driversh.findByClassification", query = "SELECT d FROM Driversh d WHERE d.classification = :classification"),
    @NamedQuery(name = "Driversh.findByDatecreate", query = "SELECT d FROM Driversh d WHERE d.datecreate = :datecreate"),
    @NamedQuery(name = "Driversh.findByDateupdate", query = "SELECT d FROM Driversh d WHERE d.dateupdate = :dateupdate"),
    @NamedQuery(name = "Driversh.findByOwner", query = "SELECT d FROM Driversh d WHERE d.owner = :owner"),
    @NamedQuery(name = "Driversh.findByLastuser", query = "SELECT d FROM Driversh d WHERE d.lastuser = :lastuser")})
public class Driversh implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "CLASSIFICATION")
    private String classification;
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
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Agent agent;

    public Driversh() {
    }

    public Driversh(String id) {
        this.id = id;
    }

    public Driversh(String id, String classification, Date datecreate, Date dateupdate) {
        this.id = id;
        this.classification = classification;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
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

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
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
        if (!(object instanceof Driversh)) {
            return false;
        }
        Driversh other = (Driversh) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Driversh[ id=" + id + " ]";
    }
    
}
