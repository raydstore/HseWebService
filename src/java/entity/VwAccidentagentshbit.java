/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boutarfa
 */
@Entity
@Table(name = "VW$ACCIDENTAGENTSHBIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwAccidentagentshbit.findAll", query = "SELECT v FROM VwAccidentagentshbit v"),
    @NamedQuery(name = "VwAccidentagentshbit.findById", query = "SELECT v FROM VwAccidentagentshbit v WHERE v.id = :id"),
    @NamedQuery(name = "VwAccidentagentshbit.findByIddamage", query = "SELECT v FROM VwAccidentagentshbit v WHERE v.iddamage = :iddamage"),
    @NamedQuery(name = "VwAccidentagentshbit.findByIdagent", query = "SELECT v FROM VwAccidentagentshbit v WHERE v.idagent = :idagent"),
    @NamedQuery(name = "VwAccidentagentshbit.findByIdgrid", query = "SELECT v FROM VwAccidentagentshbit v WHERE v.idgrid = :idgrid"),
    @NamedQuery(name = "VwAccidentagentshbit.findByIdbitclass", query = "SELECT v FROM VwAccidentagentshbit v WHERE v.idbitclass = :idbitclass"),
    @NamedQuery(name = "VwAccidentagentshbit.findByClassname", query = "SELECT v FROM VwAccidentagentshbit v WHERE v.classname = :classname"),
    @NamedQuery(name = "VwAccidentagentshbit.findByName", query = "SELECT v FROM VwAccidentagentshbit v WHERE v.name = :name"),
    @NamedQuery(name = "VwAccidentagentshbit.findByIddamageIdagentIdgrid", query = "SELECT v FROM VwAccidentagentshbit v WHERE v.iddamage = :iddamage and v.idgrid = :idgrid and  v.idagent = :idagent")
})
public class VwAccidentagentshbit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 50)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDAMAGE")
    private BigInteger iddamage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "IDAGENT")
    private String idagent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idgrid")
    private BigInteger idgrid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "IDBITCLASS")
    private String idbitclass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "CLASSNAME")
    private String classname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 72)
    @Column(name = "NAME")
    private String name;

    public VwAccidentagentshbit() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigInteger getIddamage() {
        return iddamage;
    }

    public void setIddamage(BigInteger iddamage) {
        this.iddamage = iddamage;
    }

    public String getIdagent() {
        return idagent;
    }

    public void setIdagent(String idagent) {
        this.idagent = idagent;
    }

    public BigInteger getIdgrid() {
        return idgrid;
    }

    public void setIdgrid(BigInteger idgrid) {
        this.idgrid = idgrid;
    }
    
    public String getIdbitclass() {
        return idbitclass;
    }

    public void setIdbitclass(String idbitclass) {
        this.idbitclass = idbitclass;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
