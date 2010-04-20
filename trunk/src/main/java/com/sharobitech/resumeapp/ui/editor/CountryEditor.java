/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.ui.editor;

import com.sharobitech.resumeapp.model.catalog.Country;
import com.sharobitech.resumeapp.service.CatalogService;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author ifnu
 */
public class CountryEditor extends PropertyEditorSupport {

    private final CatalogService catalogService;

    public CountryEditor(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @Override
    public String getAsText() {
        Country c = (Country) getValue();
        return c.getName();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Country c = catalogService.getCountry(Long.valueOf(text));
        setValue(c);
    }

}
