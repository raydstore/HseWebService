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
@Table(name = "DRIVERNONSH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Drivernonsh.findAll", query = "SELECT d FROM Drivernonsh d"),
    @NamedQuery(name = "Drivernonsh.findById", query = "SELECT d FROM Drivernonsh d WHERE d.id = :id"),
    @NamedQuery(name = "Drivernonsh.findByName", query = "SELECT d FROM Drivernonsh d WHERE d.name = :name"),
    @NamedQuery(name = "Drivernonsh.findByAdress", query = "SELECT d FROM Drivernonsh d WHERE d.adress = :adress"),
    @NamedQuery(name = "Drivernonsh.findByClassification", query = "SELECT d FROM Drivernonsh d WHERE d.classification = :classification"),
    @NamedQuery(name = "Drivernonsh.findByDatecreate", query = "SELECT d FROM Drivernonsh d WHERE d.datecreate = :datecreate"),
    @NamedQuery(name = "Drivernonsh.findByDateupdate", query = "SELECT d FROM Drivernonsh d WHERE d.dateupdate = :dateupdate"),
    @NamedQuery(name = "Drivernonsh.findByOwner", query = "SELECT d FROM Drivernonsh d WHERE d.owner = :owner"),
    @NamedQuery(name = "Drivernonsh.findByLastuser", query = "SELECT d FROM Drivernonsh d WHERE d.lastuser = :lastuser")})
public class Drivernonsh implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "ADRESS")
    private String adress;
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

    public Drivernonsh() {
    }

    public Drivernonsh(String id) {
        this.id = id;
    }

    public Drivernonsh(String id, String name, String adress, String classification, Date datecreate, Date dateupdate) {
        this.id = id;
        this.name = name;
        this.adress = adress;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Drivernonsh)) {
            return false;
        }
        Drivernonsh other = (Drivernonsh) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Drivernonsh[ id=" + id + " ]";
    }
    
}
