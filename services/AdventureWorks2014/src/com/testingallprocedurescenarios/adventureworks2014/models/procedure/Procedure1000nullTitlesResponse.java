/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.adventureworks2014.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class Procedure1000nullTitlesResponse implements Serializable {


    @ColumnAlias("content")
    private List<Procedure1000nullTitlesResponseContent> content;

    public List<Procedure1000nullTitlesResponseContent> getContent() {
        return this.content;
    }

    public void setContent(List<Procedure1000nullTitlesResponseContent> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Procedure1000nullTitlesResponse)) return false;
        final Procedure1000nullTitlesResponse procedure1000nullTitlesResponse = (Procedure1000nullTitlesResponse) o;
        return Objects.equals(getContent(), procedure1000nullTitlesResponse.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContent());
    }
}