/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class TestConductedId implements Serializable {

    private String academicYear;
    private Integer testConductedId;
    private Integer standardId;

    public String getAcademicYear() {
        return this.academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public Integer getTestConductedId() {
        return this.testConductedId;
    }

    public void setTestConductedId(Integer testConductedId) {
        this.testConductedId = testConductedId;
    }

    public Integer getStandardId() {
        return this.standardId;
    }

    public void setStandardId(Integer standardId) {
        this.standardId = standardId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestConducted)) return false;
        final TestConducted testConducted = (TestConducted) o;
        return Objects.equals(getAcademicYear(), testConducted.getAcademicYear()) &&
                Objects.equals(getTestConductedId(), testConducted.getTestConductedId()) &&
                Objects.equals(getStandardId(), testConducted.getStandardId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAcademicYear(),
                getTestConductedId(),
                getStandardId());
    }
}