package com.Practice1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
		
		A obj = ap.getBean("a", A.class);
		
		obj.funA();
		
		AnnotationConfigApplicationContext stx = (AnnotationConfigApplicationContext) ap;
		stx.close();
	}
	
}
