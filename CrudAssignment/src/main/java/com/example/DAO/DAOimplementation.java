package com.example.DAO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.Bean.Product;
import com.example.DButil.ProvideEntityManager;import com.example.Exception.ProductException;

@Repository
public class DAOimplementation implements DAOinterface {
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		EntityManager em = ProvideEntityManager.getConnection();
		
		List<Product> li = null;
		
		TypedQuery<Product> query = em.createQuery("from Product", Product.class);
		
		li = query.getResultList();
		
		em.close();
		
		return li;
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		
		EntityManager em = ProvideEntityManager.getConnection();
		
		Product product = em.find(Product.class, id);
		
		em.close();
				
		return product;
	}

	@Override
	public boolean addProduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		
		EntityManager em = ProvideEntityManager.getConnection();
		boolean flag = false;
		
		try {
			em.getTransaction().begin();
			em.persist(product);
			em.getTransaction().commit();
			flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			throw new ProductException("Not added, please check");
		}
		
		em.close();
		
		return flag;
	}

	@Override
	public boolean deleteProductById(int id) throws ProductException {
		// TODO Auto-generated method stub
		boolean flag = false;
		EntityManager em = ProvideEntityManager.getConnection();
		Product product = em.find(Product.class, id);
		
		try {
			em.getTransaction().begin();
			em.remove(product);
			em.getTransaction().commit();
			flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			throw new ProductException("Not deleted, please check");
		}
		
		em.close();
		
		return flag;
	}

	@Override
	public boolean updateProduct(int id, Product product) throws ProductException {
		// TODO Auto-generated method stub
		boolean flag = false;
		EntityManager em = ProvideEntityManager.getConnection();
		
		Product product1 = em.find(Product.class, id);
		
		try {
			em.getTransaction().begin();
			em.remove(product1);
			em.persist(product);
			em.getTransaction().commit();
			flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			throw new ProductException("Not deleted, please check");
		}
		
		em.close();
		
		return flag;
	}

}
