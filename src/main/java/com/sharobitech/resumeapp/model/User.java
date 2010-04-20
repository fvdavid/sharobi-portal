/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ifnu
 */
@Entity
@Table(name="T_USER")
public class User implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="ID")
    private Long id;

    @Column(name="USER_NAME",unique=true,nullable=false,length=20)
    private String userName;

    @Column(name="EMAIL",unique=true,nullable=false,length=100)
    private String email;

    @Column(name="PASSWORD", nullable=false, length=255)
    private String password;

    @Column(name="PASSWORD_HINT", length=255)
    private String passwordHint;

    @Column(name="PASSWORD_RESET_FLAG", length=1)
    private String passwordResetFlag;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="LAST_LOGIN")
    private Date lastLogin;

    @Column(name="LAST_IP_ADDRESS")
    private String lastIpAddress;

    @Column(name="LAST_MACHINE_ID")
    private String lastMachineId;

    @Column(name="OLD_PASSWORD_1")
    private String oldPassword1;

    @Column(name="OLD_PASSWORD_2")
    private String oldPassword2;

    @Column(name="OLD_PASSWORD_3")
    private String oldPassword3;

    @Column(name="STATUS",length=1,nullable=false)
    private String status= "a"; //a and d

    @Column(name="ATTRIBUTE1",length=50)
    private String attribute1;

    @Column(name="ATTRIBUTE2",length=50)
    private String attribute2;

    @Column(name="ATTRIBUTE3",length=50)
    private String attribute3;

    @Column(name="ATTRIBUTE4",length=50)
    private String attribute4;

    @Column(name="ATTRIBUTE5",length=50)
    private String attribute5;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="DATE_CREATED",nullable=false,updatable=false)
    private Date dateCreated = new Date();

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="DATE_UPDATED")
    private Date dateUpdated = new Date();

    @OneToOne(mappedBy="user")
    private Employee employee;

    @OneToOne(mappedBy="user")
    private Employer employer;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
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

    public String getLastIpAddress() {
        return lastIpAddress;
    }

    public void setLastIpAddress(String lastIpAddress) {
        this.lastIpAddress = lastIpAddress;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastMachineId() {
        return lastMachineId;
    }

    public void setLastMachineId(String lastMachineId) {
        this.lastMachineId = lastMachineId;
    }

    public String getOldPassword1() {
        return oldPassword1;
    }

    public void setOldPassword1(String oldPassword1) {
        this.oldPassword1 = oldPassword1;
    }

    public String getOldPassword2() {
        return oldPassword2;
    }

    public void setOldPassword2(String oldPassword2) {
        this.oldPassword2 = oldPassword2;
    }

    public String getOldPassword3() {
        return oldPassword3;
    }

    public void setOldPassword3(String oldPassword3) {
        this.oldPassword3 = oldPassword3;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    public String getPasswordResetFlag() {
        return passwordResetFlag;
    }

    public void setPasswordResetFlag(String passwordResetFlag) {
        this.passwordResetFlag = passwordResetFlag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
