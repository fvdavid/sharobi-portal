/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.controller;

import com.sharobitech.resumeapp.model.Apply;
import com.sharobitech.resumeapp.model.JobPosting;
import com.sharobitech.resumeapp.service.JobPostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ifnu
 */
@Controller
public class JobPostingController {

    @Autowired JobPostingService jobPortalService;

    @RequestMapping(value="/register/job")
    public ModelAndView postJob(@ModelAttribute("jobPosting")JobPosting jobPosting){

        ModelAndView mv = new ModelAndView();
        return mv;


    }

    @RequestMapping(value="/apply")
    public ModelAndView apply(Apply apply){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

}
