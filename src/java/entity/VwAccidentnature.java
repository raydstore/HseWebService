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
@Table(name = "VW$ACCIDENTNATURE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwAccidentnature.findAll", query = "SELECT v FROM VwAccidentnature v"),
    @NamedQuery(name = "VwAccidentnature.findById", query = "SELECT v FROM VwAccidentnature v WHERE v.id = :id"),
    @NamedQuery(name = "VwAccidentnature.findByIdaccident", query = "SELECT v FROM VwAccidentnature v WHERE v.idaccident = :idaccident"),
    @NamedQuery(name = "VwAccidentnature.findByIdnature", query = "SELECT v FROM VwAccidentnature v WHERE v.idnature = :idnature"),
    @NamedQuery(name = "VwAccidentnature.findByName", query = "SELECT v FROM VwAccidentnature v WHERE v.name = :name"),
    @NamedQuery(name = "VwAccidentnature.findByAccidentNature", query = "SELECT v FROM VwAccidentnature v WHERE v.idaccident = :idaccident and v.idnature = :idnature")
})
public class VwAccidentnature implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 80)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACCIDENT")
    private BigInteger idaccident;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATURE")
    private BigInteger idnature;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NAME")
    private String name;

    public VwAccidentnature() {
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

    public BigInteger getIdnature() {
        return idnature;
    }

    public void setIdnature(BigInteger idnature) {
        this.idnature = idnature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
