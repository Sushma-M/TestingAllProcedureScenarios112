/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Staffg generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`STAFFG`")
public class Staffg implements Serializable {

    private Short id;
    private String name;
    private Short dept;
    private String job;
    private Short years;
    private Integer salary;
    private Integer comm;

    @Id
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 5)
    public Short getId() {
        return this.id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    @Column(name = "`NAME`", nullable = true, length = 18)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`DEPT`", nullable = true, scale = 0, precision = 5)
    public Short getDept() {
        return this.dept;
    }

    public void setDept(Short dept) {
        this.dept = dept;
    }

    @Column(name = "`JOB`", nullable = true, length = 10)
    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Column(name = "`YEARS`", nullable = true, scale = 0, precision = 5)
    public Short getYears() {
        return this.years;
    }

    public void setYears(Short years) {
        this.years = years;
    }

    @Column(name = "`SALARY`", nullable = true, scale = 0, precision = 9)
    public Integer getSalary() {
        return this.salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Column(name = "`COMM`", nullable = true, scale = 0, precision = 9)
    public Integer getComm() {
        return this.comm;
    }

    public void setComm(Integer comm) {
        this.comm = comm;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Staffg)) return false;
        final Staffg staffg = (Staffg) o;
        return Objects.equals(getId(), staffg.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}