package com.example.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.DButil.ProvideEntityManager;
import com.example.Exception.ProductException;
import com.example.bean.Product;

@Repository
public class DataPersistImplementation implements DataPersistInterface {

	@Override
	public List<Product> getAllProducts() throws ProductException {
		// TODO Auto-generated method stub
		List<Product> li = null;
		
		EntityManager em = ProvideEntityManager.getEntityManager();
		
		TypedQuery<Product> query = em.createQuery("from Product", Product.class);
		
		li = query.getResultList();
		
		if (li == null)
			throw new ProductException("There is no products");
		
		em.close();
		
		return li;
	}

	@Override
	public Product getProductById(int id) throws ProductException {
		// TODO Auto-generated method stub
		Product p = null;
		
		EntityManager em = ProvideEntityManager.getEntityManager();
		
		p = em.find(Product.class, id);
		
		if (p == null)
			throw new ProductException("There is no products");
		
		em.close();
		
		return p;
	}

	@Override
	public boolean addProduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		
		EntityManager em = ProvideEntityManager.getEntityManager();
		boolean flag = false;
		
		try {
			em.getTransaction().begin();
			em.persist(product);
			em.getTransaction().commit();
			flag = true;
		} catch (Exception e) {
			throw new ProductException("There is no products");
		}
		
		em.close();
		
		return flag;
	}

	@Override
	public boolean deleteProductById(int id) throws ProductException {
		// TODO Auto-generated method stub
		EntityManager em = ProvideEntityManager.getEntityManager();
		boolean flag = false;
		
		Product p = em.find(Product.class, id);
		
		if (p == null)
			throw new ProductException("There is no products");
		
		try {
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
			flag = true;
		} catch (Exception e) {
			throw new ProductException("There is no products");
		}
		
		return flag;
	}

	@Override
	public boolean updateProduct(int id, Product product) throws ProductException {
		boolean flag = false;
		EntityManager em = ProvideEntityManager.getEntityManager();
		
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
