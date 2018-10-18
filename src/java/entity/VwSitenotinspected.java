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
@Table(name = "VW$SITENOTINSPECTED")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwSitenotinspected.findAll", query = "SELECT v FROM VwSitenotinspected v")
    , @NamedQuery(name = "VwSitenotinspected.findById", query = "SELECT v FROM VwSitenotinspected v WHERE v.id = :id")
    , @NamedQuery(name = "VwSitenotinspected.findByName", query = "SELECT v FROM VwSitenotinspected v WHERE v.name = :name")})
public class VwSitenotinspected implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Size(max = 31)
    @Column(name = "NAME")
    private String name;

    public VwSitenotinspected() {
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
