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
@Table(name = "VW$DAMAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDamage.findAll", query = "SELECT v FROM VwDamage v"),
    @NamedQuery(name = "VwDamage.findById", query = "SELECT v FROM VwDamage v WHERE v.id = :id"),
    @NamedQuery(name = "VwDamage.findByIdaccident", query = "SELECT v FROM VwDamage v WHERE v.idaccident = :idaccident"),
    @NamedQuery(name = "VwDamage.findByIdnature", query = "SELECT v FROM VwDamage v WHERE v.idnature = :idnature"),
    @NamedQuery(name = "VwDamage.findByAccidentdomain", query = "SELECT v FROM VwDamage v WHERE v.accidentdomain = :accidentdomain"),
    @NamedQuery(name = "VwDamage.findByIdgrid", query = "SELECT v FROM VwDamage v WHERE v.idgrid = :idgrid"),
    @NamedQuery(name = "VwDamage.findByIdrank", query = "SELECT v FROM VwDamage v WHERE v.idrank = :idrank"),
    @NamedQuery(name = "VwDamage.findByName", query = "SELECT v FROM VwDamage v WHERE v.name = :name"),
    @NamedQuery(name = "VwDamage.findByAccidentNatureAccidentdomain", query = "SELECT v FROM VwDamage v WHERE v.idaccident = :idaccident and v.idnature = :idnature and v.accidentdomain = :accidentdomain"),
})
public class VwDamage implements Serializable {
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
    @Column(name = "IDNATURE")
    private BigInteger idnature;
    @Column(name = "ACCIDENTDOMAIN")
    private Short accidentdomain;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGRID")
    private BigInteger idgrid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDRANK")
    private BigInteger idrank;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NAME")
    private String name;

    public VwDamage() {
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

    public BigInteger getIdnature() {
        return idnature;
    }

    public void setIdnature(BigInteger idnature) {
        this.idnature = idnature;
    }

    public Short getAccidentdomain() {
        return accidentdomain;
    }

    public void setAccidentdomain(Short accidentdomain) {
        this.accidentdomain = accidentdomain;
    }

    public BigInteger getIdgrid() {
        return idgrid;
    }

    public void setIdgrid(BigInteger idgrid) {
        this.idgrid = idgrid;
    }

    public BigInteger getIdrank() {
        return idrank;
    }

    public void setIdrank(BigInteger idrank) {
        this.idrank = idrank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
