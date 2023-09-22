package com.springAnnotationConfig.Repository;

import org.springframework.stereotype.Component;

@Component(value = "repository")
public class Repository {

	public void repository() {
		System.out.println("This is repository");
	}
}
