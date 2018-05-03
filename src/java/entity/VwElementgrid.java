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
@Table(name = "VW$ELEMENTGRID")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwElementgrid.findAll", query = "SELECT v FROM VwElementgrid v"),
    @NamedQuery(name = "VwElementgrid.findByIdnature", query = "SELECT v FROM VwElementgrid v WHERE v.idnature = :idnature"),
    @NamedQuery(name = "VwElementgrid.findByAccidentdomain", query = "SELECT v FROM VwElementgrid v WHERE v.accidentdomain = :accidentdomain"),
    @NamedQuery(name = "VwElementgrid.findById", query = "SELECT v FROM VwElementgrid v WHERE v.id = :id"),
    @NamedQuery(name = "VwElementgrid.findByName", query = "SELECT v FROM VwElementgrid v WHERE v.name = :name")})
public class VwElementgrid implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATURE")
    private BigInteger idnature;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCIDENTDOMAIN")
    private short accidentdomain;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigInteger id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NAME")
    private String name;

    public VwElementgrid() {
    }

    public BigInteger getIdnature() {
        return idnature;
    }

    public void setIdnature(BigInteger idnature) {
        this.idnature = idnature;
    }

    public short getAccidentdomain() {
        return accidentdomain;
    }

    public void setAccidentdomain(short accidentdomain) {
        this.accidentdomain = accidentdomain;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
