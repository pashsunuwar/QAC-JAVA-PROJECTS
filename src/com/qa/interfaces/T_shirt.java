package com.qa.interfaces;

public class T_shirt extends Clothes {

	public T_shirt(String sizeTshirt, int shoSize, String colour, String brand, String material) {
		super(sizeTshirt, shoSize, colour, brand, material);
		// TODO Auto-generated constructor stub
	}

	String collar_Type;
	String sleeve;
	boolean logo;

	public String getCollar_Type() {
		return collar_Type;
	}

	public void setCollar_Type(String collar_Type) {
		this.collar_Type = collar_Type;
	}

	public String getSleeve() {
		return sleeve;
	}

	public void setSleeve(String sleeve) {
		this.sleeve = sleeve;
	}

	public boolean isLogo() {
		return logo;
	}

	public void setLogo(boolean logo) {
		this.logo = logo;
	}

}
