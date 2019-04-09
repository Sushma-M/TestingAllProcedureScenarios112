/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * ClSched generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`CL_SCHED`")
@IdClass(ClSchedId.class)
public class ClSched implements Serializable {

    private String classCode;
    private Short day;
    private Time starting;
    private Time ending;

    @Id
    @Column(name = "`CLASS_CODE`", nullable = true, length = 7)
    public String getClassCode() {
        return this.classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Id
    @Column(name = "`DAY`", nullable = true, scale = 0, precision = 5)
    public Short getDay() {
        return this.day;
    }

    public void setDay(Short day) {
        this.day = day;
    }

    @Id
    @Column(name = "`STARTING`", nullable = true)
    public Time getStarting() {
        return this.starting;
    }

    public void setStarting(Time starting) {
        this.starting = starting;
    }

    @Id
    @Column(name = "`ENDING`", nullable = true)
    public Time getEnding() {
        return this.ending;
    }

    public void setEnding(Time ending) {
        this.ending = ending;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClSched)) return false;
        final ClSched clSched = (ClSched) o;
        return Objects.equals(getClassCode(), clSched.getClassCode()) &&
                Objects.equals(getDay(), clSched.getDay()) &&
                Objects.equals(getStarting(), clSched.getStarting()) &&
                Objects.equals(getEnding(), clSched.getEnding());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClassCode(),
                getDay(),
                getStarting(),
                getEnding());
    }
}