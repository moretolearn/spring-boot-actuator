package com.ram.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class OverrideActuator implements HealthIndicator{

	@Override
	public Health health() {
		return Health.up().withDetail("1", "hha").build();
	}

}
