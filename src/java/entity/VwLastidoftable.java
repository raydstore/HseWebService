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
@Table(name = "VW$LASTIDOFTABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwLastidoftable.findAll", query = "SELECT v FROM VwLastidoftable v"),
    @NamedQuery(name = "VwLastidoftable.findById", query = "SELECT v FROM VwLastidoftable v WHERE v.id = :id"),
    @NamedQuery(name = "VwLastidoftable.findByCount", query = "SELECT v FROM VwLastidoftable v WHERE v.count = :count")})
public class VwLastidoftable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 10)
    @Column(name = "ID")
    private String id;
    @Column(name = "COUNT")
    private BigInteger count;

    public VwLastidoftable() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger count) {
        this.count = count;
    }
    
}
