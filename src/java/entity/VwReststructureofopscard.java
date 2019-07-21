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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "VW$RESTSTRUCTUREOFOPSCARD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwReststructureofopscard.findAll", query = "SELECT v FROM VwReststructureofopscard v")
    , @NamedQuery(name = "VwReststructureofopscard.findById", query = "SELECT v FROM VwReststructureofopscard v WHERE v.id = :id")
    , @NamedQuery(name = "VwReststructureofopscard.findByIdopscard", query = "SELECT v FROM VwReststructureofopscard v WHERE v.idopscard = :idopscard")
    , @NamedQuery(name = "VwReststructureofopscard.findByIdstructure", query = "SELECT v FROM VwReststructureofopscard v WHERE v.idstructure = :idstructure")
    , @NamedQuery(name = "VwReststructureofopscard.findByName", query = "SELECT v FROM VwReststructureofopscard v WHERE v.name = :name")
    , @NamedQuery(name = "VwReststructureofopscard.findByDatecreate", query = "SELECT v FROM VwReststructureofopscard v WHERE v.datecreate = :datecreate")
    , @NamedQuery(name = "VwReststructureofopscard.findByDateupdate", query = "SELECT v FROM VwReststructureofopscard v WHERE v.dateupdate = :dateupdate")
    , @NamedQuery(name = "VwReststructureofopscard.findByOwner", query = "SELECT v FROM VwReststructureofopscard v WHERE v.owner = :owner")
    , @NamedQuery(name = "VwReststructureofopscard.findByLastuser", query = "SELECT v FROM VwReststructureofopscard v WHERE v.lastuser = :lastuser")})
public class VwReststructureofopscard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 81)
    @Column(name = "ID")
    private String id;
    @Column(name = "IDOPSCARD")
    private BigInteger idopscard;
    @Column(name = "IDSTRUCTURE")
    private BigInteger idstructure;
    @Size(max = 31)
    @Column(name = "NAME")
    private String name;
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

    public VwReststructureofopscard() {
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

    public BigInteger getIdstructure() {
        return idstructure;
    }

    public void setIdstructure(BigInteger idstructure) {
        this.idstructure = idstructure;
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
