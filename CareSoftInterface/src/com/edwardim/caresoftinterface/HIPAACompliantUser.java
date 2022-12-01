package com.edwardim.caresoftinterface;

public interface HIPAACompliantUser {
    abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}
