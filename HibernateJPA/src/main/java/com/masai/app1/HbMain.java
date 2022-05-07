package com.masai.app1;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class HbMain {
	
	public static void main(String[] args) {
		
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
//		
//		EntityManager em = emf.createEntityManager();
		
//		em.getTransaction().begin();
//		for (int i = 0; i < 10; i++) {
//		Student s1 = new Student("dhana", "TamilNade"+i, "chennai"+i);
//		em.persist(s1);
//		}
//		em.getTransaction().commit();
//		
//		em.clear();
		
		
		
//		String jpql = "update Student set city = 'chennaidaw'";
//		Query q = em.createQuery(jpql);
//		
//		em.getTransaction().begin();
//		int x = q.executeUpdate();
//		em.getTransaction().commit();
//		
//		em.clear();
		
	
		
//		String jpql = "select id, name from Student";
//		
//		TypedQuery<Object[]> q = em.createQuery(jpql, Object[].class);
//		
//		List<Object[]> s = q.getResultList();
//		
//		for (Object[] ob : s) {
//			System.out.println((int)ob[0] + "   " + (String)ob[1]);
//		}
		
//		List<Address> address = new ArrayList<>();
//		Address ad1 = new Address(1234, "srk");
//		Address ad2 = new Address(4321, "krs");
//		address.add(ad1);
//		address.add(ad2);
//		Student s1 = new Student("dhana", address, "chennai");
//		
//		em.getTransaction().begin();
////		em.persist(ad1);
////		em.persist(ad2);
//		em.persist(s1);
//		em.getTransaction().commit();
		
//		Student s1 = em.find(Student.class, 1);
//		System.out.println(s1.toString());
	}
}
