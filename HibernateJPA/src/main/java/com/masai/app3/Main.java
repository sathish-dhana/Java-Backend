package com.masai.app3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager();
		
		Employee1 emp=new Employee1();
		emp.setName("Ram");
		
		
		SalaryEmployee semp=new SalaryEmployee("Mohan");
		semp.setSalary(85000);
		
		ContractualEmployee cemp=new ContractualEmployee("Hair");
		cemp.setCostPerDay(3000);
		cemp.setNoOfWorkingDays(10);
		
		em.getTransaction().begin();
		em.persist(emp);
		em.persist(semp);
		em.persist(cemp);
		em.getTransaction().commit();

	}
}
