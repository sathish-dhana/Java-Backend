package com.masai.Question1.Presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.Question1.Beans.Book;
import com.masai.Question1.Config.Appconfig;
import com.masai.Question1.Service.ServiceImplementation;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		
		ServiceImplementation service = ac.getBean(ServiceImplementation.class);
		
		service.addBook(new Book("Wings of firw", "abdulkalam", 500.00));
		service.addBook(new Book("god of war", "author1", 600.00));
		service.addBook(new Book("fire", "author2", 500.00));
	}
}
