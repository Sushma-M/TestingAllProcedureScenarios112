/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class VemplpId implements Serializable {

    private String employeenumber;
    private String phonenumber;

    public String getEmployeenumber() {
        return this.employeenumber;
    }

    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vemplp)) return false;
        final Vemplp vemplp = (Vemplp) o;
        return Objects.equals(getEmployeenumber(), vemplp.getEmployeenumber()) &&
                Objects.equals(getPhonenumber(), vemplp.getPhonenumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeenumber(),
                getPhonenumber());
    }
}