/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class Vprojre1Id implements Serializable {

    private String projno;
    private String projname;
    private String projdep;
    private String respemp;
    private String firstnme;
    private Character midinit;
    private String lastname;
    private String majproj;

    public String getProjno() {
        return this.projno;
    }

    public void setProjno(String projno) {
        this.projno = projno;
    }

    public String getProjname() {
        return this.projname;
    }

    public void setProjname(String projname) {
        this.projname = projname;
    }

    public String getProjdep() {
        return this.projdep;
    }

    public void setProjdep(String projdep) {
        this.projdep = projdep;
    }

    public String getRespemp() {
        return this.respemp;
    }

    public void setRespemp(String respemp) {
        this.respemp = respemp;
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

    public String getMajproj() {
        return this.majproj;
    }

    public void setMajproj(String majproj) {
        this.majproj = majproj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vprojre1)) return false;
        final Vprojre1 vprojre1 = (Vprojre1) o;
        return Objects.equals(getProjno(), vprojre1.getProjno()) &&
                Objects.equals(getProjname(), vprojre1.getProjname()) &&
                Objects.equals(getProjdep(), vprojre1.getProjdep()) &&
                Objects.equals(getRespemp(), vprojre1.getRespemp()) &&
                Objects.equals(getFirstnme(), vprojre1.getFirstnme()) &&
                Objects.equals(getMidinit(), vprojre1.getMidinit()) &&
                Objects.equals(getLastname(), vprojre1.getLastname()) &&
                Objects.equals(getMajproj(), vprojre1.getMajproj());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProjno(),
                getProjname(),
                getProjdep(),
                getRespemp(),
                getFirstnme(),
                getMidinit(),
                getLastname(),
                getMajproj());
    }
}