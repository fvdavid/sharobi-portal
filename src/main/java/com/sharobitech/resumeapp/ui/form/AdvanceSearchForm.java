/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.ui.form;

import java.math.BigDecimal;

/**
 *
 * @author ifnu
 */
public class AdvanceSearchForm {

    private String keyword;

    private Integer country;

    private Integer workSector;

    private Integer subSector;

    private Integer type;

    private Integer experience;

    private Integer renumeration;

    private BigDecimal renumerationValue;

    private String shorting;

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getRenumeration() {
        return renumeration;
    }

    public void setRenumeration(Integer renumeration) {
        this.renumeration = renumeration;
    }

    public BigDecimal getRenumerationValue() {
        return renumerationValue;
    }

    public void setRenumerationValue(BigDecimal renumerationValue) {
        this.renumerationValue = renumerationValue;
    }

    public String getShorting() {
        return shorting;
    }

    public void setShorting(String shorting) {
        this.shorting = shorting;
    }

    public Integer getSubSector() {
        return subSector;
    }

    public void setSubSector(Integer subSector) {
        this.subSector = subSector;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getWorkSector() {
        return workSector;
    }

    public void setWorkSector(Integer workSector) {
        this.workSector = workSector;
    }



}
