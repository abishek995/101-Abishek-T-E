package com.marticles.technology.entity;





import java.util.List;

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
public class TechnologyEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	long id;
	
	
	@Column(name="technology_id")
	String technologyid;
	@Column(name="technology_name")
	String technologyName;
	public static TechnologyEntity ok(List<TechnologyEntity> tech) {
		// TODO Auto-generated method stub
		return null;
	}



}
