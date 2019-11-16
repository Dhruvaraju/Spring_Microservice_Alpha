package com.HateosApp.alpha;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HateoasController {

	@GetMapping("/")
	public Greet displayMessage() {
		return new Greet("Hi There");
	}

	@RequestMapping("/greeting")
	@ResponseBody
	public Greet greeting(@RequestParam(value = "text",
	required = false, defaultValue = "HATEOAS") String textContent) {
		Greet greetingData = new Greet();
		 
		if(null != textContent) {
			greetingData.setMessage("Entered Data is : "+ textContent);
		}
		return greetingData;
	}
}
