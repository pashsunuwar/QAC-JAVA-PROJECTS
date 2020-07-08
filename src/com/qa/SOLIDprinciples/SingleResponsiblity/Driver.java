package com.qa.SOLIDprinciples.SingleResponsiblity;

public class Driver {

	private int mileage;
	int raceswon;

	// functionality
	public void drive(int milesDriven) {
		this.setMileage(this.getMileage() + milesDriven);

	}

	// getters and setters
	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getRaceswon() {
		return raceswon;
	}

	public void setRaceswon(int raceswon) {
		this.raceswon = raceswon;
	}

	// constructors

}
