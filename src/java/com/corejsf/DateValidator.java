/*
    Michael Morrow
    CSD322
    lab02
*/
package com.corejsf;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;

@FacesValidator("dateValidator")

public class DateValidator implements Validator {
    
    String dateInput, dateInputYear;
    int year;
    FacesMessage fmsg;
    
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) 
    throws ValidatorException {
        
        dateInput = value.toString();
        dateInputYear = dateInput.substring(dateInput.length() - 4);
        year = Integer.parseInt(dateInputYear);

        if (year < 1942){
            fmsg = new FacesMessage("You are too old, please consult your carer.");
            throw new ValidatorException(fmsg);
        }
        else if (year > 2017){
            fmsg = new FacesMessage("You have not been born yet, please remain in utero until gestation is complete.");
            throw new ValidatorException(fmsg);
        }
    }
}
