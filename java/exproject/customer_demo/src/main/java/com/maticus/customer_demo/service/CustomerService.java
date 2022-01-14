package com.maticus.customer_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maticus.customer_demo.entity.CustomerEntity;
import com.maticus.customer_demo.report.CustomerRepositery;



@Service
public class CustomerService {

	@Autowired
	CustomerRepositery CustomerRepository;
	private static CustomerRepositery CustomerRepositery;
public void saveCustomer(CustomerEntity departmentEnt) {
	CustomerRepositery.save(departmentEnt);
}
public CustomerEntity findCustomerById(long id) {
	return com.maticus.customer_demo.report.CustomerRepositery.findCustomerById(id);
}
public static List<CustomerEntity>findAllCustomer() {
	return CustomerRepositery.findAll();
}
public Boolean deleteCustomerById(Long id) {
	CustomerEntity cust=CustomerRepositery.findCustomerById(id);
	if(cust!=null)
	{
		CustomerRepositery.delete(cust);
	return true;
}
return false;
	
}
public void updateCustomer(CustomerEntity cust) {
	CustomerEntity custdb=customerRepository.findCustomerById(cust.getId());
	custdb.setCustomerCode(cust.getCustomerCode());
	custdb.setCustomerName(cust.getCustomerName());
	customerRepository.save(custdb);
}
}
