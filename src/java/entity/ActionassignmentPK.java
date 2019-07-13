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
public class ActionassignmentPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSENDACTION")
    private BigInteger idsendaction;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACTION")
    private BigInteger idaction;

    public ActionassignmentPK() {
    }

    public ActionassignmentPK(BigInteger idsendaction, BigInteger idaction) {
        this.idsendaction = idsendaction;
        this.idaction = idaction;
    }

    public BigInteger getIdsendaction() {
        return idsendaction;
    }

    public void setIdsendaction(BigInteger idsendaction) {
        this.idsendaction = idsendaction;
    }

    public BigInteger getIdaction() {
        return idaction;
    }

    public void setIdaction(BigInteger idaction) {
        this.idaction = idaction;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsendaction != null ? idsendaction.hashCode() : 0);
        hash += (idaction != null ? idaction.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActionassignmentPK)) {
            return false;
        }
        ActionassignmentPK other = (ActionassignmentPK) object;
        if ((this.idsendaction == null && other.idsendaction != null) || (this.idsendaction != null && !this.idsendaction.equals(other.idsendaction))) {
            return false;
        }
        if ((this.idaction == null && other.idaction != null) || (this.idaction != null && !this.idaction.equals(other.idaction))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ActionassignmentPK[ idsendaction=" + idsendaction + ", idaction=" + idaction  + " ]";
    }
    
}
