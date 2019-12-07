package com.SpringRabbitMQ.alpha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRabbitMqApplication implements CommandLineRunner {
	@Autowired
	Sender sender;
	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitMqApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		sender.send("Messaging from App...!!!!");
	}

}
