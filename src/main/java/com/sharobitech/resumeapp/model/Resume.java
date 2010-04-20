/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.model;

import com.sharobitech.resumeapp.model.catalog.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.search.annotations.Boost;
import org.hibernate.search.annotations.DateBridge;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;
import org.hibernate.search.annotations.Resolution;

/**
 *
 * @author ifnu
 */
@Entity
@Table(name="T_RESUME")
@Indexed(index="resume")
public class Resume implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="ID")
    @DocumentId
    private Integer id;

    @Column(name="FILE_PATH",length=500)
    private String filePath;

    @Column(name="FILE_TYPE",length=5)
    private String fileType;

    @Lob
    @Column(name="RESUME_TITLE")
    @Field(boost=@Boost(2))
    private String resumeTitle;

    @Lob
    @Column(name="RESUME_TEXT")
    @Field(boost=@Boost(1))
    private String resumeText;

    @Column(name="FIRST_NAME",length=30)
    @Field(boost=@Boost(2),index=Index.UN_TOKENIZED)
    private String firstName;

    @Column(name="SUR_NAME",length=30)
    @Field(boost=@Boost(2),index=Index.UN_TOKENIZED)
    private String surName;

    @Column(name="EMAIL",length=30)
    @Field(boost=@Boost(2),index=Index.UN_TOKENIZED)
    private String email;

    @ManyToOne
    @JoinColumn(name="COUNTRY_ID")
    @IndexedEmbedded
    private Country country = new Country();

    @ManyToOne
    @JoinColumn(name="LOCATION_ID")
    @IndexedEmbedded
    private Country location = new Country();

    @Column(name="POST_CODE",length=30)
    private String postCode;

    @Column(name="TELEPHONE",length=30)
    @Field(boost=@Boost(1),index=Index.UN_TOKENIZED)
    private String telephone;

    @CollectionOfElements(targetElement=String.class)
    @JoinTable(name="T_WORK_PERMIT")
    private List<String> workPermit = new ArrayList<String>();

    @Column(name="DISPLAY_RESUME",length=1)
    private String displayResume="1";

    @ManyToOne
    @JoinColumn(name="WORK_SECTOR_ID",nullable=false)
    @IndexedEmbedded
    private WorkSector workSector = new WorkSector();

    @ManyToOne
    @JoinColumn(name="WORK_EXPERIENCE_ID",nullable=false)
    @IndexedEmbedded
    private WorkExperience workExperience = new WorkExperience();

    @Column(name="CUR_ROLE",length=30)
    @Field(boost=@Boost(1))
    private String currentRole;

    @ManyToOne
    @JoinColumn(name="EDUCATION_LEVEL_ID")
    @IndexedEmbedded
    private EducationLevel educationLevel;

    @ManyToOne
    @JoinColumn(name="LANGUAGE_ID")
    private Language language = new Language();

    @ManyToOne
    @JoinColumn(name="OTHER_LANGUAGE_ID")
    private Language otherLanguage = new Language();

    @ManyToOne
    @JoinColumn(name="LANGUAGE_FLUENCY_ID")
    private LanguageFluency languageFluency = new LanguageFluency();
    
    @ManyToOne
    @JoinColumn(name="OTHER_LANGUAGE_FLUENCY_ID")
    private LanguageFluency otherLanguageFluency = new LanguageFluency();

    @Column(name="RELOCATE",length=1)
    private String willingRelocate;

    @ManyToOne
    @JoinColumn(name="JOB_PREFERENCE_ID")
    @IndexedEmbedded
    private JobPreference jobPreference = new JobPreference();

    @Column(name="MINIMUM_RENUMERATION")
    private BigDecimal minimumRenumeration;

    @ManyToOne
    @JoinColumn(name="CURRENCY_ID")
    @IndexedEmbedded
    private Currency currency = new Currency();

    @Column(name="TRAVEL_PRECENTAGE")
    private Integer desiredTravel;

    @Column(name="EMPLOYMENT_TYPE",length=10)
    private String employmentType;

    @Column(name="SEARCHABLE",length=1)
    private String searchable="0";

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="DATE_CREATED",nullable=false,updatable=false)
    @Field(boost=@Boost(1))
    @DateBridge(resolution=Resolution.DAY)
    private Date dateCreated = new Date();
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="DATE_UPDATED")
    @DateBridge(resolution=Resolution.DAY)
    private Date dateUpdated;

    @ManyToOne
    @JoinColumn(name="EMPLOYEE_ID")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name="TITLE_ID")
    private Title title = new Title();

    @ManyToOne
    @JoinColumn(name="JOB_ROLE_ID")
    private JobRole jobRole = new JobRole();

    public JobRole getJobRole() {
        return jobRole;
    }

    public void setJobRole(JobRole jobRole) {
        this.jobRole = jobRole;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getResumeTitle() {
        return resumeTitle;
    }

    public void setResumeTitle(String resumeTitle) {
        this.resumeTitle = resumeTitle;
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

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResumeText() {
        return resumeText;
    }

    public void setResumeText(String resumeText) {
        this.resumeText = resumeText;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getCurrentRole() {
        return currentRole;
    }

    public void setCurrentRole(String currentRole) {
        this.currentRole = currentRole;
    }

    public String getDisplayResume() {
        return displayResume;
    }

    public void setDisplayResume(String displayResume) {
        this.displayResume = displayResume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public JobPreference getJobPreference() {
        return jobPreference;
    }

    public void setJobPreference(JobPreference jobPreference) {
        this.jobPreference = jobPreference;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getSearchable() {
        return searchable;
    }

    public void setSearchable(String searchable) {
        this.searchable = searchable;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public BigDecimal getMinimumRenumeration() {
        return minimumRenumeration;
    }

    public void setMinimumRenumeration(BigDecimal minimumRenumeration) {
        this.minimumRenumeration = minimumRenumeration;
    }

    public Integer getDesiredTravel() {
        return desiredTravel;
    }

    public void setDesiredTravel(Integer desiredTravel) {
        this.desiredTravel = desiredTravel;
    }

    public String getWillingRelocate() {
        return willingRelocate;
    }

    public void setWillingRelocate(String willingRelocate) {
        this.willingRelocate = willingRelocate;
    }

    public List<String> getWorkPermit() {
        return workPermit;
    }

    public void setWorkPermit(List<String> workPermit) {
        this.workPermit = workPermit;
    }

    public WorkSector getWorkSector() {
        return workSector;
    }

    public void setWorkSector(WorkSector workSector) {
        this.workSector = workSector;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public LanguageFluency getLanguageFluency() {
        return languageFluency;
    }

    public void setLanguageFluency(LanguageFluency languageFluency) {
        this.languageFluency = languageFluency;
    }

    public Language getOtherLanguage() {
        return otherLanguage;
    }

    public void setOtherLanguage(Language otherLanguage) {
        this.otherLanguage = otherLanguage;
    }

    public LanguageFluency getOtherLanguageFluency() {
        return otherLanguageFluency;
    }

    public void setOtherLanguageFluency(LanguageFluency otherLanguageFluency) {
        this.otherLanguageFluency = otherLanguageFluency;
    }

    public Country getLocation() {
        return location;
    }

    public void setLocation(Country location) {
        this.location = location;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

}
