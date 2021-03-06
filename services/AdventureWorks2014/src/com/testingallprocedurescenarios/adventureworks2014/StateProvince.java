/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * StateProvince generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`StateProvince`", uniqueConstraints = {
            @UniqueConstraint(name = "`UK_35b6rgamau1u4c5lrjffdfobm`", columnNames = {"`rowguid`"}),
            @UniqueConstraint(name = "`UK_op044ouo04xllf2ypwa4x7fh`", columnNames = {"`StateProvinceCode`", "`CountryRegionCode`"}),
            @UniqueConstraint(name = "`UK_hvc9dkosk5nrk4sl2xtscvfpb`", columnNames = {"`Name`"})})
public class StateProvince implements Serializable {

    private Integer stateProvinceId;
    private String stateProvinceCode;
    private String countryRegionCode;
    private boolean isOnlyStateProvinceFlag;
    private String name;
    private int territoryId;
    private String rowguid;
    private LocalDateTime modifiedDate;
    private List<Address> addresses;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`StateProvinceID`", nullable = false, scale = 0, precision = 10)
    public Integer getStateProvinceId() {
        return this.stateProvinceId;
    }

    public void setStateProvinceId(Integer stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    @Column(name = "`StateProvinceCode`", nullable = false, length = 3)
    public String getStateProvinceCode() {
        return this.stateProvinceCode;
    }

    public void setStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }

    @Column(name = "`CountryRegionCode`", nullable = false, length = 3)
    public String getCountryRegionCode() {
        return this.countryRegionCode;
    }

    public void setCountryRegionCode(String countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
    }

    @Column(name = "`IsOnlyStateProvinceFlag`", nullable = false)
    public boolean isIsOnlyStateProvinceFlag() {
        return this.isOnlyStateProvinceFlag;
    }

    public void setIsOnlyStateProvinceFlag(boolean isOnlyStateProvinceFlag) {
        this.isOnlyStateProvinceFlag = isOnlyStateProvinceFlag;
    }

    @Column(name = "`Name`", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`TerritoryID`", nullable = false, scale = 0, precision = 10)
    public int getTerritoryId() {
        return this.territoryId;
    }

    public void setTerritoryId(int territoryId) {
        this.territoryId = territoryId;
    }

    @Column(name = "`rowguid`", nullable = false, length = 32)
    public String getRowguid() {
        return this.rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    @Column(name = "`ModifiedDate`", nullable = false)
    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "stateProvince")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.REMOVE})
    public List<Address> getAddresses() {
        return this.addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @PostPersist
    public void onPostPersist() {
        if(addresses != null) {
            addresses.forEach(_address -> _address.setStateProvince(this));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StateProvince)) return false;
        final StateProvince stateProvince = (StateProvince) o;
        return Objects.equals(getStateProvinceId(), stateProvince.getStateProvinceId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStateProvinceId());
    }
}