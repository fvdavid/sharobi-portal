/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.ui.validator;

import com.sharobitech.resumeapp.model.catalog.WorkExperience;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author ifnu
 */
public class WorkExperienceValidator implements Validator{

    public boolean supports(Class<?> clazz) {
        return WorkExperience.class.equals(clazz);
    }

    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "id", "id.empty");
    }

}
