package com.masai.Question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Shape s = ap.getBean("triangle", Triangle.class);
		s.draw();
		
		Shape s1 = ap.getBean("circle", Circle.class);
		s1.draw();
		
		Shape s2 = ap.getBean("cylinder", Cylinder.class);
		s2.draw();
	}
}
