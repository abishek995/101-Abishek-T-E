package com.marticles.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.marticles.employee.entity.EmployeeEntity;
import com.marticles.employee.service.EmployeeService;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	@PostMapping("/")
	public ResponseEntity<Void> saveEmployee(@RequestBody EmployeeEntity employeeEnt) {

	
		employeeService.saveEmployee(employeeEnt);
		return ResponseEntity.status(HttpStatus.CREATED).header("creation status", "created").build();

	}
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeEntity>getEmployeeById(@PathVariable long id)
	{
		
		EmployeeEntity emp=employeeService.findEmployeeById(id);
		return ResponseEntity.ok(emp);
	}
	@GetMapping("/")
	public ResponseEntity<List<EmployeeEntity>>getEmployeeList()
	{
		List<EmployeeEntity>emp=employeeService.findAllEmployee();
		return ResponseEntity.ok(emp);
		}
}