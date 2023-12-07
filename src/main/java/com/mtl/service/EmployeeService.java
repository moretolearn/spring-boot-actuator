package com.mtl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtl.model.Employee;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;

@Service
public class EmployeeService {

	public static List<Employee> employeeList = new ArrayList<>();

	@Autowired
	ObservationRegistry observationRegistry;

	public Employee addEmployee(Employee employee) {
		employeeList.add(employee);
		return Observation.createNotStarted("addEmployee", observationRegistry).observe(() -> employee);
	}

	public List<Employee> getEmployees() {
		return Observation.createNotStarted("getEmployees", observationRegistry).observe(() -> employeeList);
	}
}
