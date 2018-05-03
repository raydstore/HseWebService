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
@Table(name = "VW$DAMAGEWITHRANK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDamagewithrank.findAll", query = "SELECT v FROM VwDamagewithrank v"),
    @NamedQuery(name = "VwDamagewithrank.findById", query = "SELECT v FROM VwDamagewithrank v WHERE v.id = :id"),
    @NamedQuery(name = "VwDamagewithrank.findByIdaccident", query = "SELECT v FROM VwDamagewithrank v WHERE v.idaccident = :idaccident"),
    @NamedQuery(name = "VwDamagewithrank.findByIdgrid", query = "SELECT v FROM VwDamagewithrank v WHERE v.idgrid = :idgrid"),
    @NamedQuery(name = "VwDamagewithrank.findByAccidentdomain", query = "SELECT v FROM VwDamagewithrank v WHERE v.accidentdomain = :accidentdomain"),
    @NamedQuery(name = "VwDamagewithrank.findByDescription", query = "SELECT v FROM VwDamagewithrank v WHERE v.description = :description"),
    @NamedQuery(name = "VwDamagewithrank.findByDatecreate", query = "SELECT v FROM VwDamagewithrank v WHERE v.datecreate = :datecreate"),
    @NamedQuery(name = "VwDamagewithrank.findByDateupdate", query = "SELECT v FROM VwDamagewithrank v WHERE v.dateupdate = :dateupdate"),
    @NamedQuery(name = "VwDamagewithrank.findByOwner", query = "SELECT v FROM VwDamagewithrank v WHERE v.owner = :owner"),
    @NamedQuery(name = "VwDamagewithrank.findByLastuser", query = "SELECT v FROM VwDamagewithrank v WHERE v.lastuser = :lastuser"),
    @NamedQuery(name = "VwDamagewithrank.findByIdnature", query = "SELECT v FROM VwDamagewithrank v WHERE v.idnature = :idnature"),
    @NamedQuery(name = "VwDamagewithrank.findByDegree", query = "SELECT v FROM VwDamagewithrank v WHERE v.degree = :degree"),
    @NamedQuery(name = "VwDamagewithrank.findByIdrank", query = "SELECT v FROM VwDamagewithrank v WHERE v.idrank = :idrank"),
    @NamedQuery(name = "VwDamagewithrank.findByIdelement", query = "SELECT v FROM VwDamagewithrank v WHERE v.idelement = :idelement"),
    @NamedQuery(name = "VwDamagewithrank.findByGrid", query = "SELECT COUNT(v) AS c FROM VwDamagewithrank v WHERE v.idaccident = :idaccident and "
                                                            + "v.accidentdomain = :accidentdomain and v.idnature = :idnature and v.idrank = :idrank")
})
public class VwDamagewithrank implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigInteger id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACCIDENT")
    private BigInteger idaccident;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGRID")
    private BigInteger idgrid;
    @Column(name = "ACCIDENTDOMAIN")
    private Short accidentdomain;
    @Size(max = 100)
    @Column(name = "DESCRIPTION")
    private String description;
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
    @Column(name = "IDNATURE")
    private BigInteger idnature;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "DEGREE")
    private String degree;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDRANK")
    private BigInteger idrank;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDELEMENT")
    private BigInteger idelement;

    public VwDamagewithrank() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getIdaccident() {
        return idaccident;
    }

    public void setIdaccident(BigInteger idaccident) {
        this.idaccident = idaccident;
    }

    public BigInteger getIdgrid() {
        return idgrid;
    }

    public void setIdgrid(BigInteger idgrid) {
        this.idgrid = idgrid;
    }

    public Short getAccidentdomain() {
        return accidentdomain;
    }

    public void setAccidentdomain(Short accidentdomain) {
        this.accidentdomain = accidentdomain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public BigInteger getIdnature() {
        return idnature;
    }

    public void setIdnature(BigInteger idnature) {
        this.idnature = idnature;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public BigInteger getIdrank() {
        return idrank;
    }

    public void setIdrank(BigInteger idrank) {
        this.idrank = idrank;
    }

    public BigInteger getIdelement() {
        return idelement;
    }

    public void setIdelement(BigInteger idelement) {
        this.idelement = idelement;
    }
    
}
