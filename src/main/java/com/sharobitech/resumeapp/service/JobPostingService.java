/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.service;

import com.sharobitech.resumeapp.model.Apply;
import com.sharobitech.resumeapp.model.JobPosting;
import java.util.List;

/**
 *
 * @author ifnu
 */
public interface JobPostingService {

    void save(JobPosting jobPosting);
    void delete(JobPosting jobPosting);
    JobPosting getJobPosting(Long id);
    List<JobPosting> getJobPostings();
    List<JobPosting> getJobPostings(int start, int num);

    void save(Apply apply);
    void delete(Apply apply);
    Apply getApply(Long id);
    List<Apply> getApplies();
    List<Apply> getApplies(int start, int num);

}
