/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class Scenario2ResponseContent implements Serializable {


    @ColumnAlias("TEST_CONDUCTED_ID")
    private Integer testConductedId;

    @ColumnAlias("STUDENT_ID")
    private Integer studentId;

    @ColumnAlias("MARKS_SECURED")
    private Short marksSecured;

    @ColumnAlias("GRADE_ID")
    private Integer gradeId;

    @ColumnAlias("ACADEMIC_YEAR")
    private String academicYear;

    @ColumnAlias("STANDARD_ID")
    private Integer standardId;

    @ColumnAlias("PRESENCE")
    private Boolean presence;

    public Integer getTestConductedId() {
        return this.testConductedId;
    }

    public void setTestConductedId(Integer testConductedId) {
        this.testConductedId = testConductedId;
    }

    public Integer getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Short getMarksSecured() {
        return this.marksSecured;
    }

    public void setMarksSecured(Short marksSecured) {
        this.marksSecured = marksSecured;
    }

    public Integer getGradeId() {
        return this.gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getAcademicYear() {
        return this.academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public Integer getStandardId() {
        return this.standardId;
    }

    public void setStandardId(Integer standardId) {
        this.standardId = standardId;
    }

    public Boolean getPresence() {
        return this.presence;
    }

    public void setPresence(Boolean presence) {
        this.presence = presence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Scenario2ResponseContent)) return false;
        final Scenario2ResponseContent scenario2responseContent = (Scenario2ResponseContent) o;
        return Objects.equals(getTestConductedId(), scenario2responseContent.getTestConductedId()) &&
                Objects.equals(getStudentId(), scenario2responseContent.getStudentId()) &&
                Objects.equals(getMarksSecured(), scenario2responseContent.getMarksSecured()) &&
                Objects.equals(getGradeId(), scenario2responseContent.getGradeId()) &&
                Objects.equals(getAcademicYear(), scenario2responseContent.getAcademicYear()) &&
                Objects.equals(getStandardId(), scenario2responseContent.getStandardId()) &&
                Objects.equals(getPresence(), scenario2responseContent.getPresence());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTestConductedId(),
                getStudentId(),
                getMarksSecured(),
                getGradeId(),
                getAcademicYear(),
                getStandardId(),
                getPresence());
    }
}