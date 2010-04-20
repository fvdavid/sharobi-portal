/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.controller;

import com.sharobitech.resumeapp.model.Employee;
import com.sharobitech.resumeapp.model.User;
import com.sharobitech.resumeapp.service.CatalogService;
import com.sharobitech.resumeapp.service.UserService;
import com.sharobitech.resumeapp.ui.form.EmployeeForm;
import com.sharobitech.resumeapp.ui.validator.EmployeeValidator;
import com.sharobitech.resumeapp.ui.validator.UserValidator;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author ifnu
 */
@Controller
public class EmployeeController {

    @Autowired private CatalogService catalogService;
    @Autowired private UserService userService;


    @RequestMapping(value="/register/employee",method=RequestMethod.GET)
    public ModelAndView registerEmployee(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        mv.addObject("employee", new EmployeeForm());
        mv.setViewName("/employee-add");
        mv.addObject(catalogService.getWorkExperiences());
        mv.addObject(catalogService.getWorkSectors());
        mv.addObject(catalogService.getCountries());
        mv.addObject(catalogService.getCities());
        mv.addObject(catalogService.getTitles());
        return mv;
    }

    @RequestMapping(value="/register/employee",method=RequestMethod.POST)
    public ModelAndView registerEmployee(HttpServletRequest request, @ModelAttribute("employee") EmployeeForm employee,
            BindingResult bindingResult){
        new EmployeeValidator(new UserValidator()).validate(employee, bindingResult);
        User userDb = userService.getUserByEmail(employee.getUser().getEmail());
        if(userDb!=null){
            bindingResult.rejectValue("employee.user.email", "email.exist");
        }
        userDb = userService.getUserByUserName(employee.getUser().getUserName());
        if(userDb!=null){
            bindingResult.rejectValue("employee.user.userName", "name.exist");
        }
        if(bindingResult.hasErrors()){
            ModelAndView mv = new ModelAndView();
            mv.addObject("employee",employee);
            mv.addObject(catalogService.getWorkExperiences());
            mv.addObject(catalogService.getWorkSectors());
            mv.addObject(catalogService.getCountries());
            mv.addObject(catalogService.getCities());
            mv.addObject(catalogService.getTitles());
            mv.setViewName("/employee-edit");
            return mv;
        } else {
            //validated
            employee.setCity(catalogService.getCity(employee.getCity().getId()));
            employee.setCountry(catalogService.getCountry(employee.getCountry().getId()));
            employee.setTitle(catalogService.getTitle(employee.getTitle().getId()));
            employee.setWorkExperience(catalogService.getWorkExperience(employee.getWorkExperience().getId()));
            employee.setWorkSector(catalogService.getWorkSector(employee.getWorkSector().getId()));
            userService.save(employee.getEmployee());
            return new ModelAndView(new RedirectView(request.getContextPath()+"/s/view/employee/" + employee.getId()));
        }
    }

    @RequestMapping(value="/view/employee/{id}",method=RequestMethod.GET)
    public ModelAndView viewEmployee(@PathVariable("id") Long employeeId){
        Employee employee = userService.getEmployee(employeeId);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/employee-view");
        mv.addObject(employee);
        return mv;
    }

    @RequestMapping(value="/update/employee/{id}",method=RequestMethod.GET)
    public ModelAndView updateEmployee(@PathVariable("id") Long employeeId){
        Employee employee = userService.getEmployee(employeeId);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/employee-edit");
        mv.addObject(new EmployeeForm(employee));
        return mv;
    }
}
