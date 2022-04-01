package com.masai.useCases;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.bean.Student;

public class Main {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em= emf.createEntityManager();
		
		Student s= em.find(Student.class, 1);
	
		if(s != null)
			System.out.println(s);
		else
			System.out.println("Student does not exit..");
		 
		em.close();

	}
}
