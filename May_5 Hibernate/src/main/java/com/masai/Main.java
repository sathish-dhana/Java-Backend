package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testUnit1");
		
		EntityManager em = emf.createEntityManager();
		
		
		Department dept1 = new Department("civil");
		
		Department dept2 = new Department("mech");
		
		Employee emp1 = new Employee("dhana", dept1);
		Employee emp2 = new Employee("sekar", dept1);
		Employee emp3 = new Employee("soni", dept1);
		
		Employee emp4 = new Employee("dhana", dept2);
		Employee emp5 = new Employee("sekar", dept2);
		Employee emp6 = new Employee("soni", dept2);
		
		em.getTransaction().begin();
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		em.persist(emp4);
		em.persist(emp5);
		em.persist(emp6);
		em.getTransaction().commit();
		
		em.close();
	}
}
