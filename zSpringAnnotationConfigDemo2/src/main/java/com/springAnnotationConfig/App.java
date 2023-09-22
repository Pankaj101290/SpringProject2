package com.springAnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springAnnotationConfig.BeanConfig.BeanConfig;
import com.springAnnotationConfig.Controller.Controller;

public class App {
	public static void main(String[] args) {
		System.out.println("This is Main Class");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Controller controller = context.getBean(Controller.class);
		controller.controller();
	}
}
