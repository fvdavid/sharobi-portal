/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.ui.editor;

import com.sharobitech.resumeapp.model.catalog.WorkExperience;
import com.sharobitech.resumeapp.service.CatalogService;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author ifnu
 */
public class WorkExperienceEditor extends PropertyEditorSupport {

    private final CatalogService catalogService;

    public WorkExperienceEditor(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @Override
    public String getAsText() {
        WorkExperience c = (WorkExperience) getValue();
        return c.getName();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        WorkExperience c = catalogService.getWorkExperience(Long.valueOf(text));
        setValue(c);
    }

}
