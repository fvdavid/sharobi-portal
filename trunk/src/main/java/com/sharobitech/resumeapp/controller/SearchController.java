/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.controller;

import com.sharobitech.resumeapp.service.CatalogService;
import com.sharobitech.resumeapp.ui.form.AdvanceSearchForm;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
public class SearchController {

    @Autowired private CatalogService catalogService;

    @RequestMapping(value="/search/advance",method=RequestMethod.POST)
    public ModelAndView advanced(@ModelAttribute("advanceSearch") AdvanceSearchForm advanceSearchForm){
        ModelAndView mv = new ModelAndView();
        mv.addObject(new AdvanceSearchForm());
        mv.addObject(catalogService.getWorkSectors());
        mv.addObject(catalogService.getCountries());
        mv.addObject(catalogService.getWorkExperiences());
        return mv;
    }

    @RequestMapping(value="/search/advance",method=RequestMethod.GET)
    public ModelAndView advance(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping(value="/search/result",method=RequestMethod.POST)
    public ModelAndView result(@RequestParam("country") Integer country,
            @RequestParam("workSector") Integer workSector,
            @RequestParam("keyword") String keyword){
        StringBuilder builder = new StringBuilder();
        builder.append("result");
        builder.append("/" + keyword);
        builder.append("/" + country);
        builder.append("/" + workSector);
        ModelAndView mv = new ModelAndView(new RedirectView(builder.toString()));
        return mv;
    }

    @RequestMapping(value="/search/result/{keyword}/{countryId}/{sectorId}", method=RequestMethod.GET)
    public ModelAndView index(@PathVariable("keyword") String keyword,
            @PathVariable("countryId") Integer countryId,
            @PathVariable("sectorId") Integer sectorId){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/search/result");
        return mv;
    }

    @RequestMapping(value="/search/advresult",method=RequestMethod.POST)
    public ModelAndView result(@ModelAttribute("advanceSearchForm") AdvanceSearchForm a){
        StringBuilder builder = new StringBuilder();
        builder.append("/search/advresult");
        builder.append("/" + a.getKeyword());
        builder.append("/" + a.getCountry());
        builder.append("/" + a.getWorkSector());
        builder.append("/" + a.getSubSector());
        builder.append("/" + a.getType());
        builder.append("/" + a.getExperience());
        builder.append("/" + a.getRenumeration());
        builder.append("/" + a.getRenumerationValue());
        builder.append("/" + a.getShorting());
        ModelAndView mv = new ModelAndView(new RedirectView(builder.toString()));
        return mv;
    }

    @RequestMapping(value="/search/advresult/{keyword}/{location}/{sector}/{subsector}/{type}/{experience}/{renumeration}/{rvalue}/{short}",method=RequestMethod.GET)
    public ModelAndView advance(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/search/advresult");
        return mv;
    }

}
