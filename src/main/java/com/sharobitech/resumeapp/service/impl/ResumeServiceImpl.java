/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.service.impl;

import com.sharobitech.resumeapp.dao.ResumeDao;
import com.sharobitech.resumeapp.model.Resume;
import com.sharobitech.resumeapp.service.ResumeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ifnu
 */
@Service("resumeService")
@Transactional(readOnly=true)
public class ResumeServiceImpl implements ResumeService{

    @Autowired private ResumeDao resumeDao;

    @Transactional
    public void save(Resume resume,MultipartFile resumeUpload) {
        //save file
        resumeDao.save(resume);
    }

    @Transactional
    public void delete(Resume resume,MultipartFile resumeUpload) {
        //rename old file
        //save file
        resumeDao.delete(resume);
    }

    public Resume getResume(Long id) {
        return resumeDao.findById(id);
    }

    public List<Resume> getResumes() {
        return resumeDao.findAll();
    }

    public List<Resume> getResumes(int start, int num) {
        return resumeDao.findAll(start, num);
    }

}
