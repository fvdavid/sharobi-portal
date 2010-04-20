/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.controller;

import com.sharobitech.resumeapp.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author ifnu
 */
@Controller
public class CatalogController {

    @Autowired private CatalogService catalogService;
}
