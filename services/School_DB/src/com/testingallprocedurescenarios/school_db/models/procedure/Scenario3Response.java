/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class Scenario3Response implements Serializable {


    @ColumnAlias("content")
    private List<Scenario3ResponseContent> content;

    public List<Scenario3ResponseContent> getContent() {
        return this.content;
    }

    public void setContent(List<Scenario3ResponseContent> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Scenario3Response)) return false;
        final Scenario3Response scenario3response = (Scenario3Response) o;
        return Objects.equals(getContent(), scenario3response.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContent());
    }
}