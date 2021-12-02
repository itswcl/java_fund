package com.wei.models;

import java.util.ArrayList;
import java.util.Date;

import com.wei.caresoft_interfaces.HIPAACompliantUser;

public class Physician extends User implements HIPAACompliantUser {
	
	private ArrayList<String> patientNotes;
	
	public Physician(Integer id) {
		super(id);
	}

	
	public boolean assignPin(int pin) {
		String pinString = String.valueOf(pin);
		
		if (pinString.length() == 4) {
			super.setPin(pin);
			return true;
		}
		return false;
	}
	
	
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (super.getId().equals(confirmedAuthID)) {
			return true;
		}
		return false;
	}


	public void newPatientNotes(String notes, String patientName, Date date) {
		String report = String.format("Datetime submitted: %s \n", date);
		report += String.format("Reported By ID: %s\n", this.id);
		report += String.format("Patient Name: %s\n", patientName);
		report += String.format("Notes: %s \n", notes);
		this.patientNotes.add(report);
		
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}



}
