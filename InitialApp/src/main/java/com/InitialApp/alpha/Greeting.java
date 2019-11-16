package com.InitialApp.alpha;

//Object to set message and display on screen
public class Greeting {

	String message;
	public Greeting() {
		
	}
	
	public Greeting(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
