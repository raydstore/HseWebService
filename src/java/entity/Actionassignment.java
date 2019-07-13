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
@Table(name = "ACTIONASSIGNMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actionassignment.findAll", query = "SELECT a FROM Actionassignment a")
    , @NamedQuery(name = "Actionassignment.findByIdsendaction", query = "SELECT a FROM Actionassignment a WHERE a.actionassignmentPK.idsendaction = :idsendaction")
    , @NamedQuery(name = "Actionassignment.findByIdaction", query = "SELECT a FROM Actionassignment a WHERE a.actionassignmentPK.idaction = :idaction")
    , @NamedQuery(name = "Actionassignment.findByState", query = "SELECT a FROM Actionassignment a WHERE a.state = :state")        
    , @NamedQuery(name = "Actionassignment.findByDatecreate", query = "SELECT a FROM Actionassignment a WHERE a.datecreate = :datecreate")
    , @NamedQuery(name = "Actionassignment.findByDateupdate", query = "SELECT a FROM Actionassignment a WHERE a.dateupdate = :dateupdate")
    , @NamedQuery(name = "Actionassignment.findByOwner", query = "SELECT a FROM Actionassignment a WHERE a.owner = :owner")
    , @NamedQuery(name = "Actionassignment.findByLastuser", query = "SELECT a FROM Actionassignment a WHERE a.lastuser = :lastuser")})
public class Actionassignment implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ActionassignmentPK actionassignmentPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "STATE")
    private String state;
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
    @JoinColumn(name = "IDACTION", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Action action;
    @JoinColumn(name = "IDSENDACTION", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sendaction sendaction;
    public Actionassignment() {
    }

    public Actionassignment(ActionassignmentPK actionassignmentPK) {
        this.actionassignmentPK = actionassignmentPK;
    }

    public Actionassignment(ActionassignmentPK actionassignmentPK, String state,Date datecreate, Date dateupdate) {
        this.actionassignmentPK = actionassignmentPK;
        this.datecreate         = datecreate;
        this.dateupdate         = dateupdate;
        this.state              = state;
    }

    public Actionassignment(BigInteger idsendaction, BigInteger idaction) {
        this.actionassignmentPK = new ActionassignmentPK(idsendaction, idaction);
    }

    public ActionassignmentPK getActionassignmentPK() {
        return actionassignmentPK;
    }

    public void setActionassignmentPK(ActionassignmentPK actionassignmentPK) {
        this.actionassignmentPK = actionassignmentPK;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Sendaction getSendaction() {
        return sendaction;
    }

    public void setSendaction(Sendaction sendaction) {
        this.sendaction = sendaction;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actionassignmentPK != null ? actionassignmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actionassignment)) {
            return false;
        }
        Actionassignment other = (Actionassignment) object;
        if ((this.actionassignmentPK == null && other.actionassignmentPK != null) || (this.actionassignmentPK != null && !this.actionassignmentPK.equals(other.actionassignmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Actionassignment[ actionassignmentPK=" + actionassignmentPK + " ]";
    }
    
}
