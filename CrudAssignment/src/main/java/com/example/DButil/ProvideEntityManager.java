package com.example.DButil;

import java.sql.Connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProvideEntityManager {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("testUnit");
	
	public static EntityManager getConnection() {
		return emf.createEntityManager();
	}
	
}
