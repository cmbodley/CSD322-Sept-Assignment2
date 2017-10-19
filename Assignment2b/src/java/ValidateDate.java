/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Calendar;
import java.util.Date;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author John Policicchio
 */
@Named(value = "validateDate")
@FacesValidator("dateValidator")
public class ValidateDate implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        // Hold DOB
        Date date = (Date) value;
        
        // Convert to calendar
        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(date);       
        
        // Roll back calendar
        Calendar pastDate = Calendar.getInstance();
        pastDate.setTime(date);
        pastDate.add(Calendar.YEAR, -75);
        
        // Validation logic
        if (currentDate.before(pastDate)){
            throw new ValidatorException(new FacesMessage("DOB too far in the past!"));             
        } else if(currentDate.after(currentDate)){        
            throw new ValidatorException(new FacesMessage("DOB cannot be in the future!"));  
        } else {
            
        }         
    }    
}
