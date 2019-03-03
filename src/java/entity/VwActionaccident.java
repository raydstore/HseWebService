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
@Table(name = "VW$ACTIONACCIDENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwActionaccident.findAll", query = "SELECT v FROM VwActionaccident v")
    , @NamedQuery(name = "VwActionaccident.findById", query = "SELECT v FROM VwActionaccident v WHERE v.id = :id")
    , @NamedQuery(name = "VwActionaccident.findByIdaccident", query = "SELECT v FROM VwActionaccident v WHERE v.idaccident = :idaccident")
    , @NamedQuery(name = "VwActionaccident.findByIdaction", query = "SELECT v FROM VwActionaccident v WHERE v.idaction = :idaction")
    , @NamedQuery(name = "VwActionaccident.findByKind", query = "SELECT v FROM VwActionaccident v WHERE v.kind = :kind")
    , @NamedQuery(name = "VwActionaccident.findByName", query = "SELECT v FROM VwActionaccident v WHERE v.name = :name")
    , @NamedQuery(name = "VwActionaccident.findByDatecreate", query = "SELECT v FROM VwActionaccident v WHERE v.datecreate = :datecreate")
    , @NamedQuery(name = "VwActionaccident.findByDateupdate", query = "SELECT v FROM VwActionaccident v WHERE v.dateupdate = :dateupdate")
    , @NamedQuery(name = "VwActionaccident.findByOwner", query = "SELECT v FROM VwActionaccident v WHERE v.owner = :owner")
    , @NamedQuery(name = "VwActionaccident.findByLastuser", query = "SELECT v FROM VwActionaccident v WHERE v.lastuser = :lastuser")
    , @NamedQuery(name = "VwActionaccident.findByState", query = "SELECT v FROM VwActionaccident v WHERE v.state = :state")})
public class VwActionaccident implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 81)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACCIDENT")
    private BigInteger idaccident;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACTION")
    private BigInteger idaction;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KIND")
    private String kind;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "STATE")
    private String state;

    public VwActionaccident() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigInteger getIdaccident() {
        return idaccident;
    }

    public void setIdaccident(BigInteger idaccident) {
        this.idaccident = idaccident;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
}
