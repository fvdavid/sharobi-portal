/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.controller;

import com.sharobitech.resumeapp.model.Resume;
import com.sharobitech.resumeapp.service.CatalogService;
import com.sharobitech.resumeapp.service.ResumeService;
import com.sharobitech.resumeapp.ui.validator.ResumeValidator;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author ifnu
 */
@Controller
public class ResumeController {

    @Autowired private CatalogService catalogService;
    @Autowired private ResumeService resumeService;

    @RequestMapping(value="/register/resume",method=RequestMethod.GET)
    public ModelAndView registerResume(){
        ModelAndView mv = new ModelAndView();
        mv.addObject(catalogService.getWorkExperiences());
        mv.addObject(catalogService.getWorkSectors());
        mv.addObject(catalogService.getCountries());
        mv.addObject(catalogService.getLanguages());
        mv.addObject(catalogService.getLanguageFluencys());
        mv.addObject(catalogService.getJobPreferences());
        mv.addObject(catalogService.getJobRoles());
        mv.addObject(catalogService.getTitles());
        mv.addObject(new Resume());
        mv.setViewName("/resume-add");
        return mv;
    }

    @RequestMapping(value="/register/resume",method=RequestMethod.POST)
    public ModelAndView registerResume(HttpServletRequest request,@ModelAttribute("resume") Resume resume,BindingResult bindingResult,
            @RequestParam("resumeFile") MultipartFile resumeFile){
        ModelAndView mv = new ModelAndView();
        new ResumeValidator().validate(resume, bindingResult);
        if(bindingResult.hasErrors()){
            mv.setViewName("/resume-edit");
            mv.addObject(resume);
        } else {

            //open attachment and read the content
            //save resume
            resume.setResumeText(getResumeText(resumeFile));
            resume.setFileType(getFileType(resumeFile));
            resume.setFilePath(getFilePath(resumeFile));
            resumeService.save(resume,resumeFile);

            return new ModelAndView(new RedirectView(request.getContextPath() + "/s/view/resume/" + resume.getId()));
        }
        mv.addObject(catalogService.getWorkExperiences());
        mv.addObject(catalogService.getWorkSectors());
        mv.addObject(catalogService.getCountries());
        mv.addObject(catalogService.getLanguages());
        mv.addObject(catalogService.getLanguageFluencys());
        mv.addObject(catalogService.getJobPreferences());
        mv.addObject(catalogService.getJobRoles());
        return mv;
    }

    @RequestMapping(value="/view/resume/{id}",method=RequestMethod.GET)
    public ModelAndView viewResume(@PathVariable("id") Long id){
        ModelAndView mv = new ModelAndView();
        mv.addObject(resumeService.getResume(id));
        mv.setViewName("/resume-view");
        return mv;
    }

    public String getResumeText(MultipartFile resumeFile){
        return "";
    }

    public String getFileType(MultipartFile resumeFile){
        return "";
    }

    public String getFilePath(MultipartFile resumeFile){
        return "";
    }

}
