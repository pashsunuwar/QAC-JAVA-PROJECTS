package com.qa.SOLID.dependency_inversion;

public class FrontendDeveloper implements Developer {

	@Override
	public void develop() {
		write.JavaScript();
	}

	public void writeJavaScript() {
		System.out.println("JavaScript is used everywhere anyway.");
	}

}
