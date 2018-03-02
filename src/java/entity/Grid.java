/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boutarfa
 */
@Entity
@Table(name = "GRID")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grid.findAll", query = "SELECT g FROM Grid g"),
    @NamedQuery(name = "Grid.findById", query = "SELECT g FROM Grid g WHERE g.id = :id"),
    @NamedQuery(name = "Grid.findByName", query = "SELECT g FROM Grid g WHERE g.name = :name"),
    @NamedQuery(name = "Grid.findByDegree", query = "SELECT g FROM Grid g WHERE g.degree = :degree"),
    @NamedQuery(name = "Grid.findByDatecreate", query = "SELECT g FROM Grid g WHERE g.datecreate = :datecreate"),
    @NamedQuery(name = "Grid.findByDateupdate", query = "SELECT g FROM Grid g WHERE g.dateupdate = :dateupdate"),
    @NamedQuery(name = "Grid.findByOwner", query = "SELECT g FROM Grid g WHERE g.owner = :owner"),
    @NamedQuery(name = "Grid.findByLastuser", query = "SELECT g FROM Grid g WHERE g.lastuser = :lastuser")})
public class Grid implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "DEGREE")
    private String degree;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATECREATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateupdate;
    @Size(max = 31)
    @Column(name = "OWNER")
    private String owner;
    @Size(max = 31)
    @Column(name = "LASTUSER")
    private String lastuser;
    @JoinColumn(name = "IDELEMENT", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Element idelement;
    @JoinColumn(name = "IDRANK", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Rank idrank;

    public Grid() {
    }

    public Grid(BigDecimal id) {
        this.id = id;
    }

    public Grid(BigDecimal id, String name, String degree, Date datecreate, Date dateupdate) {
        this.id = id;
        this.name = name;
        this.degree = degree;
        this.datecreate = datecreate;
        this.dateupdate = dateupdate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Date getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(Date datecreate) {
        this.datecreate = datecreate;
    }

    public Date getDateupdate() {
        return dateupdate;
    }

    public void setDateupdate(Date dateupdate) {
        this.dateupdate = dateupdate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLastuser() {
        return lastuser;
    }

    public void setLastuser(String lastuser) {
        this.lastuser = lastuser;
    }

    public Element getIdelement() {
        return idelement;
    }

    public void setIdelement(Element idelement) {
        this.idelement = idelement;
    }

    public Rank getIdrank() {
        return idrank;
    }

    public void setIdrank(Rank idrank) {
        this.idrank = idrank;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grid)) {
            return false;
        }
        Grid other = (Grid) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Grid[ id=" + id + " ]";
    }
    
}
