package com.qa.SOLID.liskov_subs;

public class Studio extends Apartment {

	private int squareFootage;
	private int numberOfBedrooms;

	public Studio() {
		this.setNumberOfBedrooms(0);
	}

	@Override
	public int getSquareFootage() {
		return squareFootage;
	}

	@Override
	public void setSquareFootage(int sqft) {
		this.squareFootage = sqft;
	}

	@Override
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	@Override
	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

}
