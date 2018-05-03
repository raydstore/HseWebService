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
@Table(name = "VW$NOTELEMENTOFNATUREACCIDENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwNotelementofnatureaccident.findAll", query = "SELECT v FROM VwNotelementofnatureaccident v"),
    @NamedQuery(name = "VwNotelementofnatureaccident.findById", query = "SELECT v FROM VwNotelementofnatureaccident v WHERE v.id = :id"),
    @NamedQuery(name = "VwNotelementofnatureaccident.findByIdaccident", query = "SELECT v FROM VwNotelementofnatureaccident v WHERE v.idaccident = :idaccident"),
    @NamedQuery(name = "VwNotelementofnatureaccident.findByIdnature", query = "SELECT v FROM VwNotelementofnatureaccident v WHERE v.idnature = :idnature"),
    @NamedQuery(name = "VwNotelementofnatureaccident.findByIdelement", query = "SELECT v FROM VwNotelementofnatureaccident v WHERE v.idelement = :idelement"),
    @NamedQuery(name = "VwNotelementofnatureaccident.findByName", query = "SELECT v FROM VwNotelementofnatureaccident v WHERE v.name = :name")})
public class VwNotelementofnatureaccident implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Column(name = "IDACCIDENT")
    private BigInteger idaccident;
    @Column(name = "IDNATURE")
    private BigInteger idnature;
    @Column(name = "IDELEMENT")
    private BigInteger idelement;
    @Size(max = 50)
    @Column(name = "NAME")
    private String name;

    public VwNotelementofnatureaccident() {
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

    public BigInteger getIdelement() {
        return idelement;
    }

    public void setIdelement(BigInteger idelement) {
        this.idelement = idelement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
