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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "DPROPERTY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dproperty.findAll", query = "SELECT d FROM Dproperty d"),
    @NamedQuery(name = "Dproperty.findByIdinstance", query = "SELECT d FROM Dproperty d WHERE d.dpropertyPK.idinstance = :idinstance"),
    @NamedQuery(name = "Dproperty.findByIdobject", query = "SELECT d FROM Dproperty d WHERE d.dpropertyPK.idobject = :idobject"),
    @NamedQuery(name = "Dproperty.findByIdproperty", query = "SELECT d FROM Dproperty d WHERE d.dpropertyPK.idproperty = :idproperty"),
    @NamedQuery(name = "Dproperty.findByType", query = "SELECT d FROM Dproperty d WHERE d.type = :type"),
    @NamedQuery(name = "Dproperty.findByValue", query = "SELECT d FROM Dproperty d WHERE d.value = :value"),
    @NamedQuery(name = "Dproperty.findByDatecreate", query = "SELECT d FROM Dproperty d WHERE d.datecreate = :datecreate"),
    @NamedQuery(name = "Dproperty.findByDateupdate", query = "SELECT d FROM Dproperty d WHERE d.dateupdate = :dateupdate"),
    @NamedQuery(name = "Dproperty.findByOwner", query = "SELECT d FROM Dproperty d WHERE d.owner = :owner"),
    @NamedQuery(name = "Dproperty.findByLastuser", query = "SELECT d FROM Dproperty d WHERE d.lastuser = :lastuser")})
public class Dproperty implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DpropertyPK dpropertyPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TYPE")
    private String type;
    @Column(name = "VALUE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date value;
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

    public Dproperty() {
    }

    public Dproperty(DpropertyPK dpropertyPK) {
        this.dpropertyPK = dpropertyPK;
    }

    public Dproperty(DpropertyPK dpropertyPK, String type, Date datecreate, Date dateupdate) {
        this.dpropertyPK = dpropertyPK;
        this.type = type;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public Dproperty(BigInteger idinstance, BigInteger idobject, BigInteger idproperty) {
        this.dpropertyPK = new DpropertyPK(idinstance, idobject, idproperty);
    }

    public DpropertyPK getDpropertyPK() {
        return dpropertyPK;
    }

    public void setDpropertyPK(DpropertyPK dpropertyPK) {
        this.dpropertyPK = dpropertyPK;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getValue() {
        return value;
    }

    public void setValue(Date value) {
        this.value = value;
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
        hash += (dpropertyPK != null ? dpropertyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dproperty)) {
            return false;
        }
        Dproperty other = (Dproperty) object;
        if ((this.dpropertyPK == null && other.dpropertyPK != null) || (this.dpropertyPK != null && !this.dpropertyPK.equals(other.dpropertyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Dproperty[ dpropertyPK=" + dpropertyPK + " ]";
    }
    
}
