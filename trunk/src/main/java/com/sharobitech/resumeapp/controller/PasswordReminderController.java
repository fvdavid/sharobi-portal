/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author ifnu
 */
@Controller
public class PasswordReminderController {

    @RequestMapping(value="/employee-reminder",method=RequestMethod.GET)
    public ModelAndView employeePasswordReminder(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping(value="/employee-reminder",method=RequestMethod.POST)
    public ModelAndView employeePasswordReminder(@RequestParam("email") String email){
        ModelAndView mv = new ModelAndView(new RedirectView("/reminder-success"));
        return mv;
    }

    @RequestMapping(value="/employer-reminder",method=RequestMethod.GET)
    public ModelAndView employerPasswordReminder(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping(value="/reminder-success",method=RequestMethod.GET)
    public ModelAndView reminderSuccess(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping(value="/employer-reminder",method=RequestMethod.POST)
    public ModelAndView employerPasswordReminder(@RequestParam("email") String email){
        ModelAndView mv = new ModelAndView(new RedirectView("/reminder-success"));
        return mv;
    }

}
