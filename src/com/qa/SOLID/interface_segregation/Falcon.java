package com.qa.SOLID.interface_segregation;

public class Falcon implements Bird, EggLayingCreature, FlyingCreature {
	private String currentLocation;
	private int numberOfEggs;

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public int getNumberOfEggs() {
		return numberOfEggs;
	}

	public void setNumberOfEggs(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}

	@Override
	public void laysEggs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void layEggs() {
		// TODO Auto-generated method stub

	}

}
