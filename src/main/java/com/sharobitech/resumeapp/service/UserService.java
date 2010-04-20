/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.service;

import com.sharobitech.resumeapp.model.Employee;
import com.sharobitech.resumeapp.model.Employer;
import com.sharobitech.resumeapp.model.User;
import java.util.List;

/**
 *
 * @author ifnu
 */
public interface UserService {

    void save(User user);
    void delete(User user);
    User getUser(Long id);
    User getUserByEmail(String email);
    User getUserByUserName(String userName);
    List<User> getUsers();
    List<User> getUsers(int start, int num);

    void save(Employee employee);
    void delete(Employee employee);
    Employee getEmployee(Long id);
    List<Employee> getEmployees();
    List<Employee> getEmployees(int start, int num);

    void save(Employer employer);
    void delete(Employer employer);
    Employer getEmployer(Long id);
    List<Employer> getEmployers();
    List<Employer> getEmployers(int start, int num);

}
