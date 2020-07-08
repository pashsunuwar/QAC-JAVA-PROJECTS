package com.qa.SOLIDprinciples.SingleResponsiblity;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car berty = new Car("red", "x-model", 69);
		Driver Stig = new Driver();
		Stig.drive(500);

		System.out.println("What is Stig's mileage?");
		System.out.println("Ans " + Stig.getMileage());
		System.out.println("--------------------------");

	}

}
