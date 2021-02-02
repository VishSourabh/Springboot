package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.CoronaPtEntity;
import com.nt.repository.CoronaPtRepository;

@Service("service")	
public class CoronaPtRegService {

	@Autowired
	private CoronaPtRepository crptrepo;
	
	public CoronaPtRegService(CoronaPtRepository crptrepo) {
		super();
		this.crptrepo = crptrepo;
	}

	public String saveData(CoronaPtEntity entity){
		
		
		CoronaPtEntity isSave = crptrepo.save(entity);
		
		if (isSave!=null)			
		   return "Record is Inserted Succefully";
		else
			return "Failed record is not inserted";
	}
}
