/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class ResultsId implements Serializable {

    private String academicYear;
    private Integer testConductedId;
    private Integer standardId;
    private Integer studentId;

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

    public Integer getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Results)) return false;
        final Results results = (Results) o;
        return Objects.equals(getAcademicYear(), results.getAcademicYear()) &&
                Objects.equals(getTestConductedId(), results.getTestConductedId()) &&
                Objects.equals(getStandardId(), results.getStandardId()) &&
                Objects.equals(getStudentId(), results.getStudentId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAcademicYear(),
                getTestConductedId(),
                getStandardId(),
                getStudentId());
    }
}