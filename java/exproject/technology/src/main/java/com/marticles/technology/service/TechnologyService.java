package com.marticles.technology.service;







import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticles.technology.entity.TechnologyEntity;
import com.marticles.technology.report.TechnologyRepository;



@Service
public class TechnologyService {

	@Autowired
	TechnologyRepository technologyRepository;
public void saveCustomer(TechnologyEntity technologyEnt) {
	technologyRepository.save(technologyEnt);
}

public List<TechnologyEntity> findAllTechnology() {
	// TODO Auto-generated method stub
	return null;
}
public static TechnologyEntity findTechnologyById(long id) {
	// TODO Auto-generated method stub
	return null;
}

public static TechnologyEntity findProjectById(long id) {
	// TODO Auto-generated method stub
	return null;
}

public List<TechnologyEntity> findAllTechnologyByName(String technologyname) {
	// TODO Auto-generated method stub
	return null;
}


}