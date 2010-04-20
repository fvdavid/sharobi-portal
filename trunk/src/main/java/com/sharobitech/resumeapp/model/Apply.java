/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ifnu
 */
@Entity
@Table(name="T_APPLY")
public class Apply implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="APPLY_ID")
    private Long id;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="DATE_APPLY",nullable=false)
    private Date dateApply;

    @ManyToOne
    @JoinColumn(name="JOB_POSTING_ID",nullable=false)
    private JobPosting jobPosting;

    @ManyToOne
    @JoinColumn(name="EMPLOYEE_ID",nullable=false)
    private Employee employee;

    @Column(name="EXPECTED_SALARY")
    private BigDecimal expectedSalary;

    @Column(name="DAYS_AVAILABILITY")
    private Long daysAvailability;

    public Date getDateApply() {
        return dateApply;
    }

    public void setDateApply(Date dateApply) {
        this.dateApply = dateApply;
    }

    public Long getDaysAvailability() {
        return daysAvailability;
    }

    public void setDaysAvailability(Long daysAvailability) {
        this.daysAvailability = daysAvailability;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public BigDecimal getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(BigDecimal expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JobPosting getJobPosting() {
        return jobPosting;
    }

    public void setJobPosting(JobPosting jobPosting) {
        this.jobPosting = jobPosting;
    }

    

}
