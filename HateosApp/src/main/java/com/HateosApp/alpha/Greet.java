package com.HateosApp.alpha;

import org.springframework.hateoas.RepresentationModel;

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
