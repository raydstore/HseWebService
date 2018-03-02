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
public class ListagentPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDJOBPOSTING")
    private BigInteger idjobposting;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "IDAGENT")
    private String idagent;

    public ListagentPK() {
    }

    public ListagentPK(BigInteger idjobposting, String idagent) {
        this.idjobposting = idjobposting;
        this.idagent = idagent;
    }

    public BigInteger getIdjobposting() {
        return idjobposting;
    }

    public void setIdjobposting(BigInteger idjobposting) {
        this.idjobposting = idjobposting;
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
        hash += (idjobposting != null ? idjobposting.hashCode() : 0);
        hash += (idagent != null ? idagent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListagentPK)) {
            return false;
        }
        ListagentPK other = (ListagentPK) object;
        if ((this.idjobposting == null && other.idjobposting != null) || (this.idjobposting != null && !this.idjobposting.equals(other.idjobposting))) {
            return false;
        }
        if ((this.idagent == null && other.idagent != null) || (this.idagent != null && !this.idagent.equals(other.idagent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ListagentPK[ idjobposting=" + idjobposting + ", idagent=" + idagent + " ]";
    }
    
}
