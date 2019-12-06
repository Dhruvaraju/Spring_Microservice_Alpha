package com.ReactiveMS.alpha;

import java.awt.PageAttributes.MediaType;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.event.annotation.BeforeTestExecution;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.client.WebClient;


@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
class ReactiveMSappApplicationTests {
	
	WebTestClient webClient;
	
	@Test
	public void testWebFluxURI() throws Exception {
		//WebTestClient enables to create a server and bind it with a base url
		webClient = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();
		webClient.get().uri("/")
		.accept(org.springframework.http.MediaType.APPLICATION_JSON)
		.exchange()
		.expectStatus().isOk()
		.expectBody(Greet.class).returnResult()
		.getResponseBody().getMessage().equalsIgnoreCase("Hi There");
	}
	
	@Test
	void contextLoads() {
	}

}
