/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "NPROPERTY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nproperty.findAll", query = "SELECT n FROM Nproperty n"),
    @NamedQuery(name = "Nproperty.findByIdinstance", query = "SELECT n FROM Nproperty n WHERE n.npropertyPK.idinstance = :idinstance"),
    @NamedQuery(name = "Nproperty.findByIdobject", query = "SELECT n FROM Nproperty n WHERE n.npropertyPK.idobject = :idobject"),
    @NamedQuery(name = "Nproperty.findByIdproperty", query = "SELECT n FROM Nproperty n WHERE n.npropertyPK.idproperty = :idproperty"),
    @NamedQuery(name = "Nproperty.findByType", query = "SELECT n FROM Nproperty n WHERE n.type = :type"),
    @NamedQuery(name = "Nproperty.findByValue", query = "SELECT n FROM Nproperty n WHERE n.value = :value"),
    @NamedQuery(name = "Nproperty.findByDatecreate", query = "SELECT n FROM Nproperty n WHERE n.datecreate = :datecreate"),
    @NamedQuery(name = "Nproperty.findByDateupdate", query = "SELECT n FROM Nproperty n WHERE n.dateupdate = :dateupdate"),
    @NamedQuery(name = "Nproperty.findByOwner", query = "SELECT n FROM Nproperty n WHERE n.owner = :owner"),
    @NamedQuery(name = "Nproperty.findByLastuser", query = "SELECT n FROM Nproperty n WHERE n.lastuser = :lastuser")})
public class Nproperty implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NpropertyPK npropertyPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TYPE")
    private String type;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALUE")
    private BigDecimal value;
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

    public Nproperty() {
    }

    public Nproperty(NpropertyPK npropertyPK) {
        this.npropertyPK = npropertyPK;
    }

    public Nproperty(NpropertyPK npropertyPK, String type, Date datecreate, Date dateupdate) {
        this.npropertyPK = npropertyPK;
        this.type = type;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public Nproperty(BigInteger idinstance, BigInteger idobject, BigInteger idproperty) {
        this.npropertyPK = new NpropertyPK(idinstance, idobject, idproperty);
    }

    public NpropertyPK getNpropertyPK() {
        return npropertyPK;
    }

    public void setNpropertyPK(NpropertyPK npropertyPK) {
        this.npropertyPK = npropertyPK;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
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
        hash += (npropertyPK != null ? npropertyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nproperty)) {
            return false;
        }
        Nproperty other = (Nproperty) object;
        if ((this.npropertyPK == null && other.npropertyPK != null) || (this.npropertyPK != null && !this.npropertyPK.equals(other.npropertyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Nproperty[ npropertyPK=" + npropertyPK + " ]";
    }
    
}
