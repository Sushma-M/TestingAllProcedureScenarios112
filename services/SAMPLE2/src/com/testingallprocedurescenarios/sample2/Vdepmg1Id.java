/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class Vdepmg1Id implements Serializable {

    private String deptno;
    private String deptname;
    private String mgrno;
    private String firstnme;
    private Character midinit;
    private String lastname;
    private String admrdept;

    public String getDeptno() {
        return this.deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return this.deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getMgrno() {
        return this.mgrno;
    }

    public void setMgrno(String mgrno) {
        this.mgrno = mgrno;
    }

    public String getFirstnme() {
        return this.firstnme;
    }

    public void setFirstnme(String firstnme) {
        this.firstnme = firstnme;
    }

    public Character getMidinit() {
        return this.midinit;
    }

    public void setMidinit(Character midinit) {
        this.midinit = midinit;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdmrdept() {
        return this.admrdept;
    }

    public void setAdmrdept(String admrdept) {
        this.admrdept = admrdept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vdepmg1)) return false;
        final Vdepmg1 vdepmg1 = (Vdepmg1) o;
        return Objects.equals(getDeptno(), vdepmg1.getDeptno()) &&
                Objects.equals(getDeptname(), vdepmg1.getDeptname()) &&
                Objects.equals(getMgrno(), vdepmg1.getMgrno()) &&
                Objects.equals(getFirstnme(), vdepmg1.getFirstnme()) &&
                Objects.equals(getMidinit(), vdepmg1.getMidinit()) &&
                Objects.equals(getLastname(), vdepmg1.getLastname()) &&
                Objects.equals(getAdmrdept(), vdepmg1.getAdmrdept());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeptno(),
                getDeptname(),
                getMgrno(),
                getFirstnme(),
                getMidinit(),
                getLastname(),
                getAdmrdept());
    }
}