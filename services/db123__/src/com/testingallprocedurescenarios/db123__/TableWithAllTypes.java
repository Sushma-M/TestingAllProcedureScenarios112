/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.db123__;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * TableWithAllTypes generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`TABLE WITH ALL TYPES`")
public class TableWithAllTypes implements Serializable {

    private Integer identityId;
    private byte byteCol;
    private short shortCol;
    private float floatCol;
    private BigInteger longCol;
    private int intCol;
    private double doubleCol;
    private BigInteger bigintCol;
    private BigDecimal bigdecCol;
    private String charCol;
    private String stringCol;
    private String textCol;
    private String clobCol;
    private Date dateCol;
    private LocalDateTime datetimeCol;
    private Time timeCol;
    private LocalDateTime timestampCol;
    private Boolean booleanCol;
    @JsonProperty(access = Access.READ_ONLY)
    private byte[] blobCol;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`IDENTITY ID`", nullable = false, scale = 0, precision = 10)
    public Integer getIdentityId() {
        return this.identityId;
    }

    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    @Column(name = "`BYTE COL`", nullable = false, scale = 0, precision = 2)
    public byte getByteCol() {
        return this.byteCol;
    }

    public void setByteCol(byte byteCol) {
        this.byteCol = byteCol;
    }

    @Column(name = "`SHORT COL`", nullable = false, scale = 0, precision = 5)
    public short getShortCol() {
        return this.shortCol;
    }

    public void setShortCol(short shortCol) {
        this.shortCol = shortCol;
    }

    @Column(name = "`FLOAT COL`", nullable = false, scale = 4, precision = 8)
    public float getFloatCol() {
        return this.floatCol;
    }

    public void setFloatCol(float floatCol) {
        this.floatCol = floatCol;
    }

    @Column(name = "`LONG COL`", nullable = false, scale = 0, precision = 18)
    public BigInteger getLongCol() {
        return this.longCol;
    }

    public void setLongCol(BigInteger longCol) {
        this.longCol = longCol;
    }

    @Column(name = "`INT COL`", nullable = false, scale = 0, precision = 10)
    public int getIntCol() {
        return this.intCol;
    }

    public void setIntCol(int intCol) {
        this.intCol = intCol;
    }

    @Column(name = "`DOUBLE COL`", nullable = false, scale = 8, precision = 18)
    public double getDoubleCol() {
        return this.doubleCol;
    }

    public void setDoubleCol(double doubleCol) {
        this.doubleCol = doubleCol;
    }

    @Column(name = "`BIGINT COL`", nullable = false, scale = 0, precision = 35)
    public BigInteger getBigintCol() {
        return this.bigintCol;
    }

    public void setBigintCol(BigInteger bigintCol) {
        this.bigintCol = bigintCol;
    }

    @Column(name = "`BIGDEC COL`", nullable = false, scale = 15, precision = 35)
    public BigDecimal getBigdecCol() {
        return this.bigdecCol;
    }

    public void setBigdecCol(BigDecimal bigdecCol) {
        this.bigdecCol = bigdecCol;
    }

    @Column(name = "`CHAR COL`", nullable = false, length = 1)
    public String getCharCol() {
        return this.charCol;
    }

    public void setCharCol(String charCol) {
        this.charCol = charCol;
    }

    @Column(name = "`STRING COL`", nullable = false, length = 255)
    public String getStringCol() {
        return this.stringCol;
    }

    public void setStringCol(String stringCol) {
        this.stringCol = stringCol;
    }

    @Column(name = "`TEXT COL`", nullable = false, length = 2147483647)
    public String getTextCol() {
        return this.textCol;
    }

    public void setTextCol(String textCol) {
        this.textCol = textCol;
    }

    @Column(name = "`CLOB COL`", nullable = false, length = 2147483647)
    public String getClobCol() {
        return this.clobCol;
    }

    public void setClobCol(String clobCol) {
        this.clobCol = clobCol;
    }

    @Column(name = "`DATE COL`", nullable = false)
    public Date getDateCol() {
        return this.dateCol;
    }

    public void setDateCol(Date dateCol) {
        this.dateCol = dateCol;
    }

    @Column(name = "`DATETIME COL`", nullable = false)
    public LocalDateTime getDatetimeCol() {
        return this.datetimeCol;
    }

    public void setDatetimeCol(LocalDateTime datetimeCol) {
        this.datetimeCol = datetimeCol;
    }

    @Column(name = "`TIME COL`", nullable = false)
    public Time getTimeCol() {
        return this.timeCol;
    }

    public void setTimeCol(Time timeCol) {
        this.timeCol = timeCol;
    }

    @Column(name = "`TIMESTAMP COL`", nullable = false)
    public LocalDateTime getTimestampCol() {
        return this.timestampCol;
    }

    public void setTimestampCol(LocalDateTime timestampCol) {
        this.timestampCol = timestampCol;
    }

    @Column(name = "`BOOLEAN COL`", nullable = true)
    public Boolean getBooleanCol() {
        return this.booleanCol;
    }

    public void setBooleanCol(Boolean booleanCol) {
        this.booleanCol = booleanCol;
    }

    @Column(name = "`BLOB COL`", nullable = true)
    public byte[] getBlobCol() {
        return this.blobCol;
    }

    public void setBlobCol(byte[] blobCol) {
        this.blobCol = blobCol;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TableWithAllTypes)) return false;
        final TableWithAllTypes tableWithAllTypes = (TableWithAllTypes) o;
        return Objects.equals(getIdentityId(), tableWithAllTypes.getIdentityId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentityId());
    }
}