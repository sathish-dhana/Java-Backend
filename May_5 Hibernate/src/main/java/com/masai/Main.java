package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testUnit1");
		
		EntityManager em = emf.createEntityManager();
		
		Student st1 = new Student(1, "dhana", "chennai", "chennai");
		
		em.getTransaction().begin();
		em.persist(st1);
		em.getTransaction().commit();
	
		
	}
}
