/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.controller;

import com.sharobitech.resumeapp.utils.RedirectConstants;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ifnu
 */
@Controller
public class LoginController {

    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public ModelAndView login(String user, String password){

        //
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping(value="/login",method=RequestMethod.GET)
    public ModelAndView login(HttpServletRequest request){

        ModelAndView mv = new ModelAndView(); //ridirect
        return mv;
    }

    @RequestMapping(value="/rlogin",method=RequestMethod.POST)
    public ModelAndView rlogin(String user, String password){

        //
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping(value="/rlogin",method=RequestMethod.GET)
    public ModelAndView rlogin(HttpServletRequest request){

        ModelAndView mv = new ModelAndView(); //ridirect
        return mv;
    }

    @RequestMapping(value="/logout",method=RequestMethod.GET)
    public String logout(HttpServletRequest request){
        request.getSession().invalidate();
        return "redirect:" + RedirectConstants.LOGIN_REDIRECT;
    }
}
