package com.springAnnotationConfig.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springAnnotationConfig.Repository.Repository;

@Component (value = "serviceb")
public class Service {

	@Autowired
	private Repository repository;

	public void service() {
		System.out.println("This is Service");
		repository.repository();
	}
}
