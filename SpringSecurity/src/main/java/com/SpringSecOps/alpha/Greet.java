package com.SpringSecOps.alpha;

public class Greet {

	private String message;
	
	public Greet() {
		
	}
	public Greet(String text) {
		this.message = text;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
