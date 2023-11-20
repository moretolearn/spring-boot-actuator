package com.ram.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="user",enableByDefault = true)
public class UserDefinedActuator {

	@ReadOperation
	public String getData() {
		return "hai";
	}
}
