/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.dbscenarios.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wavemaker.commons.json.serializer.ByteArrayToStringSerializer;
import com.wavemaker.commons.json.views.JsonViews.BlobAsUrlView;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class SvGetSingleRecordResponse implements Serializable {


    @ColumnAlias("PK ID")
    private Integer pkId;

    @ColumnAlias("BYTE COL")
    private Short byteCol;

    @ColumnAlias("SHORT COL")
    private Short shortCol;

    @ColumnAlias("INT COL")
    private Integer intCol;

    @ColumnAlias("LONG COL")
    private BigInteger longCol;

    @ColumnAlias("FLOAT COL")
    private Float floatCol;

    @ColumnAlias("DOUBLE COL")
    private Double doubleCol;

    @ColumnAlias("BIGDEC COL")
    private BigDecimal bigdecCol;

    @ColumnAlias("BIGINT COL")
    private BigInteger bigintCol;

    @ColumnAlias("CHAR COL")
    private String charCol;

    @ColumnAlias("STRING COL")
    private String stringCol;

    @ColumnAlias("TEXT COL")
    private String textCol;

    @ColumnAlias("CLOB COL")
    private String clobCol;

    @ColumnAlias("DATE COL")
    private Date dateCol;

    @ColumnAlias("TIME COL")
    private Time timeCol;

    @ColumnAlias("DATETIME COL")
    private LocalDateTime datetimeCol;

    @ColumnAlias("TIMESTAMP COL")
    private Timestamp timestampCol;

    @ColumnAlias("BOOLEAN COL")
    private Boolean booleanCol;

        @JsonView(BlobAsUrlView.class)
    @JsonSerialize(using = ByteArrayToStringSerializer.class)
    @JsonProperty(access = Access.READ_ONLY)
    @ColumnAlias("BLOB COL")
    private byte[] blobCol;

    public Integer getPkId() {
        return this.pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public Short getByteCol() {
        return this.byteCol;
    }

    public void setByteCol(Short byteCol) {
        this.byteCol = byteCol;
    }

    public Short getShortCol() {
        return this.shortCol;
    }

    public void setShortCol(Short shortCol) {
        this.shortCol = shortCol;
    }

    public Integer getIntCol() {
        return this.intCol;
    }

    public void setIntCol(Integer intCol) {
        this.intCol = intCol;
    }

    public BigInteger getLongCol() {
        return this.longCol;
    }

    public void setLongCol(BigInteger longCol) {
        this.longCol = longCol;
    }

    public Float getFloatCol() {
        return this.floatCol;
    }

    public void setFloatCol(Float floatCol) {
        this.floatCol = floatCol;
    }

    public Double getDoubleCol() {
        return this.doubleCol;
    }

    public void setDoubleCol(Double doubleCol) {
        this.doubleCol = doubleCol;
    }

    public BigDecimal getBigdecCol() {
        return this.bigdecCol;
    }

    public void setBigdecCol(BigDecimal bigdecCol) {
        this.bigdecCol = bigdecCol;
    }

    public BigInteger getBigintCol() {
        return this.bigintCol;
    }

    public void setBigintCol(BigInteger bigintCol) {
        this.bigintCol = bigintCol;
    }

    public String getCharCol() {
        return this.charCol;
    }

    public void setCharCol(String charCol) {
        this.charCol = charCol;
    }

    public String getStringCol() {
        return this.stringCol;
    }

    public void setStringCol(String stringCol) {
        this.stringCol = stringCol;
    }

    public String getTextCol() {
        return this.textCol;
    }

    public void setTextCol(String textCol) {
        this.textCol = textCol;
    }

    public String getClobCol() {
        return this.clobCol;
    }

    public void setClobCol(String clobCol) {
        this.clobCol = clobCol;
    }

    public Date getDateCol() {
        return this.dateCol;
    }

    public void setDateCol(Date dateCol) {
        this.dateCol = dateCol;
    }

    public Time getTimeCol() {
        return this.timeCol;
    }

    public void setTimeCol(Time timeCol) {
        this.timeCol = timeCol;
    }

    public LocalDateTime getDatetimeCol() {
        return this.datetimeCol;
    }

    public void setDatetimeCol(LocalDateTime datetimeCol) {
        this.datetimeCol = datetimeCol;
    }

    public Timestamp getTimestampCol() {
        return this.timestampCol;
    }

    public void setTimestampCol(Timestamp timestampCol) {
        this.timestampCol = timestampCol;
    }

    public Boolean getBooleanCol() {
        return this.booleanCol;
    }

    public void setBooleanCol(Boolean booleanCol) {
        this.booleanCol = booleanCol;
    }

    public byte[] getBlobCol() {
        return this.blobCol;
    }

    public void setBlobCol(byte[] blobCol) {
        this.blobCol = blobCol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SvGetSingleRecordResponse)) return false;
        final SvGetSingleRecordResponse svGetSingleRecordResponse = (SvGetSingleRecordResponse) o;
        return Objects.equals(getPkId(), svGetSingleRecordResponse.getPkId()) &&
                Objects.equals(getByteCol(), svGetSingleRecordResponse.getByteCol()) &&
                Objects.equals(getShortCol(), svGetSingleRecordResponse.getShortCol()) &&
                Objects.equals(getIntCol(), svGetSingleRecordResponse.getIntCol()) &&
                Objects.equals(getLongCol(), svGetSingleRecordResponse.getLongCol()) &&
                Objects.equals(getFloatCol(), svGetSingleRecordResponse.getFloatCol()) &&
                Objects.equals(getDoubleCol(), svGetSingleRecordResponse.getDoubleCol()) &&
                Objects.equals(getBigdecCol(), svGetSingleRecordResponse.getBigdecCol()) &&
                Objects.equals(getBigintCol(), svGetSingleRecordResponse.getBigintCol()) &&
                Objects.equals(getCharCol(), svGetSingleRecordResponse.getCharCol()) &&
                Objects.equals(getStringCol(), svGetSingleRecordResponse.getStringCol()) &&
                Objects.equals(getTextCol(), svGetSingleRecordResponse.getTextCol()) &&
                Objects.equals(getClobCol(), svGetSingleRecordResponse.getClobCol()) &&
                Objects.equals(getDateCol(), svGetSingleRecordResponse.getDateCol()) &&
                Objects.equals(getTimeCol(), svGetSingleRecordResponse.getTimeCol()) &&
                Objects.equals(getDatetimeCol(), svGetSingleRecordResponse.getDatetimeCol()) &&
                Objects.equals(getTimestampCol(), svGetSingleRecordResponse.getTimestampCol()) &&
                Objects.equals(getBooleanCol(), svGetSingleRecordResponse.getBooleanCol()) &&
                Objects.equals(getBlobCol(), svGetSingleRecordResponse.getBlobCol());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPkId(),
                getByteCol(),
                getShortCol(),
                getIntCol(),
                getLongCol(),
                getFloatCol(),
                getDoubleCol(),
                getBigdecCol(),
                getBigintCol(),
                getCharCol(),
                getStringCol(),
                getTextCol(),
                getClobCol(),
                getDateCol(),
                getTimeCol(),
                getDatetimeCol(),
                getTimestampCol(),
                getBooleanCol(),
                getBlobCol());
    }
}