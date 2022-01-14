package com.marticles.project.entity;





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
@Table(name="project")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	long id;
	
	@Column(name="project_id")	
	long ProjectId;
	
	@Column(name="project_name")
	String projectName;

	@Column(name="technology_id")
	String technologyid;

}
