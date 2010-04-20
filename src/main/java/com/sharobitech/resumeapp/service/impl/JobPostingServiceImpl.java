/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.service.impl;

import com.sharobitech.resumeapp.dao.ApplyDao;
import com.sharobitech.resumeapp.dao.JobPostingDao;
import com.sharobitech.resumeapp.model.Apply;
import com.sharobitech.resumeapp.model.JobPosting;
import com.sharobitech.resumeapp.service.JobPostingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ifnu
 */
@Service("jobPostingService")
@Transactional(readOnly=true)
public class JobPostingServiceImpl implements JobPostingService{

    @Autowired private JobPostingDao jobPostingDao;
    @Autowired private ApplyDao applyDao;

    @Transactional
    public void save(JobPosting jobPosting) {
        jobPostingDao.save(jobPosting);
    }

    @Transactional
    public void delete(JobPosting jobPosting) {
        jobPostingDao.delete(jobPosting);
    }

    public JobPosting getJobPosting(Long id) {
        return jobPostingDao.findById(id);
    }

    public List<JobPosting> getJobPostings() {
        return jobPostingDao.findAll();
    }

    public List<JobPosting> getJobPostings(int start, int num) {
        return jobPostingDao.findAll(start, num);
    }

    @Transactional
    public void save(Apply apply) {
        applyDao.save(apply);
    }

    @Transactional
    public void delete(Apply apply) {
        applyDao.delete(apply);
    }

    public Apply getApply(Long id) {
        return applyDao.findById(id);
    }

    public List<Apply> getApplies() {
        return applyDao.findAll();
    }

    public List<Apply> getApplies(int start, int num) {
        return applyDao.findAll(start, num);
    }


}
