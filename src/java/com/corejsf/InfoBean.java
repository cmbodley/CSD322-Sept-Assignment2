
package com.corejsf;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.util.Date;
import javax.validation.constraints.Past;

/**
 *
 * @author Zooey
 */

@Named("info") // or @ManagedBean(name="info")
@SessionScoped

public class InfoBean implements Serializable {
    
    private String name = "";
    private String address = "";
    @Past private Date dob = new Date();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    
}
