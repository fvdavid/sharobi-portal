/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.ui.form;

import com.sharobitech.resumeapp.model.Employee;
import com.sharobitech.resumeapp.model.Resume;
import com.sharobitech.resumeapp.model.User;
import com.sharobitech.resumeapp.model.catalog.City;
import com.sharobitech.resumeapp.model.catalog.Country;
import com.sharobitech.resumeapp.model.catalog.Title;
import com.sharobitech.resumeapp.model.catalog.WorkExperience;
import com.sharobitech.resumeapp.model.catalog.WorkSector;
import java.util.List;

/**
 *
 * @author ifnu
 */
public class EmployeeForm {

    private Employee employee = new Employee();
    private String email2;
    private String password2;

    public EmployeeForm() {
    }

    public EmployeeForm(Employee employee) {
        this.employee = employee;
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

    public void setWorkSector(WorkSector workSector) {
        employee.setWorkSector(workSector);
    }

    public void setWorkExperience(WorkExperience workExperience) {
        employee.setWorkExperience(workExperience);
    }

    public void setUser(User user) {
        employee.setUser(user);
    }

    public void setTitle(Title title) {
        employee.setTitle(title);
    }

    public void setResumes(List<Resume> resumes) {
        employee.setResumes(resumes);
    }

    public void setNewsLetter(String newsLetter) {
        employee.setNewsLetter(newsLetter);
    }

    public void setLattestUpdate(String lattestUpdate) {
        employee.setLattestUpdate(lattestUpdate);
    }

    public void setLastName(String lastName) {
        employee.setLastName(lastName);
    }

    public void setId(Long id) {
        employee.setId(id);
    }

    public void setFirstName(String firstName) {
        employee.setFirstName(firstName);
    }

    public void setCountry(Country country) {
        employee.setCountry(country);
    }

    public void setCity(City city) {
        employee.setCity(city);
    }

    public void setCareerInfo(String careerInfo) {
        employee.setCareerInfo(careerInfo);
    }

    public WorkSector getWorkSector() {
        return employee.getWorkSector();
    }

    public WorkExperience getWorkExperience() {
        return employee.getWorkExperience();
    }

    public User getUser() {
        return employee.getUser();
    }

    public Title getTitle() {
        return employee.getTitle();
    }

    public List<Resume> getResumes() {
        return employee.getResumes();
    }

    public String getNewsLetter() {
        return employee.getNewsLetter();
    }

    public String getLattestUpdate() {
        return employee.getLattestUpdate();
    }

    public String getLastName() {
        return employee.getLastName();
    }

    public Long getId() {
        return employee.getId();
    }

    public String getFirstName() {
        return employee.getFirstName();
    }

    public Country getCountry() {
        return employee.getCountry();
    }

    public City getCity() {
        return employee.getCity();
    }

    public String getCareerInfo() {
        return employee.getCareerInfo();
    }

    public Employee getEmployee() {
        return employee;
    }

}
