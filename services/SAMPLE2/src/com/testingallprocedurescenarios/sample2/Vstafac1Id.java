/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Vstafac1Id implements Serializable {

    private String projno;
    private Short actno;
    private String actdesc;
    private Character empno;
    private Character firstnme;
    private Character midinit;
    private Character lastname;
    private Float emptime;
    private Date stdate;
    private Date endate;
    private Character type;

    public String getProjno() {
        return this.projno;
    }

    public void setProjno(String projno) {
        this.projno = projno;
    }

    public Short getActno() {
        return this.actno;
    }

    public void setActno(Short actno) {
        this.actno = actno;
    }

    public String getActdesc() {
        return this.actdesc;
    }

    public void setActdesc(String actdesc) {
        this.actdesc = actdesc;
    }

    public Character getEmpno() {
        return this.empno;
    }

    public void setEmpno(Character empno) {
        this.empno = empno;
    }

    public Character getFirstnme() {
        return this.firstnme;
    }

    public void setFirstnme(Character firstnme) {
        this.firstnme = firstnme;
    }

    public Character getMidinit() {
        return this.midinit;
    }

    public void setMidinit(Character midinit) {
        this.midinit = midinit;
    }

    public Character getLastname() {
        return this.lastname;
    }

    public void setLastname(Character lastname) {
        this.lastname = lastname;
    }

    public Float getEmptime() {
        return this.emptime;
    }

    public void setEmptime(Float emptime) {
        this.emptime = emptime;
    }

    public Date getStdate() {
        return this.stdate;
    }

    public void setStdate(Date stdate) {
        this.stdate = stdate;
    }

    public Date getEndate() {
        return this.endate;
    }

    public void setEndate(Date endate) {
        this.endate = endate;
    }

    public Character getType() {
        return this.type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vstafac1)) return false;
        final Vstafac1 vstafac1 = (Vstafac1) o;
        return Objects.equals(getProjno(), vstafac1.getProjno()) &&
                Objects.equals(getActno(), vstafac1.getActno()) &&
                Objects.equals(getActdesc(), vstafac1.getActdesc()) &&
                Objects.equals(getEmpno(), vstafac1.getEmpno()) &&
                Objects.equals(getFirstnme(), vstafac1.getFirstnme()) &&
                Objects.equals(getMidinit(), vstafac1.getMidinit()) &&
                Objects.equals(getLastname(), vstafac1.getLastname()) &&
                Objects.equals(getEmptime(), vstafac1.getEmptime()) &&
                Objects.equals(getStdate(), vstafac1.getStdate()) &&
                Objects.equals(getEndate(), vstafac1.getEndate()) &&
                Objects.equals(getType(), vstafac1.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProjno(),
                getActno(),
                getActdesc(),
                getEmpno(),
                getFirstnme(),
                getMidinit(),
                getLastname(),
                getEmptime(),
                getStdate(),
                getEndate(),
                getType());
    }
}