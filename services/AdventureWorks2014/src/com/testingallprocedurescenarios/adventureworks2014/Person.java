/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * Person generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`Person`", uniqueConstraints = {
            @UniqueConstraint(name = "`UK_8nng0sep0o6hoaurhd0dfcyoj`", columnNames = {"`rowguid`"})})
public class Person implements Serializable {

    private Integer businessEntityId;
    private String personType;
    private boolean nameStyle;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private int emailPromotion;
    private String additionalContactInfo;
    private String demographics;
    private String rowguid;
    private LocalDateTime modifiedDate;
    private Integer person1BusinessEntityId;
    private BusinessEntity businessEntityByBusinessEntityId;
    private BusinessEntity businessEntityByPerson1BusinessEntityId;
    private Employee employee;

    @Id
    @Column(name = "`BusinessEntityID`", nullable = false, scale = 0, precision = 10)
    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }

    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }

    @Column(name = "`PersonType`", nullable = false, length = 2)
    public String getPersonType() {
        return this.personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    @Column(name = "`NameStyle`", nullable = false)
    public boolean isNameStyle() {
        return this.nameStyle;
    }

    public void setNameStyle(boolean nameStyle) {
        this.nameStyle = nameStyle;
    }

    @Column(name = "`Title`", nullable = true, length = 8)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "`FirstName`", nullable = false, length = 50)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "`MiddleName`", nullable = true, length = 50)
    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Column(name = "`LastName`", nullable = false, length = 50)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "`Suffix`", nullable = true, length = 10)
    public String getSuffix() {
        return this.suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Column(name = "`EmailPromotion`", nullable = false, scale = 0, precision = 10)
    public int getEmailPromotion() {
        return this.emailPromotion;
    }

    public void setEmailPromotion(int emailPromotion) {
        this.emailPromotion = emailPromotion;
    }

    @Column(name = "`AdditionalContactInfo`", nullable = true, length = 2147483647)
    public String getAdditionalContactInfo() {
        return this.additionalContactInfo;
    }

    public void setAdditionalContactInfo(String additionalContactInfo) {
        this.additionalContactInfo = additionalContactInfo;
    }

    @Column(name = "`Demographics`", nullable = true, length = 2147483647)
    public String getDemographics() {
        return this.demographics;
    }

    public void setDemographics(String demographics) {
        this.demographics = demographics;
    }

    @Column(name = "`rowguid`", nullable = false, length = 32)
    public String getRowguid() {
        return this.rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    @Column(name = "`ModifiedDate`", nullable = false)
    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Column(name = "`person1_BusinessEntityID`", nullable = true, scale = 0, precision = 10)
    public Integer getPerson1BusinessEntityId() {
        return this.person1BusinessEntityId;
    }

    public void setPerson1BusinessEntityId(Integer person1BusinessEntityId) {
        this.person1BusinessEntityId = person1BusinessEntityId;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`BusinessEntityID`", referencedColumnName = "`BusinessEntityID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_Person_BusinessEntity_BusinessEntityID`"))
    @Fetch(FetchMode.JOIN)
    public BusinessEntity getBusinessEntityByBusinessEntityId() {
        return this.businessEntityByBusinessEntityId;
    }

    public void setBusinessEntityByBusinessEntityId(BusinessEntity businessEntityByBusinessEntityId) {
        if(businessEntityByBusinessEntityId != null) {
            this.businessEntityId = businessEntityByBusinessEntityId.getBusinessEntityId();
        }

        this.businessEntityByBusinessEntityId = businessEntityByBusinessEntityId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`person1_BusinessEntityID`", referencedColumnName = "`BusinessEntityID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_nqelc2tgu0j3dnbh7s5b38ve9`"))
    @Fetch(FetchMode.JOIN)
    public BusinessEntity getBusinessEntityByPerson1BusinessEntityId() {
        return this.businessEntityByPerson1BusinessEntityId;
    }

    public void setBusinessEntityByPerson1BusinessEntityId(BusinessEntity businessEntityByPerson1BusinessEntityId) {
        if(businessEntityByPerson1BusinessEntityId != null) {
            this.person1BusinessEntityId = businessEntityByPerson1BusinessEntityId.getBusinessEntityId();
        }

        this.businessEntityByPerson1BusinessEntityId = businessEntityByPerson1BusinessEntityId;
    }
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "person")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.REMOVE})
    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        final Person person = (Person) o;
        return Objects.equals(getBusinessEntityId(), person.getBusinessEntityId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBusinessEntityId());
    }
}