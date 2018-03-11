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
@Table(name = "VW$NOTNATUREOFACCIDENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwNotnatureofaccident.findAll", query = "SELECT v FROM VwNotnatureofaccident v"),
    @NamedQuery(name = "VwNotnatureofaccident.findById", query = "SELECT v FROM VwNotnatureofaccident v WHERE v.id = :id"),
    @NamedQuery(name = "VwNotnatureofaccident.findByIdaccident", query = "SELECT v FROM VwNotnatureofaccident v WHERE v.idaccident = :idaccident"),
    @NamedQuery(name = "VwNotnatureofaccident.findByIdnature", query = "SELECT v FROM VwNotnatureofaccident v WHERE v.idnature = :idnature"),
    @NamedQuery(name = "VwNotnatureofaccident.findByName", query = "SELECT v FROM VwNotnatureofaccident v WHERE v.name = :name")})
public class VwNotnatureofaccident implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 80)
    @Column(name = "ID")
    private String id;
    @Column(name = "IDACCIDENT")
    private BigInteger idaccident;
    @Column(name = "IDNATURE")
    private BigInteger idnature;
    @Size(max = 50)
    @Column(name = "NAME")
    private String name;

    public VwNotnatureofaccident() {
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
