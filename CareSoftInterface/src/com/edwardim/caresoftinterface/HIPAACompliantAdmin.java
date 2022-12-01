package com.edwardim.caresoftinterface;

import java.util.ArrayList;
public interface HIPAACompliantAdmin {
    
	// UNIMPLEMENTED METHODS
    abstract ArrayList<String> reportSecurityIncidents();
    
    // DEFAULT IMPLEMENTED METHODS
    // Used to print security incidents. 
    public default void printSecurityIncidents() {
        System.out.println(reportSecurityIncidents());
    }
    
    // QA Test, PASS/FAIL of reports against QA expected results
    public default boolean adminQATest(ArrayList<String> expectedIncidents) {
        if (reportSecurityIncidents().equals(expectedIncidents)) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        return reportSecurityIncidents().equals(expectedIncidents);
    }
    
}
