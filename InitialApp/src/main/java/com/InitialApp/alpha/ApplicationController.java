package com.InitialApp.alpha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Used to generate a class which responds to URL invocation
@RestController
public class ApplicationController {
	
	//Get mapping is used to identify a HTTP get call make with the URL Mentioned
	//Here it is '/'
	@GetMapping("/")
	Greeting greet() {
		return new Greeting("Initial App");
	}

}
