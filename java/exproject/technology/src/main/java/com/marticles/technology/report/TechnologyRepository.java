package com.marticles.technology.report;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticles.technology.entity.TechnologyEntity;







@Repository
public interface TechnologyRepository  extends JpaRepository<TechnologyEntity,Long>{



	TechnologyEntity findDepartmentById(long id);
	

}
