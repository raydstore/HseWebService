/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boutarfa
 */
@Entity
@Table(name = "EXCUSEAGENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Excuseagent.findAll", query = "SELECT e FROM Excuseagent e"),
    @NamedQuery(name = "Excuseagent.findByIdcaseagent", query = "SELECT e FROM Excuseagent e WHERE e.excuseagentPK.idcaseagent = :idcaseagent"),
    @NamedQuery(name = "Excuseagent.findByIdexcuse", query = "SELECT e FROM Excuseagent e WHERE e.excuseagentPK.idexcuse = :idexcuse"),
    @NamedQuery(name = "Excuseagent.findByCase1", query = "SELECT e FROM Excuseagent e WHERE e.case1 = :case1"),
    @NamedQuery(name = "Excuseagent.findByDatecreate", query = "SELECT e FROM Excuseagent e WHERE e.datecreate = :datecreate"),
    @NamedQuery(name = "Excuseagent.findByDateupdate", query = "SELECT e FROM Excuseagent e WHERE e.dateupdate = :dateupdate"),
    @NamedQuery(name = "Excuseagent.findByOwner", query = "SELECT e FROM Excuseagent e WHERE e.owner = :owner"),
    @NamedQuery(name = "Excuseagent.findByLastuser", query = "SELECT e FROM Excuseagent e WHERE e.lastuser = :lastuser")})
public class Excuseagent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExcuseagentPK excuseagentPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "CASE")
    private String case1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATECREATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateupdate;
    @Size(max = 31)
    @Column(name = "OWNER")
    private String owner;
    @Size(max = 31)
    @Column(name = "LASTUSER")
    private String lastuser;
    @JoinColumn(name = "IDEXCUSE", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Excuse excuse;

    public Excuseagent() {
    }

    public Excuseagent(ExcuseagentPK excuseagentPK) {
        this.excuseagentPK = excuseagentPK;
    }

    public Excuseagent(ExcuseagentPK excuseagentPK, String case1, Date datecreate, Date dateupdate) {
        this.excuseagentPK = excuseagentPK;
        this.case1 = case1;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public Excuseagent(BigInteger idcaseagent, BigInteger idexcuse) {
        this.excuseagentPK = new ExcuseagentPK(idcaseagent, idexcuse);
    }

    public ExcuseagentPK getExcuseagentPK() {
        return excuseagentPK;
    }

    public void setExcuseagentPK(ExcuseagentPK excuseagentPK) {
        this.excuseagentPK = excuseagentPK;
    }

    public String getCase1() {
        return case1;
    }

    public void setCase1(String case1) {
        this.case1 = case1;
    }

    public Date getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(Date datecreate) {
        this.datecreate = datecreate;
    }

    public Date getDateupdate() {
        return dateupdate;
    }

    public void setDateupdate(Date dateupdate) {
        this.dateupdate = dateupdate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLastuser() {
        return lastuser;
    }

    public void setLastuser(String lastuser) {
        this.lastuser = lastuser;
    }

    public Excuse getExcuse() {
        return excuse;
    }

    public void setExcuse(Excuse excuse) {
        this.excuse = excuse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (excuseagentPK != null ? excuseagentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Excuseagent)) {
            return false;
        }
        Excuseagent other = (Excuseagent) object;
        if ((this.excuseagentPK == null && other.excuseagentPK != null) || (this.excuseagentPK != null && !this.excuseagentPK.equals(other.excuseagentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Excuseagent[ excuseagentPK=" + excuseagentPK + " ]";
    }
    
}
