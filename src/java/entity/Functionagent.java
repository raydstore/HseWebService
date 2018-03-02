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
@Table(name = "FUNCTIONAGENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Functionagent.findAll", query = "SELECT f FROM Functionagent f"),
    @NamedQuery(name = "Functionagent.findByIdcaseagent", query = "SELECT f FROM Functionagent f WHERE f.functionagentPK.idcaseagent = :idcaseagent"),
    @NamedQuery(name = "Functionagent.findByCase1", query = "SELECT f FROM Functionagent f WHERE f.functionagentPK.case1 = :case1"),
    @NamedQuery(name = "Functionagent.findByPeriod", query = "SELECT f FROM Functionagent f WHERE f.period = :period"),
    @NamedQuery(name = "Functionagent.findByDatecreate", query = "SELECT f FROM Functionagent f WHERE f.datecreate = :datecreate"),
    @NamedQuery(name = "Functionagent.findByDateupdate", query = "SELECT f FROM Functionagent f WHERE f.dateupdate = :dateupdate"),
    @NamedQuery(name = "Functionagent.findByOwner", query = "SELECT f FROM Functionagent f WHERE f.owner = :owner"),
    @NamedQuery(name = "Functionagent.findByLastuser", query = "SELECT f FROM Functionagent f WHERE f.lastuser = :lastuser")})
public class Functionagent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FunctionagentPK functionagentPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "PERIOD")
    private String period;
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
    @JoinColumn(name = "IDFUNCTION", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Function1 idfunction;

    public Functionagent() {
    }

    public Functionagent(FunctionagentPK functionagentPK) {
        this.functionagentPK = functionagentPK;
    }

    public Functionagent(FunctionagentPK functionagentPK, String period, Date datecreate, Date dateupdate) {
        this.functionagentPK = functionagentPK;
        this.period = period;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public Functionagent(BigInteger idcaseagent, String case1) {
        this.functionagentPK = new FunctionagentPK(idcaseagent, case1);
    }

    public FunctionagentPK getFunctionagentPK() {
        return functionagentPK;
    }

    public void setFunctionagentPK(FunctionagentPK functionagentPK) {
        this.functionagentPK = functionagentPK;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
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

    public Function1 getIdfunction() {
        return idfunction;
    }

    public void setIdfunction(Function1 idfunction) {
        this.idfunction = idfunction;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (functionagentPK != null ? functionagentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Functionagent)) {
            return false;
        }
        Functionagent other = (Functionagent) object;
        if ((this.functionagentPK == null && other.functionagentPK != null) || (this.functionagentPK != null && !this.functionagentPK.equals(other.functionagentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Functionagent[ functionagentPK=" + functionagentPK + " ]";
    }
    
}
