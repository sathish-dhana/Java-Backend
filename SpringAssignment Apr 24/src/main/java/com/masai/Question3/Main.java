package com.masai.Question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Aclass aa = ap.getBean("aclass", Aclass.class);
		aa.method();
		
		ClassPathXmlApplicationContext ctx2= (ClassPathXmlApplicationContext)ap;
		ctx2.close();
	}
}
