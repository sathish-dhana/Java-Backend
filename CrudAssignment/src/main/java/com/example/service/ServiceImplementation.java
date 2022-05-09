package com.example.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Bean.Product;
import com.example.DAO.DAOimplementation;
import com.example.DButil.ProvideEntityManager;import com.example.Exception.ProductException;

@Repository
public class ServiceImplementation implements ServiceInterface{
	
	@Autowired
	DAOimplementation dao;
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProducts();
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return dao.getProductById(id);
	}

	@Override
	public String addProduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		String display = "";
		
		boolean flag = dao.addProduct(product);
		
		if (flag) {
			display = "Product added succesfully";
		} else {
			display = "Product not added";
		}
		
		return display;
	}

	@Override
	public String deleteProductById(int id) throws ProductException {
		// TODO Auto-generated method stub
		String display = "";
		
		boolean flag = dao.deleteProductById(id);
		
		if (flag) {
			display = "Product deleted succesfully";
		} else {
			display = "Product not deleted";
		}
		
		return display;
	}

	@Override
	public String updateProduct(int id, Product product) throws ProductException {
		// TODO Auto-generated method stub
		String display = "";
		
		boolean flag = dao.updateProduct(id, product);
		
		if (flag) {
			display = "Product updated succesfully";
		} else {
			display = "Product not updated";
		}
		
		return display;
	}

}
