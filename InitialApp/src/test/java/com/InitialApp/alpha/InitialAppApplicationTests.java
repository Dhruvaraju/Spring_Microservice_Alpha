package com.InitialApp.alpha;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class InitialAppApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testInitialApp() throws JsonProcessingException, IOException{
		String body = restTemplate.getForObject("/", String.class);
		assertThat(new ObjectMapper().readTree(body).get("message").textValue()).isEqualTo("Initial App");
	}

}
