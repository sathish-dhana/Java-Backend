package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//activating the Spring container
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Travel mb = ctx.getBean(Travel.class, "first");
		mb.journey();
		
	}
}
