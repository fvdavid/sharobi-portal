/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.model.catalog;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ifnu
 */
@Entity
@Table(name="T_WORK_EXPERIENCE")
public class WorkExperience implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="WORK_EXPERIENCE_ID")
    private Long id;

    @Column(name="WORK_EXPERIENCE_INDEX")
    private Long index;

    @Column(name="WORK_EXPERIENCE_NAME",length=30,nullable=false,unique=true)
    private String name;

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
