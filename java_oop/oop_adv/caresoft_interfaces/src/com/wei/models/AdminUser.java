package com.wei.models;

import java.util.ArrayList;
import java.util.Date;

import com.wei.caresoft_interfaces.HIPAACompliantAdmin;
import com.wei.caresoft_interfaces.HIPAACompliantUser;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
    
	public AdminUser(Integer employeeID, String role) {
		super(employeeID);
		setRole(role);
	}

	
	// from user interface
	public boolean assignPin(int pin) {
		String pinString = String.valueOf(pin);
		
		if (pinString.length() == 6) {
			super.setPin(pin);
			return true;
		}
		return false;
	}
	
	
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (confirmedAuthID.equals(getId())) {
			return true;
		} else {
			authIncident();
			return false;
		}
	}


    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    
    
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

	// from admin interface
	public ArrayList<String> reportSecurityIncidents() {
		return securityIncidents;
	}
	
	
	// getter setter
	public Integer getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

}
