/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Sales generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`SALES`")
@IdClass(SalesId.class)
public class Sales implements Serializable {

    private Date salesDate;
    private String salesPerson;
    private String region;
    private Integer sales;

    @Id
    @Column(name = "`SALES_DATE`", nullable = true)
    public Date getSalesDate() {
        return this.salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    @Id
    @Column(name = "`SALES_PERSON`", nullable = true, length = 15)
    public String getSalesPerson() {
        return this.salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    @Id
    @Column(name = "`REGION`", nullable = true, length = 15)
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Id
    @Column(name = "`SALES`", nullable = true, scale = 0, precision = 10)
    public Integer getSales() {
        return this.sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sales)) return false;
        final Sales salesInstance = (Sales) o;
        return Objects.equals(getSalesDate(), salesInstance.getSalesDate()) &&
                Objects.equals(getSalesPerson(), salesInstance.getSalesPerson()) &&
                Objects.equals(getRegion(), salesInstance.getRegion()) &&
                Objects.equals(getSales(), salesInstance.getSales());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSalesDate(),
                getSalesPerson(),
                getRegion(),
                getSales());
    }
}