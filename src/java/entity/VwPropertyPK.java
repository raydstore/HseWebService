/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author boutarfa
 */
@Embeddable
public class VwPropertyPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDINSTANCE")
    private BigInteger idinstance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDOBJECT")
    private BigInteger idobject;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPROPERTY")
    private BigInteger idproperty;
   

    public VwPropertyPK() {
    }

    public VwPropertyPK(BigInteger idinstance, BigInteger idobject, BigInteger idproperty) {
        this.idinstance = idinstance;
        this.idobject = idobject;
        this.idproperty = idproperty;
    }
    
    public BigInteger getIdinstance() {
        return idinstance;
    }

    public void setIdinstance(BigInteger idinstance) {
        this.idinstance = idinstance;
    }
    
    public BigInteger getIdobject() {
        return idobject;
    }

    public void setIdobject(BigInteger idobject) {
        this.idobject = idobject;
    }

    public BigInteger getIdproperty() {
        return idproperty;
    }

    public void setIdproperty(BigInteger idproperty) {
        this.idproperty = idproperty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinstance != null ? idinstance.hashCode() : 0);
        hash += (idobject != null ? idobject.hashCode() : 0);
        hash += (idproperty != null ? idproperty.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VwPropertyPK)) {
            return false;
        }
        VwPropertyPK other = (VwPropertyPK) object;
        if ((this.idinstance == null && other.idinstance != null) || (this.idinstance != null && !this.idinstance.equals(other.idinstance))) {
            return false;
        }
        if ((this.idobject == null && other.idobject != null) || (this.idobject != null && !this.idobject.equals(other.idobject))) {
            return false;
        }
        if ((this.idproperty == null && other.idproperty != null) || (this.idproperty != null && !this.idproperty.equals(other.idproperty))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.VwPropertyPK[ idinstance=" + idinstance + ", idobject=" + idobject + ", idproperty=" + idproperty + " ]";
    }
    
}
