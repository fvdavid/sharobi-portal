/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.ui.editor;

import com.sharobitech.resumeapp.model.catalog.WorkSector;
import com.sharobitech.resumeapp.service.CatalogService;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author ifnu
 */
public class WorkSectorEditor extends PropertyEditorSupport {

    private final CatalogService catalogService;

    public WorkSectorEditor(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @Override
    public String getAsText() {
        WorkSector c = (WorkSector) getValue();
        return c.getName();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        WorkSector c = catalogService.getWorkSector(Long.valueOf(text));
        setValue(c);
    }

}
