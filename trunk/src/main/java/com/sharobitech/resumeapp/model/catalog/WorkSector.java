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
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;

/**
 *
 * @author ifnu
 */
@Entity
@Table(name="T_WORK_SECTOR")
public class WorkSector implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="WORK_SECTOR_ID")
    private Long id;

    @Column(name="WORK_SECTOR_NAME",length=50,nullable=false,unique=true)
    @Field(index=Index.UN_TOKENIZED)
    private String name;

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
