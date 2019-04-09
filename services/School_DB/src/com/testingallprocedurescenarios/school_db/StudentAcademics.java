/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * StudentAcademics generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`STUDENT_ACADEMICS`", uniqueConstraints = {
            @UniqueConstraint(name = "`UK_STUDENT_ACADEMICS_ROLZpRpH`", columnNames = {"`ROLL_NUMBER`"})})
@IdClass(StudentAcademicsId.class)
public class StudentAcademics implements Serializable {

    private String academicYear;
    private Integer standardId;
    private Integer studentId;
    private int rollNumber;
    private StudentDetails studentDetails;
    private Academics academics;

    @Id
    @Column(name = "`ACADEMIC_YEAR`", nullable = false, length = 255)
    public String getAcademicYear() {
        return this.academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    @Id
    @Column(name = "`STANDARD_ID`", nullable = false, scale = 0, precision = 10)
    public Integer getStandardId() {
        return this.standardId;
    }

    public void setStandardId(Integer standardId) {
        this.standardId = standardId;
    }

    @Id
    @Column(name = "`STUDENT_ID`", nullable = false, scale = 0, precision = 10)
    public Integer getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Column(name = "`ROLL_NUMBER`", nullable = false, scale = 0, precision = 10)
    public int getRollNumber() {
        return this.rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`STUDENT_ID`", referencedColumnName = "`STUDENT_ID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_STUDENT_ACADEMICS_TO_Wph5y`"))
    @Fetch(FetchMode.JOIN)
    public StudentDetails getStudentDetails() {
        return this.studentDetails;
    }

    public void setStudentDetails(StudentDetails studentDetails) {
        if(studentDetails != null) {
            this.studentId = studentDetails.getStudentId();
        }

        this.studentDetails = studentDetails;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns(value = {
            @JoinColumn(name = "`ACADEMIC_YEAR`", referencedColumnName = "`ACADEMIC_YEAR`", insertable = false, updatable = false),
            @JoinColumn(name = "`STANDARD_ID`", referencedColumnName = "`STANDARD_ID`", insertable = false, updatable = false)},
        foreignKey = @ForeignKey(name = "`FK_STUDENT_ACADEMICS_TO_qLftV`"))
    @Fetch(FetchMode.JOIN)
    public Academics getAcademics() {
        return this.academics;
    }

    public void setAcademics(Academics academics) {
        if(academics != null) {
            this.academicYear = academics.getAcademicYear();
            this.standardId = academics.getStandardId();
        }

        this.academics = academics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentAcademics)) return false;
        final StudentAcademics studentAcademics = (StudentAcademics) o;
        return Objects.equals(getAcademicYear(), studentAcademics.getAcademicYear()) &&
                Objects.equals(getStandardId(), studentAcademics.getStandardId()) &&
                Objects.equals(getStudentId(), studentAcademics.getStudentId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAcademicYear(),
                getStandardId(),
                getStudentId());
    }
}