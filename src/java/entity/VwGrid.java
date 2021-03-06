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
@Table(name = "VW$GRID")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwGrid.findAll", query = "SELECT v FROM VwGrid v"),
    @NamedQuery(name = "VwGrid.findById", query = "SELECT v FROM VwGrid v WHERE v.id = :id"),
    @NamedQuery(name = "VwGrid.findByCol1", query = "SELECT v FROM VwGrid v WHERE v.col1 = :col1"),
    @NamedQuery(name = "VwGrid.findByCol2", query = "SELECT v FROM VwGrid v WHERE v.col2 = :col2"),
    @NamedQuery(name = "VwGrid.findByCol3", query = "SELECT v FROM VwGrid v WHERE v.col3 = :col3"),
    @NamedQuery(name = "VwGrid.findByCol4", query = "SELECT v FROM VwGrid v WHERE v.col4 = :col4"),
    @NamedQuery(name = "VwGrid.findByCol5", query = "SELECT v FROM VwGrid v WHERE v.col5 = :col5"),
    @NamedQuery(name = "VwGrid.findByCol6", query = "SELECT v FROM VwGrid v WHERE v.col6 = :col6"),
    @NamedQuery(name = "VwGrid.findByCol7", query = "SELECT v FROM VwGrid v WHERE v.col7 = :col7")})
public class VwGrid implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigInteger id;
    @Size(max = 100)
    @Column(name = "COL1")
    private String col1;
    @Size(max = 100)
    @Column(name = "COL2")
    private String col2;
    @Size(max = 100)
    @Column(name = "COL3")
    private String col3;
    @Size(max = 100)
    @Column(name = "COL4")
    private String col4;
    @Size(max = 100)
    @Column(name = "COL5")
    private String col5;
    @Size(max = 100)
    @Column(name = "COL6")
    private String col6;
    @Size(max = 100)
    @Column(name = "COL7")
    private String col7;

    public VwGrid() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getCol1() {
        return col1;
    }

    public void setCol1(String col1) {
        this.col1 = col1;
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }

    public String getCol3() {
        return col3;
    }

    public void setCol3(String col3) {
        this.col3 = col3;
    }

    public String getCol4() {
        return col4;
    }

    public void setCol4(String col4) {
        this.col4 = col4;
    }

    public String getCol5() {
        return col5;
    }

    public void setCol5(String col5) {
        this.col5 = col5;
    }

    public String getCol6() {
        return col6;
    }

    public void setCol6(String col6) {
        this.col6 = col6;
    }

    public String getCol7() {
        return col7;
    }

    public void setCol7(String col7) {
        this.col7 = col7;
    }
    
}
