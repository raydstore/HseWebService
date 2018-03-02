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
@Table(name = "IPROPERTY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Iproperty.findAll", query = "SELECT i FROM Iproperty i"),
    @NamedQuery(name = "Iproperty.findByIdinstance", query = "SELECT i FROM Iproperty i WHERE i.ipropertyPK.idinstance = :idinstance"),
    @NamedQuery(name = "Iproperty.findByIdobject", query = "SELECT i FROM Iproperty i WHERE i.ipropertyPK.idobject = :idobject"),
    @NamedQuery(name = "Iproperty.findByIdproperty", query = "SELECT i FROM Iproperty i WHERE i.ipropertyPK.idproperty = :idproperty"),
    @NamedQuery(name = "Iproperty.findByType", query = "SELECT i FROM Iproperty i WHERE i.type = :type"),
    @NamedQuery(name = "Iproperty.findByValue", query = "SELECT i FROM Iproperty i WHERE i.value = :value"),
    @NamedQuery(name = "Iproperty.findByDatecreate", query = "SELECT i FROM Iproperty i WHERE i.datecreate = :datecreate"),
    @NamedQuery(name = "Iproperty.findByDateupdate", query = "SELECT i FROM Iproperty i WHERE i.dateupdate = :dateupdate"),
    @NamedQuery(name = "Iproperty.findByOwner", query = "SELECT i FROM Iproperty i WHERE i.owner = :owner"),
    @NamedQuery(name = "Iproperty.findByLastuser", query = "SELECT i FROM Iproperty i WHERE i.lastuser = :lastuser")})
public class Iproperty implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IpropertyPK ipropertyPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TYPE")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALUE")
    private BigInteger value;
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

    public Iproperty() {
    }

    public Iproperty(IpropertyPK ipropertyPK) {
        this.ipropertyPK = ipropertyPK;
    }

    public Iproperty(IpropertyPK ipropertyPK, String type, BigInteger value, Date datecreate, Date dateupdate) {
        this.ipropertyPK = ipropertyPK;
        this.type = type;
        this.value = value;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public Iproperty(BigInteger idinstance, BigInteger idobject, BigInteger idproperty) {
        this.ipropertyPK = new IpropertyPK(idinstance, idobject, idproperty);
    }

    public IpropertyPK getIpropertyPK() {
        return ipropertyPK;
    }

    public void setIpropertyPK(IpropertyPK ipropertyPK) {
        this.ipropertyPK = ipropertyPK;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
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
        hash += (ipropertyPK != null ? ipropertyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Iproperty)) {
            return false;
        }
        Iproperty other = (Iproperty) object;
        if ((this.ipropertyPK == null && other.ipropertyPK != null) || (this.ipropertyPK != null && !this.ipropertyPK.equals(other.ipropertyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Iproperty[ ipropertyPK=" + ipropertyPK + " ]";
    }
    
}
