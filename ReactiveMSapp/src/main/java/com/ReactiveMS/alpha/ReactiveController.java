package com.ReactiveMS.alpha;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;


@RestController
public class ReactiveController {

	@GetMapping("/")
	public Mono<Greet> displayMessage() {
		return Mono.just(new Greet("Hi There"));
	}
}
