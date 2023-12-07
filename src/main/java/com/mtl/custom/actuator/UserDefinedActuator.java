package com.mtl.custom.actuator;

import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import com.mtl.model.Employee;
import com.mtl.service.EmployeeService;

@Component
@Endpoint(id = "user", enableByDefault = true)
public class UserDefinedActuator {

	@ReadOperation
	public List<Employee> getData() {
		return EmployeeService.employeeList;
	}
}
