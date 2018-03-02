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
@Table(name = "VW$PROPERTY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwProperty.findAll", query = "SELECT v FROM VwProperty v"),
    @NamedQuery(name = "VwProperty.findByIdproperty", query = "SELECT v FROM VwProperty v WHERE v.vwPropertyPK.idproperty = :idproperty"),
    @NamedQuery(name = "VwProperty.findByIdinstance", query = "SELECT v FROM VwProperty v WHERE v.vwPropertyPK.idinstance = :idinstance"),
    @NamedQuery(name = "VwProperty.findByIdobject", query = "SELECT v FROM VwProperty v WHERE v.vwPropertyPK.idobject = :idobject"),
    @NamedQuery(name = "VwProperty.findByIdinstanceAndIdobject", query = "SELECT v FROM VwProperty v WHERE v.vwPropertyPK.idinstance = :idinstance and v.vwPropertyPK.idobject = :idobject"),
    @NamedQuery(name = "VwProperty.findByType", query = "SELECT v FROM VwProperty v WHERE v.type = :type"),
    @NamedQuery(name = "VwProperty.findByName", query = "SELECT v FROM VwProperty v WHERE v.name = :name"),
    @NamedQuery(name = "VwProperty.findByValue", query = "SELECT v FROM VwProperty v WHERE v.value = :value"),
    @NamedQuery(name = "VwProperty.findByDatecreate", query = "SELECT v FROM VwProperty v WHERE v.datecreate = :datecreate"),
    @NamedQuery(name = "VwProperty.findByDateupdate", query = "SELECT v FROM VwProperty v WHERE v.dateupdate = :dateupdate"),
    @NamedQuery(name = "VwProperty.findByOwner", query = "SELECT v FROM VwProperty v WHERE v.owner = :owner"),
    @NamedQuery(name = "VwProperty.findByLastuser", query = "SELECT v FROM VwProperty v WHERE v.lastuser = :lastuser")})
public class VwProperty implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VwPropertyPK vwPropertyPK;
//    @Column(name = "ID")
//    private BigInteger id;
//    @Column(name = "IDINSTANCE")
//    private BigInteger idinstance;
//    @Column(name = "IDOBJECT")
//    private BigInteger idobject;
    @Size(max = 1)
    @Column(name = "TYPE")
    private String type;
    @Size(max = 31)
    @Column(name = "NAME")
    private String name;
    @Size(max = 40)
    @Column(name = "VALUE")
    private String value;
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

    public VwProperty() {
    }
    
    public VwProperty(VwPropertyPK vwPropertyPK) {
        this.vwPropertyPK = vwPropertyPK;
    }

    public VwProperty(VwPropertyPK vwPropertyPK, String type, String name, String value, Date datecreate, Date dateupdate) {
        this.vwPropertyPK = vwPropertyPK;
        this.name  = name;
        this.value = value;
        this.type  = type;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public VwProperty(BigInteger idinstance, BigInteger idobject, BigInteger idproperty) {
        this.vwPropertyPK = new VwPropertyPK(idinstance, idobject, idproperty);
    }

    public VwPropertyPK getVwPropertyPK() {
        return vwPropertyPK;
    }

    public void setVwPropertyPK(VwPropertyPK vwPropertyPK) {
        this.vwPropertyPK = vwPropertyPK;
    }

//    public BigInteger getId() {
//        return id;
//    }
//
//    public void setId(BigInteger id) {
//        this.id = id;
//    }
//
//    public BigInteger getIdinstance() {
//        return idinstance;
//    }
//
//    public void setIdinstance(BigInteger idinstance) {
//        this.idinstance = idinstance;
//    }
//
//    public BigInteger getIdobject() {
//        return idobject;
//    }
//
//    public void setIdobject(BigInteger idobject) {
//        this.idobject = idobject;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
