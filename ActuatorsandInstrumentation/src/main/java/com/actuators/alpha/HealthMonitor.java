package com.actuators.alpha;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthMonitor implements HealthIndicator {
	
	TPSCounter counter;
	
	public Health health() {
		boolean health = counter.isWeak();
		if(health) {
			return Health.outOfService().withDetail("Number of Hits were High", counter.count.toString()).build();
		}
		return Health.up().build();
	}
	
	//To increase the service hits after every call is made
	public void updateTx() {
		if(counter == null || counter.isExpired()) {
			counter = new TPSCounter();
		}
		counter.increment();
	}

}
