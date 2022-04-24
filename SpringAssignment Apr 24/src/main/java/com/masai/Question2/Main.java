package com.masai.Question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		PresentationLayer p = ap.getBean(PresentationLayer.class, "presentation");
		
		p.multiply(2, 5);
		p.sum(2, 5);
	}
}
