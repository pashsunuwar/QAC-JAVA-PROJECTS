package com.qa.SOLID.liskov_subs;

public class Penthouse extends Apartment {

	private int squareFootage;
	private int numberOfBedrooms;

	public Penthouse() {
		this.setNumberOfBedrooms(4);
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
