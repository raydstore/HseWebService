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
public class FunctionagentPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCASEAGENT")
    private BigInteger idcaseagent;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "CASE")
    private String case1;

    public FunctionagentPK() {
    }

    public FunctionagentPK(BigInteger idcaseagent, String case1) {
        this.idcaseagent = idcaseagent;
        this.case1 = case1;
    }

    public BigInteger getIdcaseagent() {
        return idcaseagent;
    }

    public void setIdcaseagent(BigInteger idcaseagent) {
        this.idcaseagent = idcaseagent;
    }

    public String getCase1() {
        return case1;
    }

    public void setCase1(String case1) {
        this.case1 = case1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcaseagent != null ? idcaseagent.hashCode() : 0);
        hash += (case1 != null ? case1.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FunctionagentPK)) {
            return false;
        }
        FunctionagentPK other = (FunctionagentPK) object;
        if ((this.idcaseagent == null && other.idcaseagent != null) || (this.idcaseagent != null && !this.idcaseagent.equals(other.idcaseagent))) {
            return false;
        }
        if ((this.case1 == null && other.case1 != null) || (this.case1 != null && !this.case1.equals(other.case1))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.FunctionagentPK[ idcaseagent=" + idcaseagent + ", case1=" + case1 + " ]";
    }
    
}
