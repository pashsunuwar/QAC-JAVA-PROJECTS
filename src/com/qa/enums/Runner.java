package com.qa.enums;

import com.qa.enums.Planet.Planets;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double earthWeight = Double.parseDouble("70");
		double mass = earthWeight / Planets.EARTH.surfaceGravity();

		for (Planets p : Planets.values()) {
			System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
		}
	}

}
