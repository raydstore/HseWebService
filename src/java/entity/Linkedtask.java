/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boutarfa
 */
@Entity
@Table(name = "LINKEDTASK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Linkedtask.findAll", query = "SELECT l FROM Linkedtask l"),
    @NamedQuery(name = "Linkedtask.findByDatecreate", query = "SELECT l FROM Linkedtask l WHERE l.datecreate = :datecreate"),
    @NamedQuery(name = "Linkedtask.findByDateupdate", query = "SELECT l FROM Linkedtask l WHERE l.dateupdate = :dateupdate"),
    @NamedQuery(name = "Linkedtask.findByLastuser", query = "SELECT l FROM Linkedtask l WHERE l.lastuser = :lastuser"),
    @NamedQuery(name = "Linkedtask.findByOwner", query = "SELECT l FROM Linkedtask l WHERE l.owner = :owner"),
    @NamedQuery(name = "Linkedtask.findByType", query = "SELECT l FROM Linkedtask l WHERE l.type = :type"),
    @NamedQuery(name = "Linkedtask.findByIdparent", query = "SELECT l FROM Linkedtask l WHERE l.linkedtaskPK.idparent = :idparent"),
    @NamedQuery(name = "Linkedtask.findByIdworksheet", query = "SELECT l FROM Linkedtask l WHERE l.linkedtaskPK.idworksheet = :idworksheet"),
    @NamedQuery(name = "Linkedtask.findByIdchild", query = "SELECT l FROM Linkedtask l WHERE l.linkedtaskPK.idchild = :idchild")})
public class Linkedtask implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LinkedtaskPK linkedtaskPK;
    @Column(name = "DATECREATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreate;
    @Column(name = "DATEUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateupdate;
    @Size(max = 255)
    @Column(name = "LASTUSER")
    private String lastuser;
    @Size(max = 255)
    @Column(name = "OWNER")
    private String owner;
    @Column(name = "TYPE")
    private BigInteger type;

    public Linkedtask() {
    }

    public Linkedtask(LinkedtaskPK linkedtaskPK) {
        this.linkedtaskPK = linkedtaskPK;
    }

    public Linkedtask(BigInteger idparent, BigInteger idworksheet, BigInteger idchild) {
        this.linkedtaskPK = new LinkedtaskPK(idparent, idworksheet, idchild);
    }

    public LinkedtaskPK getLinkedtaskPK() {
        return linkedtaskPK;
    }

    public void setLinkedtaskPK(LinkedtaskPK linkedtaskPK) {
        this.linkedtaskPK = linkedtaskPK;
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

    public String getLastuser() {
        return lastuser;
    }

    public void setLastuser(String lastuser) {
        this.lastuser = lastuser;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BigInteger getType() {
        return type;
    }

    public void setType(BigInteger type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (linkedtaskPK != null ? linkedtaskPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linkedtask)) {
            return false;
        }
        Linkedtask other = (Linkedtask) object;
        if ((this.linkedtaskPK == null && other.linkedtaskPK != null) || (this.linkedtaskPK != null && !this.linkedtaskPK.equals(other.linkedtaskPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Linkedtask[ linkedtaskPK=" + linkedtaskPK + " ]";
    }
    
}
