package com.wei.interface_implementation;

public interface ACPowerable {
	Integer voltage = 120;
	Integer frequency = 60;
	
	// abstract - able to declared without implementation
	// require when you extend the class for class below
	// like placeholder for class to use
	abstract void unPlug();
	abstract boolean checkPluggedIn();
	
	
	// default method, no need implementation
	
	public default void hasPower() {
		String message = "The device is ";
		if(!checkPluggedIn()) {
			message += "not ";
		}
		System.out.println(message + "plugged in.");
	}
	
	// static method only able to call on interface
}
