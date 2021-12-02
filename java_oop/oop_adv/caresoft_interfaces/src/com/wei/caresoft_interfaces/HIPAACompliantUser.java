package com.wei.caresoft_interfaces;

public interface HIPAACompliantUser {
	abstract boolean accessAuthorized(Integer confirmedAuthID);
    abstract boolean assignPin(int pin);
}

