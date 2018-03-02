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
public class AccidentnaturePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACCIDENT")
    private BigInteger idaccident;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATURE")
    private BigInteger idnature;

    public AccidentnaturePK() {
    }

    public AccidentnaturePK(BigInteger idaccident, BigInteger idnature) {
        this.idaccident = idaccident;
        this.idnature = idnature;
    }

    public BigInteger getIdaccident() {
        return idaccident;
    }

    public void setIdaccident(BigInteger idaccident) {
        this.idaccident = idaccident;
    }

    public BigInteger getIdnature() {
        return idnature;
    }

    public void setIdnature(BigInteger idnature) {
        this.idnature = idnature;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaccident != null ? idaccident.hashCode() : 0);
        hash += (idnature != null ? idnature.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccidentnaturePK)) {
            return false;
        }
        AccidentnaturePK other = (AccidentnaturePK) object;
        if ((this.idaccident == null && other.idaccident != null) || (this.idaccident != null && !this.idaccident.equals(other.idaccident))) {
            return false;
        }
        if ((this.idnature == null && other.idnature != null) || (this.idnature != null && !this.idnature.equals(other.idnature))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AccidentnaturePK[ idaccident=" + idaccident + ", idnature=" + idnature + " ]";
    }
    
}
