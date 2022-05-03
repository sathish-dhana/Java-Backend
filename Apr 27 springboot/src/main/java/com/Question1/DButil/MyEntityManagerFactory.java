package com.Question1.DButil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntityManagerFactory {
	
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("testUnit");
	
	public static EntityManager provideEntityManager() {
    	return emf.createEntityManager();
    }
	
}
