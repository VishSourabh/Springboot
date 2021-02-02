package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.CoronaPtEntity;
import com.nt.service.CoronaPtRegService;

@SpringBootApplication
public class BootProj15MvcProjCoronaPatSpringDataPocApplication {
	

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootProj15MvcProjCoronaPatSpringDataPocApplication.class, args);
		CoronaPtRegService bean = run.getBean("service", CoronaPtRegService.class); 
		System.out.println(bean);
		CoronaPtEntity entity=new CoronaPtEntity();
		//entity.setCid(101);
		entity.setName("Shubham");
		entity.setEmail("Shubham12@gmail.com");
		entity.setGender("male");
		entity.setCountry("India");
		entity.setcCode(91);
	    entity.setMbno(1234567895l);
		String saveData = bean.saveData(entity);
		System.out.println(saveData);
		
	}

}
