package com.example.DAO;

import java.util.List;

import com.example.Bean.Product;
import com.example.Exception.ProductException;

public interface DAOinterface {
	
	public List<Product> getAllProducts();
	public Product getProductById(int id);
	public boolean addProduct(Product product) throws ProductException;
	public boolean deleteProductById(int id) throws ProductException;
	public boolean updateProduct(int id, Product product) throws ProductException;
}
