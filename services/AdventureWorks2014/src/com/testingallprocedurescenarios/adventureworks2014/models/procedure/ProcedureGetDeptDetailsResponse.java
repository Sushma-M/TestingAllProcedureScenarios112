/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.adventureworks2014.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcedureGetDeptDetailsResponse implements Serializable {


    @ColumnAlias("Name")
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureGetDeptDetailsResponse)) return false;
        final ProcedureGetDeptDetailsResponse procedureGetDeptDetailsResponse = (ProcedureGetDeptDetailsResponse) o;
        return Objects.equals(getName(), procedureGetDeptDetailsResponse.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}