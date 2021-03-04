/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boutarfa
 */
@Entity
@Table(name = "VW$SCHEMAVEHICULEDISPUTTING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwSchemavehiculedisputting.findAll", query = "SELECT v FROM VwSchemavehiculedisputting v")
    , @NamedQuery(name = "VwSchemavehiculedisputting.findById", query = "SELECT v FROM VwSchemavehiculedisputting v WHERE v.id = :id")
    , @NamedQuery(name = "VwSchemavehiculedisputting.findByIdaccident", query = "SELECT v FROM VwSchemavehiculedisputting v WHERE v.idaccident = :idaccident")
    , @NamedQuery(name = "VwSchemavehiculedisputting.findByIddamagea", query = "SELECT v FROM VwSchemavehiculedisputting v WHERE v.iddamagea = :iddamagea")
    , @NamedQuery(name = "VwSchemavehiculedisputting.findByIdvehiculea", query = "SELECT v FROM VwSchemavehiculedisputting v WHERE v.idvehiculea = :idvehiculea")
    , @NamedQuery(name = "VwSchemavehiculedisputting.findByMarka", query = "SELECT v FROM VwSchemavehiculedisputting v WHERE v.marka = :marka")
    , @NamedQuery(name = "VwSchemavehiculedisputting.findByNamea", query = "SELECT v FROM VwSchemavehiculedisputting v WHERE v.namea = :namea")
    , @NamedQuery(name = "VwSchemavehiculedisputting.findByMatriculea", query = "SELECT v FROM VwSchemavehiculedisputting v WHERE v.matriculea = :matriculea")
    , @NamedQuery(name = "VwSchemavehiculedisputting.findByIddamageb", query = "SELECT v FROM VwSchemavehiculedisputting v WHERE v.iddamageb = :iddamageb")
    , @NamedQuery(name = "VwSchemavehiculedisputting.findByIdvehiculeb", query = "SELECT v FROM VwSchemavehiculedisputting v WHERE v.idvehiculeb = :idvehiculeb")
    , @NamedQuery(name = "VwSchemavehiculedisputting.findByMarkb", query = "SELECT v FROM VwSchemavehiculedisputting v WHERE v.markb = :markb")
    , @NamedQuery(name = "VwSchemavehiculedisputting.findByNameb", query = "SELECT v FROM VwSchemavehiculedisputting v WHERE v.nameb = :nameb")
    , @NamedQuery(name = "VwSchemavehiculedisputting.findByMatriculeb", query = "SELECT v FROM VwSchemavehiculedisputting v WHERE v.matriculeb = :matriculeb")})
public class VwSchemavehiculedisputting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 81)
    @Column(name = "ID")
    private String id;
    @Column(name = "IDACCIDENT")
    private BigInteger idaccident;
    @Column(name = "IDDAMAGEA")
    private BigInteger iddamagea;
    @Column(name = "IDVEHICULEA")
    private BigInteger idvehiculea;
    @Size(max = 31)
    @Column(name = "MARKA")
    private String marka;
    @Size(max = 31)
    @Column(name = "NAMEA")
    private String namea;
    @Size(max = 14)
    @Column(name = "MATRICULEA")
    private String matriculea;
    @Column(name = "IDDAMAGEB")
    private BigInteger iddamageb;
    @Column(name = "IDVEHICULEB")
    private BigInteger idvehiculeb;
    @Size(max = 31)
    @Column(name = "MARKB")
    private String markb;
    @Size(max = 31)
    @Column(name = "NAMEB")
    private String nameb;
    @Size(max = 31)
    @Column(name = "MATRICULEB")
    private String matriculeb;

    public VwSchemavehiculedisputting() {
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
