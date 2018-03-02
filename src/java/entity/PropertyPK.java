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
public class PropertyPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigInteger id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDOBJECT")
    private BigInteger idobject;

    public PropertyPK() {
    }

    public PropertyPK(BigInteger id, BigInteger idobject) {
        this.id = id;
        this.idobject = idobject;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getIdobject() {
        return idobject;
    }

    public void setIdobject(BigInteger idobject) {
        this.idobject = idobject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        hash += (idobject != null ? idobject.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropertyPK)) {
            return false;
        }
        PropertyPK other = (PropertyPK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if ((this.idobject == null && other.idobject != null) || (this.idobject != null && !this.idobject.equals(other.idobject))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PropertyPK[ id=" + id + ", idobject=" + idobject + " ]";
    }
    
}
