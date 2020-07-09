package com.qa.SOLID.dependency_inversion;

public class BackendDeveloper implements Developer {

	@Override
	public void develop() {
		write.Java();
	}

	public void writeJava() {
		System.out.println("C# is just Microsoft Java anyway.");
	}

}
