package com.maticus.customer_demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maticus.customer_demo.entity.CustomerEntity;
import com.maticus.customer_demo.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	@PostMapping("/")
	public ResponseEntity<Void> saveCustomer(@RequestBody CustomerEntity customerEnt) {

	
		customerService.saveCustomer(customerEnt);
		return ResponseEntity.status(HttpStatus.CREATED).header("creation status", "created").build();

	}
	@GetMapping("/{id}")
	public ResponseEntity<CustomerEntity>getCustomerById(@PathVariable long id)
	{
		
		CustomerEntity cust=customerService.findCustomerById(id);
		return ResponseEntity.ok(cust);
	}
	@GetMapping("/")
	public ResponseEntity<List<CustomerEntity>>getCustomerList()
	{
		List<CustomerEntity>cust=CustomerService.findAllCustomer();
		return ResponseEntity.ok(cust);
		}
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteCustomerById(@PathVariable() Long id)
	{
		String body="record deleted ";
		Boolean delStatus=customerService.deleteCustomerById(id);
		if(!delStatus)
		{
			body="not record";
		}
		return ResponseEntity.ok().body(body);
	}
	@PutMapping("/")
	public ResponseEntity<String>updateDepartment(@RequestBody CustomerEntity dept)
	{
	CustomerEntity custnew=new CustomerEntity();
    custnew.setCustomerCode("a");
    custnew.setCustomerName("Hr");
    String strUpdStatus="data update ";
    customerService.updateCustomer(cust);
    return ResponseEntity.ok().body("ok");
	}
}
