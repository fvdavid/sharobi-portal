/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.service;

import com.sharobitech.resumeapp.model.Resume;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ifnu
 */
public interface ResumeService {

    void save(Resume resume, MultipartFile resumeUpload);
    void delete(Resume resume, MultipartFile resumeUpload);
    Resume getResume(Long id);
    List<Resume> getResumes();
    List<Resume> getResumes(int start, int num);

}
