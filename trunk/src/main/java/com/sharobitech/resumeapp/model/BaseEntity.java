/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author ifnu
 */
public class BaseEntity {
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="DATE_CREATED",nullable=false,updatable=false)
    private Date dateCreated = new Date();

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="DATE_UPDATED")
    private Date dateUpdated = new Date();

    @ManyToOne
    @JoinColumn(name="CREATED_BY",nullable=false, updatable=false)
    private User createdBy;

    @ManyToOne
    @JoinColumn(name="UPDATED_BY")
    private User updatedBy;

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }

}
