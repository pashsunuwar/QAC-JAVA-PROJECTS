package com.qa.SOLID.interface_segregation;

public class Dodo implements EggLayingCreature, ExtinctCreature {
	private String currentLocation;
	private int numberOfEggs;

	public Dodo(int initialEggCount) {
		this.setNumberOfEggs(initialEggCount);
	}

	public void layEggs() {
		this.setNumberOfEggs(getNumberOfEggs() + 1);
	}

	@Override
	public void goExtinct() {
		this.setCurrentLocation("in a museum");
	}

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

}
