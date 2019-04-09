/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * Db2alltypes1 generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`DB2ALLTYPES1`", uniqueConstraints = {
            @UniqueConstraint(name = "`SQL161228093827250`", columnNames = {"`SMALLINTCOL`"})})
public class Db2alltypes1 implements Serializable {

    private Integer intcol;
    private short smallintcol;
    private BigInteger bigintcol;
    private BigDecimal bigdeccol;
    private BigDecimal floatcol;
    private Long longcol;
    private Character charcol;
    private String stringcol;
    private String textcol;
    private BigDecimal doublecol;
    @JsonProperty(access = Access.READ_ONLY)
    private byte[] blobcol;
    private Date datecol;
    private Time timecol;
    private Timestamp timestampcol;

    @Id
    @Column(name = "`INTCOL`", nullable = false, scale = 0, precision = 10)
    public Integer getIntcol() {
        return this.intcol;
    }

    public void setIntcol(Integer intcol) {
        this.intcol = intcol;
    }

    @Column(name = "`SMALLINTCOL`", nullable = false, scale = 0, precision = 5)
    public short getSmallintcol() {
        return this.smallintcol;
    }

    public void setSmallintcol(short smallintcol) {
        this.smallintcol = smallintcol;
    }

    @Column(name = "`BIGINTCOL`", nullable = true, scale = 0, precision = 20)
    public BigInteger getBigintcol() {
        return this.bigintcol;
    }

    public void setBigintcol(BigInteger bigintcol) {
        this.bigintcol = bigintcol;
    }

    @Column(name = "`BIGDECCOL`", nullable = true, scale = 15, precision = 31)
    public BigDecimal getBigdeccol() {
        return this.bigdeccol;
    }

    public void setBigdeccol(BigDecimal bigdeccol) {
        this.bigdeccol = bigdeccol;
    }

    @Column(name = "`FLOATCOL`", nullable = true, scale = 9, precision = 53)
    public BigDecimal getFloatcol() {
        return this.floatcol;
    }

    public void setFloatcol(BigDecimal floatcol) {
        this.floatcol = floatcol;
    }

    @Column(name = "`LONGCOL`", nullable = true, scale = 0, precision = 18)
    public Long getLongcol() {
        return this.longcol;
    }

    public void setLongcol(Long longcol) {
        this.longcol = longcol;
    }

    @Column(name = "`CHARCOL`", nullable = true, length = 1)
    public Character getCharcol() {
        return this.charcol;
    }

    public void setCharcol(Character charcol) {
        this.charcol = charcol;
    }

    @Column(name = "`STRINGCOL`", nullable = true, length = 255)
    public String getStringcol() {
        return this.stringcol;
    }

    public void setStringcol(String stringcol) {
        this.stringcol = stringcol;
    }

    @Column(name = "`TEXTCOL`", nullable = true, length = 2255)
    public String getTextcol() {
        return this.textcol;
    }

    public void setTextcol(String textcol) {
        this.textcol = textcol;
    }

    @Column(name = "`DOUBLECOL`", nullable = true, scale = 9, precision = 53)
    public BigDecimal getDoublecol() {
        return this.doublecol;
    }

    public void setDoublecol(BigDecimal doublecol) {
        this.doublecol = doublecol;
    }

    @Column(name = "`BLOBCOL`", nullable = true)
    public byte[] getBlobcol() {
        return this.blobcol;
    }

    public void setBlobcol(byte[] blobcol) {
        this.blobcol = blobcol;
    }

    @Column(name = "`DATECOL`", nullable = true)
    public Date getDatecol() {
        return this.datecol;
    }

    public void setDatecol(Date datecol) {
        this.datecol = datecol;
    }

    @Column(name = "`TIMECOL`", nullable = true)
    public Time getTimecol() {
        return this.timecol;
    }

    public void setTimecol(Time timecol) {
        this.timecol = timecol;
    }

    @Column(name = "`TIMESTAMPCOL`", nullable = true)
    public Timestamp getTimestampcol() {
        return this.timestampcol;
    }

    public void setTimestampcol(Timestamp timestampcol) {
        this.timestampcol = timestampcol;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Db2alltypes1)) return false;
        final Db2alltypes1 db2alltypes1 = (Db2alltypes1) o;
        return Objects.equals(getIntcol(), db2alltypes1.getIntcol());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIntcol());
    }
}