package com.Question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		StudentService vs = ap.getBean(StudentService.class);
//		
//		AnnotationConfigApplicationContext aa = (AnnotationConfigApplicationContext)ap;
//		
//		aa.close();
		
		Cities c = ap.getBean(Cities.class);
		c.print();
	}
}
