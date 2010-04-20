/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.service.impl;

import com.sharobitech.resumeapp.dao.EmployeeDao;
import com.sharobitech.resumeapp.dao.EmployerDao;
import com.sharobitech.resumeapp.dao.UserDao;
import com.sharobitech.resumeapp.model.Employee;
import com.sharobitech.resumeapp.model.Employer;
import com.sharobitech.resumeapp.model.User;
import com.sharobitech.resumeapp.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ifnu
 */
@Service("userService")
@Transactional(readOnly=true)
public class UserServiceImpl implements UserService{

    @Autowired private UserDao userDao;
    @Autowired private EmployeeDao employeeDao;
    @Autowired private EmployerDao employerDao;

    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional
    public void delete(User user) {
        userDao.delete(user);
    }

    public User getUser(Long id) {
        return userDao.findById(id);
    }

    public User getUserByEmail(String email){
        return userDao.findByEmail(email);
    }

    public User getUserByUserName(String userName){
        return userDao.findByUserName(userName);
    }

    public List<User> getUsers() {
        return userDao.findAll();
    }

    public List<User> getUsers(int start, int num) {
        return userDao.findAll(start, num);
    }

    @Transactional
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Transactional
    public void delete(Employee employee) {
        employeeDao.delete(employee);
    }

    public Employee getEmployee(Long id) {
        return employeeDao.findById(id);
    }

    public List<Employee> getEmployees() {
        return employeeDao.findAll();
    }

    public List<Employee> getEmployees(int start, int num) {
        return employeeDao.findAll(start, num);
    }

    @Transactional
    public void save(Employer employer) {
        employerDao.save(employer);
    }

    @Transactional
    public void delete(Employer employer) {
        employerDao.delete(employer);
    }

    public Employer getEmployer(Long id) {
        return employerDao.findById(id);
    }

    public List<Employer> getEmployers() {
        return employerDao.findAll();
    }

    public List<Employer> getEmployers(int start, int num) {
        return employerDao.findAll(start, num);
    }

}
