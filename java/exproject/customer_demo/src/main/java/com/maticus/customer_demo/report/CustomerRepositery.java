package com.maticus.customer_demo.report;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maticus.customer_demo.entity.CustomerEntity;







@Repository
public interface CustomerRepositery  extends JpaRepository<CustomerEntity,Long>{


static CustomerEntity findCustomerById(long id) {
	// TODO Auto-generated method stub
	return null;
}
	

}
