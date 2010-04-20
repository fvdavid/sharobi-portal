/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.dao.catalog;

import com.sharobitech.resumeapp.dao.base.BaseDaoHibernate;
import com.sharobitech.resumeapp.model.catalog.Country;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ifnu
 */
@Repository
public class CountryDao extends BaseDaoHibernate<Country>{

    public Country findByName(String text) {
        return (Country) sessionFactory.getCurrentSession()
                .createQuery("from Country c where c.name =:name")
                .setParameter("name", text)
                .uniqueResult();
    }

}
