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
public class ExcuseagentPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCASEAGENT")
    private BigInteger idcaseagent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEXCUSE")
    private BigInteger idexcuse;

    public ExcuseagentPK() {
    }

    public ExcuseagentPK(BigInteger idcaseagent, BigInteger idexcuse) {
        this.idcaseagent = idcaseagent;
        this.idexcuse = idexcuse;
    }

    public BigInteger getIdcaseagent() {
        return idcaseagent;
    }

    public void setIdcaseagent(BigInteger idcaseagent) {
        this.idcaseagent = idcaseagent;
    }

    public BigInteger getIdexcuse() {
        return idexcuse;
    }

    public void setIdexcuse(BigInteger idexcuse) {
        this.idexcuse = idexcuse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcaseagent != null ? idcaseagent.hashCode() : 0);
        hash += (idexcuse != null ? idexcuse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExcuseagentPK)) {
            return false;
        }
        ExcuseagentPK other = (ExcuseagentPK) object;
        if ((this.idcaseagent == null && other.idcaseagent != null) || (this.idcaseagent != null && !this.idcaseagent.equals(other.idcaseagent))) {
            return false;
        }
        if ((this.idexcuse == null && other.idexcuse != null) || (this.idexcuse != null && !this.idexcuse.equals(other.idexcuse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ExcuseagentPK[ idcaseagent=" + idcaseagent + ", idexcuse=" + idexcuse + " ]";
    }
    
}
