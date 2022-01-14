package com.marticles.project.report;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticles.project.entity.ProjectEntity;






@Repository
public interface ProjectRepository  extends JpaRepository<ProjectEntity,Long>{



	ProjectEntity findDepartmentById(long id);
	

}
