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
@Table(name = "VW$USERAUTHORIZATIONMODULE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwUserauthorizationmodule.findAll", query = "SELECT v FROM VwUserauthorizationmodule v")
    , @NamedQuery(name = "VwUserauthorizationmodule.findByIduser", query = "SELECT v FROM VwUserauthorizationmodule v WHERE v.iduser = :iduser")
    , @NamedQuery(name = "VwUserauthorizationmodule.findByIdagent", query = "SELECT v FROM VwUserauthorizationmodule v WHERE v.idagent = :idagent")
    , @NamedQuery(name = "VwUserauthorizationmodule.findByName", query = "SELECT v FROM VwUserauthorizationmodule v WHERE v.name = :name")
    , @NamedQuery(name = "VwUserauthorizationmodule.findByUsername", query = "SELECT v FROM VwUserauthorizationmodule v WHERE v.username = :username")
    , @NamedQuery(name = "VwUserauthorizationmodule.findByPassword", query = "SELECT v FROM VwUserauthorizationmodule v WHERE v.password = :password")
    , @NamedQuery(name = "VwUserauthorizationmodule.findByIdrole", query = "SELECT v FROM VwUserauthorizationmodule v WHERE v.idrole = :idrole")
    , @NamedQuery(name = "VwUserauthorizationmodule.findByDatecreate", query = "SELECT v FROM VwUserauthorizationmodule v WHERE v.datecreate = :datecreate")
    , @NamedQuery(name = "VwUserauthorizationmodule.findByDateupdate", query = "SELECT v FROM VwUserauthorizationmodule v WHERE v.dateupdate = :dateupdate")
    , @NamedQuery(name = "VwUserauthorizationmodule.findByOwner", query = "SELECT v FROM VwUserauthorizationmodule v WHERE v.owner = :owner")
    , @NamedQuery(name = "VwUserauthorizationmodule.findByLastuser", query = "SELECT v FROM VwUserauthorizationmodule v WHERE v.lastuser = :lastuser")
    , @NamedQuery(name = "VwUserauthorizationmodule.findBySiteuser", query = "SELECT v FROM VwUserauthorizationmodule v WHERE v.siteuser = :siteuser")
    , @NamedQuery(name = "VwUserauthorizationmodule.findByAuthorization", query = "SELECT v FROM VwUserauthorizationmodule v WHERE v.authorization = :authorization")
    , @NamedQuery(name = "VwUserauthorizationmodule.findByUsernameAndPassword", query = "SELECT v FROM VwUserauthorizationmodule v WHERE v.username = :username and v.password = :password")        
})
public class VwUserauthorizationmodule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUSER")
    private BigInteger iduser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "IDAGENT")
    private String idagent;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDROLE")
    private BigInteger idrole;
    @Column(name = "DATECREATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreate;
    @Column(name = "DATEUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateupdate;
    @Size(max = 31)
    @Column(name = "OWNER")
    private String owner;
    @Size(max = 31)
    @Column(name = "LASTUSER")
    private String lastuser;
    @Size(max = 4000)
    @Column(name = "SITEUSER")
    private String siteuser;
    @Size(max = 4000)
    @Column(name = "AUTHORIZATION")
    private String authorization;

    public VwUserauthorizationmodule() {
    }

    public BigInteger getIduser() {
        return iduser;
    }

    public void setIduser(BigInteger iduser) {
        this.iduser = iduser;
    }

    public String getIdagent() {
        return idagent;
    }

    public void setIdagent(String idagent) {
        this.idagent = idagent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigInteger getIdrole() {
        return idrole;
    }

    public void setIdrole(BigInteger idrole) {
        this.idrole = idrole;
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

    public String getSiteuser() {
        return siteuser;
    }

    public void setSiteuser(String siteuser) {
        this.siteuser = siteuser;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }
    
}
