package com.springAnnotationConfig.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springAnnotationConfig.Service.Service;

@Component(value = "controller")
public class Controller {

	@Autowired
	private Service services;

	public void controller() {
		System.out.println("THis is controller");
		services.service();
	}
}
