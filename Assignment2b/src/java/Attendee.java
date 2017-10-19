/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import javax.inject.Named;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.Past;
import javax.faces.component.UIComponent;
import javax.faces.component.UIComponent;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author john_
 */
@Named(value = "attendee")
@SessionScoped
public class Attendee implements Serializable {
    
    private String firstname;
    private String lastname;
    
    @Past 
    private Date DOB;
    
    private String address;
    private String postalCode;
    

    /**
     * Creates a new instance of Attendee
     */
    public Attendee() {
    }
   
    /**
     * @return the DOB
     */
    public Date getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String Submit() {        
        return "success";
    }

    /*public void dateCheck(FacesContext context, UIComponent component, String value)
        throws ValidatorException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        
        try {
            Date date = sdf.parse(value);
        } catch (ParseException ex) {
            Logger.getLogger(Attendee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(DOB);
        cal.add(Calendar.YEAR, -75);
        
        //Compare date to calendar
        
    }*/

    
}

