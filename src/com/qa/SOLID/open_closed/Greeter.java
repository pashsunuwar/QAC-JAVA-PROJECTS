package com.qa.SOLID.open_closed;

public class Greeter {
	private Greeting greeting;

	// Constructor using field
	public Greeter(Greeting greeting) {
		super();
		this.greeting = greeting;
	}

	// getters and setters
	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}

}
