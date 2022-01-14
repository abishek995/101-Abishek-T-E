package com.marticles.employee.report;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticles.employee.entity.EmployeeEntity;




@Repository
public interface EmployeeRepository  extends JpaRepository<EmployeeEntity,Long>{



	EmployeeEntity findEmployeeById(long id);


}
