/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.controller;

import com.sharobitech.resumeapp.model.Employer;
import com.sharobitech.resumeapp.model.User;
import com.sharobitech.resumeapp.service.CatalogService;
import com.sharobitech.resumeapp.service.UserService;
import com.sharobitech.resumeapp.ui.form.EmployerForm;
import com.sharobitech.resumeapp.ui.validator.EmployerValidator;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author ifnu
 */
@Controller
public class EmployerController {
    
    @Autowired private CatalogService catalogService;
    @Autowired private UserService userService;

    @RequestMapping(value="/register/employer",method=RequestMethod.POST)
    public ModelAndView registerEmployer(HttpServletRequest request,
    @ModelAttribute("employer") EmployerForm employer,
            BindingResult bindingResult,
            Model model){
        new EmployerValidator().validate(employer, bindingResult);
        User userDb = userService.getUserByEmail(employer.getUser().getEmail());
        if(userDb!=null){
            bindingResult.rejectValue("employer.user.email", "email.exist");
        }
        userDb = userService.getUserByUserName(employer.getUser().getUserName());
        if(userDb!=null){
            bindingResult.rejectValue("employer.user.userName", "name.exist");
        }

        if(bindingResult.hasErrors()){
            ModelAndView mv = new ModelAndView();
            mv.addObject("employer",employer);
            mv.addObject(catalogService.getCountries());
            mv.setViewName("/employer-edit");
            return mv;
        } else {
            //validated
            employer.setCountry(catalogService.getCountry(employer.getCountry().getId()));
            userService.save(employer.getEmployer());
            return new ModelAndView(new RedirectView(request.getContextPath() + "/s/view/employer/" + employer.getId()));
        }
    }

    @RequestMapping(value="/register/employer",method=RequestMethod.GET)
    public ModelAndView registerEmployer(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        mv.addObject("employer",new EmployerForm());
        mv.addObject(catalogService.getCountries());
        mv.setViewName("/employer-add");
        return mv;
    }

    @RequestMapping(value="/update/employer/{id}",method=RequestMethod.GET)
    public ModelAndView updateEmployerResume(
            @PathVariable Long id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/employer-edit");
        return mv;
    }

    @RequestMapping(value="/update/employer",method=RequestMethod.POST)
    public ModelAndView updateEmployer(Employer employer, MultipartFile resume){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping(value="/view/employer/{id}",method=RequestMethod.GET)
    public ModelAndView viewEmployer(@PathVariable("id") Long employerId){
        Employer employer = userService.getEmployer(employerId);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/employer-view");
        mv.addObject(employer);
        return mv;
    }

}
