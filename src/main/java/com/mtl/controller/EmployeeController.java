package com.mtl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtl.model.Employee;
import com.mtl.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping
	public Employee addStudent(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping
	public List<Employee> getStudents(){
		return employeeService.getEmployees();
	}
}
