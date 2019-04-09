/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * Product generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`PRODUCT`")
public class Product implements Serializable {

    private String pid;
    private String name;
    private BigDecimal price;
    private BigDecimal promoprice;
    private Date promostart;
    private Date promoend;
    @JsonProperty(access = Access.READ_ONLY)
    private byte[] description;

    @Id
    @Column(name = "`PID`", nullable = false, length = 10)
    public String getPid() {
        return this.pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Column(name = "`NAME`", nullable = true, length = 128)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`PRICE`", nullable = true, scale = 2, precision = 30)
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column(name = "`PROMOPRICE`", nullable = true, scale = 2, precision = 30)
    public BigDecimal getPromoprice() {
        return this.promoprice;
    }

    public void setPromoprice(BigDecimal promoprice) {
        this.promoprice = promoprice;
    }

    @Column(name = "`PROMOSTART`", nullable = true)
    public Date getPromostart() {
        return this.promostart;
    }

    public void setPromostart(Date promostart) {
        this.promostart = promostart;
    }

    @Column(name = "`PROMOEND`", nullable = true)
    public Date getPromoend() {
        return this.promoend;
    }

    public void setPromoend(Date promoend) {
        this.promoend = promoend;
    }

    @Column(name = "`DESCRIPTION`", nullable = true)
    public byte[] getDescription() {
        return this.description;
    }

    public void setDescription(byte[] description) {
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        final Product product = (Product) o;
        return Objects.equals(getPid(), product.getPid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPid());
    }
}