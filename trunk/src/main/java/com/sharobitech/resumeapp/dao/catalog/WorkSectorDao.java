/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.dao.catalog;

import com.sharobitech.resumeapp.dao.base.BaseDaoHibernate;
import com.sharobitech.resumeapp.model.catalog.WorkSector;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ifnu
 */
@Repository
public class WorkSectorDao extends BaseDaoHibernate<WorkSector>{

    public WorkSector findByName(String name) {
        return (WorkSector) sessionFactory.getCurrentSession()
                .createQuery("from WorkSector w where w.name=:name")
                .setString("name", name)
                .uniqueResult();
    }

}
