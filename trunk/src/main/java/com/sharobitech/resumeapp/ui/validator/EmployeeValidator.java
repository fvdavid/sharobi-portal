/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.ui.validator;

import com.sharobitech.resumeapp.model.Employee;
import com.sharobitech.resumeapp.model.User;
import com.sharobitech.resumeapp.ui.form.EmployeeForm;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author ifnu
 */
public class EmployeeValidator implements Validator{

    private final Validator userValidator;

    public EmployeeValidator(Validator userValidator) {
        if(userValidator==null){
            throw new IllegalArgumentException("Validator cannot be null");
        }
        if(!userValidator.supports(User.class)){
            throw new IllegalArgumentException("Validator does not support User.class");
        }
        this.userValidator = userValidator;
    }

    public boolean supports(Class<?> clazz) {
        return EmployeeForm.class.equals(clazz);
    }

    public void validate(Object val, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "title", "title.empty");
        ValidationUtils.rejectIfEmpty(errors, "email2", "email2.empty");
        ValidationUtils.rejectIfEmpty(errors, "password2", "password2.empty");
        ValidationUtils.rejectIfEmpty(errors, "firstName", "firstName.empty");
        ValidationUtils.rejectIfEmpty(errors, "lastName", "lastName.empty");
        ValidationUtils.rejectIfEmpty(errors, "country.id", "country.empty");
        ValidationUtils.rejectIfEmpty(errors, "workExperience.id", "workExperience.empty");
        ValidationUtils.rejectIfEmpty(errors, "workSector.id", "workSector.empty");
        ValidationUtils.rejectIfEmpty(errors, "title.id", "title.empty");
        ValidationUtils.rejectIfEmpty(errors, "newsLetter", "newsLetter.empty");
        ValidationUtils.rejectIfEmpty(errors, "lattestUpdate", "lattestUpdate.empty");
        ValidationUtils.rejectIfEmpty(errors, "careerInfo", "careerInfo.empty");
        EmployeeForm e = (EmployeeForm) val;
        if(e.getEmail2()!=null && !e.getEmail2().equals(e.getUser().getEmail())){
            errors.rejectValue("email2", "email2.notequal");
        }
        if(e.getPassword2()!=null && !e.getPassword2().equals(e.getUser().getPassword())){
            errors.rejectValue("password2", "password2.notequal");
        }
        try{
            errors.pushNestedPath("user");
            ValidationUtils.invokeValidator(userValidator, e.getUser(), errors);
        } finally{
            errors.popNestedPath();
        }
    }

}
