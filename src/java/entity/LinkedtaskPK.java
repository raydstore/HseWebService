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
public class LinkedtaskPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPARENT")
    private BigInteger idparent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDWORKSHEET")
    private BigInteger idworksheet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCHILD")
    private BigInteger idchild;

    public LinkedtaskPK() {
    }

    public LinkedtaskPK(BigInteger idparent, BigInteger idworksheet, BigInteger idchild) {
        this.idparent = idparent;
        this.idworksheet = idworksheet;
        this.idchild = idchild;
    }

    public BigInteger getIdparent() {
        return idparent;
    }

    public void setIdparent(BigInteger idparent) {
        this.idparent = idparent;
    }

    public BigInteger getIdworksheet() {
        return idworksheet;
    }

    public void setIdworksheet(BigInteger idworksheet) {
        this.idworksheet = idworksheet;
    }

    public BigInteger getIdchild() {
        return idchild;
    }

    public void setIdchild(BigInteger idchild) {
        this.idchild = idchild;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparent != null ? idparent.hashCode() : 0);
        hash += (idworksheet != null ? idworksheet.hashCode() : 0);
        hash += (idchild != null ? idchild.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LinkedtaskPK)) {
            return false;
        }
        LinkedtaskPK other = (LinkedtaskPK) object;
        if ((this.idparent == null && other.idparent != null) || (this.idparent != null && !this.idparent.equals(other.idparent))) {
            return false;
        }
        if ((this.idworksheet == null && other.idworksheet != null) || (this.idworksheet != null && !this.idworksheet.equals(other.idworksheet))) {
            return false;
        }
        if ((this.idchild == null && other.idchild != null) || (this.idchild != null && !this.idchild.equals(other.idchild))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.LinkedtaskPK[ idparent=" + idparent + ", idworksheet=" + idworksheet + ", idchild=" + idchild + " ]";
    }
    
}
