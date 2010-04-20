/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.dao;

import com.sharobitech.resumeapp.dao.base.BaseDaoHibernate;
import com.sharobitech.resumeapp.model.User;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ifnu
 */
@Repository
public class UserDao extends BaseDaoHibernate<User>{

    public User findByEmail(String email) {
        return (User) sessionFactory.getCurrentSession()
                .createQuery("from User u where u.email=:email")
                .setString("email", email)
                .uniqueResult();
    }

    public User findByUserName(String userName) {
        return (User) sessionFactory.getCurrentSession()
                .createQuery("from User u where u.userName=:userName")
                .setString("userName", userName)
                .uniqueResult();
    }

}
