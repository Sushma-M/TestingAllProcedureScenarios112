/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class EmpResumeId implements Serializable {

    private String resumeFormat;
    private String empno;

    public String getResumeFormat() {
        return this.resumeFormat;
    }

    public void setResumeFormat(String resumeFormat) {
        this.resumeFormat = resumeFormat;
    }

    public String getEmpno() {
        return this.empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpResume)) return false;
        final EmpResume empResume = (EmpResume) o;
        return Objects.equals(getResumeFormat(), empResume.getResumeFormat()) &&
                Objects.equals(getEmpno(), empResume.getEmpno());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getResumeFormat(),
                getEmpno());
    }
}