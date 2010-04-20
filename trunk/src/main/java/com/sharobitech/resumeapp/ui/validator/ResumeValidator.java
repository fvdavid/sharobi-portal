/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.ui.validator;

import com.sharobitech.resumeapp.model.Resume;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author ifnu
 */
public class ResumeValidator implements Validator{

    public boolean supports(Class<?> clazz) {
        return Resume.class.equals(clazz);
    }

    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "country.id", "country.empty");
        ValidationUtils.rejectIfEmpty(errors, "currency.id", "currency.empty");
        ValidationUtils.rejectIfEmpty(errors, "desiredTravel", "desiredTravel.empty");
        ValidationUtils.rejectIfEmpty(errors, "email", "email.empty");
        ValidationUtils.rejectIfEmpty(errors, "employmentType", "employmentType.empty");
        ValidationUtils.rejectIfEmpty(errors, "firstName", "firstName.empty");
        ValidationUtils.rejectIfEmpty(errors, "jobPreference.id", "jobPreference.empty");
        ValidationUtils.rejectIfEmpty(errors, "jobRole.id", "jobRole.empty");
        ValidationUtils.rejectIfEmpty(errors, "language.id", "language.empty");
        ValidationUtils.rejectIfEmpty(errors, "languageFluency.id", "languageFluency.empty");
        ValidationUtils.rejectIfEmpty(errors, "minimumRenumeration", "minimumRenumeration.empty");
        ValidationUtils.rejectIfEmpty(errors, "resumeTitle", "resumeTitle.empty");
        ValidationUtils.rejectIfEmpty(errors, "surName", "surName.empty");
        ValidationUtils.rejectIfEmpty(errors, "telephone", "telephone.empty");
        ValidationUtils.rejectIfEmpty(errors, "title.id", "title.empty");
        ValidationUtils.rejectIfEmpty(errors, "willingRelocate", "willingRelocate.empty");

    }

}
