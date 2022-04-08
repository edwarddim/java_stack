package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    // MEMBER VARIABLE 
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    
    // TO DO: Implement HIPAACompliantUser!
	@Override
	public boolean assignPin(int pin) {
		
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		
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
    // TO DO: GENERATE GETTERS / SETTERS

    
}
