/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.db123__;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

public class AllExternalTypesId implements Serializable {

    private BigInteger bigintCol;
    private Boolean bitCol;
    private String char10Col;
    private Date dateCol;
    private LocalDateTime datetimeCol;
    private BigInteger decimal18p0s;
    private BigDecimal floatCol;
    private Integer intCol;
    private BigInteger numeric18p0s;
    private Short smallintCol;
    private String textCol;
    private Time timeCol;
    private Timestamp timestampCol;
    private Short tinyintCol;
    private String varchar50Col;
    private String uuidCol;

    public BigInteger getBigintCol() {
        return this.bigintCol;
    }

    public void setBigintCol(BigInteger bigintCol) {
        this.bigintCol = bigintCol;
    }

    public Boolean getBitCol() {
        return this.bitCol;
    }

    public void setBitCol(Boolean bitCol) {
        this.bitCol = bitCol;
    }

    public String getChar10Col() {
        return this.char10Col;
    }

    public void setChar10Col(String char10Col) {
        this.char10Col = char10Col;
    }

    public Date getDateCol() {
        return this.dateCol;
    }

    public void setDateCol(Date dateCol) {
        this.dateCol = dateCol;
    }

    public LocalDateTime getDatetimeCol() {
        return this.datetimeCol;
    }

    public void setDatetimeCol(LocalDateTime datetimeCol) {
        this.datetimeCol = datetimeCol;
    }

    public BigInteger getDecimal18p0s() {
        return this.decimal18p0s;
    }

    public void setDecimal18p0s(BigInteger decimal18p0s) {
        this.decimal18p0s = decimal18p0s;
    }

    public BigDecimal getFloatCol() {
        return this.floatCol;
    }

    public void setFloatCol(BigDecimal floatCol) {
        this.floatCol = floatCol;
    }

    public Integer getIntCol() {
        return this.intCol;
    }

    public void setIntCol(Integer intCol) {
        this.intCol = intCol;
    }

    public BigInteger getNumeric18p0s() {
        return this.numeric18p0s;
    }

    public void setNumeric18p0s(BigInteger numeric18p0s) {
        this.numeric18p0s = numeric18p0s;
    }

    public Short getSmallintCol() {
        return this.smallintCol;
    }

    public void setSmallintCol(Short smallintCol) {
        this.smallintCol = smallintCol;
    }

    public String getTextCol() {
        return this.textCol;
    }

    public void setTextCol(String textCol) {
        this.textCol = textCol;
    }

    public Time getTimeCol() {
        return this.timeCol;
    }

    public void setTimeCol(Time timeCol) {
        this.timeCol = timeCol;
    }

    public Timestamp getTimestampCol() {
        return this.timestampCol;
    }

    public void setTimestampCol(Timestamp timestampCol) {
        this.timestampCol = timestampCol;
    }

    public Short getTinyintCol() {
        return this.tinyintCol;
    }

    public void setTinyintCol(Short tinyintCol) {
        this.tinyintCol = tinyintCol;
    }

    public String getVarchar50Col() {
        return this.varchar50Col;
    }

    public void setVarchar50Col(String varchar50Col) {
        this.varchar50Col = varchar50Col;
    }

    public String getUuidCol() {
        return this.uuidCol;
    }

    public void setUuidCol(String uuidCol) {
        this.uuidCol = uuidCol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AllExternalTypes)) return false;
        final AllExternalTypes allExternalTypes = (AllExternalTypes) o;
        return Objects.equals(getBigintCol(), allExternalTypes.getBigintCol()) &&
                Objects.equals(getBitCol(), allExternalTypes.getBitCol()) &&
                Objects.equals(getChar10Col(), allExternalTypes.getChar10Col()) &&
                Objects.equals(getDateCol(), allExternalTypes.getDateCol()) &&
                Objects.equals(getDatetimeCol(), allExternalTypes.getDatetimeCol()) &&
                Objects.equals(getDecimal18p0s(), allExternalTypes.getDecimal18p0s()) &&
                Objects.equals(getFloatCol(), allExternalTypes.getFloatCol()) &&
                Objects.equals(getIntCol(), allExternalTypes.getIntCol()) &&
                Objects.equals(getNumeric18p0s(), allExternalTypes.getNumeric18p0s()) &&
                Objects.equals(getSmallintCol(), allExternalTypes.getSmallintCol()) &&
                Objects.equals(getTextCol(), allExternalTypes.getTextCol()) &&
                Objects.equals(getTimeCol(), allExternalTypes.getTimeCol()) &&
                Objects.equals(getTimestampCol(), allExternalTypes.getTimestampCol()) &&
                Objects.equals(getTinyintCol(), allExternalTypes.getTinyintCol()) &&
                Objects.equals(getVarchar50Col(), allExternalTypes.getVarchar50Col()) &&
                Objects.equals(getUuidCol(), allExternalTypes.getUuidCol());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBigintCol(),
                getBitCol(),
                getChar10Col(),
                getDateCol(),
                getDatetimeCol(),
                getDecimal18p0s(),
                getFloatCol(),
                getIntCol(),
                getNumeric18p0s(),
                getSmallintCol(),
                getTextCol(),
                getTimeCol(),
                getTimestampCol(),
                getTinyintCol(),
                getVarchar50Col(),
                getUuidCol());
    }
}