/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class Scenario4ResponseContent implements Serializable {


    @ColumnAlias("ACADEMIC_YEAR")
    private String academicYear;

    public String getAcademicYear() {
        return this.academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Scenario4ResponseContent)) return false;
        final Scenario4ResponseContent scenario4responseContent = (Scenario4ResponseContent) o;
        return Objects.equals(getAcademicYear(), scenario4responseContent.getAcademicYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAcademicYear());
    }
}