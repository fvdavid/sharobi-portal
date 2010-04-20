/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.model;

import com.sharobitech.resumeapp.model.catalog.Country;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ifnu
 */
@Entity
@Table(name="T_EMPLOYER")
public class Employer implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="EMPLOYEE_ID")
    private Long id;

    @Column(name="FIRST_NAME",nullable=false,length=30)
    private String firstName;

    @Column(name="LAST_NAME",nullable=false,length=40)
    private String lastName;

    @Column(name="NEWSLETTER",nullable=false,length=1)
    private String newsLetter;

    @Column(name="COMPANY_TYPE",nullable=false,length=1)
    private String companyType; //r = recruitment, e = employer, a = ad agency

    @Column(name="COMPANY_NAME",nullable=false)
    private String companyName;

    @ManyToOne
    @JoinColumn(name="COUNTRY_ID",nullable=false)
    private Country country = new Country();

    @Column(name="TELEPHONE",length=100,nullable=false)
    private String telephone;

    @Column(name="HELP")
    private String help;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="USER_ID")
    private User user = new User();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
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

    public String getNewsLetter() {
        return newsLetter;
    }

    public void setNewsLetter(String newsLetter) {
        this.newsLetter = newsLetter;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}
