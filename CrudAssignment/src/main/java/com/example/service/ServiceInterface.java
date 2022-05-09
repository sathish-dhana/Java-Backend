package com.example.service;

import java.util.List;

import com.example.Bean.Product;
import com.example.Exception.ProductException;

public interface ServiceInterface {
	
	public List<Product> getAllProducts();
	public Product getProductById(int id);
	public String addProduct(Product product) throws ProductException;
	public String deleteProductById(int id) throws ProductException;
	public String updateProduct(int id, Product product) throws ProductException;
}
