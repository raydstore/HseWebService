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
public class DetailopscardstructurePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IDOPSCARD")
    private BigInteger idopscard;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSTRUCTURE")
    private BigInteger idstructure;

    public DetailopscardstructurePK() {
    }

    public DetailopscardstructurePK(BigInteger idopscard, BigInteger idstructure) {
        this.idopscard = idopscard;
        this.idstructure = idstructure;
    }

    public BigInteger getIdopscard() {
        return idopscard;
    }

    public void setIdopscard(BigInteger idopscard) {
        this.idopscard = idopscard;
    }

    public BigInteger getIdstructure() {
        return idstructure;
    }

    public void setIdstructure(BigInteger idstructure) {
        this.idstructure = idstructure;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idopscard != null ? idopscard.hashCode() : 0);
        hash += (idstructure != null ? idstructure.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailopscardstructurePK)) {
            return false;
        }
        DetailopscardstructurePK other = (DetailopscardstructurePK) object;
        if ((this.idopscard == null && other.idopscard != null) || (this.idopscard != null && !this.idopscard.equals(other.idopscard))) {
            return false;
        }
        if ((this.idstructure == null && other.idstructure != null) || (this.idstructure != null && !this.idstructure.equals(other.idstructure))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DetailopscardstructurePK[ idopscard=" + idopscard + ", idstructure=" + idstructure + " ]";
    }
    
}
