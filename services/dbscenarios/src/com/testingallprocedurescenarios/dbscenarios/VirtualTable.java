/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.dbscenarios;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * VirtualTable generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`VIRTUAL_TABLE`", uniqueConstraints = {
            @UniqueConstraint(name = "`UK_VIRTUAL_TABLE_STRING_DZEdf`", columnNames = {"`STRING COL`", "`DATE COL`"})})
public class VirtualTable implements Serializable {

    private String charCol;
    private Date dateCol;
    private Double doubleCol;
    private BigDecimal bigdecCol;
    private Character stringCol;

    @Id
    @Column(name = "`CHAR COL`", nullable = true, length = 1)
    public String getCharCol() {
        return this.charCol;
    }

    public void setCharCol(String charCol) {
        this.charCol = charCol;
    }

    @Column(name = "`DATE COL`", nullable = true)
    public Date getDateCol() {
        return this.dateCol;
    }

    public void setDateCol(Date dateCol) {
        this.dateCol = dateCol;
    }

    @Column(name = "`DOUBLE COL`", nullable = true, scale = 8, precision = 18)
    public Double getDoubleCol() {
        return this.doubleCol;
    }

    public void setDoubleCol(Double doubleCol) {
        this.doubleCol = doubleCol;
    }

    @Column(name = "`BIGDEC COL`", nullable = true, scale = 15, precision = 35)
    public BigDecimal getBigdecCol() {
        return this.bigdecCol;
    }

    public void setBigdecCol(BigDecimal bigdecCol) {
        this.bigdecCol = bigdecCol;
    }

    @Column(name = "`STRING COL`", nullable = true, length = 1)
    public Character getStringCol() {
        return this.stringCol;
    }

    public void setStringCol(Character stringCol) {
        this.stringCol = stringCol;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VirtualTable)) return false;
        final VirtualTable virtualTable = (VirtualTable) o;
        return Objects.equals(getCharCol(), virtualTable.getCharCol());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCharCol());
    }
}