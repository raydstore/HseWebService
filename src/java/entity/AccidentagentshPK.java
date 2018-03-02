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
import javax.validation.constraints.Size;

/**
 *
 * @author boutarfa
 */
@Embeddable
public class AccidentagentshPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDAMAGE")
    private BigInteger iddamage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "IDAGENT")
    private String idagent;

    public AccidentagentshPK() {
    }

    public AccidentagentshPK(BigInteger iddamage, String idagent) {
        this.iddamage = iddamage;
        this.idagent = idagent;
    }

    public BigInteger getIddamage() {
        return iddamage;
    }

    public void setIddamage(BigInteger iddamage) {
        this.iddamage = iddamage;
    }

    public String getIdagent() {
        return idagent;
    }

    public void setIdagent(String idagent) {
        this.idagent = idagent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddamage != null ? iddamage.hashCode() : 0);
        hash += (idagent != null ? idagent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccidentagentshPK)) {
            return false;
        }
        AccidentagentshPK other = (AccidentagentshPK) object;
        if ((this.iddamage == null && other.iddamage != null) || (this.iddamage != null && !this.iddamage.equals(other.iddamage))) {
            return false;
        }
        if ((this.idagent == null && other.idagent != null) || (this.idagent != null && !this.idagent.equals(other.idagent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AccidentagentshPK[ iddamage=" + iddamage + ", idagent=" + idagent + " ]";
    }
    
}
