/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class ProjactId implements Serializable {

    private Short actno;
    private String projno;
    private Date acstdate;

    public Short getActno() {
        return this.actno;
    }

    public void setActno(Short actno) {
        this.actno = actno;
    }

    public String getProjno() {
        return this.projno;
    }

    public void setProjno(String projno) {
        this.projno = projno;
    }

    public Date getAcstdate() {
        return this.acstdate;
    }

    public void setAcstdate(Date acstdate) {
        this.acstdate = acstdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Projact)) return false;
        final Projact projact = (Projact) o;
        return Objects.equals(getActno(), projact.getActno()) &&
                Objects.equals(getProjno(), projact.getProjno()) &&
                Objects.equals(getAcstdate(), projact.getAcstdate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getActno(),
                getProjno(),
                getAcstdate());
    }
}