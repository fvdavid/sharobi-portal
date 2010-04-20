/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.model;

import com.sharobitech.resumeapp.model.catalog.WorkExperience;
import com.sharobitech.resumeapp.model.catalog.WorkSector;
import com.sharobitech.resumeapp.model.catalog.City;
import com.sharobitech.resumeapp.model.catalog.Title;
import com.sharobitech.resumeapp.model.catalog.Country;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ifnu
 */
@Entity
@Table(name="T_EMPLOYEE")
public class Employee implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="EMPLOYEE_ID")
    private Long id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @ManyToOne
    @JoinColumn(name="TITLE_NAME")
    private Title title;

    @ManyToOne
    @JoinColumn(name="WORK_EXPERIENCE_ID")
    private WorkExperience workExperience = new WorkExperience();

    @ManyToOne
    @JoinColumn(name="WORK_SECTOR_ID")
    private WorkSector workSector = new WorkSector();

    @ManyToOne
    @JoinColumn(name="COUNTRY_ID")
    private Country country = new Country();

    @ManyToOne
    @JoinColumn(name="CITY_ID")
    private City city = new City();

    @OneToMany(mappedBy="employee")
    private List<Resume> resumes;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="USER_ID")
    private User user= new User();

    @Column(name="NEWSLETTER")
    private String newsLetter;

    @Column(name="LATEST_UPDATE")
    private String lattestUpdate;

    @Column(name="CAREER_INFO")
    private String careerInfo;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCareerInfo() {
        return careerInfo;
    }

    public void setCareerInfo(String careerInfo) {
        this.careerInfo = careerInfo;
    }

    public String getLattestUpdate() {
        return lattestUpdate;
    }

    public void setLattestUpdate(String lattestUpdate) {
        this.lattestUpdate = lattestUpdate;
    }

    public String getNewsLetter() {
        return newsLetter;
    }

    public void setNewsLetter(String newsLetter) {
        this.newsLetter = newsLetter;
    }

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

    public List<Resume> getResumes() {
        return resumes;
    }

    public void setResumes(List<Resume> resumes) {
        this.resumes = resumes;
    }

    public WorkSector getWorkSector() {
        return workSector;
    }

    public void setWorkSector(WorkSector workSector) {
        this.workSector = workSector;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }


}
