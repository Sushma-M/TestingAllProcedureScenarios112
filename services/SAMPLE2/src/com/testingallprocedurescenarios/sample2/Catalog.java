/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * Catalog generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`CATALOG`")
public class Catalog implements Serializable {

    private String name;
    @JsonProperty(access = Access.READ_ONLY)
    private byte[] catlog;

    @Id
    @Column(name = "`NAME`", nullable = false, length = 128)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`CATLOG`", nullable = true)
    public byte[] getCatlog() {
        return this.catlog;
    }

    public void setCatlog(byte[] catlog) {
        this.catlog = catlog;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Catalog)) return false;
        final Catalog catalog = (Catalog) o;
        return Objects.equals(getName(), catalog.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}