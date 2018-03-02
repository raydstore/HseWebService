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
public class AccidentagenttpPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigInteger id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDAMAGE")
    private BigInteger iddamage;

    public AccidentagenttpPK() {
    }

    public AccidentagenttpPK(BigInteger id, BigInteger iddamage) {
        this.id = id;
        this.iddamage = iddamage;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getIddamage() {
        return iddamage;
    }

    public void setIddamage(BigInteger iddamage) {
        this.iddamage = iddamage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        hash += (iddamage != null ? iddamage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccidentagenttpPK)) {
            return false;
        }
        AccidentagenttpPK other = (AccidentagenttpPK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if ((this.iddamage == null && other.iddamage != null) || (this.iddamage != null && !this.iddamage.equals(other.iddamage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AccidentagenttpPK[ id=" + id + ", iddamage=" + iddamage + " ]";
    }
    
}
