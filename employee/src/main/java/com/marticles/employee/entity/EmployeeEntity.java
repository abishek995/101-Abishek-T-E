package com.marticles.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table(name="employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	long id;
	
	@Column(name="employee_id")	
	Long employeeId;
	
	@Column(name="employee_name")
	String employeeName;

	@Column(name="project_id")
	String projectid;

}
