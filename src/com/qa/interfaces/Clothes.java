package com.qa.interfaces;

public class Clothes {
	
	String sizeTshirt;
	int shoSize;
	String colour;
	String brand;
	String material;
	
	// Constructor using fields
	public Clothes(String sizeTshirt, int shoSize, String colour, String brand, String material) {
		super();
		this.sizeTshirt = sizeTshirt;
		this.shoSize = shoSize;
		this.colour = colour;
		this.brand = brand;
		this.material = material;
	}

	//Getter and setters
	public String getSizeTshirt() {
		return sizeTshirt;
	}

	public void setSizeTshirt(String sizeTshirt) {
		this.sizeTshirt = sizeTshirt;
	}

	public int getShoSize() {
		return shoSize;
	}

	public void setShoSize(int shoSize) {
		this.shoSize = shoSize;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	

}
