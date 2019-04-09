/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * Employee generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`Employee`", schema = "`HumanResources`", uniqueConstraints = {
            @UniqueConstraint(name = "`UK_550s85r2wnakc17q5diuit3q5`", columnNames = {"`LoginID`"}),
            @UniqueConstraint(name = "`UK_36c8yp0q8ry0y2acrd50qjkt`", columnNames = {"`rowguid`"}),
            @UniqueConstraint(name = "`UK_ktpwii8so9uy1t5iwicaj002j`", columnNames = {"`NationalIDNumber`"})})
public class Employee implements Serializable {

    private Integer businessEntityId;
    private String nationalIdnumber;
    private String loginId;
    @JsonProperty(access = Access.READ_ONLY)
    private byte[] organizationNode;
    private Short organizationLevel;
    private String jobTitle;
    private Date birthDate;
    private String maritalStatus;
    private String gender;
    private Date hireDate;
    private boolean salariedFlag;
    private short vacationHours;
    private short sickLeaveHours;
    private boolean currentFlag;
    private String rowguid;
    private LocalDateTime modifiedDate;
    private Person person;
    private List<EmployeeDepartmentHistory> employeeDepartmentHistories;
    private List<EmployeePayHistory> employeePayHistories;

    @Id
    @Column(name = "`BusinessEntityID`", nullable = false, scale = 0, precision = 10)
    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }

    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }

    @Column(name = "`NationalIDNumber`", nullable = false, length = 15)
    public String getNationalIdnumber() {
        return this.nationalIdnumber;
    }

    public void setNationalIdnumber(String nationalIdnumber) {
        this.nationalIdnumber = nationalIdnumber;
    }

    @Column(name = "`LoginID`", nullable = false, length = 256)
    public String getLoginId() {
        return this.loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    @Column(name = "`OrganizationNode`", nullable = true)
    public byte[] getOrganizationNode() {
        return this.organizationNode;
    }

    public void setOrganizationNode(byte[] organizationNode) {
        this.organizationNode = organizationNode;
    }

    @Column(name = "`OrganizationLevel`", nullable = true, scale = 0, precision = 5)
    public Short getOrganizationLevel() {
        return this.organizationLevel;
    }

    public void setOrganizationLevel(Short organizationLevel) {
        this.organizationLevel = organizationLevel;
    }

    @Column(name = "`JobTitle`", nullable = false, length = 50)
    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Column(name = "`BirthDate`", nullable = false)
    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Column(name = "`MaritalStatus`", nullable = false, length = 1)
    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Column(name = "`Gender`", nullable = false, length = 1)
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "`HireDate`", nullable = false)
    public Date getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Column(name = "`SalariedFlag`", nullable = false)
    public boolean isSalariedFlag() {
        return this.salariedFlag;
    }

    public void setSalariedFlag(boolean salariedFlag) {
        this.salariedFlag = salariedFlag;
    }

    @Column(name = "`VacationHours`", nullable = false, scale = 0, precision = 5)
    public short getVacationHours() {
        return this.vacationHours;
    }

    public void setVacationHours(short vacationHours) {
        this.vacationHours = vacationHours;
    }

    @Column(name = "`SickLeaveHours`", nullable = false, scale = 0, precision = 5)
    public short getSickLeaveHours() {
        return this.sickLeaveHours;
    }

    public void setSickLeaveHours(short sickLeaveHours) {
        this.sickLeaveHours = sickLeaveHours;
    }

    @Column(name = "`CurrentFlag`", nullable = false)
    public boolean isCurrentFlag() {
        return this.currentFlag;
    }

    public void setCurrentFlag(boolean currentFlag) {
        this.currentFlag = currentFlag;
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

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`BusinessEntityID`", referencedColumnName = "`BusinessEntityID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_Employee_Person_BusinessEntityID`"))
    @Fetch(FetchMode.JOIN)
    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        if(person != null) {
            this.businessEntityId = person.getBusinessEntityId();
        }

        this.person = person;
    }
    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.REMOVE})
    public List<EmployeeDepartmentHistory> getEmployeeDepartmentHistories() {
        return this.employeeDepartmentHistories;
    }

    public void setEmployeeDepartmentHistories(List<EmployeeDepartmentHistory> employeeDepartmentHistories) {
        this.employeeDepartmentHistories = employeeDepartmentHistories;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.REMOVE})
    public List<EmployeePayHistory> getEmployeePayHistories() {
        return this.employeePayHistories;
    }

    public void setEmployeePayHistories(List<EmployeePayHistory> employeePayHistories) {
        this.employeePayHistories = employeePayHistories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        final Employee employee = (Employee) o;
        return Objects.equals(getBusinessEntityId(), employee.getBusinessEntityId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBusinessEntityId());
    }
}