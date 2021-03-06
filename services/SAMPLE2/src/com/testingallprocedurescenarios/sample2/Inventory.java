/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Inventory generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`INVENTORY`")
public class Inventory implements Serializable {

    private String pid;
    private Integer quantity;
    private String location;

    @Id
    @Column(name = "`PID`", nullable = false, length = 10)
    public String getPid() {
        return this.pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Column(name = "`QUANTITY`", nullable = true, scale = 0, precision = 10)
    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Column(name = "`LOCATION`", nullable = true, length = 128)
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Inventory)) return false;
        final Inventory inventory = (Inventory) o;
        return Objects.equals(getPid(), inventory.getPid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPid());
    }
}