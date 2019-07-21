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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "VW$ACTIONOPSCARD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwActionopscard.findAll", query = "SELECT v FROM VwActionopscard v")
    , @NamedQuery(name = "VwActionopscard.findById", query = "SELECT v FROM VwActionopscard v WHERE v.id = :id")
    , @NamedQuery(name = "VwActionopscard.findByIdopscard", query = "SELECT v FROM VwActionopscard v WHERE v.idopscard = :idopscard")
    , @NamedQuery(name = "VwActionopscard.findByIdaction", query = "SELECT v FROM VwActionopscard v WHERE v.idaction = :idaction")
    , @NamedQuery(name = "VwActionopscard.findByKind", query = "SELECT v FROM VwActionopscard v WHERE v.kind = :kind")
    , @NamedQuery(name = "VwActionopscard.findByName", query = "SELECT v FROM VwActionopscard v WHERE v.name = :name")
    , @NamedQuery(name = "VwActionopscard.findByDatecreate", query = "SELECT v FROM VwActionopscard v WHERE v.datecreate = :datecreate")
    , @NamedQuery(name = "VwActionopscard.findByDateupdate", query = "SELECT v FROM VwActionopscard v WHERE v.dateupdate = :dateupdate")
    , @NamedQuery(name = "VwActionopscard.findByOwner", query = "SELECT v FROM VwActionopscard v WHERE v.owner = :owner")
    , @NamedQuery(name = "VwActionopscard.findByLastuser", query = "SELECT v FROM VwActionopscard v WHERE v.lastuser = :lastuser")})
public class VwActionopscard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 80)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDOPSCARD")
    private BigInteger idopscard;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACTION")
    private BigInteger idaction;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KIND")
    private String kind;
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "STATE")
    private String state;
    @Size(max = 256)
    @Column(name = "NAME")
    private String name;
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

    public VwActionopscard() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigInteger getIdopscard() {
        return idopscard;
    }

    public void setIdopscard(BigInteger idopscard) {
        this.idopscard = idopscard;
    }

    public BigInteger getIdaction() {
        return idaction;
    }

    public void setIdaction(BigInteger idaction) {
        this.idaction = idaction;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
}
