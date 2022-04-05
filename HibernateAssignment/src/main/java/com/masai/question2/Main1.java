package com.masai.question2;

import javax.persistence.EntityManager;

import com.masai.DButil.DBU;

public class Main1 {
	public static void main(String[] args) {
		
		EntityManager em = DBU.provideEntityManager();
		
		Department developer = new Department();
		developer.setDname("IT");
		developer.setLocation("chennai");
		
		Employee1 emp1 = new Employee1("dhana", "TN", 1200000, developer);
		Employee1 emp2 = new Employee1("sekar", "TN", 1500000, developer);
		
		em.getTransaction().begin();
		
		em.persist(developer);
		
		em.getTransaction().commit();
		
		em.close();
	}
}
