/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.model;

import com.sharobitech.resumeapp.model.catalog.WorkExperience;
import com.sharobitech.resumeapp.model.catalog.WorkSector;
import com.sharobitech.resumeapp.model.catalog.City;
import com.sharobitech.resumeapp.model.catalog.Country;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ifnu
 */
@Entity
@Table(name="T_JOB_POSTING")
public class JobPosting  extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="JOB_POSTING_IID")
    private Long id;

    @Column(name="TITLE",length=255,nullable=false)
    private String title;

    @Lob
    @Column(name="DESCRIPTION",nullable=false)
    private String description;

    @Column(name="URL",nullable=false)
    private String url;

    @ManyToOne
    @JoinColumn(name="MIN_WORK_EXPERIENCE")
    private WorkExperience minWorkExperience;

    @ManyToOne
    @JoinColumn(name="WORK_SECTOR")
    private WorkSector workSector;

    @Column(name="LOW_RANGE_SALARY")
    private BigDecimal lowRangeSalary;

    @Column(name="UP_RANGE_SALARY")
    private BigDecimal upRangeSalary;

    @ManyToOne
    @JoinColumn(name="COUNTRY_ID")
    private Country country;

    @ManyToOne
    @JoinColumn(name="CITY_ID")
    private City city;

    @ManyToOne
    @JoinColumn(name="EMPLOYER_ID")
    private Employer employer;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getLowRangeSalary() {
        return lowRangeSalary;
    }

    public void setLowRangeSalary(BigDecimal lowRangeSalary) {
        this.lowRangeSalary = lowRangeSalary;
    }

    public WorkExperience getMinWorkExperience() {
        return minWorkExperience;
    }

    public void setMinWorkExperience(WorkExperience minWorkExperience) {
        this.minWorkExperience = minWorkExperience;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getUpRangeSalary() {
        return upRangeSalary;
    }

    public void setUpRangeSalary(BigDecimal upRangeSalary) {
        this.upRangeSalary = upRangeSalary;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WorkSector getWorkSector() {
        return workSector;
    }

    public void setWorkSector(WorkSector workSector) {
        this.workSector = workSector;
    }

}
