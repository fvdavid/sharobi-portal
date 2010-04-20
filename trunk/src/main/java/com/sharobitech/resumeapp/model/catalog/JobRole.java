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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ifnu
 */
@Entity
@Table(name="T_JOB_ROLE")
public class JobRole implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="JOB_ROLE_ID")
    private Long id;

    @Column(name="JOB_ROLE_NAME",unique=true,nullable=false,length=100)
    private String name;

    @ManyToOne
    @JoinColumn(name="WORK_SECTOR_ID")
    private WorkSector workSector;

    public WorkSector getWorkSector() {
        return workSector;
    }

    public void setWorkSector(WorkSector workSector) {
        this.workSector = workSector;
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
