/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.wmstudio;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Regions generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`REGIONS`")
public class Regions implements Serializable {

    private BigInteger regionId;
    private String regionName;
    private List<Countries> countrieses;

    @Id
    @Column(name = "`REGION_ID`", nullable = false, scale = 0, precision = 38)
    public BigInteger getRegionId() {
        return this.regionId;
    }

    public void setRegionId(BigInteger regionId) {
        this.regionId = regionId;
    }

    @Column(name = "`REGION_NAME`", nullable = true, length = 25)
    public String getRegionName() {
        return this.regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "regions")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.REMOVE})
    public List<Countries> getCountrieses() {
        return this.countrieses;
    }

    public void setCountrieses(List<Countries> countrieses) {
        this.countrieses = countrieses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Regions)) return false;
        final Regions regions = (Regions) o;
        return Objects.equals(getRegionId(), regions.getRegionId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRegionId());
    }
}