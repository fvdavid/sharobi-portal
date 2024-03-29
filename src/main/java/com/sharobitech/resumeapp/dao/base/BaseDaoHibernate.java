/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharobitech.resumeapp.dao.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author martin
 */
public class BaseDaoHibernate<T> {

    @SuppressWarnings("unchecked")
    protected Class domainClass;
    @Autowired protected SessionFactory sessionFactory;

//    private static Log LOGGER  = LogFactory.getLog(BaseDaoHibernate.class);

    @SuppressWarnings("unchecked")
    public BaseDaoHibernate() {
        this.domainClass = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @SuppressWarnings("unchecked")
    public T findById(Long id) {
        if(id == null) return null;
        final T domain = (T) sessionFactory.getCurrentSession().get(domainClass, id);
        return domain;
    }

    public T save(T domain) {
        sessionFactory.getCurrentSession().saveOrUpdate(domain);
        return domain;
    }

    public void delete(T domain) {
        sessionFactory.getCurrentSession().delete(domain);
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll(Integer startIndex, Integer pageSize) {
        return sessionFactory.getCurrentSession().createQuery("from " + domainClass.getName()).setFirstResult(startIndex).setMaxResults(pageSize).list();
    }
    
    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from " + domainClass.getName()).list();
    }

}
