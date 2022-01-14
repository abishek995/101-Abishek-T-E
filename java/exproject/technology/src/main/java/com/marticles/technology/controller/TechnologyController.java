package com.marticles.technology.controller;





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

import com.marticles.technology.entity.TechnologyEntity;
import com.marticles.technology.service.TechnologyService;



@RestController
@RequestMapping("/technology")
public class TechnologyController {



	@Autowired
	TechnologyService technologyService;
	@PostMapping("/")
	public ResponseEntity<Void> saveProject(@RequestBody TechnologyEntity technologyEnt) {

	
		technologyService.saveCustomer(technologyEnt);
		return ResponseEntity.status(HttpStatus.CREATED).header("creation status", "created").build();

	}
	@GetMapping("/{id}")
	public ResponseEntity<TechnologyEntity>getTechnologyById(@PathVariable long id)
	{
		
		TechnologyEntity tech=TechnologyService.findTechnologyById(id);
		return ResponseEntity.ok(tech);
	}
	@GetMapping("/employee/{empname}")
	public ResponseEntity<List<TechnologyEntity>> getEmployeeByEmpName(@PathVariable("technologyname") String technologyname)
	{
		List<TechnologyEntity> technologyEntities = technologyService.findAllTechnologyByName(technologyname);
		return ResponseEntity.ok(technologyEntities);
	}
}