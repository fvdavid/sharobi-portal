/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.ui.form;

import com.sharobitech.resumeapp.model.Employer;
import com.sharobitech.resumeapp.model.User;
import com.sharobitech.resumeapp.model.catalog.Country;

/**
 *
 * @author ifnu
 */
public class EmployerForm {
    private Employer employer;
    private String email2;
    private String password2;

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public EmployerForm() {
        employer = new Employer();
    }

    public EmployerForm(Employer employer) {
        this.employer = employer;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public void setUser(User user) {
        employer.setUser(user);
    }

    public void setTelephone(String telephone) {
        employer.setTelephone(telephone);
    }

    public void setNewsLetter(String newsLetter) {
        employer.setNewsLetter(newsLetter);
    }

    public void setLastName(String lastName) {
        employer.setLastName(lastName);
    }

    public void setId(Long id) {
        employer.setId(id);
    }

    public void setHelp(String help) {
        employer.setHelp(help);
    }

    public void setFirstName(String firstName) {
        employer.setFirstName(firstName);
    }

    public void setCountry(Country country) {
        employer.setCountry(country);
    }

    public void setCompanyType(String companyType) {
        employer.setCompanyType(companyType);
    }

    public void setCompanyName(String companyName) {
        employer.setCompanyName(companyName);
    }

    public User getUser() {
        return employer.getUser();
    }

    public String getTelephone() {
        return employer.getTelephone();
    }

    public String getNewsLetter() {
        return employer.getNewsLetter();
    }

    public String getLastName() {
        return employer.getLastName();
    }

    public Long getId() {
        return employer.getId();
    }

    public String getHelp() {
        return employer.getHelp();
    }

    public String getFirstName() {
        return employer.getFirstName();
    }

    public Country getCountry() {
        return employer.getCountry();
    }

    public String getCompanyType() {
        return employer.getCompanyType();
    }

    public String getCompanyName() {
        return employer.getCompanyName();
    }
    

}
