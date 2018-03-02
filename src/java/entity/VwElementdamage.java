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
@Table(name = "VW$ELEMENTDAMAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwElementdamage.findAll", query = "SELECT v FROM VwElementdamage v"),
    @NamedQuery(name = "VwElementdamage.findByIdaccident", query = "SELECT v FROM VwElementdamage v WHERE v.idaccident = :idaccident"),
    @NamedQuery(name = "VwElementdamage.findByIdnature", query = "SELECT v FROM VwElementdamage v WHERE v.idnature = :idnature"),
    @NamedQuery(name = "VwElementdamage.findByAccidentdomain", query = "SELECT v FROM VwElementdamage v WHERE v.accidentdomain = :accidentdomain"),
    @NamedQuery(name = "VwElementdamage.findByName", query = "SELECT v FROM VwElementdamage v WHERE v.name = :name"),
    @NamedQuery(name = "VwElementdamage.findByAccidentNature", query = "SELECT v FROM VwElementdamage v WHERE v.idaccident = :idaccident and v.idnature = :idnature"),
})
public class VwElementdamage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACCIDENT")
    private BigInteger idaccident;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATURE")
    private BigInteger idnature;
    @Id
    @Column(name = "ACCIDENTDOMAIN")
    private Short accidentdomain;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NAME")
    private String name;

    public VwElementdamage() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
