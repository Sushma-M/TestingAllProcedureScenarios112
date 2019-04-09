/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TestDetails generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`TEST_DETAILS`", uniqueConstraints = {
            @UniqueConstraint(name = "`UK_TEST_DETAILS_TEST_NAME`", columnNames = {"`TEST_NAME`"})})
public class TestDetails implements Serializable {

    private Integer testId;
    private String testName;
    private List<AcademicTestSubjects> academicTestSubjectses;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`TEST_ID`", nullable = false, scale = 0, precision = 10)
    public Integer getTestId() {
        return this.testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    @Column(name = "`TEST_NAME`", nullable = false, length = 255)
    public String getTestName() {
        return this.testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "testDetails")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.REMOVE})
    public List<AcademicTestSubjects> getAcademicTestSubjectses() {
        return this.academicTestSubjectses;
    }

    public void setAcademicTestSubjectses(List<AcademicTestSubjects> academicTestSubjectses) {
        this.academicTestSubjectses = academicTestSubjectses;
    }

    @PostPersist
    public void onPostPersist() {
        if(academicTestSubjectses != null) {
            academicTestSubjectses.forEach(_academicTestSubjects -> _academicTestSubjects.setTestDetails(this));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestDetails)) return false;
        final TestDetails testDetails = (TestDetails) o;
        return Objects.equals(getTestId(), testDetails.getTestId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTestId());
    }
}