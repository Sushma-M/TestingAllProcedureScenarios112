/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcedureBonusIncrementsResponse implements Serializable {


    @ColumnAlias("content")
    private List<ProcedureBonusIncrementsResponseContent> content;

    @ColumnAlias("P_DEPTSWITHOUTNEWBONUSES")
    private String pdeptswithoutnewbonuses;

    @ColumnAlias("P_COUNTDEPTSVIEWED")
    private Integer pcountdeptsviewed;

    @ColumnAlias("P_COUNTDEPTSBONUSCHANGED")
    private Integer pcountdeptsbonuschanged;

    @ColumnAlias("P_ERRORMSG")
    private String perrormsg;

    public List<ProcedureBonusIncrementsResponseContent> getContent() {
        return this.content;
    }

    public void setContent(List<ProcedureBonusIncrementsResponseContent> content) {
        this.content = content;
    }

    public String getPdeptswithoutnewbonuses() {
        return this.pdeptswithoutnewbonuses;
    }

    public void setPdeptswithoutnewbonuses(String pdeptswithoutnewbonuses) {
        this.pdeptswithoutnewbonuses = pdeptswithoutnewbonuses;
    }

    public Integer getPcountdeptsviewed() {
        return this.pcountdeptsviewed;
    }

    public void setPcountdeptsviewed(Integer pcountdeptsviewed) {
        this.pcountdeptsviewed = pcountdeptsviewed;
    }

    public Integer getPcountdeptsbonuschanged() {
        return this.pcountdeptsbonuschanged;
    }

    public void setPcountdeptsbonuschanged(Integer pcountdeptsbonuschanged) {
        this.pcountdeptsbonuschanged = pcountdeptsbonuschanged;
    }

    public String getPerrormsg() {
        return this.perrormsg;
    }

    public void setPerrormsg(String perrormsg) {
        this.perrormsg = perrormsg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureBonusIncrementsResponse)) return false;
        final ProcedureBonusIncrementsResponse procedureBonusIncrementsResponse = (ProcedureBonusIncrementsResponse) o;
        return Objects.equals(getContent(), procedureBonusIncrementsResponse.getContent()) &&
                Objects.equals(getPdeptswithoutnewbonuses(), procedureBonusIncrementsResponse.getPdeptswithoutnewbonuses()) &&
                Objects.equals(getPcountdeptsviewed(), procedureBonusIncrementsResponse.getPcountdeptsviewed()) &&
                Objects.equals(getPcountdeptsbonuschanged(), procedureBonusIncrementsResponse.getPcountdeptsbonuschanged()) &&
                Objects.equals(getPerrormsg(), procedureBonusIncrementsResponse.getPerrormsg());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContent(),
                getPdeptswithoutnewbonuses(),
                getPcountdeptsviewed(),
                getPcountdeptsbonuschanged(),
                getPerrormsg());
    }
}