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
@Table(name = "VW$LISTREPORTOFACCIDENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwListreportofaccident.findAll", query = "SELECT v FROM VwListreportofaccident v")
    , @NamedQuery(name = "VwListreportofaccident.findById", query = "SELECT v FROM VwListreportofaccident v WHERE v.id = :id")
    , @NamedQuery(name = "VwListreportofaccident.findByIdaccident", query = "SELECT v FROM VwListreportofaccident v WHERE v.idaccident = :idaccident")
    , @NamedQuery(name = "VwListreportofaccident.findByLabel", query = "SELECT v FROM VwListreportofaccident v WHERE v.label = :label")
    , @NamedQuery(name = "VwListreportofaccident.findByName", query = "SELECT v FROM VwListreportofaccident v WHERE v.name = :name")
    , @NamedQuery(name = "VwListreportofaccident.findByEnable", query = "SELECT v FROM VwListreportofaccident v WHERE v.enable = :enable")})
public class VwListreportofaccident implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 80)
    @Column(name = "ID")
    private String id;
    @Column(name = "IDACCIDENT")
    private BigInteger idaccident;
    @Size(max = 64)
    @Column(name = "LABEL")
    private String label;
    @Size(max = 31)
    @Column(name = "NAME")
    private String name;
    @Column(name = "ENABLE")
    private BigInteger enable;

    public VwListreportofaccident() {
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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getEnable() {
        return enable;
    }

    public void setEnable(BigInteger enable) {
        this.enable = enable;
    }
    
}
