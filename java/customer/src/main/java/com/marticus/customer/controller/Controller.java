package com.marticus.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.model.Customer;
import com.marticus.service.CustomerService;

@RestController
@RequestMapping("/customer")

public class Controller {
	@Autowired
	CustomerService customerService;
	@PostMapping("/detiles")
	ResponseEntity<Void>saveCustomer(@RequestBody Customer cust )
	{
		System.out.println(cust.getCustomerCode());
		return ResponseEntity.status(HttpStatus.CREATED)
				.header("c1", "abi")
				.header("c2", "ani")
				.build();
	}
	@GetMapping("/grtddetiles")
	ResponseEntity<List<Customer>>getAllCustomer()
	{
		Customer cust= new Customer(1,"abishek","112");
		return ResponseEntity.status(HttpStatus.CREATED).body(cust);
	}
}
