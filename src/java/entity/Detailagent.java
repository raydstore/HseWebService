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
@Table(name = "DETAILAGENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detailagent.findAll", query = "SELECT d FROM Detailagent d")
    , @NamedQuery(name = "Detailagent.findByIdagent", query = "SELECT d FROM Detailagent d WHERE d.idagent = :idagent")
    , @NamedQuery(name = "Detailagent.findByIdstructure", query = "SELECT d FROM Detailagent d WHERE d.idstructure = :idstructure")
    , @NamedQuery(name = "Detailagent.findByIdfunction", query = "SELECT d FROM Detailagent d WHERE d.idfunction = :idfunction")
    , @NamedQuery(name = "Detailagent.findByNamefunction", query = "SELECT d FROM Detailagent d WHERE d.namefunction = :namefunction")
    , @NamedQuery(name = "Detailagent.findByCategory", query = "SELECT d FROM Detailagent d WHERE d.category = :category")
    , @NamedQuery(name = "Detailagent.findByDaterecruitment", query = "SELECT d FROM Detailagent d WHERE d.daterecruitment = :daterecruitment")
    , @NamedQuery(name = "Detailagent.findByWorksystem", query = "SELECT d FROM Detailagent d WHERE d.worksystem = :worksystem")
    , @NamedQuery(name = "Detailagent.findByPointingsystem", query = "SELECT d FROM Detailagent d WHERE d.pointingsystem = :pointingsystem")
    , @NamedQuery(name = "Detailagent.findByDatecreate", query = "SELECT d FROM Detailagent d WHERE d.datecreate = :datecreate")
    , @NamedQuery(name = "Detailagent.findByDateupdate", query = "SELECT d FROM Detailagent d WHERE d.dateupdate = :dateupdate")
    , @NamedQuery(name = "Detailagent.findByOwner", query = "SELECT d FROM Detailagent d WHERE d.owner = :owner")
    , @NamedQuery(name = "Detailagent.findByLastuser", query = "SELECT d FROM Detailagent d WHERE d.lastuser = :lastuser")})
public class Detailagent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "IDAGENT")
    private String idagent;
    @Size(max = 8)
    @Column(name = "IDSTRUCTURE")
    private String idstructure;
    @Size(max = 8)
    @Column(name = "IDFUNCTION")
    private String idfunction;
    @Size(max = 64)
    @Column(name = "NAMEFUNCTION")
    private String namefunction;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "CATEGORY")
    private String category;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATERECRUITMENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date daterecruitment;
    @Size(max = 8)
    @Column(name = "WORKSYSTEM")
    private String worksystem;
    @Size(max = 8)
    @Column(name = "POINTINGSYSTEM")
    private String pointingsystem;
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
    @JoinColumn(name = "IDAGENT", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Agent agent;

    public Detailagent() {
    }

    public Detailagent(String idagent) {
        this.idagent = idagent;
    }

    public Detailagent(String idagent, String category, Date daterecruitment, Date datecreate, Date dateupdate) {
        this.idagent = idagent;
        this.category = category;
        this.daterecruitment = daterecruitment;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public String getIdagent() {
        return idagent;
    }

    public void setIdagent(String idagent) {
        this.idagent = idagent;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDaterecruitment() {
        return daterecruitment;
    }

    public void setDaterecruitment(Date daterecruitment) {
        this.daterecruitment = daterecruitment;
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
        hash += (idagent != null ? idagent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detailagent)) {
            return false;
        }
        Detailagent other = (Detailagent) object;
        if ((this.idagent == null && other.idagent != null) || (this.idagent != null && !this.idagent.equals(other.idagent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Detailagent[ idagent=" + idagent + " ]";
    }
    
}
