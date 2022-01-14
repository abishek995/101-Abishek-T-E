package com.marticles.project.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticles.project.entity.ProjectEntity;
import com.marticles.project.report.ProjectRepository;



@Service
public class ProjectService {

	@Autowired
	ProjectRepository projectRepository;
public void saveCustomer(ProjectEntity projectEnt) {
	projectRepository.save(projectEnt);
}

public List<ProjectEntity> findAllProject() {
	// TODO Auto-generated method stub
	return null;
}
public ProjectEntity findProjectById(long id) {
	// TODO Auto-generated method stub
	return null;
}

public void saveProject(ProjectEntity projectEnt) {
	// TODO Auto-generated method stub
	
}


}