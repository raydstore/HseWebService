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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boutarfa
 */
@Entity
@Table(name = "VW$DAMAGEACCIDENTNATURE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDamageaccidentnature.findAll", query = "SELECT v FROM VwDamageaccidentnature v"),
    @NamedQuery(name = "VwDamageaccidentnature.findByIdaccident", query = "SELECT v FROM VwDamageaccidentnature v WHERE v.idaccident = :idaccident"),
    @NamedQuery(name = "VwDamageaccidentnature.findByIdnature", query = "SELECT v FROM VwDamageaccidentnature v WHERE v.idnature = :idnature"),
    @NamedQuery(name = "VwDamageaccidentnature.findByIddamage", query = "SELECT v FROM VwDamageaccidentnature v WHERE v.iddamage = :iddamage"),
    @NamedQuery(name = "VwDamageaccidentnature.findByIdgrid", query = "SELECT v FROM VwDamageaccidentnature v WHERE v.idgrid = :idgrid"),
    @NamedQuery(name = "VwDamageaccidentnature.findByAccidentNature", query = "SELECT v FROM VwDamageaccidentnature v WHERE v.idaccident = :idaccident and v.idnature = :idnature")
})
public class VwDamageaccidentnature implements Serializable {
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDAMAGE")
    private BigInteger iddamage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGRID")
    private BigInteger idgrid;

    public VwDamageaccidentnature() {
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

    public BigInteger getIddamage() {
        return iddamage;
    }

    public void setIddamage(BigInteger iddamage) {
        this.iddamage = iddamage;
    }

    public BigInteger getIdgrid() {
        return idgrid;
    }

    public void setIdgrid(BigInteger idgrid) {
        this.idgrid = idgrid;
    }
    
}
