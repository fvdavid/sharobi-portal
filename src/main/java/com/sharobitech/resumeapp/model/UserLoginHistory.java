/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ifnu
 */
@Entity
@Table(name="T_USER_LOGIN_HISTORY")
public class UserLoginHistory implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="USER_LOGIN_ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="USER_ID",nullable=false)
    private User user;

    @Column(name="IP_ADDRESS")
    private String ipAddress;

    @Column(name="MACHINE_NAME")
    private String machineName;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    

}
