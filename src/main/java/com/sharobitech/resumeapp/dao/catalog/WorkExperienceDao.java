/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.dao.catalog;

import com.sharobitech.resumeapp.dao.base.BaseDaoHibernate;
import com.sharobitech.resumeapp.model.catalog.WorkExperience;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ifnu
 */
@Repository
public class WorkExperienceDao extends BaseDaoHibernate<WorkExperience>{

    public WorkExperience findByName(String name){
        return (WorkExperience) sessionFactory.getCurrentSession()
                .createQuery("from WorkExperience w where w.name=:name")
                .setString("name", name)
                .uniqueResult();
    }

}
