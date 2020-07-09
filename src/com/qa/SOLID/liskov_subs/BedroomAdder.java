package com.qa.SOLID.liskov_subs;

public class BedroomAdder {
	public void addBedroom(Penthouse penthouse) {
		penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 5);
	}
}
