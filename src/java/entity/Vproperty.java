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
@Table(name = "VPROPERTY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vproperty.findAll", query = "SELECT v FROM Vproperty v"),
    @NamedQuery(name = "Vproperty.findByIdinstance", query = "SELECT v FROM Vproperty v WHERE v.vpropertyPK.idinstance = :idinstance"),
    @NamedQuery(name = "Vproperty.findByIdobject", query = "SELECT v FROM Vproperty v WHERE v.vpropertyPK.idobject = :idobject"),
    @NamedQuery(name = "Vproperty.findByIdproperty", query = "SELECT v FROM Vproperty v WHERE v.vpropertyPK.idproperty = :idproperty"),
    @NamedQuery(name = "Vproperty.findByType", query = "SELECT v FROM Vproperty v WHERE v.type = :type"),
    @NamedQuery(name = "Vproperty.findByValue", query = "SELECT v FROM Vproperty v WHERE v.value = :value"),
    @NamedQuery(name = "Vproperty.findByDatecreate", query = "SELECT v FROM Vproperty v WHERE v.datecreate = :datecreate"),
    @NamedQuery(name = "Vproperty.findByDateupdate", query = "SELECT v FROM Vproperty v WHERE v.dateupdate = :dateupdate"),
    @NamedQuery(name = "Vproperty.findByOwner", query = "SELECT v FROM Vproperty v WHERE v.owner = :owner"),
    @NamedQuery(name = "Vproperty.findByLastuser", query = "SELECT v FROM Vproperty v WHERE v.lastuser = :lastuser")})
public class Vproperty implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpropertyPK vpropertyPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TYPE")
    private String type;
    @Size(max = 16)
    @Column(name = "VALUE")
    private String value;
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

    public Vproperty() {
    }

    public Vproperty(VpropertyPK vpropertyPK) {
        this.vpropertyPK = vpropertyPK;
    }

    public Vproperty(VpropertyPK vpropertyPK, String type, Date datecreate, Date dateupdate) {
        this.vpropertyPK = vpropertyPK;
        this.type = type;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public Vproperty(BigInteger idinstance, BigInteger idobject, BigInteger idproperty) {
        this.vpropertyPK = new VpropertyPK(idinstance, idobject, idproperty);
    }

    public VpropertyPK getVpropertyPK() {
        return vpropertyPK;
    }

    public void setVpropertyPK(VpropertyPK vpropertyPK) {
        this.vpropertyPK = vpropertyPK;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
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
        hash += (vpropertyPK != null ? vpropertyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vproperty)) {
            return false;
        }
        Vproperty other = (Vproperty) object;
        if ((this.vpropertyPK == null && other.vpropertyPK != null) || (this.vpropertyPK != null && !this.vpropertyPK.equals(other.vpropertyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Vproperty[ vpropertyPK=" + vpropertyPK + " ]";
    }
    
}
