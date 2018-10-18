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
@Table(name = "VW$INSPECTEDSITE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwInspectedsite.findAll", query = "SELECT v FROM VwInspectedsite v")
    , @NamedQuery(name = "VwInspectedsite.findById", query = "SELECT v FROM VwInspectedsite v WHERE v.id = :id")
    , @NamedQuery(name = "VwInspectedsite.findByName", query = "SELECT v FROM VwInspectedsite v WHERE v.name = :name")
    , @NamedQuery(name = "VwInspectedsite.findByEnable", query = "SELECT v FROM VwInspectedsite v WHERE v.enable = :enable")
    , @NamedQuery(name = "VwInspectedsite.findByPeriodicity", query = "SELECT v FROM VwInspectedsite v WHERE v.periodicity = :periodicity")
    , @NamedQuery(name = "VwInspectedsite.findByDatecreate", query = "SELECT v FROM VwInspectedsite v WHERE v.datecreate = :datecreate")
    , @NamedQuery(name = "VwInspectedsite.findByDateupdate", query = "SELECT v FROM VwInspectedsite v WHERE v.dateupdate = :dateupdate")
    , @NamedQuery(name = "VwInspectedsite.findByOwner", query = "SELECT v FROM VwInspectedsite v WHERE v.owner = :owner")
    , @NamedQuery(name = "VwInspectedsite.findByLastuser", query = "SELECT v FROM VwInspectedsite v WHERE v.lastuser = :lastuser")})
public class VwInspectedsite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigInteger id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ENABLE")
    private short enable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERIODICITY")
    private BigInteger periodicity;
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

    public VwInspectedsite() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getEnable() {
        return enable;
    }

    public void setEnable(short enable) {
        this.enable = enable;
    }

    public BigInteger getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(BigInteger periodicity) {
        this.periodicity = periodicity;
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
