/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * Empprojact generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`EMPPROJACT`")
@IdClass(EmpprojactId.class)
public class Empprojact implements Serializable {

    private String empno;
    private String projno;
    private Short actno;
    private Float emptime;
    private Date emstdate;
    private Date emendate;
    private Projact projact;

    @Id
    @Column(name = "`EMPNO`", nullable = false, length = 6)
    public String getEmpno() {
        return this.empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    @Id
    @Column(name = "`PROJNO`", nullable = false, length = 6)
    public String getProjno() {
        return this.projno;
    }

    public void setProjno(String projno) {
        this.projno = projno;
    }

    @Id
    @Column(name = "`ACTNO`", nullable = false, scale = 0, precision = 5)
    public Short getActno() {
        return this.actno;
    }

    public void setActno(Short actno) {
        this.actno = actno;
    }

    @Id
    @Column(name = "`EMPTIME`", nullable = true, scale = 2, precision = 5)
    public Float getEmptime() {
        return this.emptime;
    }

    public void setEmptime(Float emptime) {
        this.emptime = emptime;
    }

    @Id
    @Column(name = "`EMSTDATE`", nullable = true)
    public Date getEmstdate() {
        return this.emstdate;
    }

    public void setEmstdate(Date emstdate) {
        this.emstdate = emstdate;
    }

    @Id
    @Column(name = "`EMENDATE`", nullable = true)
    public Date getEmendate() {
        return this.emendate;
    }

    public void setEmendate(Date emendate) {
        this.emendate = emendate;
    }


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns(value = {
            @JoinColumn(name = "`PROJNO`", referencedColumnName = "`PROJNO`", insertable = false, updatable = false),
            @JoinColumn(name = "`ACTNO`", referencedColumnName = "`ACTNO`", insertable = false, updatable = false),
            @JoinColumn(name = "`EMSTDATE`", referencedColumnName = "`ACSTDATE`", insertable = false, updatable = false)},
        foreignKey = @ForeignKey(name = "`REPAPA`"))
    @Fetch(FetchMode.JOIN)
    public Projact getProjact() {
        return this.projact;
    }

    public void setProjact(Projact projact) {
        if(projact != null) {
            this.projno = projact.getProjno();
            this.actno = projact.getActno();
            this.emstdate = projact.getAcstdate();
        }

        this.projact = projact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empprojact)) return false;
        final Empprojact empprojact = (Empprojact) o;
        return Objects.equals(getEmpno(), empprojact.getEmpno()) &&
                Objects.equals(getProjno(), empprojact.getProjno()) &&
                Objects.equals(getActno(), empprojact.getActno()) &&
                Objects.equals(getEmptime(), empprojact.getEmptime()) &&
                Objects.equals(getEmstdate(), empprojact.getEmstdate()) &&
                Objects.equals(getEmendate(), empprojact.getEmendate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpno(),
                getProjno(),
                getActno(),
                getEmptime(),
                getEmstdate(),
                getEmendate());
    }
}