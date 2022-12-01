package com.edwardim.test;

import java.util.ArrayList;
import java.util.Date;

import com.edwardim.caresoftinterface.HIPAACompliantUser;

public class Physician extends User implements HIPAACompliantUser  {

    // Inside class:    
    private ArrayList<String> patientNotes;
	
    public Physician(Integer id) {
    	this.id = id;
    }

	@Override
	public boolean assignPin(int pin) {
		// Pin must be exactly 4 digits, returns false if not.
		// Expected to assign the pin to the user (as a member variable)
		String pinString = Integer.toString(pin);
		if(pinString.length() != 4) {
			return false;
		}
		this.pin = pin;
		return true;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return false;
	}
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
    
    
    // TO DO: Setters & Getters
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
}
