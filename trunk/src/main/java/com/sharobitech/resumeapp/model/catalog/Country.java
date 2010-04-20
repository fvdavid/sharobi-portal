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
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;

/**
 *
 * @author ifnu
 */
@Entity
@Table(name="T_COUNTRY")
public class Country implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="ID")
    private Long id;

    @Column(name="COUNTRY_NAME",length=255,unique=true,nullable=false)
    @Field(index=Index.UN_TOKENIZED)
    private String name;

    @ManyToOne
    @JoinColumn(name="CONTINENT_ID",nullable=false)
    private Continent continent;

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
