package com.wei.models;

import com.wei.interface_implementation.ACPowerable;

public class Heater implements ACPowerable {
	public Integer fanSpeedPercent = 0;
	public Integer heatSettingPercent = 0;
	public Boolean isPluggedIn = false;
	public Integer maxWattage;
	
	public Heater(Integer maxWattage) {
		this.maxWattage = maxWattage;
	}
	
	public void applySettings(Integer fanSpeedPercent, Integer heatSettingPercent) {
		this.fanSpeedPercent = fanSpeedPercent;
		this.heatSettingPercent = heatSettingPercent;
	}
	
	public void plugIn() {
		this.isPluggedIn = true;
	}
	
	@Override
	public void unPlug() {
		// TODO Auto-generated method stub
		this.isPluggedIn = false;
	}

	@Override
	public boolean checkPluggedIn() {
		// TODO Auto-generated method stub
		return isPluggedIn;
	}
	
	public void checkPowerConsumption() {
		if (isPluggedIn) {
			Double power = 0.0;
			
			power += maxWattage * 0.5 * fanSpeedPercent * 0.01;
			power += maxWattage * 0.5 * heatSettingPercent * 0.01;
			
			System.out.println("The heater is consuming " + power + "Watts!");
		} else {
			System.out.println("The heater isn't plugged in!");
		}
	}

}
