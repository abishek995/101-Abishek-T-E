package com.marticles.project.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticles.project.entity.ProjectEntity;
import com.marticles.project.service.ProjectService;




@RestController
@RequestMapping("/project")
public class ProjectController {



	@Autowired
	ProjectService projectService;
	@PostMapping("/")
	public ResponseEntity<Void> saveProject(@RequestBody ProjectEntity projectEnt) {

	
		projectService.saveProject(projectEnt);
		return ResponseEntity.status(HttpStatus.CREATED).header("creation status", "created").build();

	}
	@GetMapping("/{id}")
	public ResponseEntity<ProjectEntity>getProjectById(@PathVariable long id)
	{
		
		ProjectEntity proj=projectService.findProjectById(id);
		return ResponseEntity.ok(proj);
	}
	@GetMapping("/")
	public ResponseEntity<List<ProjectEntity>>getProjectList()
	{
		List<ProjectEntity>proj=projectService.findAllProject();
		return ResponseEntity.ok(proj);
		}
}