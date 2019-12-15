package com.actuators.alpha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {

	@Autowired
	HealthMonitor health;
	
	@GetMapping("/")
	public Greet displayMessage() {
		health.updateTx();
		return new Greet("Hi There");
	}

	@RequestMapping("/greeting")
	@ResponseBody
	public Greet greeting(@RequestParam(value = "text",
	required = false, defaultValue = "TestData") String textContent) {
		Greet greetingData = new Greet();
		 
		if(null != textContent) {
			greetingData.setMessage("Entered Data is : "+ textContent);
		}
		return greetingData;
	}
}
