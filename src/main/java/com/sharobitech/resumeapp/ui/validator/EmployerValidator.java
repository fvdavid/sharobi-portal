/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.ui.validator;

import com.sharobitech.resumeapp.ui.form.EmployerForm;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author ifnu
 */
public class EmployerValidator implements Validator{

    public boolean supports(Class<?> clazz) {
        return EmployerForm.class.equals(clazz);
    }

    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "companyType", "companyType.empty");
        ValidationUtils.rejectIfEmpty(errors, "companyName", "companyName.empty");
        ValidationUtils.rejectIfEmpty(errors, "country.id", "country.empty");
        ValidationUtils.rejectIfEmpty(errors, "email2", "email2.empty");
        ValidationUtils.rejectIfEmpty(errors, "firstName", "firstName.empty");
        ValidationUtils.rejectIfEmpty(errors, "lastName", "lastName.empty");
        ValidationUtils.rejectIfEmpty(errors, "newsLetter", "newsLetter.empty");
        ValidationUtils.rejectIfEmpty(errors, "password2", "password2.empty");
        ValidationUtils.rejectIfEmpty(errors, "telephone", "telephone.empty");
        ValidationUtils.rejectIfEmpty(errors, "user.email", "email.empty");
        ValidationUtils.rejectIfEmpty(errors, "user.password", "password.empty");
        ValidationUtils.rejectIfEmpty(errors, "user.userName", "name.empty");
        EmployerForm e = (EmployerForm) o;
        if(e.getEmail2()!=null && !e.getEmail2().equals(e.getUser().getEmail())){
            errors.rejectValue("email2", "email2.notequal");
        }
        if(e.getPassword2()!=null && !e.getPassword2().equals(e.getUser().getPassword())){
            errors.rejectValue("password2", "password2.notequal");
        }

    }

}
