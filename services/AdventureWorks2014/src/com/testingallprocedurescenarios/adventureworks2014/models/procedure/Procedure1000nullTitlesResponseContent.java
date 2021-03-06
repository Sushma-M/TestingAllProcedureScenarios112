/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.adventureworks2014.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class Procedure1000nullTitlesResponseContent implements Serializable {


    @ColumnAlias("BusinessEntityID")
    private Integer businessEntityId;

    @ColumnAlias("PersonType")
    private String personType;

    @ColumnAlias("NameStyle")
    private Boolean nameStyle;

    @ColumnAlias("FirstName")
    private String firstName;

    @ColumnAlias("Title")
    private String title;

    @ColumnAlias("EmailPromotion")
    private Integer emailPromotion;

    @ColumnAlias("AdditionalContactInfo")
    private String additionalContactInfo;

    @ColumnAlias("rowguid")
    private String rowguid;

    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }

    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }

    public String getPersonType() {
        return this.personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public Boolean getNameStyle() {
        return this.nameStyle;
    }

    public void setNameStyle(Boolean nameStyle) {
        this.nameStyle = nameStyle;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getEmailPromotion() {
        return this.emailPromotion;
    }

    public void setEmailPromotion(Integer emailPromotion) {
        this.emailPromotion = emailPromotion;
    }

    public String getAdditionalContactInfo() {
        return this.additionalContactInfo;
    }

    public void setAdditionalContactInfo(String additionalContactInfo) {
        this.additionalContactInfo = additionalContactInfo;
    }

    public String getRowguid() {
        return this.rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Procedure1000nullTitlesResponseContent)) return false;
        final Procedure1000nullTitlesResponseContent procedure1000nullTitlesResponseContent = (Procedure1000nullTitlesResponseContent) o;
        return Objects.equals(getBusinessEntityId(), procedure1000nullTitlesResponseContent.getBusinessEntityId()) &&
                Objects.equals(getPersonType(), procedure1000nullTitlesResponseContent.getPersonType()) &&
                Objects.equals(getNameStyle(), procedure1000nullTitlesResponseContent.getNameStyle()) &&
                Objects.equals(getFirstName(), procedure1000nullTitlesResponseContent.getFirstName()) &&
                Objects.equals(getTitle(), procedure1000nullTitlesResponseContent.getTitle()) &&
                Objects.equals(getEmailPromotion(), procedure1000nullTitlesResponseContent.getEmailPromotion()) &&
                Objects.equals(getAdditionalContactInfo(), procedure1000nullTitlesResponseContent.getAdditionalContactInfo()) &&
                Objects.equals(getRowguid(), procedure1000nullTitlesResponseContent.getRowguid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBusinessEntityId(),
                getPersonType(),
                getNameStyle(),
                getFirstName(),
                getTitle(),
                getEmailPromotion(),
                getAdditionalContactInfo(),
                getRowguid());
    }
}