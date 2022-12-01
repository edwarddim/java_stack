package com.edwardim.test;

import java.util.ArrayList;

import com.edwardim.caresoftinterface.HIPAACompliantAdmin;
import com.edwardim.caresoftinterface.HIPAACompliantUser;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {

	@Override
	public boolean assignPin(int pin) {
		// Pin must be 6 digits or more; returns false if not
		// Expected to assign the pin to the user (as a member variable)
		String pinString = Integer.toString(pin);
		if(pinString.length() < 6) {
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

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return null;
	}

}
