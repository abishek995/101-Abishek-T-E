package com.marticles.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticles.employee.entity.EmployeeEntity;
import com.marticles.employee.report.EmployeeRepository;



@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
public void saveCustomer(EmployeeEntity employeeEnt) {
	employeeRepository.save(employeeEnt);
}

public List<EmployeeEntity> findAllEmployee() {
	// TODO Auto-generated method stub
	return null;
}
public EmployeeEntity findDepartmentById(long id) {
	// TODO Auto-generated method stub
	return null;
}

public void saveEmployee(EmployeeEntity employeeEnt) {
	// TODO Auto-generated method stub
	
}

public EmployeeEntity findEmployeeById(long id) {
	// TODO Auto-generated method stub
	return null;
}


}