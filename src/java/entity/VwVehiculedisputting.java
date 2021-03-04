/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "VW$VEHICULEDISPUTTING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwVehiculedisputting.findAll", query = "SELECT v FROM VwVehiculedisputting v")
    , @NamedQuery(name = "VwVehiculedisputting.findById", query = "SELECT v FROM VwVehiculedisputting v WHERE v.id = :id")
    , @NamedQuery(name = "VwVehiculedisputting.findByIdab", query = "SELECT v FROM VwVehiculedisputting v WHERE v.idab = :idab")    
    , @NamedQuery(name = "VwVehiculedisputting.findByIdaccident", query = "SELECT v FROM VwVehiculedisputting v WHERE v.idaccident = :idaccident")
    , @NamedQuery(name = "VwVehiculedisputting.findByIddamagea", query = "SELECT v FROM VwVehiculedisputting v WHERE v.iddamagea = :iddamagea")
    , @NamedQuery(name = "VwVehiculedisputting.findByIdvehiculea", query = "SELECT v FROM VwVehiculedisputting v WHERE v.idvehiculea = :idvehiculea")
    , @NamedQuery(name = "VwVehiculedisputting.findByMarka", query = "SELECT v FROM VwVehiculedisputting v WHERE v.marka = :marka")
    , @NamedQuery(name = "VwVehiculedisputting.findByNamea", query = "SELECT v FROM VwVehiculedisputting v WHERE v.namea = :namea")
    , @NamedQuery(name = "VwVehiculedisputting.findByMatriculea", query = "SELECT v FROM VwVehiculedisputting v WHERE v.matriculea = :matriculea")
    , @NamedQuery(name = "VwVehiculedisputting.findByIddamageb", query = "SELECT v FROM VwVehiculedisputting v WHERE v.iddamageb = :iddamageb")
    , @NamedQuery(name = "VwVehiculedisputting.findByIdvehiculeb", query = "SELECT v FROM VwVehiculedisputting v WHERE v.idvehiculeb = :idvehiculeb")
    , @NamedQuery(name = "VwVehiculedisputting.findByMarkb", query = "SELECT v FROM VwVehiculedisputting v WHERE v.markb = :markb")
    , @NamedQuery(name = "VwVehiculedisputting.findByNameb", query = "SELECT v FROM VwVehiculedisputting v WHERE v.nameb = :nameb")
    , @NamedQuery(name = "VwVehiculedisputting.findByMatriculeb", query = "SELECT v FROM VwVehiculedisputting v WHERE v.matriculeb = :matriculeb")})
public class VwVehiculedisputting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 81)
    @Column(name = "IDAB")
    private String idab;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACCIDENT")
    private BigInteger idaccident;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDAMAGEA")
    private BigInteger iddamagea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDVEHICULEA")
    private BigInteger idvehiculea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "MARKA")
    private String marka;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "NAMEA")
    private String namea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "MATRICULEA")
    private String matriculea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDAMAGEB")
    private BigInteger iddamageb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDVEHICULEB")
    private BigInteger idvehiculeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "MARKB")
    private String markb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 31)
    @Column(name = "NAMEB")
    private String nameb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "MATRICULEB")
    private String matriculeb;

    public VwVehiculedisputting() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getIdab() {
        return idab;
    }

    public void setIdab(String idab) {
        this.idab = idab;
    }
    
    

    public BigInteger getIdaccident() {
        return idaccident;
    }

    public void setIdaccident(BigInteger idaccident) {
        this.idaccident = idaccident;
    }

    public BigInteger getIddamagea() {
        return iddamagea;
    }

    public void setIddamagea(BigInteger iddamagea) {
        this.iddamagea = iddamagea;
    }

    public BigInteger getIdvehiculea() {
        return idvehiculea;
    }

    public void setIdvehiculea(BigInteger idvehiculea) {
        this.idvehiculea = idvehiculea;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNamea() {
        return namea;
    }

    public void setNamea(String namea) {
        this.namea = namea;
    }

    public String getMatriculea() {
        return matriculea;
    }

    public void setMatriculea(String matriculea) {
        this.matriculea = matriculea;
    }

    public BigInteger getIddamageb() {
        return iddamageb;
    }

    public void setIddamageb(BigInteger iddamageb) {
        this.iddamageb = iddamageb;
    }

    public BigInteger getIdvehiculeb() {
        return idvehiculeb;
    }

    public void setIdvehiculeb(BigInteger idvehiculeb) {
        this.idvehiculeb = idvehiculeb;
    }

    public String getMarkb() {
        return markb;
    }

    public void setMarkb(String markb) {
        this.markb = markb;
    }

    public String getNameb() {
        return nameb;
    }

    public void setNameb(String nameb) {
        this.nameb = nameb;
    }

    public String getMatriculeb() {
        return matriculeb;
    }

    public void setMatriculeb(String matriculeb) {
        this.matriculeb = matriculeb;
    }
    
}
