package com.corejsf;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named; 
import javax.enterprise.context.SessionScoped; 

@Named("user") // or @ManagedBean(name="user")
@SessionScoped
public class userBean implements Serializable {
    
   private String name;
   private String address;
   private Date date;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
}