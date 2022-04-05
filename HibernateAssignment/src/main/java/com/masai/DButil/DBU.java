package com.masai.DButil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBU {
private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("testUnit");
	
	public static EntityManager provideEntityManager() {
		
		return emf.createEntityManager();
	}
}
