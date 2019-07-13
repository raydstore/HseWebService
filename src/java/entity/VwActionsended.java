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
@Table(name = "VW$ACTIONSENDED")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwActionsended.findAll", query = "SELECT v FROM VwActionsended v")
    , @NamedQuery(name = "VwActionsended.findById", query = "SELECT v FROM VwActionsended v WHERE v.id = :id")
    , @NamedQuery(name = "VwActionsended.findByIdsendaction", query = "SELECT v FROM VwActionsended v WHERE v.idsendaction = :idsendaction")
    , @NamedQuery(name = "VwActionsended.findByCurdate", query = "SELECT v FROM VwActionsended v WHERE v.curdate = :curdate")
    , @NamedQuery(name = "VwActionsended.findByIdaction", query = "SELECT v FROM VwActionsended v WHERE v.idaction = :idaction")
    , @NamedQuery(name = "VwActionsended.findByNameaction", query = "SELECT v FROM VwActionsended v WHERE v.nameaction = :nameaction")
    , @NamedQuery(name = "VwActionsended.findByKind", query = "SELECT v FROM VwActionsended v WHERE v.kind = :kind")
    , @NamedQuery(name = "VwActionsended.findByState", query = "SELECT v FROM VwActionsended v WHERE v.state = :state")
    , @NamedQuery(name = "VwActionsended.findByStateaction", query = "SELECT v FROM VwActionsended v WHERE v.stateaction = :stateaction")    
    , @NamedQuery(name = "VwActionsended.findByIdstructure", query = "SELECT v FROM VwActionsended v WHERE v.idstructure = :idstructure")
    , @NamedQuery(name = "VwActionsended.findByNamestructure", query = "SELECT v FROM VwActionsended v WHERE v.namestructure = :namestructure")
    , @NamedQuery(name = "VwActionsended.findByDatecreate", query = "SELECT v FROM VwActionsended v WHERE v.datecreate = :datecreate")
    , @NamedQuery(name = "VwActionsended.findByDateupdate", query = "SELECT v FROM VwActionsended v WHERE v.dateupdate = :dateupdate")
    , @NamedQuery(name = "VwActionsended.findByOwner", query = "SELECT v FROM VwActionsended v WHERE v.owner = :owner")
    , @NamedQuery(name = "VwActionsended.findByLastuser", query = "SELECT v FROM VwActionsended v WHERE v.lastuser = :lastuser")
    , @NamedQuery(name = "VwActionsended.findByAADatecreate", query = "SELECT v FROM VwActionsended v WHERE v.aadatecreate = :aadatecreate")
    , @NamedQuery(name = "VwActionsended.findByAADateupdate", query = "SELECT v FROM VwActionsended v WHERE v.aadateupdate = :aadateupdate")
    , @NamedQuery(name = "VwActionsended.findByAAOwner", query = "SELECT v FROM VwActionsended v WHERE v.aaowner = :aaowner")
    , @NamedQuery(name = "VwActionsended.findByAALastuser", query = "SELECT v FROM VwActionsended v WHERE v.aalastuser = :aalastuser")
    , @NamedQuery(name = "VwActionsended.findByADatecreate", query = "SELECT v FROM VwActionsended v WHERE v.adatecreate = :adatecreate")
    , @NamedQuery(name = "VwActionsended.findByADateupdate", query = "SELECT v FROM VwActionsended v WHERE v.adateupdate = :adateupdate")
    , @NamedQuery(name = "VwActionsended.findByAOwner", query = "SELECT v FROM VwActionsended v WHERE v.aowner = :aowner")
    , @NamedQuery(name = "VwActionsended.findByALastuser", query = "SELECT v FROM VwActionsended v WHERE v.alastuser = :alastuser")
    , @NamedQuery(name = "VwActionsended.findBySTDatecreate", query = "SELECT v FROM VwActionsended v WHERE v.stdatecreate = :stdatecreate")
    , @NamedQuery(name = "VwActionsended.findBySTDateupdate", query = "SELECT v FROM VwActionsended v WHERE v.stdateupdate = :stdateupdate")
    , @NamedQuery(name = "VwActionsended.findBySTOwner", query = "SELECT v FROM VwActionsended v WHERE v.stowner = :stowner")
    , @NamedQuery(name = "VwActionsended.findBySTLastuser", query = "SELECT v FROM VwActionsended v WHERE v.stlastuser = :stlastuser")    
})
public class VwActionsended implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigInteger id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSENDACTION")
    private BigInteger idsendaction;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CURDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date curdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACTION")
    private BigInteger idaction;
    @Size(max = 256)
    @Column(name = "NAMEACTION")
    private String nameaction;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KIND")
    private String kind;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "STATEACTION")
    private String stateaction;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "STATE")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSTRUCTURE")
    private BigInteger idstructure;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "NAMESTRUCTURE")
    private String namestructure;
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
    
    //-------------------------------
    @Basic(optional = false)
    @NotNull
    @Column(name = "AADATECREATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aadatecreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AADATEUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aadateupdate;
    @Size(max = 31)
    @Column(name = "AAOWNER")
    private String aaowner;
    @Size(max = 31)
    @Column(name = "AALASTUSER")
    private String aalastuser;
    //-------------------------------
    @Basic(optional = false)
    @NotNull
    @Column(name = "ADATECREATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date adatecreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ADATEUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date adateupdate;
    @Size(max = 31)
    @Column(name = "AOWNER")
    private String aowner;
    @Size(max = 31)
    @Column(name = "ALASTUSER")
    private String alastuser;
    //-------------------------------
    @Basic(optional = false)
    @NotNull
    @Column(name = "STDATECREATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stdatecreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STDATEUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stdateupdate;
    @Size(max = 31)
    @Column(name = "STOWNER")
    private String stowner;
    @Size(max = 31)
    @Column(name = "STLASTUSER")
    private String stlastuser;

    public VwActionsended() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getIdsendaction() {
        return idsendaction;
    }

    public void setIdsendaction(BigInteger idsendaction) {
        this.idsendaction = idsendaction;
    }

    public Date getCurdate() {
        return curdate;
    }

    public void setCurdate(Date curdate) {
        this.curdate = curdate;
    }

    public BigInteger getIdaction() {
        return idaction;
    }

    public void setIdaction(BigInteger idaction) {
        this.idaction = idaction;
    }

    public String getNameaction() {
        return nameaction;
    }

    public void setNameaction(String nameaction) {
        this.nameaction = nameaction;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getStateaction() {
        return stateaction;
    }

    public void setStateaction(String stateaction) {
        this.stateaction = stateaction;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigInteger getIdstructure() {
        return idstructure;
    }

    public void setIdstructure(BigInteger idstructure) {
        this.idstructure = idstructure;
    }

    public String getNamestructure() {
        return namestructure;
    }

    public void setNamestructure(String namestructure) {
        this.namestructure = namestructure;
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

    public Date getAadatecreate() {
        return aadatecreate;
    }

    public void setAadatecreate(Date aadatecreate) {
        this.aadatecreate = aadatecreate;
    }

    public Date getAadateupdate() {
        return aadateupdate;
    }

    public void setAadateupdate(Date aadateupdate) {
        this.aadateupdate = aadateupdate;
    }

    public String getAaowner() {
        return aaowner;
    }

    public void setAaowner(String aaowner) {
        this.aaowner = aaowner;
    }

    public String getAalastuser() {
        return aalastuser;
    }

    public void setAalastuser(String aalastuser) {
        this.aalastuser = aalastuser;
    }

    public Date getAdatecreate() {
        return adatecreate;
    }

    public void setAdatecreate(Date adatecreate) {
        this.adatecreate = adatecreate;
    }

    public Date getAdateupdate() {
        return adateupdate;
    }

    public void setAdateupdate(Date adateupdate) {
        this.adateupdate = adateupdate;
    }

    public String getAowner() {
        return aowner;
    }

    public void setAowner(String aowner) {
        this.aowner = aowner;
    }

    public String getAlastuser() {
        return alastuser;
    }

    public void setAlastuser(String alastuser) {
        this.alastuser = alastuser;
    }

    public Date getStdatecreate() {
        return stdatecreate;
    }

    public void setStdatecreate(Date stdatecreate) {
        this.stdatecreate = stdatecreate;
    }

    public Date getStdateupdate() {
        return stdateupdate;
    }

    public void setStdateupdate(Date stdateupdate) {
        this.stdateupdate = stdateupdate;
    }

    public String getStowner() {
        return stowner;
    }

    public void setStowner(String stowner) {
        this.stowner = stowner;
    }

    public String getStlastuser() {
        return stlastuser;
    }

    public void setStlastuser(String stlastuser) {
        this.stlastuser = stlastuser;
    }
    
    
    
}
